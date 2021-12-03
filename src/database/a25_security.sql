/*
# 데이터베이스 보안을 위한 권한 설정
1. 데이터베이스 관리자(DBA)는 사용자가 데이터베이스
객체(테이블,view,sequence..)에 대한 특정 권한을
가질 수 있게 하여, 다수의 사용자가 데이터베이스에
저장된 정보를 공유하면서도 정보에 대한 보안이 이루어
지도록 한다.
2. DB 서버에 접근시 필요한 사용자 계정/암호를 통해
로그인 인증을 받는다.
3. 권한의 역할과 종류
	1) create user : 사용자를 새롭게 생성하는 권한
	2) drop user : 사용자를 삭제하는 권한
	3) drop any table : 테이블을 삭제하는 권한
	4) query rewrite : 함수 기반 인덱스 생성 권한
	5) backup any table : 테이블 백업 권한
	
	6) create session : 데이터베이스에 접속할 수
		있는 권한
	7) create table/view/sequence/procedure
*/
/*
# 사용자 생성하기.
사전에 scott계정에 dba 권한 부여
관리자 계정으로 접근
conn system/1111;
grant dba to scott;

1.create user 사용자명 identified by 비밀번호
ex) create user orauser01 identified by user01;
2. 접속 권한을 할당, 처리.
	grant 권한명 to 계정명;
	create session: 접속권한.
ex) grant create session to orauser01;
create USER orauser01 IDENTIFIED by user01;
GRANT CREATE SESSION TO orauser01;
conn orauser01/user01;
show USER;
*/
/*
# 사용자계정별로 자원에 대한 접근 권한 설정.
1. 테이블 생성 권한 부여
	grant create table to 계정명;
	ex) grant create table to orauser01;
2. 전체 자원에 대한 권한 부여
	grant resoure to 계정명;
*/
GRANT CREATE TABLE TO orauser01;
SELECT * 
FROM DBA_USERS
WHERE username= 'ORAUSER01';