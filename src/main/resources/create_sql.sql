drop table employee;
CREATE SEQUENCE emp_seq START WITH 1;
create table employee( id number DEFAULT emp_seq.nextval primary key ,
name varchar(45),
salary number(6),
address varchar(45),
deptid number,
created_by timestamp default sysdate NOT NULL
);

drop table Department;
create table Department (
dept_id number primary key,
dept_name varchar(45)
);