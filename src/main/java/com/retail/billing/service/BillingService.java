package com.retail.billing.service;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.retail.billing.dto.BillDetailsDto;
import com.retail.billing.dto.BillingItems;
import com.retail.billing.enums.ProductType;
import com.retail.billing.enums.UserType;
import com.retail.billing.model.Users;
import com.retail.billing.repository.UserRepositry;

@Service
public class BillingService {

	@Autowired
	UserRepositry userRepo;

	public BillingService() {
		// TODO Auto-generated constructor stub
	}

	public double generateBill(BillDetailsDto items) {

		float discount = findDiscountPercentage(items.getUserEmail());

		double totalAmount = 0.0;

		for (BillingItems item : items.getItems()) {

			if (item.getType().equals(ProductType.NON_GROCERY) && discount > 0) {

				double totalPrice=(item.getPrice() * item.getQuantity());
				double discountAmount=totalPrice*discount/100;
				
				totalAmount += (totalPrice-discountAmount);

			} else {
				totalAmount += (item.getPrice() * item.getQuantity());
			}

		}
		
		int billingDiscount=(((int)totalAmount)/100)*5;
		
		totalAmount-=billingDiscount;

		return roundAvoid(totalAmount,2);
		
		
	}

	private float findDiscountPercentage(String userEmail) {

		Users user = userRepo.findByEmail(userEmail);

		
		if (Objects.isNull(user)) {
			return 0;
		}else {
			Calendar createdAt = Calendar.getInstance();
			Calendar today = Calendar.getInstance();
			
			if (user.getUserType().equals(UserType.STAFF))
				return 30;

			else if (user.isAffiliatedByStore())
				return 10;
			else if (today.get(Calendar.YEAR) > createdAt.get(Calendar.YEAR)) {
				return 5;
			} else
				return 0;

		}
		
		
	}
	
	public static double roundAvoid(double value, int places) {
	    double scale = Math.pow(10, places);
	    return Math.round(value * scale) / scale;
	}
}
