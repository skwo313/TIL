/*
2021-12-06
[1단계:개념] 1. 계층형 sql이란 무엇인가?
	START WITH : 계층 구조 전개의 시작 위치를 지정하는 구문이다. 루트데이터를 지정한다
	CONNECT BY : 다음에 전개 될 자식 데이터를 지정하는 구문이다. 자식 데이터는 CONNECT BY 절에 주어진 조건을 만족해야 한다. (JOIN)
	PRIOR : CONNECT BY 절에 사용되며, 현재 읽은 컬럼을 지정한다. ‘PRIOR 자식 = 부모’ 형태를 사용하면 계층 구조에서 자식 → 부모 방향으로 순방향 전개를 한다. 그리고 ‘PRIOR 부모 = 자식’ 형태를 사용하면 반대로 부모 → 자식 방향으로 전개하는 역방향 전개를 한다.
	NOCYCLE : 데이터를 전개하면서 이미 나타났던 동일한 데이터가 전개 중에 다시 나타난다면 이것을 사이클 (Cycle) 이 형성되었다 라고 말한다. 사이클이 발생한 데이터는 런타임 오류가 발생한다. 그렇지만 NOCYCLE 을 추가하면 사이클이 발생한 이후의 데이터는 전개하지 않는다.
	ORDER SIBLINGS BY : 형제 노드 (동일한 LEVEL) 사이에서 정렬을 수행한다.
	WHERE : 모든 전개를 수행한 후에 지정된 조건을 만족하는 데이터만 추출한다.(조건문)
[1단계:개념] 2. 계층형 sql의 데이터 구조를 emp의 empno와 mgr을 기준으로 기술하세요
	계층형 sql이란 한 테이블에 담겨 있는 여러 레코드들이 서로 상하 관계(부모, 자식) 관계를 이루며 존재할 때,
	  이 관계에 따라 레코드를 상/하위 한 구조로 가져올 때 사용되는 SQL을 의미한다. 
	  하나의 사원정보 row는 사원번호(empno)와 관리자(mgr)가 있는데 이 mgr은 사원번호를 다시 가지고 있다. 
	  여기서 emp 테이블의 empno와 mgr를 보면 제일 최상위 구조에 7839 KING이 위치하고 있고 
	  다음 2레벨에는 7782/7698/7566 3레벨에는  7934/7844/7900/7902이 위치한 트리 모형으로 이루어져 있다. 

[1단계:개념] 3. 계층형 sql의 핵심 keyword의 의미를 기술하세요.
   1) select level, 컬럼..
      level : 각 컬럼에 해당하는 데이터의 계층 레벨을 표기
   2) start width 컬럼 = 조건 : 최상위 root 레벨을 지정하는 조건
   3) connect by prior 컬럼1 = 컬럼2 : 계층으로 나누어지는 컬럼의 관계를 설정하는 것이다.
                  하위컬럼 = 상위컬럼 : 순방향
                  상위컬럼 = 하위컬럼 : 역방향
   select level
   from 테이블명
   start with mgr = null : 최상위 root 계층 조건을 설정
   connect by prior = empno : 상/하위 계층을 연결하는 조건을 처리
[1단계:확인] 4. 답변형게시판 테이블(글번호,상위글번호, 제목, 작성자, 등록일, 조회수)을 계층구조로 데이터를 입력한 후에
              계층형 sql을 이용해서 조회하세요
*/
SELECT FROM emp;

CREATE TABLE board(
    bno number PRIMARY KEY, 
    rbno NUMBER,
    title varchar2(50),
    name varchar2(30),
    redate date,
    hits NUMBER
);

INSERT INTO board VALUES (1,0,'쌍용 12/06일 과제','유진선',sysdate,4);
INSERT INTO board VALUES (2,1,'문제 1번','유진선',sysdate,4);
INSERT INTO board VALUES (3,1,'문제 2번','유진선',sysdate,4);
INSERT INTO board VALUES (4,2,'문제 1번 풀이','유진선',sysdate,4);

SELECT LEVEL, b.
FROM board b 
START WITH rbno=0
CONNECT BY PRIOR bno = rbno 
ORDER BY LEVEL;
/*
[2단계:확인] 5. sequence를 사용하는 이유를 기술하세요.
	게시판의 글번호 같은 경우는 순차적으로 생성되며 절대 중복되지 않는
	Unique속성을 가지고 있다. 시퀀스가 없다면 새로운 글이 생성될때마다
	쿼리를 매번 실행하여 글 번호의 최대값을 확인 후 그보다 1큰 값을 계산해
	새로운 글 번호를 INSERT한다.
	반면 시퀀스를 사용한다면 한번의 쿼리로 INSERT를 할 수 있기 때문에 DB에 부하를 덜 줄수 있다.
[1단계:확인] 6. sequence의 주요속성값을 기술하세요
	1) 생성
      create sequence 시퀀스명
         increment by 증가단위
         start with 시작번호
         maxvalue 최대값 | nomaxvalue
         minvalue 최소값 | nominvalue
         cycle | nocycle 반복여부 설정
         cache n | nocache 속도 개선을 위한 메모리 캐시 갯수 설정
   2) 활용
      시퀀스명.nextval : 현재 시퀀스번호를 출력하면서 다음 시퀀스가 넘버링된다.
      시퀀스명.currval : 현재 시퀀스번호를 출력
   3) 삭제
      drop sequence 시퀀스명;
[1단계:확인] 7. 상품목록의 상품번호를 Q21121000부터 시작해서 Q년도월1000~ 까지 입력할려고 한다, squence를 만들고,
               해당테이블에 key를 입력하세요..
*/
			CREATE SEQUENCE seq_05
				INCREMENT BY 1
				START WITH 1000
				MAXVALUE 9999
				MINVALUE 1000
				CYCLE;
			SELECT seq_05.nextval, 'Q'||to_char(sysdate, 'YYMM')||seq_05.nextval 
			FROM dual;
				
/*
[1단계:확인] 8. exerd의 환경 설정을 처리하세요(ppt)
*/