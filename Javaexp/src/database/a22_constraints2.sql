-- unique : 다른 데이터와 식별되게 입력하지 않으면 에러 발생
CREATE TABLE student08(
	sno number(4) CONSTRAINT student08_sno_uq unique
);
SELECT *
FROM sys.ALL_CONSTRAINTS 
WHERE TABLE_NAME = 'STUDENT08';
INSERT INTO student08 values(10); -- 같은 데이터는 입력이 안된다
INSERT INTO student08 values(null); 
SELECT * FROM student08;	-- unique는 null의 중복은 허용한다
-- ex) 
CREATE TABLE student09 (
	sno number(10) CONSTRAINT student09_sno_uq UNIQUE,
	name varchar2(10),
	kors number(10)
);
DROP TABLE student09;
INSERT INTO student09(sno, name,kors) VALUES (1613088, '홍길동', 80);
INSERT INTO student09(sno, name,kors) VALUES (1613088, '마길동', 89); -- 처리x
SELECT * FROM student09;
-- PRIMARY KEY : 데이터를 입력시 중복도 허용하지 않고, null도 허용되지 않는
-- 제약조건을 설정할 때, 사용된다.
CREATE TABLE student10 (
	sno number(3) CONSTRAINT student10_sno_pk PRIMARY KEY 
);
SELECT *
FROM sys.all_constraints 
WHERE TABLE_NAME = 'STUDENT10';
INSERT INTO student10 VALUES(10);
INSERT INTO student10 VALUES(10);	-- 중복데이터 입력도
INSERT INTO student10 VALUES(null);	-- null입력도 허용되지 않는다.

-- ex)
CREATE TABLE student11 (
	sno number(3) CONSTRAINT student11_sno_pk PRIMARY KEY,
	name varchar(10) CONSTRAINT student11_name_nn NOT NULL,
	kor NUMBER(3),
	eng NUMBER(3),
	math NUMBER(3)
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME = 'STUDENT11';
INSERT INTO student11 values(1,'홍길동',80,90,100);
INSERT INTO student11 values(2,'마길동',80,90,100);
INSERT INTO student11 values(3,'null',80,90,100);
INSERT INTO student11 values(null,'마길동',80,90,100);
SELECT * FROM student11;
/*
# check
1. 특정한 데이터를 조건이나 범위를 지정해서, 해당 범위에 데이터만 입력되도록 처리하는 것을 말한다.
2. 형식
	컬럼명 데이터유형 constraint 제약명 check (조건문-where에 들어가는 sql문장)
	컬럼명 데이터유형 check (조건문-where에 들어가는 sql문장)
*/
CREATE TABLE student12 (
	gender varchar(1) check( gender IN('F','M') )
);
INSERT INTO student12 VALUES('F');
INSERT INTO student12 VALUES('M');
INSERT INTO student12 VALUES('K');
INSERT INTO student12 VALUES(null);
SELECT * FROM student12;
CREATE TABLE student13 (
	kor number(3) CHECK( kor BETWEEN 0 AND 100) 
);
INSERT INTO student13 VALUES(99);
INSERT INTO student13 VALUES(101);
--ex) 
CREATE TABLE student14 ( 
	sno number(3) CONSTRAINT student14_sno_pk PRIMARY KEY,
	grade number(1) check( grade BETWEEN 1 AND 4),
	name varchar2(10) CONSTRAINT student14_name_nn NOT NULL,
	kors NUMBER(5) CHECK( kors BETWEEN 1 AND 100),
	eng NUMBER(5) CHECK( eng BETWEEN 1 AND 100),
	math NUMBER(5) CHECK( math BETWEEN 1 AND 100)
);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME LIKE 'STUDENT%';
INSERT INTO student14 values(1,2,'홍길동',80,90,80);
SELECT * FROM student14; 



