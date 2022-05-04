/*
1. join 구문의 기본형식을 기본예제와 함꼐 기술하세요
	SELECT 선택 컬럼 	-- 중복된 컬럼만 alias 이름을 지정
	from 테이블명 별칭, 테이블명 별칭 	-- 조인할 테이블을 별칭과 함께 나열
	where 별칭.컬럼명 = 별칭.컬럼 : 두개 테이블에서 공통으로 연결한 컬럼명을
		별칭과함께 join 해준다.
	and 기타조건 : 그 외 조인한 내용의 데이터를 기준으로 조회 조건을 처리한다.
	
2. 사원번호의 짝/홀 기준으로 최근/최초 입사일자를 출력하세요
	1. 처리해야할 컬럼..
	2. 변형되는 데이터에 필요로 하는 함수
		짝/홀 ==> mod(컬럼, 나누기값) : 나머지 mod(empno, 2) ==> 0,1
			 ==> decode(컬럼, case1, 리턴데이터,
			 				 case2, 리턴데이터,
			 				 ...
			 				 case이외 처리) decode(결과데이터,0, '짝', '홀')
	 	최근/최초 입사일자 ==> group 함수 처리
	 		group할 컬럼을 지정 :
	 			select 그룹할 데이터, 그룹함수()
	 			from 
	 			group by 그룹할데이터 
	 		그룹함수 선언 : max(hiredate), min(hiredate)		 				 
*/
	SELECT decode(MOD(empno,2), 0, '짝','홀') "구분",
		max(hiredate) "최근입사",
		min(hiredate) "최초입사"
	FROM emp
	GROUP BY MOD(empno,2);
								
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
	from 테이블1, 테이블2(범위지정테이블)
	where 테이블1.대상컬럼 between 범위1 and 범위2
	테이블2(범위지정) : 회원등급(포인트따른 등급), 사원직급테이블, 권한별테이블,
	
6. 부서별 최고급여와 그 등급을 출력하세요.
*/
-- 1. 기본에서 진행할 수 있는 sql 
	SELECT deptno, max(SAL) 최고급여, max(grade) 등급	-- 그룹이 기준이 되는 컬럼을 한개로 보통 설정한다
	FROM emp e, SALGRADE s 
	WHERE e.sal BETWEEN losal AND hisal
	GROUP BY deptno;
-- 2. 다중열 subquery를 통해서 처리
	SELECT deptno, max(sal) "최고급여", grade "등급"
	FROM EMP e , SALGRADE s 
	WHERE e.sal BETWEEN losal AND hisal
	AND sal in (
		SELECT max(sal)
		FROM emp
		GROUP BY deptno 
	)
	GROUP BY deptno, grade
	ORDER BY deptno;
---------------------------------
	SELECT deptno, sal "최고급여", grade "등급", ename
	FROM EMP e , SALGRADE s 
	WHERE (deptno,sal) in (
		SELECT deptno, max(sal)
		FROM emp
		GROUP BY deptno 
	)
	AND e.sal BETWEEN losal AND hisal
	ORDER BY deptno;
	 

/*
7. emp, dept, salgrade 3개를 조인하여, 1등급에 해당하는 부서명, 사원명, 급여,
	등급을 출력하세요.
	# 테이블 3개 이상 join
	1. 테이블1, 테이블2의 조인 처리
	2. 테이블2, 테이블3의 조인 처리
	3. 테이블1, 테이블3의 조인 처리(테이블1,테이블2,테이블3의 연관관계 데이터가
		명확하면 생략해도 된다)
*/
SELECT dname, ename, sal, grade
FROM EMP e , DEPT d , SALGRADE s 
WHERE e.DEPTNO = d.deptno
AND e.sal BETWEEN losal AND hisal
AND grade=1;

/*
8. equi join과 outer join의 차이점을 기술하세요
	공통점 : 두개이상의 테이블간의 연관관계 있는 컬럼을 기준으로 join하는 것을 말한다.
	equal join에서는 양측 칼럼이 같을 때 조인
	outer join : 기준되는 테이블과 연결된 테이블에 데이터가 존재하지 않더라도
		기준되는 테이블 칼럼의 데이터는 보이고자 할 때, 사옹된다
		ex) 부서테이블의 부서정보가 사원 테이블에 없더라도 출력되게 할 때 사용된다
	outer join에서는 한쪽이 null값이여도 (+)으로 null로 해당하는 컬럼 출력
	
9. dept테이블 기준으로 부서별 인원수를 표시하되 부서에 할당된 인원이 없으면
	0으로 표기(아웃조인 활용)
*/
	SELECT d.deptno, count(e.DEPTNO) "인원수"
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
