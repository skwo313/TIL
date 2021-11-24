/*
# 여러가지 기능 조건문 처리
1. between
	1) 특정한 데이터를 범위를 설정하여 검색할 때, 사용된다.
	2) 형식
		컬럼명 between 시작범위 and 마지막범위
		==> 컬럼명 ==> 시작범위 and 컬럼명 <= 마지막 범위
*/
-- 급여가 1000에서 2000사이의 데이터 출력
SELECT *
FROM emp 
WHERE sal BETWEEN 1000 AND 2000;
-- ex)
SELECT *
FROM emp 
WHERE empno BETWEEN 7600 AND 7900;
/*
# in 구문 
1. 데이터는 논리연산자 or에 의해서, 여러가지 데이터의 합집합에
대한 처리를 할 수 있다
2. or 처리 형식은 컬럼명 = 데이터1 or 컬럼명 = 데이터2로 컬럼명과
데이터를 or로 계속 나열해야 한다.
3. in 구문을 효과적으로 활용하면 보다 간편하게 or 데이터를 처리할 수 있다.
4. 기본형식
	컬럼명 in (데이터1, 데이터2, ...)
*/
SELECT ename, deptno4
FROM emp 
WHERE deptno = 10 OR detno = 20;
SELECT ename, deptno
FROM emp 
WHERE deptno IN (10,20);
-- ex)
SELECT *
FROM emp 
WHERE empno in(7499, 7566, 7369);
-- ex2)
SELECT *
FROM emp 
WHERE job IN ('SALESMAN','MANAGER');
/*
# IN 구문을 활용한 SUNQUERY
1. 데이터는 특정한 query의 결과를 통해서, 다시 결과내용을 처리할 때가 있다.
2. 이것을 subquery라고 한다.
3. 예를들어 부서번호가 30인 사원번호를 먼저 데이터를 추출한 후, 이에서 도출한
	사원번호를 다시 조회 조건 정보에 검색하게 처리할 수 있다.
4. 이때, 부서번호가 30인 사원번호는 main query인 사원정보를 조건으로 하는 
	데이터 호출에 subquery로 활용되는 것이다
5. subquery의 사용내용을 in 구문에 활용하여 데이터를 or로 처리할 수 있다.

* */
SELECT empno
FROM emp 
WHERE deptno = 30; -- 부서번호가 30번인 사원번호를 호출

SELECT *
FROM emp 
WHERE empno IN (
	SELECT empno
	FROM emp 
	WHERE deptno = 30
);
-- ex)
SELECT job
FROM emp 
WHERE sal BETWEEN 1000 AND 3000 

SELECT *
FROM emp 
WHERE job IN (
	SELECT job 
	FROM emp 
	WHERE sal BETWEEN 1000 AND 3000
);
/*
데이터를 1차로 검색내용을 기준으로
2차로 검색처리하는 것이라고 보면 된다.
1차로 우리반에 있는 학생들 중에 여성인 학생들을 먼저 데이터를 추출하고 
 이 학생들을 
 * */
