/*
1. 테이블 구조변경의 기본형식을 기술하세요
	alter table 테이블명
	add 컬럼명 데이터유형 [default 디폴트데이터, 제약조건] -- 추가
	modify 컬럼명 데이터유형 [default 디폴트데이터, 제약조건] -- 변경
	drop colomn 컬럼명 데이터유형 [default 디폴트데이터, 제약조건] -- 삭제
	rename colomn 변경전테이블명 to 변경후테이블명 : 컬럼명의 변경 
	테이블 구조변경
	삭제: drop table 테이블명
	이름변경: rename 변경전테이블명 to 변경후테이블명
	
2. emp21복사테이블을 만들고 부서정보(부서명,부서이름,부서위치)를 칼럼을 추가하세요
*/
	CREATE TABLE emp21
	AS SELECT * FROM emp;
	ALTER TABLE emp21
	ADD dname varchar(20) DEFAULT '입력없음';
	ALTER TABLE emp21
	ADD loc varchar(20) DEFAULT '입력없음';
	SELECT * FROM emp21;
	
/*
3. 테이블 컬럼의 속성변경의 규칙을 기술하세요.
	1 기본 컬럼에 데이터가 없는 경우
		 컬럼 타입이나 크기 변경이 자유롭다.
	2 기존 데이터가 있는 경우
		다른 데이터 유형으로 변경을 할 수 없다
		1) 타입 변경은 char와 varchar2만 허용된다
			문자열은 변경이 가능하다
		2) 변경한 컬럼의 크기가 저장된 데이터의 크기보다 같거나 커야
			변경 가능하다
		3) 숫자 타입에는 정밀도 증가 가능.
	3 기본 값의 변경은 변경 후에 입력되는 데이터부터 적용된다.
		범위 안에서 크게 선언된 데이터유형을 작은 데이터유형 선언으로 바꿀 수 잇다
		# 처리단계
		1. 변경할 데이터의 실제 저장된 최대 크기를 확인
		select max(length(변경할컬럼)) from 테이블
		2. alter table 테이블명
			modify 컬럼명 varchar2(위에서 확인한 저장된 최대크기)
	
4. 데이터가 없는 emp22복사테이블을 만들고, 문자열형 숫자, 숫자형은 문자열형,
	날짜는 숫자형으로 변경처리하세요.
*/
	CREATE TABLE emp22
	AS SELECT * FROM emp
	WHERE 1=0;
	ALTER TABLE emp22
	MODIFY ename NUMBER;
	ALTER TABLE emp22
	MODIFY mgr varchar2(10);
	ALTER TABLE emp22
	MODIFY hiredate NUMBER;
	
/*
5. 부서정보가 있는 복사테이블을 emp24을 만들고, 문자열 데이터의 최소크기로 데이터를 
	변경처리하세요
*/
	CREATE TABLE emp24
	AS SELECT * FROM dept;
	SELECT max(length(dname)) FROM dept; -- 10
	ALTER TABLE emp24
	MODIFY dname varchar2(10);
/*
6. 회원테이블(회원아이디, 이름)과 구매테이블(물건명, 회원아이디) 두개 테이블을
	회원아이디로 foreign key를 설정하여 데이터의 입력을 처리하여 연관관계를 설정하세요
*/
	CREATE TABLE MEMBER (
		id varchar2(20) PRIMARY key,
		name varchar2(15) 
	);
	CREATE TABLE buy (
		id varchar2(20) CONSTRAINT buy_id_fk references member(id),
		pname varchar2(15) 
	);
	INSERT INTO MEMBER values('himan', '홍길동');
	INSERT INTO buy values('himan', '사과');
	
/*
7. 위테이블을 회원/구매 조인관계를 이용하여, 회원과 구매정보를 출력하세요
*/
	SELECT m.id "아이디", m.name "이름", pname "구매정보" 
	FROM MEMBER m, buy b
	WHERE m.id = b.id;
/*
8. emp23의 테이블명을 변경하고, hiredate컬럼명을 변경하고, 컬럼명의
	삭제/테이블 삭제를 처리하세요.
*/
	CREATE TABLE emp23
	AS SELECT * FROM emp;

	RENAME emp23 TO emp23_new;

	ALTER TABLE emp23_new 
	RENAME COLUMN hiredate TO eday;

	ALTER TABLE emp23_new
	DROP COLUMN eday;

	DROP TABLE emp23_new;
	
/*
9. 제약조건의 추가 삭제의 기본형식을 기술하세요.
	alter table 테이블명 add unique (컬럼명)
	alter table 테이블명 add constraint 제약조건명 unique (컬럼명)
	alter table 테이블명 add foreign key (컬럼명)
		reference 참조테이블( 컬럼명 )
	alter table 테이블명 add constraint 제약조건명 foreign key
			(컬럼명) reference 참조테이블(컬럼명)  
	alter table 테이블명 drop constraint 제약조건명; -- 삭제

10. emp24, dept24 복사테이블을 만들고 foreign key 제약조건을 추가하세요.
*/	
	CREATE TABLE emp24 
	AS SELECT * FROM emp;
	CREATE TABLE dept24
	AS SELECT * FROM dept;
	ALTER TABLE emp24
	ADD PRIMARY KEY(deptno);
	ALTER TABLE dept24
	ADD FOREIGN KEY(deptno)
		REFERENCES emp24(deptno) ON DELETE cascade;
	delete
	FROM emp24
	WHERE deptno=10;
	SELECT * 
	FROM emp24 e, dept24 d
	WHERE e.deptno = d.deptno;
/*


11. user01/8888계정을 생성하여, 접속하여 테이블을 만들 수 있게 권한을 설정하세요
*/
sqlplus
system/1111
create user user01 identified by 8888;
GRANT CREATE SESSION, CREATE TABLE, resource TO user01;
-- resource : DB안에 들어갈 구성요소에 대한 권한을 설정
conn user01/8888;
show USER;
CREATE TABLE tab01( NO number);

SQL> conn system/1111
Connected.
SQL> grant dba to user01;
SQL> grant create table to user01;
SQL> conn user01/8888;
Connected.




