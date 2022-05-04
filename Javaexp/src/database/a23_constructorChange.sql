/*
# 테이블 구조의 변경
1. 개요
	테이블을 사용하다보면 여러가지 상황에 따라 테이블의 구조를 변경하는
	경우가 발생한다. 테이블의 구조를 변경하는데 필요한 명령어를 파악하고,
	테이블 구조의 변경시 발생하는 데이터 처리에 대한 내용을 파악해보자.
	1) 유형
	컬럼의 추가, 컬럼의 삭제, 컬럼의 속성의 변경, 제약조건의 변경 등등.
2. 컬럼의 추가
	alter table 테이블명
	add 컬럼명 데이터유형 [default 디폴트데이터, 제약조건]
	
*/
DROP TABLE emp15;
CREATE TABLE emp14
AS SELECT empno, ename, job, sal FROM emp;
SELECT * FROM emp14;
ALTER TABLE emp14
ADD address varchar2(20) DEFAULT '주소입력없음';
SELECT * FROM emp14;
-- ex) 
CREATE TABLE emp15
AS SELECT deptno, ename, job, sal FROM emp;
ALTER TABLE emp15
ADD bonus number DEFAULT 0; 
SELECT * FROM emp15;
/*
# 컬럼의 삭제
alter table 테이블명 drop column 컬럼명;
 */
SELECT * FROM emp15;
ALTER TABLE emp15
DROP COLUMN job;
 
--ex) 
DROP TABLE emp16;
CREATE TABLE emp16 
AS SELECT * 
FROM emp
WHERE sal in (
		SELECT max(sal) msal
		FROM emp 
		GROUP BY deptno
);
SELECT * FROM emp16;
-- deptno 삭제
ALTER TABLE emp16
DROP COLUMN deptno;

/*
# 테이블 컬럼 변경
1. 테이블의 컬럼의 타입, 크기, 기본 값은 변경이 가능하다.
2. 기본형식은 alter table 테이블명 modify 컬럼명
3. 변경시, 기본 컬럼에 데이터가 없는 경우
	-> 컬럼 타입이나 크기 변경이 자유롭다.
4. 기존 데이터가 있는 경우
	1) 타입 변경은 char와 varchar2만 허용된다
		문자열은 변경이 가능..
	2) 변경한 컬럼의 크기가 저장된 데이터의 크기보다 같거나 클 경우
		변경 가능.
			name varchar(30)
			'himan' 현재 들어간 데이터 기준으로
			name varchar(5)	이상으로 변경은 가능
	3) 숫자 타입에는 정밀도 증가 가능.
5. 기본 값의 변경은 변경 후에 입력되는 데이터부터 적용된다.

 */
CREATE TABLE emp9 
AS SELECT * FROM emp WHERE 1=0;
DELETE FROM emp9; -- emp9테이블의 모든 데이터 삭제.
SELECT * FROM emp9;
ALTER TABLE EMP9 
MODIFY ename varchar2(50);
ALTER TABLE EMP9
MODIFY mgr varchar2(100);
-- ex) 
ALTER TABLE emp9 
MODIFY ename NUMBER;
ALTER TABLE emp9 
MODIFY empno varchar2(50);
ALTER TABLE emp9 
MODIFY hiredate varchar2(50);
CREATE TABLE emp10 
AS SELECT * FROM emp;
select * FROM emp10;
-- # 데이터가 있을 때..
-- 1. 작은 데이터 유형에서 큰데이터 유형(O)
ALTER TABLE EMP100
MODIFY ename varchar2(50);
-- 2. 큰 데이터 유형에서 작은데이터 유형() 
-- 	  varchar2() : 최대 크기 설정되었기 떄문에 변경기준으로 사용하지 않는다.
--	  1) 저장된 데이터 크기의 범위 안에서 가능하다
SELECT max(LENGTH(ename)) FROM emp10;
ALTER TABLE emp10 
MODIFY ename varchar2(40);
ALTER TABLE emp10
MODIFY ename varchar2(5);
-- cf) 저장된 데이터가 6이 최대이기에 5로 변경이 불가능하다.

-- 3. 저장된 데이터가 있으면 다른 유형의 데이터 type 변경(X)
ALTER TABLE emp10 
MODIFY empno varchar2(30);
-- ex) 
SELECT max(LENGTH(job)) FROM emp10;
ALTER TABLE emp101 
MODIFY job varchar2(9);
