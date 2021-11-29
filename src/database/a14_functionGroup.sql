/*
# 그룹함수란?
1. 테이블의 전체 행을 하나 이상의 컬럼을 기준으로 그룹화하여
	그룹별로 결과를 출력하는 함수
2. 그룹함수는 통계적인 결과를 출력하는데 자주 사용된다.
3. 기본형식
	select 컬럼명, 그룹함수1, 그룹함수2...
	from 테이블명
	where 조건
	group by 그룹할컬럼
	having 그룹함수의 조건;
	특정 컬럼의 데이터를 그룹별로 함수에 의해 처리하는 것을 말한다.
	부서별로 사원의 최대 급여, deptno(부서), 취대급여 max(sal)
	그룹할 컬럼은 부서이고, 부서별로 급여를 확인하여 최대급여를
	뽑아내는 것을 말한다.
	ex) select deptno, max(sal)
		from emp
		group by deptno;
4. 그룹함수의 종류
	count() : 행의 갯수
	max() : null을 제외한 모든 행의 최대값
	min() : null을 제외한 모든 행의 최소값
	sum() : null을 제외한 모든 행의 합
	avg() : null을 제외한 모든 행의 평균값
	stddev() : null을 제외한 모든 행의 표준편차
	variance() : null을 제외한 모든 행의 분산
	1) 테이블 단위로 해당 컬럼의 전체 데이터를 그룹처리할 때
	는 group by 없이 그룹함수를 사용한다.
	ex) 사원 테이블의 최대연봉, 사원데이터 건수
	select count(*), max(sal)
	from emp;
*/
SELECT count(*), max(sal), min(sal), SUM(sal), AVG(sal)
FROM emp;
-- 전체 데이터의 대한 함수 처리..
SELECT deptno, sal
FROM emp
ORDER BY deptno;
SELECT deptno, count(*), max(sal), min(sal), SUM(sal), AVG(sal)
FROM EMP e 
GROUP BY deptno;
-- 부서번호별로 통계치를 처리해주는 것을 볼 수 있다.
-- GROUP BY deptno에 선언된 기준 컬럼을 지정해서,
-- select deptno, 통계함수를 지정해준다.
-- ex1)
SELECT count(mgr) -- null이 있는 데이터를 제외하고 관리자의 전체 수를 나타낸다.
FROM EMP;
-- ex2)
SELECT mgr, count(*), count(mgr)
FROM EMP e 
GROUP BY mgr;
-- 그룹할 내용을 함수에 의해 만들어 처리된 경우
-- 입사분기별로 인원수를 처리
SELECT TO_CHAR(hiredate, 'Q')
FROM emp;
SELECT TO_CHAR(hiredate, 'Q'), count(*)
FROM EMP
GROUP BY TO_CHAR(HIREDATE, 'Q')
ORDER BY TO_CHAR(HIREDATE, 'Q');
-- ex)
SELECT to_char(hiredate, 'MM') "입사월", count(*) "인원"
FROM emp
GROUP BY to_char(hiredate, 'MM')
order BY to_char(hiredate, 'MM');
-- ex)
SELECT to_char(hiredate, 'Q'), max(sal)
FROM emp 
GROUP BY to_char(hiredate, 'Q')
order BY to_char(hiredate, 'Q');
/*
# 그룹함수 처리 순서
1. 처리할 데이터 select로 선언..
	select to_char(hiredate, 'Q'), sal
2. group할 기준데이터의 컬럼을 지정한다.
	입사분기별로 그룹데이터 처리 - group by to_char(hiredate,'Q')
3. 적용할 group 함수를 선택
	최소, 최대, 평균, 건수..
	최대급여 max(sal)
4. 정렬이 필요하면 order by 정렬기준컬럼.
5. sql 정리
select to_char(hiredate, 'Q'), sal
from emp
group by to_char(hiredate, 'Q')
order by to_char(hiredate, 'Q');
 
-- 사원번호의 짝/홀수를 기준으로 최대 급여 처리..
 */
SELECT mod(empno,2), max(sal)
FROM emp
GROUP BY mod(empno,2)
order BY mod(empno,2);
-- ex)
SELECT job, max(sal)
FROM emp
GROUP BY job
order BY job;
-- ex)
SELECT mgr, decode( mod(nvl(mgr, 0),2),0,'짝수', 1, '홀수','분류안됨'), avg(sal)
FROM emp
GROUP BY mod(nvl(mgr, 0), 2), mgr; -- null은 초기에 처리하고 함수를 적용해야 한다.
-- nvl(mgr,2) : null일 때는 0으로 처리
-- mod( nvl(mgr,0),2) : 0,1로 처리..

/*
# having
그룹함수의 결과값을 기준으로 조건을 처리할 때, 활용된다.

 */
SELECT deptno, max(sal)
FROM EMP e 
GROUP BY deptno;
-- 부서별 최대급여 출력하는데, 최대급여가 3000이상인 경우에 출력할 때는
-- where 조건문이 아닌 having을 활용하여 조건을 처리하여야 한다.
SELECT deptno, max(sal)
FROM EMP e 
GROUP BY DEPTNO 
HAVING max(sal) >= 3000;
-- ex) 
SELECT job, min(sal)
FROM emp 
GROUP BY job 
HAVING min(sal) < 2000;
