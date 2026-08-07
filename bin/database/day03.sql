drop DATABASE IF EXISTS mydb0807;

CREATE DATABASE mydb0807;

use mydb0807;
CREATE table test(
    번호 int AUTO_INCREMENT,
    constraint PRIMARY KEY(번호),
    이름 VARCHAR(30) not null unique,
    개수 int DEFAULT 2
);
-- DML: 조작어, 1) insert 레코드삽입 2) select 레코드조회 3) update 레코드수정 4) delete 레코드삭제
-- 레코드란? 테이블내 행/가로 단위
# [1] insert : insert into 테이블명(속성명, 속성명) values(값1,값2)
INSERT into test(번호,이름,개수) VALUES(1,"유재석",10);
INSERT into test(이름,개수) VALUES("강호동", 20); -- 번호 값을 제외한 삽입
INSERT into test(이름) VALUES("신동엽"); -- 번호(auto), 개수(default)
-- INSERT inro test(이름) VALUES("유재석"); 오류/중복불가능
INSERT into test VALUES(4,"하하",30); -- 모든 속성값 순서대로 값 대입시 속성명 생략
INSERT into test(이름) values("박명수"), ("수박"), ("바나나");

# [2] select : select*from 테이블명
SELECT * FROM test;

SELECT 이름 FROM test;

select 이름, 개수 from test;
SELECT * from test WHERE 이름 = "유재석";
SELECT * from test where 개수>=5;

# [3] update : update 테이블명 set 속성명 = 새로운값, 속성명= 새로운 값 where 조건
update test set 개수 = 10;

update test set 개수 = 30 where 이름 = "유재석";

UPDATE test set 개수 = 40, 이름 = " 강호동" where 번호 = 2;

-- [3] delete: delete from 테이블명 where 조건
-- delete from test; -- 조건이 없으므로 테이블내 모든 레코드 제거
delete from test where 이름 = "유재석"; -- 이름 속성값이 유재석이면 삭제
delete from test where 번호 = 2;    -- 번호 속성값이 2이면 삭제
-- (DML)delete: 테이블내 레코드 삭제 [vs] (DDL)truncate table: 테이블내 레코드 삭제 [vs] drop table: 테이블 자체 삭제
-- DML은 취소 가능, DDL은 취소(Rollback) 불가능

# SQL 연산자
# 1. 회원테이블
create table member(    # 아이돌 그룹
 mid char(8) not null ,   # 식별키   최대 8자리
    mname varchar(10) not null , # 그룹명  최대 10자리
    mnumber int not null ,   # 인원수  정수 +-21억정도
    maddr char(2) not null ,   # 지역  최대 2자리
    mphone1 char(3) ,    # 지역번호 최대 2자리
    mphone2 char(8) ,    # 전화번호  최대 8자리
    mheight smallint ,    # 평균키   정수 +-3만정도
 mdebut date ,     # 데뷔일   yyyy-mm-dd
    constraint primary key ( mid )    # 제약조건
);
# 2. 구매테이블
create table buy(
 bnum int auto_increment ,    # 구매번호 정수  자동번호 부여
    mid char(8),      # 구매자  FK
    bpname char(6) not null ,   # 제품명  최대 6자리
    bgname char(4) ,      # 분류명   최대 4자리
    bprice int not null ,    # 가격   정수
    bamount smallint not null ,   # 구매수량 정수
    constraint primary key(bnum) ,     # 제약조건
    constraint foreign key ( mid ) references member(mid) # 제약조건
);
# 샘플데이터
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015.10.19');
INSERT INTO member VALUES('BLK', '블랙핑크', 4, '경남', '055', '22222222', 163, '2016.08.08');
INSERT INTO member VALUES('WMN', '여자친구', 6, '경기', '031', '33333333', 166, '2015.01.15');
INSERT INTO member VALUES('OMY', '오마이걸', 7, '서울', NULL, NULL, 160, '2015.04.21');
INSERT INTO member VALUES('GRL', '소녀시대', 8, '서울', '02', '44444444', 168, '2007.08.02');
INSERT INTO member VALUES('ITZ', '잇지', 5, '경남', NULL, NULL, 167, '2019.02.12');
INSERT INTO member VALUES('RED', '레드벨벳', 4, '경북', '054', '55555555', 161, '2014.08.01');
INSERT INTO member VALUES('APN', '에이핑크', 6, '경기', '031', '77777777', 164, '2011.02.10');
INSERT INTO member VALUES('SPC', '우주소녀', 13, '서울', '02', '88888888', 162, '2016.02.25');
INSERT INTO member VALUES('MMU', '마마무', 4, '전남', '061', '99999999', 165, '2014.06.19');
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
INSERT INTO buy VALUES(NULL, 'BLK', '맥북프로', '디지털', 1000, 1);
INSERT INTO buy VALUES(NULL, 'APN', '아이폰', '디지털', 200, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '아이폰', '디지털', 200, 5);
INSERT INTO buy VALUES(NULL, 'BLK', '청바지', '패션', 50, 3);
INSERT INTO buy VALUES(NULL, 'MMU', '에어팟', '디지털', 80, 10);
INSERT INTO buy VALUES(NULL, 'GRL', '혼공SQL', '서적', 15, 5);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 2);
INSERT INTO buy VALUES(NULL, 'APN', '청바지', '패션', 50, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 1);
INSERT INTO buy VALUES(NULL, 'APN', '혼공SQL', '서적', 15, 1);
INSERT INTO buy VALUES(NULL, 'MMU', '지갑', NULL, 30, 4);