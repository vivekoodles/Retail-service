# Retail-service

############# Database configuration ####################
install a postgres sql 
create database with name retaildb


############### Build Application ###########################
This is a maven base spring boot application for creating jar file following command need to be run
mvn clean install
after that the jar file name (Retail-website-0.0.1-SNAPSHOT.jar) will be created in target folder 

##################### env variables configuration ##########################3
following env variables need to be configure in application.properties file 
server.port=8181
spring.application.name=retail-billing
spring.datasource.url = jdbc:postgresql://<DBHost>:<DBPort>/<DBName>
spring.datasource.username=<UserName>
spring.datasource.password=<password>
spring.datasource.driverClassName=org.postgresql.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.generate-ddl=true


####################### run the application #######################
java -jar targate/Retail-website-0.0.1-SNAPSHOT.jar --spring.config.location=<location of application.properties file>



#################### testing apis ####################
In this application for api documentation swagger has been configurated which will be open in 
http://localhost:8181/swagger-ui.html

There is two api one of register any user as staff member or affiliated by store .

Second api is for generate it's bill with adding the purchased items.db

