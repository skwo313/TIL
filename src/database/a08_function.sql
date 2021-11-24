/*
# database에서 함수(function)
1. sql에서 함수(주로 내장함수)
	1) 컬럼의 값이나 데이터 타입이 변경하는 경우
	2) 숫자 또는 날짜 데이터의 출력 형식이 변경하는 경우
	3) 하나 이상의 행에 대한 집게(aggregation)를 하는 경우
2. sql 함수의 유형
	1) 단일 행 함수 : 테이블에 저장되어 있는 개별 행을 대상으로 하는 함수를
		적용하며 하나의 겨로가를 반환하는 함수
			ex) 소문자로 변환 처리, 올림, 내림, 반올림
	2) 복수 행 함수 : 조건에 따라 여러 행을 그룹화하여 그룹별로 결과를 하니씩
		반환하는 함수
		여러 행의 데이터를 함수를 적용했을 떄, 단일 또는 줄어든 
		결과값을 리턴하여 처리할 때, 사용된다.
			ex) 부서별로 최소값 처리 
*/
SELECT *
FROM emp ;
/*
# 단일 행 함수
1. 데이터 값을 조작하는데 주로 사용한다
	숫자형 ==> 문자형, 소숫점이하 실수 ==> 반올림 정수,
	날짜형 ==> 원하는 형식의 날짜 형태로..
2. 행별로 함수를 적용하여 하나의 결과를 반환한다.
	ex) SELECT ename, nvl(comm,0) "보너스"
3. 단일 행 함수의 종류 
	1) 문자함수
	2) 숫자함수
	3) 날짜함수
	4) 반환함수
		- 묵시적 데이터형 변환
		- 명시적 데이터형 변환
	5) 일반함수
4. 단일행 함수의 사용법
	1) 기본형식
		함수명(컬럼명|데이터 , param1, param2,...)
		param1, param2는 매개변수를 말한다.
		ex) nvl(comm, 0)
		
# 문자함수
1. 문자 데이터를 입력하여 문자나 숫자를 결과로 반환하는 함수
2. 문자 함수의 종류
	1) 대소문자 변환 함수
	2) 문자조직 함수
	3) 문자열 길이 반환 함수
3. initcap : 문자열의 첫 번쨰 문자만 대문자로 변환 처리 함수.
	lower : 문자열 전체를 소문자로 변환
	upper : 문자열 전체를 대문자로 변환
 */

SELECT ename,  INITCAP(ename), lower(ename), upper(ename)
FROM emp;
--ex)
SELECT 'The job of '||ename||' is a '||job show
FROM emp
WHERE INITCAP(ename) = 'Smith';  -- 함수 내용도 조건문에 사용가능
/*
-- 프로그램이 연동이 되어, 검색되는 데이터가 대소문자와 상관없이 활용하고자 할 때는 아래와 같은 형식을 사용한다.
-- 사원명:[  ][조회]
	1. 입력되는 데이터와 데이터베이스에 있는 데이터를 동일한 형식으로 처리하여야 한다.
		1) 저장되어 있는 데이터 대문자로 변환	
		where upper(검색할컬럼)
		2) 입력되는 데이터를 대문자로 변환 
		where upper(검색할컬럼) = upper('입력되는 문자열')
		3) keyword 검색까지 혼용되면
		where upper(검색할컬럼) LIKE '%'||upper('입력되는 문자열')||'%' -- '%실제입력된 문자를 대문자로 변환%'
		where lower(검색할컬럼) LIKE '%'||lower('입력되는 문자열')||'%' -- '%실제입력된 문자를 대문자로 변환%'
**/
SELECT a.*, lower(ename), lower('O') -- 테이블.* : 해당테이블에 모든칼럼을 보이게 처리
FROM EMP a 
WHERE lower(ename) LIKE '%'||lower('O')||'%';
-- ex)
SELECT job
FROM EMP e 
WHERE lower(JOB) LIKE '%'||lower('MAN')||'%';
-- where upper(job) : 데이터가 만약에 소문자로 입력되어 있더라도 대문자로 변환되어 비교할 수 있게 한다.
-- like '%'||upper('man')||'%'	: 검색할 데이터가 소문자로 입력되더라도 대문자로 변환되고, 키워드 검색하게 해준다.
/*
# 문자열 길이 반환
1. length(데이터/칼럼명) : 입력되는 문자열의 길이(글자수)를 반환하는 함수.
2. lengthb(데이터/컬럼명) : 입력되는 문자열의 바이트를 반환하는 함수.
	한글이나 특수문자는 1글자가 3bytes인 경우가 있어,
	영문과 한글은 글자 수에 따라 차이가 있다.
cf) dual : 오라클에서 지원되는 가상테이블로 테스트 용으로 한라인에 데이터와
	함수의 적용결과를 확인할 수 있다
 */
SELECT 'himan' 이름, 25 나이, '서울신림동' 사는곳 FROM dual;
SELECT ename, LENGTH(ename) "이름의 길이"
FROM EMP e ;

--ex) 
SELECT ename, job, length(job) "직책의 길이"
FROM EMP e ;
--ex) 
SELECT ename, length(ename)
FROM EMP e 
WHERE LENGTH (ename) = 6;

-- lengthb : 입력된 데이터의 byte로 한글의 경우 한글자에 3byte가 저장된다.

SELECT '안녕하세요' g1, length('안녕하세요') g2, lengthb('안녕하세요') g3
FROM dual;

--ex) 사원명이 5byte인 경우를 lengthb를 통해서 확인하여, 사원번호, 사원명(첫자 대문자처리), 사원명 byte수 출력하세요.

SELECT EMPNO, INITCAP(ENAME), LENGTHB(ENAME) "사원명의 byte수"
FROM emp
WHERE LENGTHB(ENAME) = 5; 




