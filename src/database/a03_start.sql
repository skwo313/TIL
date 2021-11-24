SELECT * FROM emp;
/*
# 데이터 조회하기
데이터는 select 구문을 이용하여 저장된 데이터를 호출(query) 할 수 있다
1. 기본형식
	select *||컬럼명, 컬럼명2
	from 테이블명
	where 조건
*/
SELECT * FROM emp;
SELECT empno, ename, job 
FROM emp;
-- ex)
SELECT * FROM dept;
SELECT deptno, dname
FROM dept;
/*
2. 컬럼명 별칭처리하기
select 컬럼명 as 별칭명, 컬럼명 별칭명
from 테이블
해당 테이블 구조 안에 있는 컬럼명이 as나 한칸 띄움으로 별칭으로 호출할 수 있다.
*/
-- 별칭을 한글로 나타낼 수도 있는데, 추가하여 공백을 타이틀로 보이거나, 특수문자를 타이틀로 하고 싶으면 "" 사이에
-- 입력하면 된다.
SELECT empno AS no, ename AS name, deptno dno, job "직 책", hiredate AS hire
FROM emp;
-- ex
SELECT empno "사원 번호", ename "이 름", job "직 책", mgr "관리자 번호", hiredate "입 사 일", sal "급 여"
, comm "보 너 스", deptno "부서 번호"
FROM emp;
/*
# 데이터의 산술 연산 처리와 concatnate(문자열|컬럼의 연결)
1. 숫자형 컬럼을 사칙 연산 처리가 가능하다 + - * /
2. 문자열과 컬럼 간의 연결 처리는 '문자열'||컬럼명
 */
SELECT ename , mgr, mgr +10 , mgr-5 , mgr*10,
		'직책은 '|| job "show", ename || '님' ename, sal*1.1
FROM emp;

SELECT ename || '님' ename, sal "급여", sal*1.1 "급여+10%"
FROM emp;
/*
# 컬럼간의 연결
select 컬럼1 || 컬럼2 || '문자열' || 컬럼3 "출력타이틀"
from 테이블명
*/
-- 부서번호 @@의 @@ 사원의 직책은 @@@이고 급여는 @@@입니다.
SELECT *
FROM emp;
SELECT '부서번호'||deptno||'인 '||ename||'사원의 직책은 '||job||'이고, 급여는 '||sal||'입니다.' show
FROM emp;
-- ex)
SELECT * FROM emp;
SELECT '급여가 '||sal||'만원인 사원'||ename||'는 직책이'||job||'입니다' show
FROM emp;
