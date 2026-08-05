# 한줄주석
-- 한줄주석
/* 여러줄주석*/

-- 데이터베이스란? 여러 데이터들을 집합/공간
-- 데이터베이스서버란? 여러 데이터베이스들을 저장한 PC/프로그램

-- [1] 데이터베이스 목록 보기
-- 1. SQL 문법 작성한다. 2. ;세미콜론 마침 3. 실행할SQL문법에 커서 두고 CTRL+엔터 또는 RUN
SHOW DATABASE; -- 연결된 DB서버내의 모든 데이터베이스 목록 확인

-- [2] 데이터베이스 로컬 경로
SHOW VARIABLES LIKE 'datadir';

-- [3] 데이터베이스 생성, 주의할점 : 중복된 데이터베이스명 불가능, SQL문법은 대소문자 구분하지 않는다.
CREATE DATABASE mydb0804;

-- [4] 데이터베이스 삭제 (코드로)
DROP DATABASE mydb0804;

DROP DATABASE if EXISTS mydb0804;

-- [5] 데이터베이스 활성화 : 연결된 DB서버내 여러개 DB중 조작할 DB선택
use mydb0804;

-- [활용] : 프로젝트의 데이터베이스 초기화할때 기본 코드 3줄.
drop DATABASE if EXISTS boardService;

CREATE DATABASE boardService;

use boardService;

