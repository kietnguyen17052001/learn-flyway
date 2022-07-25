

create table tbl_customer(
    id bigint(20) not null auto_increment,
    name varchar(100) not null,
    country varchar(100) default null,
    city varchar(100) default null,
    phone varchar(11) default null,
    primary key (id),
    unique key uk_phone (phone)
)



