/*
# 외래키 설정 관계(foreign key)
1. 연관관계에 있는 두 테이블에 대하여, 왼쪽 테이블에 있는 데이터 기준으로 다른쪽 테이블의
데이터를 입력할 수 있게 하는 것을 말한다.
	기준이 되는 테이블에 데이터가 없으면,연관관계있는 테이블에 다른 데이터를 입력할 때,
	에러가 발생한다.tno
	ex) emp테이블의 deptno입력은 반드시 dept테이블에 depno가 입력되어 있을 때,
	가능하다.
2. 기본 형식
	컬럼명 데이터형 constraint 테이블명_컬럼명_fk references 테이블명(컬럼명)

*/
-- 교수테이블 생성..
CREATE TABLE teacher01(
	tno NUMBER PRIMARY KEY
);
INSERT INTO teacher01 values(10);
INSERT INTO teacher01 values(11);
INSERT INTO teacher01 values(12);
SELECT * FROM teacher01;
DROP TABLE student008;
CREATE TABLE STUDENT008(
	name varchar2(50),
	tno NUMBER CONSTRAINT STUDENT008_tno_fk REFERENCES teacher01(tno)
);
INSERT INTO STUDENT008 VALUES('마길동',11);
SELECT * FROM STUDENT008; 
-- ex)
DROP TABLE product;
CREATE TABLE product (
	pno number(4) PRIMARY key, 
	pname varchar2(20),
	price number(5),
	pcnt number(3)
);
INSERT INTO product VALUES(1,'사과',2000,3);
INSERT INTO product VALUES(2,'수박',8100,2);
INSERT INTO product VALUES(3,'바나나',5100,8);
CREATE TABLE buy10 (
	bno number(4),
	bcnt number(5),
	pno number(4) CONSTRAINT buy_pno_fk REFERENCES product(pno)
);
INSERT INTO buy10 VALUES(2389,3,1);
SELECT *
FROM product p, buy10 b
WHERE p.pno = b.pno;