
/* This sql statment which creates the database with the name food_ordering_system_database */
create database food_ordering_system_database;

/*This sql statment which will enable the database in mysql */
use food_ordering_system_database;

/*This sql statement creates the table customer_details  with given fields and this table is mapped
to entity class 'Customer' in spring application */
create table customer_details(customer_id int  primary key auto_increment  NOT NULL,
first_name varchar(50),
last_name varchar(50),
email varchar(50));

/*This sql statement creates the table address_details with given fields and this table is mapped
to entity class 'Address' in spring application */
create table address_details(address_id int primary key auto_increment NOT NULL,
 city varchar(30), 
 country varchar(30),
 state varchar(50),street varchar(80),zipcode varchar(10));
 
 /*This sql statement creates the table order_details  with given fields and this table is mapped
to entity class 'Order' in spring application */
 create table order_details(order_id int primary key auto_increment NOT NULL, 
 total_quantity int, total_price double, address_id int , customer_id int, foreign key(address_id) references address_details(address_id),
 foreign key(customer_id) references customer_details(customer_id));
 
 /*This sql statement creates the table login_details  with given fields and this table is mapped
to entity class 'User' in spring application */
 create table login_details(user_id int primary key auto_increment NOT NULL,first_name varchar(30),
 last_name varchar(30),email varchar(30),user_password varchar(30));
 
 /* These are select queries for showing the result of each table */
 select * from order_details;
 select * from customer_details;
 select * from address_details;
 select * from login_details;
 
 /*These are delete statement for deleting the rows of each table*/
 delete from order_details where order_id>0;
 delete from customer_details where customer_id>0;
 delete from address_details where address_id>0;
 delete from login_details where user_id>0;
 
 
 


 
