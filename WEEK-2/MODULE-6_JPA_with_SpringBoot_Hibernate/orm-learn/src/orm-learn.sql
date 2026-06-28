create schema ormlearn;

SELECT user, host FROM mysql.user;

SELECT user();
SELECT user, host, authentication_string FROM mysql.user;

-- ALTER USER 'root'@'localhost' IDENTIFIED BY 'root123';
-- FLUSH PRIVILEGES;

use ormlearn;
create table country(co_code varchar(2) primary key, co_name varchar(50));

insert into country values ('IN', 'India');
insert into country values ('US', 'United States of America');
