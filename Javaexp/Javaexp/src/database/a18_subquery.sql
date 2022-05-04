/*
# subquery
1. 개요
하나의 SQL 명령문의 결과를 다른 SQL 명령문에 전달하기 위해 두 개 이상의
SQL 명령문을 하나의 SQL명령문으로 연결하여 처리하는 방법
서브쿼리의 필요성
예 : 교수 테이블에서 '전은지' 교수와 직급이 동일한 모든 교수의 이름 검색
ex) ALLEN과 동일한 부서에 
2. 처리방식
	1. 교수 테이블에서 '전은지' 교수의 직급 검색 SQL 명령문 실행
	2. 교수 테이블의 직급 칼럼에서 1에서 얻은 결과 값과 동일한 직급을 가진 교수
		검색 명령문 실행
	1, 2 SQL 명령문 처리과정을 통합하여 하나의 SQL 명령문으로 처리
3. 실행순서
	1) main query에 최하단에 있는 부분부터 실행해서
		결과를 가지고 상위에 있는 query로 전달한다.
*/
-- 사원테이블에서 최고 급여자의 정보를 출력
SELECT *
FROM emp 
WHERE sal = (
	SELECT max(sal)
	FROM emp
);
-- 입사분기별로 최고 급여자를 출력..
-- 1. 입사분기별 최고급여
SELECT to_char(hiredate, 'Q'), max(SAL)
FROM emp 
GROUP BY to_char(hiredate, 'Q');
-- 2. 다중열 subquery 설정..
SELECT *
FROM emp e
WHERE (to_char(hiredate, 'Q'), sal) in(
	SELECT to_char(hiredate, 'Q'), max(SAL)
	FROM emp 
	GROUP BY to_char(hiredate, 'Q')
)
ORDER BY to_char(hiredate, 'Q');

-- ex)
SELECT *
FROM emp e 
WHERE (job, sal) IN (
	SELECT job, max(sal)
	FROM emp 
	GROUP BY job
);
-- where (job,sal ) = (단일 데이터 subquery)
-- where (job,sal ) in (한개 이상 데이터 subquery)
/*
# inline 뷰 처리(subquery)
0. 뷰(view) : 실제물리적으로 만든 테이블이 아닌 프로그램(sql) 상 만든 가상의 테이블을 말한다.
	==> 사원정보, 부서정보 조인 가상의 뷰로 필요로 하는 컬럼을 선택해서
	하나의 테이블로 만들어 사용한다.
1. 조인할 테이블을 ()로 만들어 데이터를 일단, 먼저 처리한 후에
	그 이후에 다른 테이블과 조인 관계를 처리할 때 사용된다.
 */
-- 부서별 최고 급여자의 정보를 출력..
SELECT *
FROM (
	SELECT deptno, max(sal) msal
	FROM emp 
	GROUP BY deptno
	) a, emp e
WHERE a.deptno = e.deptno
AND a.msal = e.sal;
-- INLINE VIEW라고 사용자 정의 QUERY를 가상의 테이블(뷰)로 만들어
-- 연관관계 있는 테이블과 조인해서 데이터를 처리하는 것을 말한다.
-- ex)
SELECT *
FROM (
	SELECT dept
	FROM emp 
	WHERE deptno=10
	) a, emp b 
WHERE a.deptno = b.deptno
AND a.sal = b.sal;
/* inline view 처리하기
 * 1. inline 들어갈 query를 만들고, () a 소괄호로 묶어서 alias명을 지정한다.
 * 2. join 테이블 alias 명을 지정한다.
 * 3. 두 테이블의 join 조건을 where 조건으로 처리한다.
 */
--ex) 
SELECT b.*
FROM (SELECT deptno, max(hiredate) HIREDATE 
	  FROM emp 
	  GROUP BY deptno
	  ) a, emp b
WHERE a.deptno = b.deptno
AND a.hiredate = b.hiredate;
