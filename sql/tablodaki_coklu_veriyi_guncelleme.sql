--Çoklu veri güncelleme->birden dfazla kolonu aynı anda güncelleme
UPDATE cars
SET colorrrr='White',year= 2000
WHERE brand= 'Nissan';

SELECT* FROM cars;