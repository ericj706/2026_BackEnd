package day09;

public class Exam2 {
    public static void main(String[] args) {
        // 싱글톤패턴 : 프로그램내 단 *하나의* 인스턴스(객체) 갖는 설계 구조
        /* 목적 : 
            1. 다수 인스턴스 생성 방지 (프로그램내 인스턴스 여러개 필요없는 경우)
            2. 하나 인스턴스 사용하여 메모리 공유
        */
        View 인스턴스1 = new View(); System.out.println(인스턴스1); // View@372f7a8d
        // 간접사용=> 클래스명.getInstance();
        Controller 인스턴스2 = Controller.getInstance(); System.out.println(인스턴스2); // Controller@3caeaf62


    }
}//ce

class View{ } // 일반 객체 클래스
class Controller{ // 싱글톤 클래스
    // 1. 생성자를 private 한다. 다른 클래스에서 생성자 사용금지
    private Controller(){} 
    // 2. 클래스 내부에 단 하나의 인스턴스 생성
    private static final Controller instance = new Controller();
    //3. 클래스 내부에 인스턴스를 간접 사용(공유) 하도록 getter 만든다.
    public static Controller getInstance(){ return instance; }

}
