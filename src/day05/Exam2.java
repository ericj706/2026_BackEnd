package day05;

public class Exam2 {
    
    public class Main {
        public static void main(String[] args) {

            Book b1 = new Book("Java Basics");      // 인스턴스 생성1
            Book b2 = new Book("OOP Concepts");     // 인스턴스 생성1
            Book[] library = new Book[3];                 // 인스턴스 생성1
             // b1,b2,library[] => 3개

            library[0] = b1;                              // 인스턴스 생성1
            library[1] = new Book("Data Structure"); // 인스턴스 생성1
             // b1,b2, library[b1,""] => 5개

            Book b3 = library[1];                         // 인스턴스 생성1
            b2 = library[0];                              // 인스턴스 삭제1 (실행후)
             // b1,b2=b1, library[b1,""], b3 => (실행후)5개, 삭제: 1개 / (실행전)6개

            Book[] archive = library;                     // 인스턴스 생성3
            archive[2] = new Book("Algorithm");    // 인스턴스 생성1
             // b1,b1, library[b1,"D"], archive[b1,"D","A"], b3 => 9개

            library[0] = null;                            // 인스턴스 삭제1
            b1 = null;                                    // 인스턴스 삭제1
             //  library[null, "D", null], archive[null,"D","A"], b3

            
            // ===== 프로그램 실행 종료 직전 (Final State) =====
            // 제시된 코드에서 총 인스턴스는 몇개 만들어졌고    [ 총 9개 ]
            // main함수가 종료 되기 전 유효 한 인스턴스는 몇 개 이고 몇개가 사라졌을까? [ 7개유효, 3개 삭제 ]
        }
    }

}

class Book {
  String title;
  // 생성자: 객체 생성 시 전달받은 도서 제목(title)으로 멤버변수(필드)를 초기화합니다.
  Book(String title) { this.title = title; } 
}
