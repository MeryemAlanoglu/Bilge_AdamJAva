--TAbloya Veri Kaydı gerçekleştirme
-- Syntax su sekilde olacaktır-> INSERT INTO tabloADi(TAblonubn fieldları(kolon isimleri))
							--VALUES (kolon veri türüne denk gelen verilerle doldur)

INSERT INTO cars(brand,model,year)--SQL de String çift tırnak ile değil tek tırnak ile yazılır
VALUES
('Ferrari','Enzo',2002),
('Nissan','R34',1999),
('Nissan','Silvia',2000),
('Cobra','Shelby',1962),
('Aston Martin','DB 11',2013),
('Ford','Renger',2000);

SELECT*FROM cars;

SELECT * FROM cars
WHERE brand='Nissan';--Markası nissan olanları getir

SELECT * FROM cars
WHERE year< 1975;--yılı 1975 ten küçük olanları getir.

SELECT * FROM cars
WHERE year>1975;--modeli 1975'den büyük olanları getir.

SELECT * FROM cars
WHERE year<= 1999;

SELECT * FROM cars
WHERE year>= 1999;


SELECT * FROM cars
WHERE brand <> 'Cobra';--Markası kobra olmayanları getir 

SELECT * FROM cars
WHERE brand ! 'Cobra';--Markası kobra olmayanları getir. Yukardakiyle aynı işi yapar


 -- % işareti sıfır, bir veya daha fazla karakteri temsil eden bir wildcard'dır.
SELECT * FROM cars
WHERE model LIKE'R%'; --modelii 'R' ile başlayanları getir

SELECT *FROM cars
WHERE model LIKE 'r%'; --Modeli 'r' ile bitenleri getir

SELECT * FROM cars
WHERE brand LIKE '%a%'; --Markasının içinde 'a' harfi geçenleri getir

SELECT * FROM cars
WHERE brand LIKE '%ra%';--Markasının içinde 'ra ' geçenleri getirir

-- _wildcard karakteri tek bir karakteri temsil eder. Herhangi bir karakter veya sayı olabilir
SELECT * FROM cars
WHERE brand LIKE 'F__ra__';-- Markası f başlayan ardından iki adet wildcard karakter alan(__),
--ardından 'ra' ve ardından yine bir wildcard karakter alan markayı döndürür.

--Birden fazla koşulu kontrol etmek istediğimizde AND operatörü kullanılır.
SELECT*FROM cars
WHERE brand ='Nissan'
AND model = 'Silvia';--markası nissan ve modeli silvia olan tüm kayıtları döndürür.


--Birden fazla koşuldan herhangi birini kontrol etmek için OR operatörü kullanılır
SELECT*FROM cars
WHERE brand='Nissan'
OR model ='Enzo';--markası 'nissan' veya modeli 'Enzo' olan tüm kayıtları döndürür.


--IN operatörü, bir sütunun değeri listedeki değerlerden herhangi
--biriyle/birileriyle eşleştiğinde kullanılır.bir liste verildiği zaman çok kullanışlıdır.
SELECT *FROM cars
WHERE brand IN ('Nissan',('Aston Martin'),'Ford');--MArkası {Nissan,Aston Martin,Ford} olanları getiriri

SELECT * FROM cars
WHERE year BETWEEN 1962 AND 2000;--1950 ile 2000 yılları arasında olan bütün kayıtları getirir.

SELECT * FROM cars
WHERE model IS Null;-- Model NULL olan tüm kayıtları döndürür

--NOT öperatörü,operatörün doğruluğunu tersine çevirmek için LIKE, ILIKE,IN,BETWEEN,NULL operatörleri
--birlikte kullanıla bilir.

SELECT * FROM cars
WHERE brand NOT LIKE --F ile başlamayan kayıtları döndürür.->LIKE case sensitive (büyük-küçük harf duyarlı)
'F%';

SELECT * FROM cars
WHERE brand NOT ILIKE --f ya da F ile başlamayan kayıtları döndürür.->ILIKE case sensitive değil (büyük-küçük harf duyarlı)
'f%';

SELECT * FROM cars
WHERE brand NOT LIKE ('Cobra','Ford','Ferrari'); --markanın bu listede olmadığı tüm kayıtları döndürür


SELECT * FROM cars
WHERE year NOT BETWEEN 1950 AND 2000;--Yılı 1950 ile 2000 yılları arasında olmayan bnütün kayıtları getirir

SELECT * FROM cars
WHERE model IS NOT NULL;-- model NULL olmayan bütün kayıtları döndürür




