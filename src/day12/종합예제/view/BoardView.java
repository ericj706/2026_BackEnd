package day12.종합예제.view;

import day12.종합예제.controller.BoardController;
import day12.종합예제.model.dto.BoardDto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance( ){ return instance; } // 3. 
    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
    // [*] 입력객체
    private Scanner scan = new Scanner(System.in);
    // [*] 최초 루프/화면
    public void run( ){
        while( true ){
            try{ // 예외처리 
                System.out.print("1.등록 2.전체조회 3.개별수정 4.개별삭제 선택:");
                int ch = scan.nextInt();
                if( ch == 1 ){ }
                else if( ch == 2 ){ }
                else if( ch == 3 ){ }
                else if( ch == 4 ){ }
            }catch( InputMismatchException e ){
                // 입력(성공) 했지만 타입반환에서 예외 이므로 입력객체 초기화
                scan = new Scanner( System.in );
                System.out.println("[다시입력]" + e);
            }
        }
    }
    // [1] 등록 View
    public void save( ){
        System.out.print("내용: ");     String 내용 = scan.next();  // 1.1 저장할 자료 입력받기 
        System.out.print("작성자: ");   String 작성자 = scan.next();
        BoardDto boardDto = new BoardDto(0, 내용, 작성자); // 1.2 자료 객체화하기 , no(아무거나/사용X)
        boolean result = bc.save( boardDto ); // 1.3 컨트롤러 에게 전달(dto) 하여 응답(boolean) 받기 
        if( result ){ System.out.println(">등록성공");} // 1.4 응답받은 결과로 출력
        else{ System.out.println(">등록실패"); }
    }
    // [2] 전체조회 VIEW
    public void findAll( ){
        ArrayList<BoardDto> result = bc.findAll();// 1. 컨트롤러에게 요청하고 모든 게시물정보 들을 받는다.
        for( BoardDto dto : result ){// 2. 반복문 이용하여 게시물정보들을 출력 
            System.out.println( dto.getNo()+" / "+dto.getWriter()+" / " +dto.getContent() );
        }
    }
    // [3] 개별수정 VIEW
    public void update( ){
        System.out.print("수정할번호: ");   int 수정할번호 = scan.nextInt();
        System.out.print("수정할내용: ");   String 수정할내용 = scan.next();
        BoardDto boardDto = new BoardDto(수정할번호, 수정할내용, null ); // writer 사용안함.null
        boolean result = bc.update( boardDto );
        if( result ){ System.out.println(">수정 성공"); }
        else{ System.out.println(">수정 실패(없는 번호)"); }
    }
    // [4] 개별삭제 VIEW
    public void delete(){
        System.out.println("삭제할번호: "); int 삭제할번호 = scan.nextInt();
        boolean result = bc.delete(삭제할번호);
        if(result){System.out.println(">삭제성공");}
        else{System.out.println(">삭제실패 (없는번호)");}
    }
}

