SQL Tables:

CREATE table customers(
	UCI BIGINT NOT NULL PRIMARY KEY,
	custFirstName VARCHAR(100) NOT NULL,
	custLastName VARCHAR(100) NOT NULL,
	custAddress TEXT NOT NULL,
	custPhoneNo CHAR(10) unique,
	password VARCHAR(100),
	isReqApproved BOOLEAN,
	userStatus VARCHAR(10),
	docKYC BLOB,
	emailSent BOOLEAN
);

CREATE table acounts(
	acctNumber BIGINT NOT NULL PRIMARY KEY,
	acctBalance DECIMAL,
	acctType VARCHAR(20) NOT NULL,
	CONSTRAINT FK_UCI FOREIGN KEY account_uci REFERENCES customer(UCI)
);

CREATE table custBeneficiaries(
	selfBenefAcctID BIGINT,
	selfBenefAcctBalance DECIMAL,
	benefCreditCardID BIGINT,
	benefCreditCardAcctBalance DECIMAL,
	otherBenefAcctID BIGINT,
	otherBenefAcctBalance DECIMAL,
	CONSTRAINT FK_UCI FOREIGN KEY account_uci REFERENCES customer(UCI)
);

CREATE table loanAccts(
	loanID BIGINT NOT NULL PRIMARY KEY,
	loanAmount DECIMAL,
	loanStatus VARCHAR(20) NOT NULL,
	CONSTRAINT FK_UCI FOREIGN KEY account_uci REFERENCES customer(UCI)
);

CREATE table custCards(
	cardID BIGINT NOT NULL PRIMARY KEY,
	cardPIN int,
	cardType VARCHAR(20),
	cardStatus VARCHAR(20),
	CONSTRAINT FK_UCI FOREIGN KEY account_uci REFERENCES customer(UCI)
);

CREATE table cardStatementMismatch(
	reqMismatchID int NOT NULL PRIMARY KEY,
	mismatchDescription Text,
	CONSTRAINT FK_UCI FOREIGN KEY account_uci REFERENCES customer(UCI)
);


CREATE table IBSExecutives(
	executiveID BIGINT NOT NULL PRIMARY KEY,
	executiveFirstName VARCHAR(100) NOT NULL,
	executiveLastName VARCHAR(100) NOT NULL,
	executivePhoneNo CHAR(10) unique
);

CREATE table bankRepresentatives(
	repID BIGINT NOT NULL PRIMARY KEY,
	repFirstName VARCHAR(100) NOT NULL,
	repLastName VARCHAR(100) NOT NULL,
	repPhoneNo CHAR(10) unique
);

CREATE table serviceProviders(
	accountID BIGINT NOT NULL PRIMARY KEY,
	executiveFirstName VARCHAR(100) NOT NULL,
	executiveLastName VARCHAR(100) NOT NULL,
	executivePhoneNo CHAR(10) unique,
	password VARCHAR(100),
	docKYC BLOB
);


















