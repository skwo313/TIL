/*
# 데이터베이스 모델링

1. exerd 모델링 툴 설치
	http://exerd.com/update
	
2. ERD
	Entity Relation DIagram
	Entity(객체) : 설계의 물리적 모델링에서 테이블로 만들어질 객체를 말한다.	
	Relation : 엔티티와 엔티티의 연관관계를 설정하는 것을 말한다.
*/
CREATE TABLE book2(
	bookid number(10) PRIMARY KEY,
	bookname varchar2(40),
	publisher varchar2(40),
	price number(10)
);

CREATE TABLE customer(
	custid NUMBER(10) PRIMARY KEY,
	name varchar2(40),
	address varchar2(40),
	phone varchar2(40)
);
CREATE TABLE orders (
	orderid NUMBER PRIMARY KEY,
	custid NUMBER REFERENCES customer(custid),
	bookid NUMBER REFERENCES book2(bookid),
	orderdate DATE ,
	saleprice number
);


