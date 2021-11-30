/* 
# 조인
1. 하나의 SQL명령문에 의해 여러 테이블에 저장된 데이터를 한번에 조회할 수 
	있는 기능을 말한다.
2. 관계형 데이터베이스 분야의 표준으로 자리잡고 있다.
3. 두개 이상의 테이블을 결합한다는 의미이다.
*/
-- 1. 조인이 필요하지 않는 경우,
--		사원 정보테이블에서 해당 관련 부서 정보를 가져와서
--		부서번호 정보를 통해서 부서정보를 출력할 때,
--		ex) 연봉이 3000이상인 사원이 있는 부서번호를 가져오자
SELECT deptno
FROM emp
WHERE sal >= 3000;
--	ex) 위에서 확인된 부서번호를 통해서 부서테이블의 상세 정보를 확인
SELECT *
FROM dept 
WHERE deptno IN (10,20);
-- 2. 조인이 필요한 경우
--		연봉이 3000이상인 사원의 정보와 부서정보를 한꺼번에 확인할 때,
SELECT empno, ename, sal, e.deptno, dname, loc 
FROM emp e, dept d
WHERE e.deptno = d.deptno 
AND sal >= 3000;
-- SELECT 선택 컬럼 : 중복된 컬럼만 alias 이름을 지정해도 된다. e.deptno
-- from 테이블명 별칭, 테이블명 별칭 : 조인할 테이블을 별칭과 함께 나열한다.
-- where 별칭.컬럼명 = 별칭,컬럼 : 두개 테이블에서 공통으로 연결한 컬럼명을
--		별칭과함께 join 해준다. inner join이라고 한다.
-- and 기타조건 : 그 외 조인한 내용의 데이터를 기준으로 조회 조건을 처리한다.
--1. 개별 테이블 확인
--		연봉이 4000이상인 테이블 확인 
SELECT *
FROM emp
WHERE sal>=4000;
--		연봉이 4000이상인 사원정보의 부서번호를 확인하고, 해당 부서 정보를 출력
SELECT *
FROM dept 
WHERE deptno = 10;
--	join관계를 통해서 연봉 4000이상인 사원과 연결되어있는 부서정보와 함꼐 출력.
SELECT e.*, d.*	-- 사원의 모든 컬럼, 부서테이블의 모든 컬럼
FROM EMP e , DEPT d -- 두개 테이블으리 사용하되 alias 이름으로 e,d를 지정..
WHERE e.DEPTNO = d.DEPTNO -- 연관관계에 있는 컬럼인 deptno를 조인 처리..
	AND sal >= 4000;	-- 조건이 4000이상을 설정..
	
-- ex)
SELECT *
FROM emp 
WHERE job = 'MANAGER';
SELECT *
FROM dept 
WHERE deptno IN(10,20,30);
SELECT e.*, d.*
FROM EMP e , DEPT d
WHERE e.deptno = d.deptno
AND job = 'MANAGER';
-- 조인 관계에 있는 특정한 컬럼을 출력하기..
--	사원명, 직책명, 부서명, 부서위치
SELECT ename, job, dname, loc 
FROM emp e, DEPT d 
WHERE e.DEPTNO = d.deptno 
AND job = 'MANAGER';
-- 출력할 컬럼을 지정하되 연관관계가 없는 경우는 그대로 컬럼명을 설정하고
-- 공통된 컬럼이 있을 때는 테이블명을 별칭으로 지정하여 처리한다.
-- ex)
SELECT e.DEPTNO, dname, ename, sal
FROM EMP e , DEPT d
WHERE e.DEPTNO = d.DEPTNO 
AND sal BETWEEN 1000 AND 3000;
-- 부서위치별로 평균 급여
SELECT loc "부서위치", trunc( avg(sal) )
FROM EMP e, DEPT d
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY loc;

-- ex)
SELECT dname, max(SAL), min(sal)
FROM EMP e , DEPT d 
WHERE d.DEPTNO = e.DEPTNO 
GROUP BY dname;

-- 1982-01-23 max
-- 1980-12-17 min
-- 날짜형 데이터의 함수 max는 최근 데이터, 최근에 날짜로 등록한 데이터, 최근에 입사한 날짜
-- 					min는 가장 먼저인 날짜, 최초로 등록한 데이터, 가장 먼저 입사한 날짜 
SELECT dname, min(hiredate) "최초입사", max(hiredate) "최근입사"
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO
GROUP BY dname;
-- ex)
SELECT loc, min(hiredate)
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY loc;
-- 지금까지 함수, where조건, 그룹함수, join을 활용한 여러가지 sql 연습예제
--ex1)
SELECT dname, loc, ename, to_char(hiredate, 'Q')
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND TO_CHAR(hiredate, 'Q')= '1';
--ex2) 
SELECT ename, dname
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND dname = 'SALES';

-- ex3)
SELECT ename, dname, loc,
		CASE WHEN to_number(to_char(hiredate, 'Q'))<3 THEN '상반기'
			 ELSE '하반기'
		END "상/하반기"
FROM EMP e ,DEPT d 
WHERE e.DEPTNO = d.DEPTNO
AND to_number(to_char(hiredate, 'Q')) >= 3;






