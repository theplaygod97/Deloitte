fkey demo
---------
create table order1(
OrderId integer primary key,
OrderDate date,
productId integer not null
)

drop table order

create table product1(
productId integer primary key,
productName varchar2(20),
Price integer not null,
qoh integer not null
);

select * from order1;
select * from product1;
alter table order1 add constraint fkproductId foreign key(productId) references product1(productId);

insert into order1 values(12,'2-10-2019',100)
insert into product1 values(100,'Biscuit',10,20)




-----------------------------------------------------------------------------------------------------------------------------
Delete cascade

CREATE TABLE SECTION (
SECTION_ID INTEGER CONSTRAINT S_ID CHECK (SECTION_ID > 0),
SECTION_NAME CHAR(30) CONSTRAINT S_NAME NOT NULL,
BOOK_COUNT INTEGER,
CONSTRAINT SECT_PRIME PRIMARY KEY (SECTION_ID))

CREATE TABLE BOOK
(
ISBN INTEGER CONSTRAINT B_ISBN CHECK (ISBN BETWEEN 1 AND 2000),
TITLE VARCHAR2(200) CONSTRAINT B_TITLE NOT NULL,
AUTHOR VARCHAR2(50) CONSTRAINT B_AUTH NOT NULL,
LENT_DATE DATE,
RETURNED_DATE DATE,
TIMES_LENT NUMBER(6),
SECTION_ID NUMBER(3),
CONSTRAINT BOOK_PRIME PRIMARY KEY (ISBN),
CONSTRAINT BOOK_SECT FOREIGN KEY (SECTION_ID) REFERENCES SECTION(SECTION_ID)
ON DELETE CASCADE)

INSERT INTO SECTION values(1,'ABC',78);
INSERT INTO SECTION values(2,'XYZ',65);
 
insert into BOOK values(1,'java','james',to_date('3/3/09','mm/dd/yy'),to_date('3/4/09','mm/dd/yy'),10,1);


delete from book where section_id = 1

select * from book

drop table book

---------------------------------------------------------------------------------------------------------------------
join demo

create table Suppliers
(
   supplier_id varchar(20),
   supplier_name varchar(20)
)
/

create table Orders
(
   order_id varchar(20),
   supplier_id varchar(20),
   order_date date
)
/

insert into Suppliers values('10000','IBM')
insert into Suppliers values('10001','Hewlett Packard')
insert into Suppliers values('10002','Microsoft')
insert into Suppliers values('10003','TCS')

insert into Orders values('1','10000',to_date('3/3/09','mm/dd/yy'))
insert into Orders values('2','10000',to_date('7/5/10','mm/dd/yy'))
insert into Orders values('3','10001',to_date('12/8/10','mm/dd/yy'))
insert into Orders values('4','20001',to_date('12/8/10','mm/dd/yy'))


select supplier_name,order_date
from suppliers,orders
where suppliers.supplier_id = orders.supplier_id

select suppliers.supplier_id,supplier_name,order_date
from suppliers,orders
where suppliers.supplier_id = orders.supplier_id
 
select s.supplier_id,s.supplier_name,o.order_date
from suppliers s,orders o
where s.supplier_id = o.supplier_id

----------------------------------------------------------------------------

Sub query

select roll,Name from Stu where Roll > any(SELECT rOLL FROM FEES)

select roll,Name from Stu where Roll > aLL(SELECT rOLL FROM FEES)

SELECT AMOUNT FROM FEES WHERE ROLL =(SELECT ROLL FROM STU WHERE NAME ='Sai')
                                              
                                              
----------------------------------------------------------------------------


Corealted sub query
                                              
create table emp100
(
	empId integer,
	empName varchar(20),
	sal integer,
	deptno integer
)


insert into emp100 values(1,'Tufail',980000,1);
insert into emp100 values(2,'Ahmed',80000,1);
insert into emp100 values(3,'Khan',90000,2);
insert into emp100 values(4,'Tarun',20000,2);
insert into emp100 values(5,'Neha',950000,2);

update emp100 a
         set a.sal = (select avg(sal) from emp100 b where a.deptno = b.deptno )
where sal < (select avg(sal) from emp100 c where a.deptno = c.deptno)
                                              
delete from emp100 a
        where a.sal = (select max(sal) from emp100 b where a.deptno = b.deptno )

select * from emp100

                                             


