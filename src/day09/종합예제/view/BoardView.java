package day09.종합예제.view;

import java.util.Scanner;

import day09.종합예제.controller.BoardController;
import day09.종합예제.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance(){return instance;} // 3.
    private BoardController bc = BoardController.getInstance(); // view에서 controller 싱글톤 호출
    // 모든 메소드에서 사용 가능한 입력객체
    private Scanner scan = new Scanner(System.in);

    // [1] 게시물 작성 입출력
    public void save(){
        // 1. 입력받기
        System.out.println("내용: ");   String 내용 = scan.next();
        System.out.println("작성자: "); String 작성자 = scan.next();
        // 2. 객체화
        BoardDto boardDto = new BoardDto(내용, 작성자);
        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = bc.save(boardDto);
        if(result){System.out.println("등록성공");}
        else{System.out.println("등록실패");}

    }
}
