/*
# 사용자 암호변경
1. 기본형식
alter user 사용자명 idnetified by 패스워드;
*/
SELECT *
FROM dba_users;
ALTER USER user01 IDENTIFIED BY 5555;
-- cmd 창에서 sqlplus 접근확인..

-- ex)
ALTER USER user02 IDENTIFIED BY 5555;
/*
# 계정이 LOCK 걸린 경우
1. 계정 정책에 의해 @@회 이상 암호를 잘못 입력한 경우
2. 계정 정책에 의해 계정만료기간 도래시
3. 처리할 SQL
	ALTER uesr 사용자계정 idnetified BY 패스워드 account unlock;
*/
ALTER USER himan IDENTIFIED BY 1111;
ALTER USER himan IDENTIFIED BY 7777 account unlock;
--ex) 
CREATE USER higirl IDENTIFIED BY 1111;
GRANT CREATE session TO higirl;
ALTER USER higirl IDENTIFIED BY 1234;
