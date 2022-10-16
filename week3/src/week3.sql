--Select
--ANSII
--case insensitive
Select contact_name Adi,Company_name SirketAdi,City Sehir from customers;
Select * from Customers where City  = 'Berlin';
Select * from Products where category_id=1 or category_id=3;
Select * from Products where category_id=1 and unit_price>=10;
select * from Products order by category_id; --sıralama
select * from Products order by unit_price asc; --ascending artan fiyata göre 
select * from Products where category_id=1 order by unit_price desc; --descending azalan 
Select count(*) from Products; --tüm satırları say
Select count(*) from Products where category_id=2; --category_id si 2 olanları say
Select category_id from products group by category_id;--bütün dataları tekrar etmeyecek şekilde sırala
--her grup için arka planda bir katagori oluşturulur

Select category_id,count(*) from Products group by category_id;--her grup için kaç tene olduğunun sayısı

--bana 10 taneden az ürün olan katagorileri ver having count lara uygulanır
--önce her zaman where çalışır
Select category_id,count(*) from Products group by category_id having count(*)<10;
Select category_id,count(*) from Products where unit_price>20 group by category_id having count(*)<10;

--join birleştirmek inner join iki tablodada  eşleşenleri getirir
Select * from products inner join categories --Product ve Categori tablolarını beraber getir
on categories.category_id = products.category_id;

Select Products.product_id, Products.product_name,Products.unit_price,Categories.category_name
from products inner join categories --Product ve Categori tablolarını beraber getir
on categories.category_id = products.category_id;
--DTO Data Transformation object

--fiyatı 10 dan büyük olanları category ismi ile beraber getir
Select Products.product_id, Products.product_name,Products.unit_price,Categories.category_name
from products inner join categories --Product ve Categori tablolarını beraber getir
on categories.category_id = products.category_id
where Products.unit_price>10;

Select * from Products p inner join order_details od 
on p.product_id= od.product_id;

Select * from Products p left join order_details  od --solda olup sağda olmayanları da getir. Yani üründe olup hiç satışı yok
on p.product_id= od.product_id;
--yine aynı sonucun gelmesinin sebebi tüm ürün türlerinden satış yapılmasıdır
--yani ürünlerde olup sipariş detayı olmayan yok

Select *from Customers c left join Orders o
on c.customer_id= o.customer_id;
--müşterilerden sipariş vermemiş

Select *from Customers c left join Orders o
on c.customer_id = o.customer_id;
where o.CustomerID is null;--sağda olup solda olmayan null olarak gelir null o data yok demek
--sitelerdeki kişiye özel indirimi sağlayan bir sorgu. Kayıt olmuş ama hiç ürün almamış

Select *from Customers c right join Orders o
on c.customer_id = o.customer_id;
where o.CustomerID is null;

