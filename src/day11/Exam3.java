package day11;

public class Exam3 {
    public static void main(String[] args) {
        
    // 1. 
        Car mycar = new Car();
        //myCar.run();    // 자동차만 만들고 타이어가 연결X
    // 2.
        //mycar.tire = new Tire(); // 인터페이스로 객체생성 불가능
    // 3.
        mycar.tire = new HankookTire();
        mycar.run();    // 한국타이어 회전
    // 4. 
        mycar.tire = new KumhoTire();
        mycar.run();    // 금호타이어 회전
    // 5. 
        System.out.println(mycar.tire instanceof Tire);         // true
        System.out.println(mycar.tire instanceof HankookTire);  // true
        System.out.println(mycar.tire instanceof KumhoTire);    // false
    // ** 익명(클래스없이)구현 = 일회성으로 사용하는 인터페이스 구현체
    // 자체적으로 추상메소드 오버라이딩
    // new 인터페이스명 (){오버라이딩}
        Tire tire = new Tire(){
           @Override public void roll() {
            System.out.println("일회성타이어 회전");
           }; // roll에대한 오버라이딩
        };
        mycar.run(); // 일회성 타이어 회전
    }
}



class Car{
    Tire tire;
    void run() { this.tire.roll(); }
}
// 인터페이스
interface Tire{
    void roll(); // { }없는 메소드: 추상메소드

}

// 구현체
class HankookTire implements Tire{
    //추상 메소드{ } 구현 (재정의)
    @Override
    public void roll() {
        System.out.println("한국타이어 회전");
    }
}
class KumhoTire implements Tire{
    @Override
    public void roll() {
        System.out.println("금호타이어 회정");
    }
}
