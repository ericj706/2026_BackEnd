package day12.종합예제.view;

import day12.종합예제.controller.BoardController;

public class BoardView {
    private BoardView(){} // 1.
    private static final BoardView instance = new BoardView(); // 2.
    public static BoardView getInstance( ){ return instance; } // 3. 

    // [*] MVC패턴 흐름의 controller 싱글톤 호출
    private BoardController bc = BoardController.getInstance();
}

