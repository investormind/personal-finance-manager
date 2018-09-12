CREATE DATABASE IF NOT EXISTS personal_finance_db;
USE personal_finance_db;

DROP TABLE IF EXISTS financial_record;
CREATE TABLE financial_record (
	id	int(9) NOT NULL AUTO_INCREMENT,
    amount double NOT NULL,
    from_date date NOT NULL,
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS financial_record;
CREATE TABLE financial_record_history (
	id	int(9) NOT NULL AUTO_INCREMENT,
    amount double NOT NULL,
    from_date date NOT NULL,
    to_date date NOT NULL,
    interest double NOT NULL,
    PRIMARY KEY (id)
);