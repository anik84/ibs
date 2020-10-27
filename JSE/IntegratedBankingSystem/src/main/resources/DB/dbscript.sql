DROP DATABASE IF EXISTS IBS;

CREATE DATABASE IBS;

USE IBS;

CREATE TABLE AccountDetails(
  AcctNumber VARCHAR(20),
  UCI VARCHAR(20),
  AcctHolderName VARCHAR(50),
  AcctType VARCHAR(20),
  Amount DECIMAL,
  AcctOpenDate DATE,
  AcctStatus VARCHAR(20),
  MaturityDate  DATE,
  CONSTRAINT Acct_Acctnumber_pk PRIMARY KEY(AcctNumber),
  CONSTRAINT Acct_UCD_fk FOREIGN KEY(UCI) REFERENCES Customer(UCI)
);

INSERT INTO AccountDetails VALUES
 ('A123456','1234567890111213','Anik','Savings','50000','2012-07-11','Active','2030-08-22'),
 ('A789061','1234567890111214','Ramya','Fixed','10000','2010-07-11','Active','2029-07-23'),
 ('A132243','1234567890111215','Bhat','Savings','20000','2011-07-11','Active','2030-08-22'),
 ('A908754','1234567890111216','Sharma','Reoccuring','30000','2013-07-11','Active','2020-12-30'),
 ('A346786','1234567890111217','Silpa','fixed','40000','2012-01-11','Active','2030-08-23');

 CREATE TABLE TransactionDetails(
  Transid VARCHAR(20),
  AcctNumber VARCHAR(20),
  TransDateTime DATE,
  TransType VARCHAR(20),
  TransAmount DECIMAL,
  CONSTRAINT Trans_Id_pk PRIMARY KEY(TransId),
  CONSTRAINT Trans_AccNumber_fk FOREIGN KEY(AcctNumber) REFERENCES AccountDetails(AcctNumber)
);

INSERT INTO TransactionDetails VALUES
 (111213,'A123456','2020-09-11','Credit','5000'),
 (111219,'A789061','2020-09-11','Debit','1000');