# Write your MySQL query statement below
select distinct product_id, product_name from
Product natural inner join Sales 
where product_id not in (select product_id from Sales where sale_date not between '2019-01-01' and '2019-03-31');