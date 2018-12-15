CREATE DATABASE earth_development;
USE earth_development;

CREATE TABLE user_info (
  id                     INT PRIMARY KEY AUTO_INCREMENT,
  user_id                VARCHAR(20) UNIQUE NOT NULL,
  name                   VARCHAR(50)        NOT NULL,
  gender                 VARCHAR(1)         NOT NULL,
  cell_phone             VARCHAR(50),
  email                  VARCHAR(50),
  address                VARCHAR(100),
  created_datetime       DATETIME           NOT NULL,
  last_modified_datetime DATETIME           NOT NULL
);

CREATE TABLE user_account (
  id       INT PRIMARY KEY AUTO_INCREMENT,
  user_id  VARCHAR(20) UNIQUE NOT NULL,
  password VARCHAR(20)        NOT NULL
);

CREATE TABLE photo (
  id                     INT PRIMARY KEY AUTO_INCREMENT,
  name                   VARCHAR(50) NOT NULL,
  size                   LONG        NOT NULL,
  mime_type              VARCHAR(20) NOT NULL,
  address                VARCHAR(100),
  owner_id               VARCHAR(20),
  height                 INT,
  width                  INT,
  created_datetime       DATETIME    NOT NULL,
  last_modified_datetime DATETIME    NOT NULL
)