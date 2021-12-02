/*
1. 제약조건을 하는 이유에 대하여 기술하세요
	학년데이터는 1,2,3,4만 입력, 
	학번이나 선수 정보의 데이터가 중복이나 null값이 없이 입력 등 데이터의 정확성을 
	유지하여 다양한 업무규칙을 지정할 수 있음
	
2. oracle의 제약조건의 종류와 기본형식에 대하여 기술하세요.
	1) not null
		컬럼명 데이터유형 constraint 테이블명_컬럼명_nn not null
		컬럼명 데이터유형 not null
	2) unique
		컬럼명 데이터유형 constraint 테이블명_컬럼명_uq unique
		컬럼명 데이터유형 unique key
	3) primary key 
		컬럼명 데이터유형 constraint 테이블명_컬럼명_pk primary key
		컬럼명 데이터유형 primary key
	4) foreign key
		컬럼명 데이터유형 constraint 테이블명_컬럼명_fk forign key
		컬럼명 데이터유형 foreign key
	5) check
	    컬럼명 데이터유형 check( where 조건 )
	     
3. 제약조건의 이름을 지정하는 규칙과 이를 확인하는 oracle DB 시스템상 테이블을
	이용해서 조회하는 sql을 작성하세요
	constraint 테이블명_컬럼명_nn not null
	select * 
	from sys.ALL_CONSTRAINTS
	WHERE TABLE_NAME = '테이블명';
	
4. person 테이블에 이름을 not null로 지정하여 만들고 데이터를 입력 확인하세요
*/
	DROP TABLE person;
	CREATE TABLE person (
		name varchar2(10) CONSTRAINT person_name_nn NOT null
	);
	INSERT INTO person values('마길동');
	SELECT * FROM person;
/*
5. person2 테이블에 이름을 no를 unique로 지정하여 만들고 데이터를 입력 확인하세요
*/
	CREATE TABLE person2 (
		no NUMBER(2) CONSTRAINT person2_no_uq UNIQUE
	);
	INSERT INTO person2 VALUES(1);
	SELECT * FROM person2;
/*
6. person3 테이블에 civilno를 primary key로 지정하여 만들고 데이터를 입력 확인하세요
*/
	CREATE TABLE person3 (
		civilno char(13) CONSTRAINT person3_civilno_pk PRIMARY KEY
	);
	INSERT INTO person3 VALUES(8503251185477);
	SELECT * FROM person3;
/*
7. person4 테이블에 age를 check로 0~100로 지정하여 만들고 데이터를 입력 확인하세요
*/
	CREATE TABLE person4 (
		age number(3) CONSTRAINT person4_age_c check(age BETWEEN 0 AND 100)
	);
	INSERT INTO person4 VALUES(25);
	SELECT * FROM person4;
/*	
8. 회원테이블을 만들고, id, pass, 이름, 포인트, 등록일을 설정해서 만들되
	각각 제약조건을 지정해서 만들고 데이터를 입력 처리하세요.
*/
	CREATE TABLE member1 (
		id varchar2(10),
		pass varchar2(20),
		name varchar2(10) CONSTRAINT member1_name_nn NOT NULL,
		point NUMBER(5) CHECK( point BETWEEN 0 AND 10000),
		joindate DATE CONSTRAINT member1_joindate_nn NOT NULL,
		CONSTRAINT GROUP_pk PRIMARY KEY(id,pass)
	);
	INSERT INTO member1 values('himan','h7777','비오',1000, to_date('2021/12/03', 'YYYY/MM/DD') );
	SELECT * FROM member1;
/*
9. 프로야구의 팀과 선수를 확인하고, 해당 리스트에 필요한 제약조건을 설정하여 
	테이블을 각각 만들어 처리하세요.
*/  DROP TABLE player;
	CREATE TABLE player (
		pranking number(2),
		name varchar(15),
		tname varchar(15),
		CONSTRAINT group_player_pk PRIMARY KEY(pranking, name, tname)
	);
	CREATE TABLE team (
		ranking number(2), 
		tname varchar(15),
		win number(2) CHECK( win BETWEEN 0 AND 100) ,
		CONSTRAINT group_team_pk PRIMARY key(ranking, tname)
	);
	INSERT INTO player values(1,'강백호','KT');
	INSERT INTO player values(2,'페르난데스','두산');
	INSERT INTO player values(3,'심우준','KT');
	INSERT INTO team values(1,'KT',76);
	INSERT INTO team values(2,'두산',71);
	
	SELECT *
	FROM player p, team t
	WHERE  p.tname = t.tname;
	

