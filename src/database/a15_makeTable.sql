/*
# 테이블에 사용되는 데이터 타입..
1. 개요
	1) 데이터베이스에 저장되는 데이터는 문자, 숫자, 날짜, 이미지 등과 같은
		다양한 형식으로 표현된다.
		cf) 이미지는 binary 타입으로 저장하기보다 이미 파일 서버를 
		활용해서 이미지 경로와 파일명을 활용해서 저장한 위치를 호출한다.
		varchar2로 저장한다. 설계시, *이미지명과 경로명까지 처리된다는
		것을 설계에 포함.
	2) 실무에서 컬럼에 대한 데이터 타입이나 길이의 결정은 데이터베이스 설계
		단계에서 신중하게 고려해야 하는 중요한 사항
	3) 데이터베이스 설계 단계에서 잘못 선정된 데이터 타입은 응용 프로그램
		개발을 어렵게 하거나 성능을 저하시키는 요인이 된다.
2. 오라클에서 지원되는 데이터 타입의 종류
	1) char(size) : 고정 길이 문자 데이터 타입, 최대 2000바이트
		-ex) 코드성 데이터 - 학번, 사번, 주민번호 : 자리 수가 정해진 데이터
		create table personnel(
			civilnum char(13);
		);
	2) varchar2(size) : 가변 길이 문자 데이터 타입. 최대 4000바이트
		- ex) 최대 크기를 설정하기에 그 보다 작은 데이터 할당 시 효율화
		create table personnel(
			civilnum varchar2(15);
		);
	3) number(p,s) : 정밀도(p)와 스케일(s)로 표현되는 숫자 데이터 타입
		- ex) 전체크기 소숫점 이하 크기 지정.
	4) date : 날짜/시간 형식을 저장하기 위한 데이터 타입
	5) nvarchar2(size) : 국가별 문자 집합에 따른 size크기의 문자/바이트
		문자 데이터 타입
	6) rowid : 테이블 내 행의 고유 주소를 가지는 64진수 문자 타입
		행단 6바이트 또는 10바이트
	7) blob : 대용량의 바이너리 데이터를 저장하기 위한 데이터 타입 최대 4gb
	8) clob : 대용량의 텍스트 데이터를 저장하기 위한 데이터 타입 최대 4gb
	9) bfile : 대용량의 바이너리 데이터를 파일 형태로 저장하기 위한 데이터 타입
			최대 4gb
	10) timestamp(n) date 데이터 타입의 확장된 형태. n은 millis second
		자리수로 최대 9자리까지 표현 가능
 */
SELECT * FROM emp; --ctrl 누른 상황에서 테이블명을 클릭
/*
create table 테이블명(
	컬럼명 데이터유형(크기)
);
 */
CREATE TABLE personnel(
	civilnum char(13)
);
-- insert into 테이블명 values(데이터);
INSERT INTO personnel values('9112251802718');
INSERT INTO personnel values('1');
SELECT * FROM personnel;
SELECT civilnum, LENGTH(civilnum) FROM personnel;
-- ex)
CREATE TABLE school24(
	schoolnum char(8)
); 
INSERT INTO school VALUES('1613088');
INSERT INTO school VALUES('1');
SELECT schoolnum, LENGTH(schoolnum) FROM school;

-- 가변형 데이터 만들기..
CREATE TABLE member01(
	id varchar2(20), -- 가변형으로 두개의 컬럼을 만든다.
	pass varchar2(15)
);
INSERT INTO member01 values('himan', '7777');
-- 테이블내에 모든 컬럼에 데이터를 입력할 떄는 컬럼을 지정하지 않고,
-- 순서대로 데이터를 입력할 수 있다.
INSERT INTO member01(id, pass) values('himan', '7777');
SELECT id, pass, LENGTH(id), length(pass) FROM member01;
-- ex)
CREATE TABLE person (
	name varchar2(20),
	loc varchar2(20)
);
INSERT INTO person values('홍길동', '서울');
SELECT name, loc, length(name), length(loc) FROM person;

CREATE TABLE records(
	num01 number(3),
	num02 number(4,1)
);
INSERT INTO records values(343,135.5);
-- ex)
CREATE TABLE studrecord26(
	sname varchar2(20),
	skors number(5,1)
);
SELECT INTO studrecord26 values('홍길동', 85.9);
SELECT * FROM studrecord26;

CREATE TABLE member10(
	id varchar2(10),
	regdte date
);
INSERT INTO member10 values('himan', sysdate);
SELECT * FROM member10;


