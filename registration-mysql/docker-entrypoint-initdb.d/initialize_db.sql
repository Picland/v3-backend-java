CREATE DATABASE earth-development;
USE earth-development;

CREATE TABLE USER_INFO(
    USERID VARCHAR(20) PRIMARY KEY,
    PHONE_NUMBER VARCHAR(20),
    NAME VARCHAR(20),
    AVATAR VARCHAR(20),
    GENDER VARCHAR(1);
    EMAIL VARCHAR(20)
);

CREATE TABLE USER_ACCOUNT(
    USERID VARCHAR(20) PRIMARY KEY,
    PASSOWRD VARCHAR(20)
)