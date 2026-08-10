package day05;

public class Exam2 {
    
    
        public static void main(String[] args) {

            Book b1 = new Book("Java Basics");      // 인스턴스 생성1
            Book b2 = new Book("OOP Concepts");     // 인스턴스 생성1
            Book[] library = new Book[3];                 // 인스턴스 생성1
             // b1,b2,library[] => 3개

            library[0] = b1;                              
            library[1] = new Book("Data Structure"); // 인스턴스 생성1
             // b1,b2, library[b1,"D"] => 4개

            Book b3 = library[1];                         
            b2 = library[0]; //==> b2 삭제, Java Basics 타이틀인스턴스에 접근
            

            Book[] archive = library;                     
            archive[2] = new Book("Algorithm");    // 인스턴스 생성1
            

            library[0] = null;          // achive[]는 library[]를 따라가기 때문에, archive[0]도 null
            b1 = null;
             //  library[null, "D", null], archive[null,"D","A"], b3

            
            // ===== 프로그램 실행 종료 직전 (Final State) =====
            // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고    [ 총 5개 생성 ]
            // main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까? [  ]
        }
    

}

class Book {
  String title;
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}
