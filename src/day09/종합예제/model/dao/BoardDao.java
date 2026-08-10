package day09.종합예제.model.dao;

import java.lang.reflect.Array;
import java.util.ArrayList;

import day09.종합예제.model.dto.BoardDto;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){return instance;}
    // 추후에 MYSQL 서버와 연동
    // 데이터베이스 대신에 ArrayList 사용
    private ArrayList<BoardDto> boardList = new ArrayList<>();

    // [1] 대기명단 작성 로직
    public boolean save(BoardDto boardDto){
        // 1. controller으로부터 저장할 정보 객체 받는다.
        // ** insert 이용한 db에 저장
        // 2. 리스트에 저장
        boardList.add(boardDto);
        // 3. 성공반환
        return true;
    }
    // [2] 대기자 명단 전체 조회 로직
    public ArrayList<BoardDto> findAll(){
        // 1. controller에게 매개변수 받는다. 현재는 없음
        // ** 추후에 select 이용한 db 조회
        // 2. 리스트 전체 반환
        return boardList;
    }

    // [3] 대기자 목록 수정
    public boolean update(BoardDto boardDto){
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getNum().equals(boardDto.getNum())){
                boardList.set(i, boardDto);
                return true;
            }
        }
        return false;
    }


    // [4] 대기자 목록 삭제
    public boolean remove(String num){
        for (int i = 0; i < boardList.size(); i++) {
            if (boardList.get(i).getNum().equals(num)) {
                boardList.remove(i);
                return true;
            }
        }
        return false;
    }

}
