/*
1. case문의 기본형식 2가지를 예제를 통해 기술하세요.
	1) 조건문 형태 활용 
		case when 논리|산술|관계 then 처리할 데이터
			 when 논리|산술|관계 then 처리할 데이터
			 else 기타 처리할 데이터
		end
	2) switch case 문 형태
		case [컬럼명]
			when 데이터1 then 처리할 데이터
			when 데이터2 then 처리할 데이터
			else 그외 데이터
		end

2. decode문과 case문의 차이를 기술하세요
	- decode의 확장된 함수 형식을 표현식 또는 컬럼 값 '=' 비교를 통해
		조건의 일치하는 경우에만 다른 값으로 대치하지만, case는
		술 연산, 관계 연산, 논리 연산과 같은 다양한 비교가 가능하다.
	- case는 statement이고 decode는 함수이다
	
3. 입사월별 마지막날짜를 출력하세요 
	2월은 29일,30일 나오는 월, 그 외는 다 31일 (decode활용) 
*/	
	SELECT	ename, to_char(hiredate, 'MM'), 
		decode(to_char(hiredate, 'MM') , '01', '31일',
											'03', '31일',
											'04', '30일',
											'05', '31일',
											'06', '30일',
											'07', '31일',
											'08', '31일',
											'09', '30일',
											'10', '31일',
											'11', '30일',
											'12', '31일',
											'29일'
				) show
	FROM emp;
	SELECT to_char(LAST_DAY(hiredate), 'MMDD')
	FROM emp;
/*
4. sal 5000이상(상), 2000~5000미만(중), 2000미만(하)
	이름 연봉 등급 case when 구무능로 처리해서 출력
*/
	SELECT ename, sal,
		CASE WHEN sal>=5000 THEN '상'
			WHEN sal>=2000 THEN '중'
			WHEN sal<=2000 THEN '하'
		END 
	FROM emp;
/*
5. 그룹함수처리 기본형식을 기술하세요
	select 컬럼명, 그룹함수1, 그룹함수2...
	from 테이블명
	where 조건
	group by 그룹할컬럼
	having 그룹함수의 조건;
	
6. 그룹함수의 종류를 기술하세요.
	count() : 행의 갯수 
		테이블 전체의 행 숫자를 알고 싶다면 count(*)
		특정 칼럼의 숫자를 확인하려면 count(칼럼명)을 사용
	max() : null을 제외한 모든 행의 최대값
	min() : null을 제외한 모든 행의 최소값
	sum() : null을 제외한 모든 행의 합
	avg() : null을 제외한 모든 행의 평균값
	stddev() : null을 제외한 모든 행의 표준편차
	variance() : null을 제외한 모든 행의 분산
	
7. 직책별(job), 평균급여를 출력하세요.
*/
	SELECT job, avg(sal)
	FROM emp 
	GROUP BY JOB 
	ORDER BY job;
/*
8. 월별 최대급여와 최저급여를 출력하세요.
*/	
	SELECT to_char(hiredate, 'MM'), max(sal), min(sal)
	FROM emp 
	GROUP BY to_char(hiredate, 'MM')
	ORDER BY to_char(hiredate, 'MM');
/*
9. 사원번호의 홀/짝수별 사원의 수와 최고연봉을 출력하세요.
*/
	SELECT MOD(empno,2), count(MOD(empno,2)), max(sal)
	FROM emp 
	GROUP BY MOD(empno,2)
	ORDER BY MOD(empno,2);
/*
10. 1) 입사월별 최고연봉자가 1000이상인 경우만 출력하세요
*/
	SELECT to_char(hiredate, 'MM'), max(sal)
	FROM emp 
	GROUP BY to_char(hiredate, 'MM')
	HAVING max(sal) >= 1000
	ORDER BY to_char(hiredate, 'MM');
/*
	2) 직책별 인원이 3명이상인 직책과 인원을 출력하세요.
*/
	SELECT job, count(job)
	FROM emp 
	GROUP BY job 
	HAVING count(job) >= 3;
/*
11. char, varchar2의 근복적인 차이점을 예제를 통해서 기술하세요
	char은 학번, 사번, 주민번호 등과 같이 자리 수가 정해진 코드성 데이터이고
	varchar2는 가변형 데이터이다
		create table person0011( 
			civilnum char(15)
		);
		insert into person001 VALUES('1');
		SELECT civilnum, length(civilnum) FROM person001; -- 15로 정해져 있다
		
12. 프로야구의 팀 순위를 저장하는 테이블(팀명, 승, 무, 패, 승률, 등록일)을 만들고
	데이터를 입력하세요.
*/
	CREATE TABLE teamrecord01(
		tname varchar2(10),
		win number(3),
		draw number(3),
		loose number(3),
		winrate number(3,1),
		days date
	);
	INSERT INTO teamrecord01 VALUES ('KT', 10, 3, 1, 80.7, sysdate);
	SELECT * FROM teamrecord01;