package day09.종합예제.view;

import java.util.ArrayList;
import java.util.Scanner;

import day09.종합예제.controller.BoardController;
import day09.종합예제.model.dto.BoardDto;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance(){return instance;} // 3.
    private BoardController bc = BoardController.getInstance(); // view에서 controller 싱글톤 호출
    // 모든 메소드에서 사용 가능한 입력객체
    

    public void run(){
        while(true){
            System.out.println("==========Waiting List==========");
            System.out.println("| 1. 대기명단 등록 | 2. 대기명단 조회 |");
            System.out.println("| 3. 등록명단 수정 | 4. 등록명단 삭제 |");
            System.out.println("==============================");
            System.out.print("선택> ");
            int ch = scan.nextInt();
            if( ch == 1) { save();}
            else if ( ch == 2 ){findAll();}
            else if ( ch == 3 ){update();}
            else if ( ch == 4 ){remove();}
        }
    }
    private Scanner scan = new Scanner(System.in);
    // [1] 대기명단 작성 입출력
    public void save(){
        // 1. 입력받기
        System.out.print("연락처: ");   String 연락처 = scan.next();
        System.out.print("방문자 수: "); int 방문자수 = scan.nextInt();
        // 2. 객체화
        BoardDto boardDto = new BoardDto(연락처, 방문자수);
        // 3. 컨트롤러에게 요청하고 응답받기
        boolean result = bc.save(boardDto);
        if(result){System.out.println("등록성공");}
        else{System.out.println("등록실패");}
    }

    // [2] 대기자 명단 전체출력
    public void findAll(){
        // 1. 컨트롤러로부터 모든 게시물 요청하고 받는다.
        ArrayList<BoardDto> result = bc.findAll();
        // 2. 컨트롤러로부터 받은 모든 게시물 출력
        for( BoardDto board : result){
            System.out.println( 
            board.getNum()+" , 방문 인원 수: "+
            board.getCount()+"명" );
        }
    }

    // [3] 대기자 목록 수정
    public void update(){
        System.out.print("연락처: "); String 연락처 = scan.next();
        System.out.print("(수정)방문자 수: "); int 방문자수 = scan.nextInt();
        BoardDto boardDto = new BoardDto(연락처,방문자수);
        boolean result = bc.update(boardDto);
        if(result){System.out.println("수정성공");}
        else{System.out.println("수정실패");}
    }

    // [4] 대기자 목록 삭제
    public void remove(){
        System.out.print("삭제할 연락처: "); String 연락처 = scan.next();
        boolean result = bc.remove(연락처);
        if(result){System.out.println("삭제성공");}
        else{System.out.println("삭제실패");}
    }
}//ce
