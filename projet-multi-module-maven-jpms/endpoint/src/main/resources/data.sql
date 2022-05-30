

INSERT INTO CLIENT (CLI_ID, CLI_TYPE, CLI_NAME, CLI_SURNAME,CLI_CREA_DATE, CLI_UPD_DATE,CLI_SUP_DATE)
VALUES 
(1,'Person','Smith','John','2010-05-22 00:00:00','2022-05-22 00:00:00', null), 
(2,'Person','Doe','Jane','2010-05-22 00:00:00','2022-05-22 00:00:00', null),
(3,'Entreprise','CGI',null,'2010-05-22 00:00:00','2022-05-22 00:00:00', null),
(4,'Association','Amicale bouliste de Lyon',null,'2022-05-22 00:00:00','2022-05-22 00:00:00', null);


INSERT INTO ENTREPRISE (ENT_ID, ENT_NAME,EMP_MAIL_SUFFIXE, ENT_CREA_DATE, ENT_UPD_DATE,ENT_SUP_DATE)
VALUES 
(1,'CGI','com','2022-05-22 00:00:00','2022-05-22 00:00:00', null), 
(2,'EDF','fr','2022-05-22 00:00:00','2022-05-22 00:00:00', null),
(3,'SNCF','fr','2022-05-22 00:00:00','2022-05-22 00:00:00', null),
(4,'Médecins sans frontières','org','2022-05-22 00:00:00','2022-05-22 00:00:00', null)
;

INSERT INTO EMPLOYEE (EMP_ID, EMP_NAME, EMP_SURNAME, EMP_EMAIL, EMP_BIRTHDATE, EMP_START_WORK, ENT_ID, EMP_CREA_DATE, EMP_UPD_DATE, EMP_SUP_DATE)
VALUES 
(1,'Smith','John','john.smith@cgi.com','1990-01-01','2020-01-01',1,'2019-12-20','2019-12-20',null),
(2,'Doe','Jane','jane.doe@edf.fr','1990-01-01','2020-01-01',2,'2019-12-20','2019-12-20',null),
(3,'Doe','Jim','jim.doe@sncf.fr','1990-01-01','2020-01-01',3,'2019-12-20','2019-12-20',null),
(4,'Doe','Alice','alice.doe@msf.org','1990-01-01','2020-01-01',4,'2019-12-20','2019-12-20',null);

INSERT INTO RELATION_CLIENT (CLI_ID, ENT_ID, REC_FIRST_RELATION, REC_LAST_CONTACT, REC_CREA_DATE,REC_UPD_DATE,REC_SUP_DATE)
VALUES
(1,1,'2018-01-01','2021-01-01','2010-05-22 00:00:00','2022-01-01 00:00:00',null),
(2,2,'2018-01-01','2021-01-01','2010-05-22 00:00:00','2022-01-01 00:00:00',null),
(3,3,'2018-01-01','2021-01-01','2010-05-22 00:00:00','2022-01-01 00:00:00',null),
(4,2,'2018-01-01','2021-01-01','2010-05-22 00:00:00','2022-01-01 00:00:00',null);