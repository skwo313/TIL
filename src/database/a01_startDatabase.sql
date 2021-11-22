/*
# database 서버 설치

1. admin 비밀번호 1111
2. 설치완료 후,
3. cmd 창에서
	sqlplus
	명령을 치면 DB가 설치된지 여부가 나온다
# database client 설치
1. help ==> eclipse market place
2. dbeaver 21.2.5 install
3. install anyway

# jdbc 드라이버 설정
C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar
파일을 아래 경로에 복사

webapp\WEB-INF\lib\ojdbc6.jar

ojdbc6.jar를 통해 eclipse의 deaver클라이언트로 oracle서버에 연결 처리하기위해 필요하다

# 기본 계정 만들기
C:\oraclexe\app\oracle\product\11.2.0\server\rdbms\admin\scott.sql

cmd을 치면
기본 경로를 상단을 통해 알 수 있다.
사용자 계정 경로를 확인하고 그 곳에 scott.sql 파일을 복사한다.

계정 폴드에 복사
C:\Users\11
scott.sql

sqlplus
system
1111
@scott.sql
conn scott/tiger;
select * from emp;

C:\a01_javaexp\workspace\javaexp\src\main\webapp\WEB-INF\lib\ojdbc6.jar
*/