package day07;
public class Exam1 {
    public static void main(String[] args) {
        /*
            -함수란? 기능을 수행하는 코드집합
            -메소드란? 자바에서는 함수=>메소드
                1) 클래스 내부 선언
                2) 목적: 재사용, 인수에 따른 서로 다른 결과물
                3) 선언:
                    - 반환타입 메소드명(타입 매개변수){
                        return 반환값
                    }
                    - 반환타입: 반환값의 타입/자료형 일치!
                    - 메소드명: 소문자 시작하는 카멜표기법
                    - 타입 매개변수: 함수호출 하는 곳으로 전달받는 값의 타입 일치!
                    - { }: 함수호출시 실행할 코드
                    - return: 함수종료시 반환되는 값
                4) 호출: 다양한 기준
                    1. 서로 다른 클래스에서 메소드 호출
                        주체: this(특정 메소드/생성자 호출한 객체)
                    2. 동일한 클래스내 메소드 호출시 인스턴스 필요없다.
                        메소드명():
                ** 매개변수는 지역변수이다.
                    지역변수란? 특정 함수/if/for{}에서 선언된 변수는
                               종료되면 사라진다. { }밖에서 호출이 안된다.
        */

        calculator 나만의계산기 = new calculator();

        // 1) 매개변수가 없고 반환이 있는 경우
        double pi = 나만의계산기.getPI();
        // 2) 매개변수가 없고 반환도 없는 경우
        나만의계산기.powerOn();
        // 3) 
        나만의계산기.printSum(10, 5);
        // 4)
        int result = 나만의계산기.add(10, 5);

        // *** 주의할점 ***: this(주체)인스턴스 식별!
        // 1. 강호동,유재석
        

    }//me
}//ce

class calculator{
    // 1. 멤버변수
    // 2. 생성자
    // 3. 메소드/함수
        // 1) 매개변수X 반환값O
    double getPI(){
        return 3.14;
    }
        // 2) 매개변수X 반환값X
    void powerOn(){ 
        System.out.println("전원을 킵니다.");
        return; 
    }
        // 3) 매개변수O, 반환값X
    void printSum(int x, int y){
        System.out.println(x+y);
    }
        // 4) 매개변수O, 반환값O
    int add(int x, int y){
        // 동일한 클래스내 다른 메소드 호출
        this.printSum(x, y);
        return x+y;
    }
}

class 사람타입{
    // 사람이 가져야할 상태 설계 = 멤버변수
    String name;
    int age;
    String job;
    // 사람이 태어날때 초기호 가져야할 설계 = 생성자
    사람타입(String name){
        this.name = name;
        age=1;
    }

    // 취업,행위,상태변경 설계 = 메소드
    void 취업성공(String 취업한직업){
        this.job = 취업한직업;
        return;
    }

}