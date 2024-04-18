CREATE TABLE students(

	name VARCHAR(255), 
	surname VARCHAR(255),
	grade INT

	);
	SELECT*FROM students;
	INSERT INTO students(name,surname,grade)
		VALUES
	
	('Ruveyda','Yilmaz',90),
	('Elif', 'Er',93),
	('Tuba','İnan',86),
	('Büşra','Özdemir',100),
	('Meryem','Alanoglu',30);
		SELECT* FROM students;

UPDATE students
SET surname='Ermez'
WHERE name='Elif'
--dogum yili
	ALTER TABLE students
ADD birthyear VARCHAR(255);
SELECT* FROM students;

--dogum yili gir

UPDATE students
SET birthyear=1999;
 -- öğrencilerden b,irinin adını soyadını ve doğum yılını güncelle

	