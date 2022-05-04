/*
# non equi join
1. 조인하는 두개의 테이블의 값이 동일하지 않고, 범위로 조인하는 경우를 말한다.
2. select 컬럼1, 대상컬럼, 등급..
	from 테이블1, 테이블2
	where 대상컬럼 between 범위1 and 범위2
*/
SELECT ename, sal
FROM emp 
ORDER BY sal;
SELECT *
FROM SALGRADE;

SELECT ename, sal, grade
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal;
-- ex)
SELECT *
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND grade = 4;

-- ex)
SELECT job, sal, grade
FROM EMP e , SALGRADE s 
WHERE sal BETWEEN losal AND hisal
AND job = 'SALESMAN';
/*
 # outer join
 1. EQUI join의 조인 조건에서 양측 칼럼 값 중, 어느 하나라도 NULL이면
 '=' 비교결과가 거짓이 되어 NULL 값을 가진 행은 조인 결과로 출력 불가
 NULL에 대해서 어떠한 연산을 적용하더라도 연산 결과는 NULL 
 	일반적인 EQUI JOIN 의 예:
 	학생 테이블의 학과번호 컬럼과 부서 테이블의 부서번호 컬럼에 대한
 	EQUI JOIN ( student.deptno = department.deptno ) 한 경우
 	학생 테이블의 deptno 칼럼이 NULL인 경우 해당 학생을 결과로
 	출력되지 못함
 2. EQUI JOIN에서 양측 칼럼 값중의 하나가 NULL 이지만 조인 결과로
 	출력할 필요가 있는 경우 OUTER JOIN 사용
 	OUTER JOIN의 예:
 	학생 테이블과 교수 테이블을 EQUI JOIN하여 학생의 지도 교수 이름 출력
 	조건 : 지도 학생을 한 명도 배정받지 못한 교수 이름도 반드시 함꼐 출력
 3. (+) 기호를 사용한 OUTER JOIN
 WHERE 절의 조인 조건에서 OUTER JOIN 연산자인 '(+)' 기호 사용
 조인 조건문에서 **NULL이 출력되는 테이블의 칼럼에 (+) 기호 추가
 4. 기본구문
 SELECT		table.column, table.column
 FROM		table1, table2
 WHERE		table1.column(+) = table2.column
	  또는 ;	table1.column = table2.column(+)
 */
SELECT DISTINCT deptno	--DISTINCT : 중복데이터 제어
FROM emp;
SELECT *
FROM dept;
SELECT e.ename, e.deptno, d.deptno, dname
FROM emp e, dept d
WHERE e.deptno(+) = d.deptno;
-- ex) 아웃조인을 활용하여, 부서명, 사원명, 급여를 출력하되
-- 		부서가 할당되지 안흔ㄴ 사원 정보는 null
SELECT e.deptno, d.deptno, dname, nvl(ename, '할당인원없음'), nvl(sal,0)
FROM EMP e , DEPT d 
WHERE e.DEPTNO(+)= d.DEPTNO;
-- ex)
SELECT loc, nvl(ename, '없음')
FROM EMP e ,DEPT d 
WHERE e.DEPTNO(+) = d.DEPTNO;
