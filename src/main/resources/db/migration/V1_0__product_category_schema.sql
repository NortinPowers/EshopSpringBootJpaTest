drop table if exists product_category cascade;

create table product_category
(
    id       bigint generated by default as identity
        constraint product_category_pk
            primary key,
    category varchar(40) not null
);

alter table product_category
    owner to postgres;

insert into product_category (category)
values ('phone'),
       ('tv');
