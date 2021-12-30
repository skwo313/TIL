/*
# DML(데이터 조작어) - Data manipulation Language
1. 테이블에 세로운 데이터를 입력하거나 기존 데이터를 수정 또는 삭제하기 위한
명령어이다.
2. 종류
	insert : 입력 처리 명령어
	update : 수정 처리 명령어
	delete : 삭제 처리 명령어
	merge : 병합처리 명령어(논리적 테이블의 병합-수정과 동시에 입력)
3. 트랜잭션
	여러 개의 명령문을 하나의 논리적인 작업단위로 처리하는 기능을 말한다.
	명령어 종류 : commit(정상종료 확정), rollback(비정상종료 복구)
	ex) DB클라이언트가 접속해서 변경을 했을 때, 본인 계정으로만
		변경된 데이터가 보인다(다른 계정으로 접근하면 변경되지
		않는 데이터가 보임). 이때, commit하는 순간 현재 클라이언트
		뿐만아니라 다른 계정으로 접속하덜도 변경되게 처리된다.
# 데이터 입력 처리
1. 테이블에 데이터를 입력하기 위한 명령어 insert 구문을 말한다.
2. 입력방법
	1) 단일 행 입력 : 한번에 하나의 행을 테이블에 입력하는 구문
	2) 다중 행 입력 : 서브 쿼리(subquery)를 이용하여
		한번에 여러 행을 동시에 입력하는 구문
3. 단일행 입력 방법
	1) 기본 구문
		insert into 테이블명(컬럼1, 컬럼2...) values(데이터1,데이터2);
		insert into 테이블명 values(테이블 구조 순서에 따른 데이터1, 데이터2);
4. 다중행 입력
	1) 데이터를 하나의 테이블에 여러 행을 한번에 입력하는 query를 말한다.
	2) 형식
		- insert명령문에서 서브쿼리로 다른 테이블에서 조회해와서 입력처리
		- insert명령문에 의해 한번에 여러행을 동시에 입력.
		- 기타형식
			insert all
			first insert
*/
-- 복사테이블 만들기..
-- create table 테이블명
-- as select * from 테이블명;
-- 기존에 있는 테이블을 복사(데이터와 구조)하여
CREATE TABLE emp100
AS SELECT * FROM emp;
SELECT * FROM emp100;
-- ex)
CREATE TABLE emp101 
AS SELECT * FROM emp100;
SELECT * FROM emp101;
-- # 구조만 복사하는 테이블 만들기
SELECT *
FROM EMP e 
WHERE 1=0;
-- false로 데이터가 보이지 않는다. 하지만, 테이블의 컬럼을 가지고 있는 것을
--	볼 수 있다.
CREATE TABLE emp102 
AS SELECT * FROM emp 
WHERE 1=0;
SELECT * FROM emp102; -- 테이블의 구조만 복사되었음..
-- ex)
CREATE TABLE dept100
AS SELECT * FROM dept
WHERE 1=0;
SELECT * FROM dept100;
-- # 데이터 입력 처리.
-- 1. 열단위 입력 : insert into 테이블명(컬럼명1, 컬럼명2...) values(데이터1, 데이터2)
INSERT INTO emp100(empno, ename) values(7900, '홍길동');
SELECT max(empno) FROM emp100;
-- ex)
INSERT INTO emp100(empno, ename, job) values(7935, '마길동', 'SALESMAN');
SELECT * FROM emp100
WHERE empno=7935;
-- 2. 테이블 전체입력 : insert into 테이블 values(데이터1, 데이터2..)
--		컬럼을 지정하지 않고, 테이블에 있는 모든 컬럼을 순서별로 데이터 유형에 맞게
--		입력한다
SELECT * FROM emp102;
INSERT INTO emp102 VALUES(1000, '홍길동', '사원', 9999, sysdate,3500,100,10);
SELECT * FROM emp102;
-- ex)
INSERT INTO emp102 values(2000, '마길동', '팀장', 8888, sysdate, 4000,400,20);
SELECT * FROM emp102;
/* 
# 날짜 데이터 처리
1. sysdate : 현재 날짜/시간으로 date타입 컬럼에 현재 날짜/시간 입력한다.
2. to_date('문자열데이터', '문자열데이터의 입력형식') :
	문자열 데이터를 지정된 입력양식에 맞게 data타입 컬럼에 날짜/시간 입력
	ex) to_date('2021/06/23', 'YYYY/MM/DD')
 */
INSERT INTO emp102(ename,hiredate) values('신길동', 
		to_date('2021/11/30','YYYY/MM/DD') );
-- ex) 	
INSERT INTO emp102(ename,hiredate) VALUES('석광우',
		to_date('1997/03/13', 'YYYY/MM/DD') );

SELECT * FROM emp102;



