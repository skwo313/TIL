/*
1. subquery란 무엇인가 기본 형식을 기술하세요.
	서브쿼리(subquery)란 다른 쿼리 내부에 포함되어 있는 SELECT 문을 의미합니다.
	서브쿼리를 포함하고 있는 쿼리를 외부쿼리(outer query)라고 부르며, 
	서브쿼리는 내부쿼리(inner query)라고도 부릅니다.
	서브쿼리는 반드시 괄호(())로 감싸져 있어야만 합니다.

2. inline view란 무엇인가? 기본 예제를 통해 기술하세요
	사용자 정의 QUERY를 가상의 테이블(뷰)로 만들어
	연관관계 있는 테이블과 조인해서 데이터를 처리하는 것을 말한다.
	SELECT *
	FROM (
		SELECT deptno, max(sal) msal
		FROM emp 
		GROUP BY deptno
		) a, emp e
	WHERE a.deptno = e.deptno
	AND a.msal = e.sal;
	
3. 아래와 같은 문제를 해결하기 위하여 subquery를 이용해서 처리
	최저 급여자의 사원정보 조회
	1) 최저 급여 처리
	*/
	SELECT min(sal)
	FROM emp;
	/*
	2) 최저 급여에 해당하는 사원정보 처리
	*/
	SELECT * 
	FROM (
		SELECT min(sal) asal
		FROM emp
	) a, emp b
	WHERE a.asal = b.sal;
	/*
4. 연봉이 2000~4000인 사원의 부서번호, 사원명, 사원번호
	이름의 subquery 테이블(inline view)과 부서테이블과 join하여 출력하세요
*/
	SELECT a.deptno, a.ename, a.empno
	FROM (
		SELECT *
		FROM emp 
		WHERE sal BETWEEN 2000 AND 4000
	) a, dept d 
	WHERE a.deptno = d.deptno;
	
/*
5. 부서별 최저 연봉의 사원 정보와 부서정보를 join하여 출력하세요
*/
	SELECT *
	FROM (
		 SELECT deptno, min(sal) asal 
		 FROM emp 
		 GROUP BY deptno
	) a, dept d 
	WHERE a.deptno = d.deptno;
/*
6. 복사테이블을 만드는 형식 2가지를 기술하세요
	1. 데이터와 구조까지 복사
	-- create table 테이블명
	-- as select * from 테이블명;
	2. 구조만 복사
	-- create table 테이블명
	-- as select * from 테이블명;
	-- where 1=0;
	
7. emp99(데이터+구조), emp98(구조)만 복사 테이블을 만드세요
*/
	CREATE TABLE emp99
	AS SELECT * FROM emp;
	
	CREATE TABLE emp98
	AS SELECT * FROM emp
	WHERE 1=0;
/*
8. 데이터 입력 기본형식을 기술하고, emp99에 전체 데이터를 입력하고,
	일부컬럼을 입력하여 처리하세요.
-- 1. 열단위 입력 : insert into 테이블명(컬럼명1, 컬럼명2...) values(데이터1, 데이터2)
-- 2. 테이블 전체입력 : insert into 테이블 values(데이터1, 데이터2..)
*/
	INSERT INTO emp99 values(1000,'홍길동','사원',9999,sysdate,1500,100,20);
	INSERT INTO emp99(ename, sal) values('마길동', 2000);
	SELECT * FROM emp99;
	
/*
9. 테이블의 수정/삭제 기본형식을 기술하세요.
 1. 수정 기본형식
 	update 테이블명
	set 컬럼1 = 변경할데이터,
		컬럼2 = 변경할데이터,
		컬럼3 = 변경할데이터
	where 조건문
 2. 삭제 기본형식
 	delete 
 	from 테이블명
 	where 조건문	
	
10. 복사데이터가 있는 emp99을 기준으로
		1/4분기에 입사한 사람의 보너스(comm)는 급여의 30% 수정하세요
*/		
	UPDATE emp99
		SET comm = sal*0.3
	WHERE to_char(hiredate, 'Q') = '1';

	SELECT * 
	FROM emp99
	WHERE to_char(hiredate, 'Q') = '1';
/*
11. 날짜데이터의 처리형식을 기술하고, emp99에 특정한 날짜로 등록/수정처리하세요
	to_date('2021/01/01' , 'YYYY/MM/DD')
*/
	SELECT * FROM emp99;
	INSERT INTO emp99(ename, hiredate) VALUES('석광우', to_date('2021/01/01', 'YYYY/MM/DD'));
	UPDATE emp99 
		SET hiredate = to_date('2021/03/13', 'YYYY/MM/DD')
	WHERE ename = '석광우';
