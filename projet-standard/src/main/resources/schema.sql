
DROP ALL OBJECTS;

/*
	Table EMPLOYEE : trigram CLI
*/
CREATE TABLE CLIENT (
	CLI_ID  INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	CLI_TYPE VARCHAR(32) NOT NULL,
	CLI_NAME VARCHAR(64) NOT NULL,
	CLI_SURNAME VARCHAR(64),
	CLI_CREA_DATE TIMESTAMP NOT NULL,
	CLI_UPD_DATE TIMESTAMP NOT NULL,
	CLI_SUP_DATE TIMESTAMP,
	CONSTRAINT CLI_TYPE_VALUES CHECK (CLI_TYPE IN ('Person','Entreprise','Association'))
);

/*
	Table ENTREPRISE : trigram ENT
*/
CREATE TABLE ENTREPRISE (
	
	ENT_ID INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	ENT_NAME VARCHAR(64) NOT NULL,
	EMP_MAIL_SUFFIXE VARCHAR(16) NOT NULL,
	ENT_CREA_DATE TIMESTAMP NOT NULL,
	ENT_UPD_DATE TIMESTAMP NOT NULL,
	ENT_SUP_DATE TIMESTAMP
);


/*
	TABLE RELATION CLIENT : trigram REC
*/
CREATE TABLE RELATION_CLIENT (
	
	CLI_ID INTEGER NOT NULL,
	ENT_ID INTEGER NOT NULL,
	REC_FIRST_RELATION TIMESTAMP NOT NULL,
	REC_LAST_CONTACT TIMESTAMP NOT NULL,
	REC_CREA_DATE TIMESTAMP NOT NULL,
	REC_UPD_DATE TIMESTAMP NOT NULL,
	REC_SUP_DATE TIMESTAMP
);

ALTER TABLE RELATION_CLIENT ADD PRIMARY KEY(CLI_ID, ENT_ID);
ALTER TABLE RELATION_CLIENT ADD CONSTRAINT FK_RELATION_CLIENT_CLIENT FOREIGN KEY (CLI_ID) REFERENCES CLIENT(CLI_ID);
ALTER TABLE RELATION_CLIENT ADD CONSTRAINT FK_RELATION_CLIENT_ENTREPRISE FOREIGN KEY (ENT_ID) REFERENCES ENTREPRISE(ENT_ID);

/*
	Table EMPLOYEE : trigram EMP
*/
CREATE TABLE EMPLOYEE (
	EMP_ID INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
	EMP_NAME VARCHAR(64) NOT NULL,
	EMP_SURNAME VARCHAR(64) NOT NULL,
	EMP_EMAIL VARCHAR(64) unique NOT NULL,
	EMP_BIRTHDATE DATE NOT NULL, 
	EMP_START_WORK DATE,
	ENT_ID INTEGER NOT NULL,
	EMP_CREA_DATE TIMESTAMP NOT NULL,
	EMP_UPD_DATE TIMESTAMP NOT NULL,
	EMP_SUP_DATE TIMESTAMP
);

ALTER TABLE EMPLOYEE ADD CONSTRAINT FK_EMPLOYEE_ENTREPRISE FOREIGN KEY (ENT_ID) REFERENCES ENTREPRISE(ENT_ID);

