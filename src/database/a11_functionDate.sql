SELECT * FROM emp;
/* 
# 날짜 함수
1. 날짜형 데이터 타입에 사용하는 함수
	1970/1/1
	1/1000ch ==> 1초 ==> (60)1분 ==> (60)1시간
	==> (24)1일(*) ==> calendar 규칙에 의해..28/30/31
	1(월) ==> (12)1년 ..
2. 기본연산
	기본 +1은 1일을 기준으로 처리 된다.
	1) 날짜 +/- 숫자 : 해당 일자의 일수를 가산(감산)하여 처리
	2) 날짜 +/- 1/24 : 시간단위 연산 처리
	1일이 24시간이기 떄문에 5시간 이후인 경우, 날짜 5/24를 처리한다.
cf) sysdate는 현재날짜시간을 나타낸다.
*/
SELECT  SYSDATE  "현재날짜/시간",
	SYSDATE + 1  "내일 24시간이후",
	SYSDATE - 1 "전날 24이전날짜",
	SYSDATE + (8/24) "현재로부터 8시간 이후",
	SYSDATE + (30/60/24) "현재부터 30분이후"
FROM dual;

-- ex)
SELECT 
	SYSDATE + 3,
	SYSDATE + 100,
	SYSDATE - (5/24),
	SYSDATE - (3/24),
	SYSDATE + (50/60/24)
FROM dual;
SELECT ename, hiredate, hiredate+1 "1일 이후",
		hiredate-100 "입사100일전"
FROM EMP e ;

SELECT ename, hiredate, hiredate+120 "인턴기간", hiredate-(8/24),
		floor(sysdate-hiredate) "근무일수"
FROM EMP e ;
/*
# 날짜 함수
1. sysdate : 오라클에서 서버시스템의 현재 날짜와 시간
2. months_between(날짜1, 날짜2) :
	날짜 사이의 개월을 월단위로 계산
	기준 단위가 1 ==> 1월
	1개월 => 1, 15일 => 0.5 1월을 기준, 일/시/분/초 단위 등으로
		소숫점으로 계산이 된다.
3. 소숫점이하에 대한 처리는 trunc,floor를 이용해서 처리해준다.
	1.5개월을 개월차로 ceil, 개월수는 trunc, floor
4. add_months(날짜형데이터, 추가할개월수) :
	해당 날짜에 개월을 더한 날짜 계산
 */
SELECT ename, hiredate, SYSDATE,
	MONTHS_BETWEEN(SYSDATE, hiredate) "근무개월수",
	floor( MONTHS_BETWEEN(SYSDATE, hiredate)) "근무개월수2",
	floor( MONTHS_BETWEEN(SYSDATE, hiredate)/12) "근무연한"
FROM emp;
-- ex1)
SELECT FLOOR(MONTHS_BETWEEN(SYSDATE+100, SYSDATE)) 
FROM dual;
-- ex2)
SELECT FLOOR(MONTHS_BETWEEN(SYSDATE+1000,SYSDATE)/12)||'년'||
	FLOOR(MOD(MONTHS_BETWEEN(SYSDATE+1000,SYSDATE),12))||'개월' show
FROM dual;

SELECT SYSDATE , ADD_MONTHS(SYSDATE,4) "오늘로부터 4개월 후", 
	 ADD_MONTHS(SYSDATE,-3) "오늘로부터 3개월 전" 
FROM dual;
-- ex1)
SELECT ename, ADD_MONTHS(hiredate, 12) "입사 후 1년",
	ADD_MONTHS(HIREDATE, 6) "입사 후 6개월"
FROM emp;
-- ex2)
SELECT ename, DEPTNO , HIREDATE "입사일", DEPTNO/10||'개월', ADD_MONTHS(HIREDATE,DEPTNO/10) "인턴만료일" 
FROM EMP e;
/*
5. next_day(날짜,'요일') : 대상날짜로부터 다가오는 첫번째 요일에 
	해당하는 날짜
6. last_day(날짜) : 대상날짜의 월의 마지막날짜.
 */
SELECT SYSDATE, NEXT_DAY(SYSDATE,'금'),
	NEXT_DAY(NEXT_DAY(SYSDATE,'금'),'금'),
	LAST_DAY(SYSDATE),
	LAST_DAY(SYSDATE)+1
FROM dual;
	

