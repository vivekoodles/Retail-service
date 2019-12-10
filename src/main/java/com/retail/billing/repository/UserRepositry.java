package com.retail.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.retail.billing.model.Users;

@Repository
public interface UserRepositry extends JpaRepository<Users, Long> {

	Users findByEmail(String userEmail);

}
