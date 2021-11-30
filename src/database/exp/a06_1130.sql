/*
1. join 구문의 기본형식을 기본예제와 함꼐 기술하세요
	SELECT 선택 컬럼 	-- 중복된 컬럼만 alias 이름을 지정
	from 테이블명 별칭, 테이블명 별칭 	-- 조인할 테이블을 별칭과 함께 나열
	where 별칭.컬럼명 = 별칭.컬럼 : 두개 테이블에서 공통으로 연결한 컬럼명을
		별칭과함께 join 해준다.
	and 기타조건 : 그 외 조인한 내용의 데이터를 기준으로 조회 조건을 처리한다.
	
2. 사원번호의 짝/홀 기준으로 최근/최초 입사일자를 출력하세요
*/
	SELECT decode(MOD(empno,2), 0, '짝','홀') "홀/짝",
		max(hiredate) "최근입사",
		min(hiredate) "최초입사"
	FROM emp
	GROUP BY decode(MOD(empno,2), 0, '짝','홀');
								
/*
3. 전체 평균연봉을 확인하고, 평균연봉이상은 상급, 이하는 하급으로 나누어,
부서명 사원명 연봉 연봉구분을 부서번호가 10,20인 경우를 출력하세요.
*/
	SELECT trunc(avg(sal))
	FROM emp;	--2077

	SELECT e.DEPTNO, dname, ename, sal,
		CASE WHEN sal >= 2077 THEN '상'
			ELSE '하'
		END "연봉구분"
	FROM emp e, dept d
	WHERE e.DEPTNO = d.DEPTNO
	AND e.DEPTNO IN(10,20)
	ORDER BY DEPTNO;
/*
4. 연봉이 3000미만일 때, 부서이름, 팀(청/백-사원번호기준 0/1), 사원명을 출력하세요
*/
	SELECT ename, dname, decode(MOD(empno,2), 0 , '청팀', '홍팀') "팀", sal
	FROM EMP e , DEPT d 
	WHERE e.DEPTNO = d.DEPTNO 
	AND sal<3000;
/*
5. non equi 기본 형식을 기술하세요.
	select 컬럼1, 대상컬럼, 등급..
	from 테이블1, 테이블2
	where 대상컬럼 between 범위1 and 범위2
	
6. 부서별 최고급여와 그 등급을 출력하세요.
*/
	SELECT deptno, max(sal) "최고급여", grade "등급"
	FROM EMP e , SALGRADE s 
	WHERE sal BETWEEN losal AND hisal
	AND sal in (
		SELECT max(sal)
		FROM emp
		GROUP BY deptno 
	)
	GROUP BY deptno, grade
	ORDER BY deptno;

	SELECT deptno, max(sal), grade
	FROM (
		SELECT deptno, max(sal)
		FROM emp 
		GROUP BY DEPTNO 
		) e, salgrade s
	WHERE e.sal BETWEEN losal AND hisal;
/*
7. emp, dept, salgrade 3개를 조인하여, 1등급에 해당하는 부서명, 사원명, 급여,
	등급을 출력하세요.
*/
SELECT dname, ename, sal
FROM EMP e , DEPT d , SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND grade=1;
/*
8. equi join과 outer join의 차이점을 기술하세요
	equi join에서는 양측 칼럼이 같은 경우에만 출력
	outer join에서는 한쪽이 null값이여도 (+)으로 null로 해당하는 컬럼 출력
	
9. dept테이블 기준으로 부서별 인원수를 표시하되 부서에 할당된 인원이 없으면
	0으로 표기(아웃조인 활용)
*/
	SELECT d.deptno, nvl(count(e.DEPTNO), 0) "인원수"
	FROM EMP e , DEPT d
	WHERE e.deptno(+) = d.DEPTNO
	GROUP BY d.deptno;
/*
10. 부서명별 최근입사일(없을 떄는 0으로 처리)을 출력하세요(아웃조인, 그룹함수처리)
*/
SELECT dname, nvl(to_char(max(hiredate), 'YYMMDD'), '0')
FROM EMP e , DEPT d 
WHERE e.deptno(+) = d.DEPTNO 
GROUP BY dname;
