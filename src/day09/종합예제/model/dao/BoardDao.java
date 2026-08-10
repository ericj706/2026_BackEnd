package day09.종합예제.model.dao;

import java.util.ArrayList;

public class BoardDao {
    private BoardDao(){}
    private static final BoardDao instance = new BoardDao();
    public static BoardDao getInstance(){return instance;}
    // 추후에 MYSQL 서버와 연동
    // 데이터베이스 대신에 ArrayList 사용
    private ArrayList<BoardDto> boardList = new ArrayList<>();
}
