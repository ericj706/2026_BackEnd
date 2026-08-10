package day09.종합예제.controller;

import java.util.ArrayList;

import day09.종합예제.model.dao.BoardDao;
import day09.종합예제.model.dto.BoardDto;

public class BoardController {
    private BoardController (){}
    private static final BoardController instance = new BoardController();
    public static BoardController getInstance(){return instance;}
    private BoardDao bd = BoardDao.getInstance(); // controller에서 dao 싱글톤 호출

    // [1] 대기명단 작성 컨트롤러
    public boolean save(BoardDto boardDto){
        // 1. view로 부터 저장할 정보 객체로 받는다.
        // ** 유효성검사 / 타입 변환 등등
        // 2. DAO에게 요청하고 응답받기
        boolean result = bd.save(boardDto);
        // 3. DAO에게 받은 결과를 VIEW에게 응답하기
        return result;
    }

    // [2] 대기자 명단 전체 조회 컨트롤러
    public ArrayList<BoardDto> findAll(){
        // 1. view에게 매개변수 받는다. 현재는 없음
        // 2. dao에게 요청하고 응답 받는다.
        ArrayList<BoardDto> result = bd.findAll();
        // 3. dao에게 받은 결과를 view에게 반환한다.
        return result;
    }

    // [3] 대기자 목록 수정 컨트롤러
    public boolean update(BoardDto boardDto){
        boolean result = bd.update(boardDto);
        return result;
    }

    // [4] 게시물 삭제 컨트롤러
    public boolean remove(String num){
        boolean result = bd.remove(num);
        return result;
    }
}// ce
