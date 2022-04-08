mysql> create database library;
Query OK, 1 row affected (0.27 sec)

mysql> use library;
Database changed
mysql> create table books(callno varchar(400), name varchar(200), author varchar(700), publisher varchar(700), quantity int (700), issued int(700), primary key(callno));
ERROR 1439 (42000): Display width out of range for column 'quantity' (max = 255)
mysql> create table books(callno varchar(40), name varchar(200), author varchar(70), publisher varchar(70), quantity int (70), issued int(70), primary key(callno));
Query OK, 0 rows affected, 2 warnings (1.84 sec)

mysql> create table issuebook(callno varchar(200) not null , studentid varchar(400), studentname varchar(300), studentmobile varchar(400), issuedate date, returnstatus varchar(300));
Query OK, 0 rows affected (4.12 sec)

mysql> create table librarian(id int(200),name varchar(200), password varchar(400),email varchar(400), mobile varchar(300),primary key (id));
Query OK, 0 rows affected, 1 warning (3.25 sec)
