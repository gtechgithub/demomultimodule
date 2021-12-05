drop table customer if exists;

create table customer (
    id number not null AUTO_INCREMENT,
    customer_name varchar2(25),
    PRIMARY KEY (id)

);

insert into customer(customer_name)  values ('gopal');