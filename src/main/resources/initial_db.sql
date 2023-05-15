create schema ecom;
create table ecom.Products (
    id bigserial primary key,
    name character varying(255) not null,
    description character varying(2000),
    price double precision,
    available boolean
);
insert into ecom.Products(name,description,price,category,available)
values('TV','Samsung TV',750.00,'Electronics',true);
insert into ecom.Products(name,description,price,category,available)
values('Microwave','Samsung Microwave',150.00,'Small Appliance',true);