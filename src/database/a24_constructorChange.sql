/*
# 테이블 이름 변경
RENAME 기존테이블명 TO 변경할테이블명;
# 컬럼명 변경.
ALTER TABLE 테이블명
rename column 기존컬럼명 to 변경할컬럼명;
*/
RENAME emp10 TO emp10_new;
SELECT * FROM emp10_new;
ALTER TABLE emp10_new
RENAME COLUMN empno TO NO;
/*
# 테이블 삭제
1. drop table 테이블명;
# 컬럼 삭제
1. alter table 테이블명 drop column 컬럼명;
*/
DROP TABLE emp10_new;
SELECT * FROM emp9;
alter table emp9 
DROP COLUMN deptno;
-- ex)
CREATE TABLE emp11_new 
AS SELECT * FROM emp;
ALTER TABLE emp11_new 
RENAME COLUMN deptno TO deptnumber;
RENAME emp11_new TO emp11;
ALTER TABLE emp11 
DROP COLUMN hiredate;
DROP TABLE emp11;
SELECT * FROM emp11_new;
/*
# 제약조건(constraint)의 추가와 삭제..
1. primary key 
	1) 키의 추가.
	alter table 테이블명 add primary key (컬럼명)
	2) 키의 삭제.
	alter table 테이블명 drop primary key;
2. 그 외의 제약 조건..
	alter table 테이블명 add unique (컬럼명)
	alter table 테이블명 add constraint 제약조건명 unique (컬럼명)
	alter table 테이블명 add foreign key (컬럼명)
		reference 참조테이블( 컬럼명 )
	alter table 테이블명 add constraint 제약조건명 foreign key
			(컬럼명) reference 참조테이블(컬럼명) 
		# 참조키 관련 내용 ..
			references 참조테이블명(참조컬럼명)
			ex) emp 테이블에 deptno는 dept에 deptno 참조
		# 데이터가 삭제 수정되었을 때, 처리 내용
			on delete 옵션
			on update 옵션
		# 옵션 내용(oracle은 on delete에서만 적용)
			no action : 참조 테이블의 변화(삭제) 있어도 기본 테이블에 영향 없음
			cascade : 참조테이블의 변화(삭제)에 따라 기본 테이블도 수정/삭제
			set null : 참조테이블의 변화로 기본테이블 데이터 null
			set default : 참조테이블의 변화로 기본테이블의 데이터 기본 값으로 설정
3. 제약조건 이름으로 삭제
	alter table 테이블명 drop constraint 제약조건명;
*/
SELECT * FROM emp9;
ALTER TABLE emp9 ADD PRIMARY KEY (empno);
ALTER TABLE emp9 drop PRIMARY KEY;
-- 이름 정한 primary key 할당
CREATE TABLE dept11
AS SELECT * FROM dept;
-- 복사할 때는 constraint는 복사가 되지 않는다
ALTER TABLE dept11
ADD CONSTRAINT dept11_deptno_pk PRIMARY key(deptno);
-- foreign key
--		on delete cascade 설정 참조되는 부모테이블 삭제시 자식테이블의 값 삭제
CREATE TABLE EMP11
AS SELECT * FROM emp;
ALTER TABLE EMP11 
ADD CONSTRAINT emp11_deptno_fk FOREIGN key(deptno)
REFERENCES dept11(deptno) ON DELETE CASCADE;
SELECT * FROM emp11;
SELECT * FROM dept11;
DELETE FROM dept11
WHERE deptno = 10;

CREATE TABLE emp12
AS SELECT * FROM emp;
CREATE TABLE dept12
AS SELECT * FROM dept;

ALTER TABLE dept12
ADD CONSTRAINT dept12_deptno_pk PRIMARY KEY (deptno);
ALTER TABLE emp12 
ADD CONSTRAINT emp12_deptno_fk FOREIGN KEY (deptno)
REFERENCES dept12(deptno) ON DELETE SET NULL;

SELECT * FROM emp12;
SELECT * FROM dept12;
DELETE FROM dept12
WHERE deptno = 10;
-- ex)
CREATE TABLE emp13 
AS SELECT * FROM emp;
CREATE TABLE dept13
AS SELECT * FROM dept;
DROP TABLE emp13;
ALTER TABLE dept13 
ADD CONSTRAINT dept13_deptno_pk PRIMARY KEY (deptno);
ALTER TABLE emp13
ADD CONSTRAINT emp13_deptno_fk FOREIGN key(deptno)
	REFERENCES dept13(deptno) ON UPDATE SET NULL;
UPDATE emp13
	SET deptno = 50
WHERE deptno = 10;
	
SELECT * FROM emp13;
SELECT * FROM dept13;


