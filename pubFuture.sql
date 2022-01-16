CREATE DATABASE IF NOT EXISTS PubFutureDB;

USE PubFutureDB;

CREATE TABLE IF NOT EXISTS account (
  account_id INT(100) NOT NULL AUTO_INCREMENT,
  total DECIMAL(15,2),
  tp_account VARCAR(50) NOT NULL,
  fi_institution VARCHAR(100) NOT NULL,
  PRIMARY KEY(account_id)
) ;

CREATE TABLE IF NOT EXISTS income (
  income_id INT(100) NOT NULL AUTO_INCREMENT,
  value DECIMAL(15,2) NOT NULL,
  date_receiving TIMESTAMP NOT NULL,
  date_demanding TIMESTAMP NOT NULL,
  tp_income VARCHAR(50) NOT NULL,
  account_fk INT(100) NOT NULL,
  description VARCHAR(50) NOT NULL,
  PRIMARY KEY(income_id),
  FOREIGN KEY(account_fk) REFERENCES account(account_id),
) ;

CREATE TABLE IF NOT EXISTS expense (
  expense_id INT(100) NOT NULL AUTO_INCREMENT,
  value DECIMAL(15,2) NOT NULL,
  date_paying TIMESTAMP NOT NULL,
  date_demanding TIMESTAMP NOT NULL,
  tp_expense VARCHAR(50) NOT NULL,
  account_fk INT(100) NOT NULL,
  PRIMARY KEY(expense_id),
  FOREIGN KEY(account_fk) REFERENCES account(account_id)
) ;
