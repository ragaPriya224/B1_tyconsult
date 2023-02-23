CREATE DATABASE tyconsultDB;

use tyconsultDB;

CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255) ,
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255)
);


select * from persons;


select city from persons;

INSERT INTO persons (PersonID, LastName, FirstName, city)
VALUES (123,'john','victor','delhi');

INSERT INTO persons
VALUES (456,'abc','xyz','123 street','london');

UPDATE persons
SET city = 'mumbai'
WHERE personID = 123;

SET SQL_SAFE_UPDATES=0;

select * from persons;

select * from persons where city = 'delhi';

DELETE FROM persons WHERE firstname = 'xyz';
