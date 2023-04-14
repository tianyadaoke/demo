create table if not exists brand(
    brand_id int not null,
    brand_name varchar(100) not null,
    primary key (brand_id)
);
create table if not exists price(
    brand_id int,
    start_date datetime,
    end_date datetime,
    price_list bigint not null,
    product_id bigint not null,
    priority int not null,
    price decimal(8,2) not null,
    curr varchar(20) not null,
    primary key (price_list),
    foreign key (brand_id) references brand(brand_id)
);