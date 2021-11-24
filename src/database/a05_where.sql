SELECT deptno, max(sal) "최대급여"
FROM emp
group BY deptno
HAVING max(sal)>=3000; -- 부서번호별 최대 급여, 최대 급여가 3000이상인 경우만 검색
/*
# 정렬처리
1. 정렬은 데이터의 컬럼별로 정렬 기준을 설정하여, 해당 컬럼의 데이터를
기준으로 내림차순, 오름차순으로 처리할 수 있다.
2. 기본형식 
	order by 컬럼명 asc|desc; 	// 오름차순/내림차순 정렬
 */
SELECT DEPTNO , EMPNO ,ENAME 
FROM EMP e	-- 테이블의 별칭 선언
ORDER BY deptno ASC, empno ASC;
-- 1차로 부서번호를 기준으로 정렬하고, 부서번호가 같으면 사원번호를 기준으로 오름차순 정렬
-- ex)
SELECT sal, ename, deptno
FROM EMP e 
ORDER BY sal DESC;

SELECT mgr, empno, ename
FROM EMP e 
ORDER BY mgr asc, empno DESC ;