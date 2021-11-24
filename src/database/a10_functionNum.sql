/*
# 숫자 함수
1. 숫자 데이터를 처리하기 위한 함수.
2. 종류
	1) round : 지정한 소숫점 자리로 반올림 처리
		round(데이터, 자릿수)
백자리 십자리 1자리 0 소숫점이하 자리수 지정
-4	-3	-2 -1 | 1 2 3...
		자릿수가 +값은 소숫점 이하 자리수
		자릿수가 -값은 10단위 이상의 자릴수 처리
	2) trunc : 지정한 소숫점 자리까지 남기고 절삭처리
		trunc (데이터, 자릿수)
	3) mod : 데이터베이스에서는 % 없기 때문에, 함수로 나머지 처리
		mod(데이터m,n) : 데이터를 m을 n으로 나눈 나머지
		ex) mod(10,3) ==> 1
	4) ceil : 지정한 값보다 큰 수 중에서 가장 작은 정수.
		소숫점이하의 내용에 대하여 올림처리 정수.
		ex) ceil(123.17) ==> 124
	5) floor : 지정한 값도 작은 수 중에서 가장 큰 정수
		ex) floor(123.9) ==> 123
*/
SELECT 
	round(2433.2433, 1) "소숫점한자리",
 	round(2433.2433, 2) "소숫점두자리",
 	round(2433.2433, -1) "십자리", 
 	round(2433.2433, -2) "백자리"
FROM dual;
SELECT 
	trunc(2433.2433, 1) "소숫점한자리",
 	trunc(2433.2433, 2) "소숫점두자리",
 	trunc(2433.2433, -1) "십자리", 
 	trunc(2433.2433, -2) "백자리"
FROM dual;
SELECT mod(5,2) "2나머지" , mod(11,3) "3나머지"
FROM dual;

-- ex) comm sal 합산의 반올림처리 
SELECT sal, comm, round(sal+nvl(comm,0), 1) "급여합산1" ,
		round(sal+nvl(comm,0), 2)
FROM EMP e ;

-- ex)
SELECT empno, ename "청팀"
FROM EMP e 
WHERE mod(empno, 2)=1;
SELECT empno, ename "백팀"
FROM EMP e 
WHERE mod(empno, 2)=0;
 