package day10;

public class Example2 {
    public static void main(String[] args) {
        Car myCar = new Car();  // 
        System.out.println(myCar); // 주소값
        Car yourCar = new Car();
        System.out.println(yourCar);

        myCar.tire = new Tire(); 
        myCar.run(); 
        yourCar.tire = new Tire();

        myCar.tire = new HankookTire(); 
        myCar.run();    // 한국 타이어
        yourCar.run();  // 일반 타이어

        myCar.tire = new KumhoTire();
        myCar.run(); 

        System.out.println( myCar.tire instanceof Tire ); // true
        System.out.println( myCar.tire instanceof KumhoTire ); // true
        System.out.println( myCar.tire instanceof HankookTire ); // false

        // 인스턴스 1개당 멤버변수 (tire) 각각 생성한다.    ( 상태 ) '아이디' 상태는 회원마다 제공할 필요.
        // 인스턴스 여러개는 하나의 메소드 (run()) 공유한다. ( 행위 )'로그인' 기능은 회원마다 제공할 필요 X.
        // 상속의 다형성이란? 타입변환은 호환성!

        // 클래스 생성할때 코드가 중복되면 부모클래스 만들어 상속.
        // 일반 코드가 중복되면 함수 만들기
        // 특정 패턴이 있는 코드가 중복되면 반복문 만들기
        // 일반 코드가 흐름/분기 조건문 만들기
        
    } // main
} // class end

class Car{ // 자동차
 Tire tire; // 멤버변수, 초기값이 없다
 void run() { this.tire.roll(); }   // 메소드, this(해당 메소드 호출한 인스턴스뜻)

 Tire fontRightTire;
 Tire fontLeftTire;
 Tire backRightTire;
 Tire backleftTire;
 
}

class Tire{ // 타이어
 void roll(){
 System.out.println("[일반] 타이어가 회전");
 }
}
class HankookTire extends Tire{
 void roll(){ System.out.println("[한국] 타이어가 회전(업그레이드)"); }
}
class KumhoTire extends Tire{ 
 void roll(){ System.out.println("[금호] 타이어가 회전(업그레이드)"); }
}