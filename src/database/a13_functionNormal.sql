/*
# 일반 기능 함수
1. nvl()
2. nvl2(데이터|컬럼명, null이 아닐 때 처리할 데이터, null일 때 처리할 데이터)
	comm이 null일 때는 100으로 null이 아닐 때 10% 더 추가해서 결과값을 처리
*/
SELECT ename, sal, comm, nvl2(comm, comm*1.1, 100) 보너스
FROM emp;

-- ex)
SELECT ename, sal, comm, nvl2(comm, comm+sal*0.05, sal*0.15) 보너스
FROM emp;
/*
3. nullif(데이터1, 데이터2)
두개의 매개변수로 받는 데이터를 비교하여 동일하면 null로 변환하고, 동일하지 않으면
첫번째 데이터1을 반혼처리하는 함수를 말한다.
*/
SELECT NULLIF('a','a') show1,
		NULLIF('a','b') show2,
		nvl(NULLIF('a','a'), '동일') show3,
		nvl(NULLIF('a','b'), '동일') show4
FROM dual;
-- ex)
SELECT 
		nvl(NULLIF(1000, 1000), 0) show1,
		nvl(NULLIF(1000, 2000), 0) show2  
		-- nvl은 첫번째 데이터 유형에 맞게 데이터를 처리하여야 한다
FROM dual;
/*
# decode 함수
1. 프로그래밍 언어의 if문이나 case문으로 표현되는 내용을 하나의 함수로
	처리할 수 있게 해준다.
2. 기본형식
	decode(데이터, case1, case1에 해당할 떄 처리, 그 외 처리);
	decode(데이터, case1, case1에 해당할 떄 처리할 데이터,
				case2, case2일떄처리할데이터,
				case3, case3일떄처리할데이터,
				위내용에해당하지않을 떄 처리할 데이터)
 */
SELECT  ename, deptno,
	decode(deptno, 10, '인사과',
					20, '총무',
					30, '회계',
				'부서정하지않음') 부서명
FROM emp;
-- ex)
-- empno 기준으로 0이든지 1이 출력된다
-- 결국 0과 1데이터가 나온다.
-- decode( mod(empno,2), 0, 0일떄 처리할 데이터, 그외데이터)
SELECT ename, empno,
	DECODE(MOD(EMPNO,2), 0, '홍팀', 
							'청팀') 팀
FROM emp;
SELECT ename, hiredate, to_char(hiredate, 'Q') "분기"
FROM emp;
-- ex) 
SELECT ename, hiredate, to_char(hiredate, 'Q'), 
	decode(to_char(hiredate, 'Q'), 
					'1', '부산',
			 		'2', '광주',
					'3', '제주',
					'출장없음') "출장지"
FROM emp;
/*
# 일반 함수 case
1. decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
	조건의 일치하는 경우에만 다른 값으로 대치하지만, case 함수에서는
	산술 연산, 관계 연산, 논리 연산과 같은 다양한 비교가 가능하다.
2. 기본 형식
	1) 조건문 형태 활용
	case when 논리|산술|관계 then 처리할 데이터
		 when 논리|산술|관계 then 처리할 데이터
		 else 기타 처리할 데이터
	end
	## 주의
	case when은 앞에서 선언 조건식을 제외한 조건을
	처리한다.
	
	2) switch case 문 형태
	case [컬럼명]
		when 데이터1 then 처리할 데이터
		when 데이터2 then 처리할 데이터
		else 그외 데이터
	end
 */
-- 부서번호에 따라 처리하는 데이터를 다르게 할 때,
SELECT ename, deptno,
	CASE WHEN deptno = 10 THEN sal*0.2
		-- 여러가지 비교와 논리연산자를 활용하여 결과값을 리턴할 수 있다.
		 WHEN deptno = 20 THEN sal*0.5
		 -- 이전에 선언한 내용을 제외하고를 포함하고 있음..
		 WHEN deptno = 30 THEN sal*0.7
		 ELSE sal*1.2
	END show
FROM emp;
-- ex)
SELECT ename, sal, 
	CASE WHEN sal >= 5000 THEN 'A등급'
		WHEN sal >= 4000 THEN 'B등급'
		-- CASE WHEN 앞에 있는 조건을 제외시킨다.
		-- when sal >= 4000 and sal < 5000을 포함하고 있다.
		WHEN sal >= 3000 THEN 'C등급'
		WHEN sal >= 2000 THEN 'D등급'
		WHEN sal >= 1000 THEN 'E등급'
		WHEN sal >= 0 THEN 'F등급'
		ELSE '등급분류불가'
	END show
FROM emp;
SELECT ename, sal, deptno,
	CASE deptno		--특정한 컬럼 지정..
		WHEN 10 THEN sal*0.2	-- 해당 deptno가 어떤 값일 때를 나타냄(부서별로 보너스 지정)
		WHEN 20 THEN sal*0.5
		WHEN 30 THEN sal*0.7
		ELSE sal*1.2
	END 보너스
FROM emp;

-- ex) 
SELECT ename, sal, hiredate, to_char(HIREDATE, 'Q'),
	CASE to_char(HIREDATE, 'Q')
		WHEN '1' THEN sal*0.3
		WHEN '2' THEN sal*0.2
		WHEN '3' THEN sal*0.1
		else sal*0.05
	END 보너스
FROM emp;
