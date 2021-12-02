/*
# 데이터 무결성 제약조건의 개념
1. 데이터의 정확성과 일관성을 보장.
2. 데이터의 정확성을 유지하여 다양한 종류의 업무규칙을 고려함
	1) student테이블에서 학년 데이터는 1,2,3,4 중의 하나만 
		입력.
	2) 모든 학번은 유일하게 처리.
	3) student테이블의 지도교수 번호는 professor 테이블의
		교수번호 중의 하나와 반드시 일치
3. 데이터 무결성 제약조건의 장점
	1) 테이블 생성시 무결성 제약조건을 정의 가능.
		- 생성후 제약조건 설정도 가능.
	2) 테이블에 대해 정의, 데이터 딕션너리에 저장되므로
		응용프록램에서 입력된 모든 데이터에 대해 동일하게 적용
	3) 제약조건을 활성화, 비활성화 할 수 있는 융통성이 있다.
4. 무결성 제약조건의 종류
	1) not null : 열이 null을 포함할 수 없음..
	2) unique key : 테이블의 모든 행에서 고유한 값을 갖는 열 또는 열조합
		을 지정해야 한다. ex) 학번, 주민번호, 사원번호를 중복되지 않아야 한다.
		ps) null은 입력이 가능하고, 여러가지 null은 중복이 가능..
	3) primary key : 해당 컬럼 값은 반드시 존재해야 하며 유일해야 한다.
		not null과 unique가 결합된 형태.
		주로 테이블에서 식별해야할 컬럼 즉 key를 설정할 때, 사용된다.
		ex) emp테이블의 empno, dept테이블의 deptno
	4) foreign key : 한 열과 참조된 테이블의 열간에 외래 키 관계를 설정하고 시행
		ex) 사원의 테이블의 부서번호는 반드시 부서테이블에 있는 부서번호이어야 
		한다.
	5) check : 해당 컬럼에 저장 가능한 데이터 값의 범위나 조건을 지정처리
		ex) student 테이블의 학년을 1,2,3,4만 데이터로 넣을 수 있다.
*/
SELECT *
FROM sys.ALL_CONSTRAINTS 
WHERE table_name LIKE 'EMP%';
-- 내장된 테이블로 현재 오라클 서버에 있는 모든 제약 조건을 볼 수 있다.
-- not null
-- 컬럼명 데이터유형 constraint 테이블명_컬럼명_nn not null
CREATE TABLE student01(
	name varchar(30) CONSTRAINT student01_name_nn NOT NULL --이름지정
);
CREATE TABLE student02(
	name varchar(30) NOT NULL	-- 자동으로 규칙에 의해서 constraint이름 지정
);
SELECT *
FROM sys.ALL_CONSTRAINTS 
WHERE table_name LIKE 'STUDENT%';
INSERT INTO student01(name) values('himan');
-- name은 제약조건을 지정했기 떄문에 에러가 발생한다.
INSERT INTO student01(name) values(null);

--ex)
CREATE TABLE student05 (
	name varchar2(30) CONSTRAINT student05_name_nn NOT NULL,
	kors number(3)
);
DROP TABLE student06; -- drop table 테이블명;   해당 테이블 삭제
CREATE TABLE student06 (
	name varchar2(30) NOT NULL,
	kors number(3)
);
INSERT INTO student05 VALUES('홍길동',85);
INSERT INTO student06(NAME) VALUES(null);
SELECT *
FROM sys.ALL_CONSTRAINTS
WHERE TABLE_NAME LIKE 'STUDENT%';
SELECT * FROM student05