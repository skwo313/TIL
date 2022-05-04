/*
# sequence 
1. 컬럼의 유일한 데이터의 설정의 필요성
	데이터는 하나의 테이블에서 특정 컬럼의 경우에 식별할 수 있는 데이터를 입력이
	필요한 경우가 많다.
	ex) 주민번호, 사번, 학번 등등..
		
	
2. key를 이용하여 만드는 여러가지 데이터들
	key라는 데이터는 입력시마다 동일데이터인지 여부를 전체데이터를 확인해서 입력하는 것보다
	규칙을 만들어 순서별로 입력하는 것이 더 효과적일 때가 많다.
	
	AKSI202110000
	AK : 회사 고유 문자.
	SI : 부서명칭
	2021 : 입사한 연도
	10000 : 입사 순서별로 numbering
		10001
		10002
		10003
	현재 어디까지 numbering이 되고 있는지만 알면 저장한 사원번호를 알지 못하더라도 
	효과적으로 key인 사원번호를 중복되지 않게 입력이 가능하다
	
	각 부서별로 연도별로 sequence(numbering할 수 있는)가 만들어진다면 효과적으로
	key데이터를 처리할 수 있다.
	
3. sequence의 활용
	위와 같이, 테이블에 종속되지 않고, 식별하는 key데이터를 만들어서 입력 또는 수정할 때,
	주로 활용된다.
	1) 증가하는 숫자
		시작 번호
		증가 단위
		최대 번호
		최소 번호
		최대값 범위에 갔을 때, 처리하는 옵션 : 계속 반복할 것인가 멈출 것인가?
		cache 메모리를 이용하여 보다 빠르게 처리할 것인가

4. sequence의 기본형식
	1) 생성
		create sequence 시퀀스명
			increment by 증가단위
			start with 시작번호
			maxvalue 최대값 | nomaxvalue 
			minvalue 최소값 | nominvalue
			cycle | nocycle 반복여부 설정
			cache n | nocache 속도 개선을 위한 메모리 캐시 갯수 설정.
	2) 활용
		시퀀스명.nextval : 현재 시퀀스번호를 출력하면서 다음 시퀀스가 넘버링된다
		시퀀스명.currval : 현재 시퀀스번호 출력
		
	3) 삭제
		drop sequence 시퀀스명;

5. 실제 sql에서 사용되는 sequence
	insert into emp(empno) values(empSeq, nextval);

*/
	CREATE SEQUENCE seq_01
		INCREMENT BY 1
		START WITH 1
		MINVALUE 1
		MAXVALUE 999999
		CYCLE;
	SELECT seq_01.nextval, seq_01.currval FROM dual;
--ex) 
	CREATE SEQUENCE seq_02
		INCREMENT BY 1
		START WITH 1001
		MINVALUE 1001
		MAXVALUE 9999
		CYCLE;
--	'AK'||to_char(sysdate,'YYYY')||seq_02.nextval empnum
--	'AK' : 코드, to_char(sysdate, 'YYYY') : 시퀀스번호
--	이와같이 문자열을 조합해서 고유 key값을 만들 수 있다
	SELECT seq_02.nextval, 'AK'||to_char(sysdate,'YYYY')||seq_02.nextval empnum
	 FROM dual;
--ex)
	CREATE SEQUENCE seq_03
		INCREMENT BY -1
		START WITH 8888
		MaxVALUE 8888
		MINVALUE 1000
		CYCLE;
	SELECT seq_03.nextval, seq_03.currval FROM dual;
--ex)
	CREATE SEQUENCE seq_04
		INCREMENT BY 5
		START WITH 1
		MAXVALUE 50
		MINVALUE 1
		CYCLE	-- 반복적으로 처리할 때 사용
		cache 2;	-- 속도의 향상을 위해서 사용되는데, 일반적으로 cycle이 설정되면 cache 2이상 처리되어야 한다
	SELECT seq_04.nextval, seq_04.currval FROM dual;
	DROP SEQUENCE seq_04;