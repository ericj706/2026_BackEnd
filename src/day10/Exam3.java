package day10;

public class Exam3 {
    public static void main(String[] args) {
         
        // 1. 상위객체
        상위클래스 obj1 = new 상위클래스();
        obj1.show();
        System.out.println(obj1.value1);
        System.out.println(obj1.value2);
        // System.out.println(obj1.value3);

        //2. 하위객체
        하위클래스 obj2 = new 하위클래스();
        obj2.show();
        System.out.println(obj2.value1);
        System.out.println(obj2.value3);

        // 3. *타입변환*
        상위클래스 obj3 = obj2;
        obj3.show();

    }//me
}//ce

/*
    오버로딩: 생성자명 또는 메소드명 동일하게 여러개 선언
    조건: 매개변수 개수, 타입, 순서 다른 경우
    오버라이딩: 물려받은 메소드 재정의
*/
class 상위클래스{
    int value1 = 10;
    int value2 = 20;
    상위클래스(){System.out.println("상위클래스 탄생");}
    void show(){System.out.println("상위 메소드 실행");}
}

class 하위클래스 extends 상위클래스{
    int value3 = 30; int value4 = 40;
    하위클래스(){System.out.println("하위클래스 탄생");}
    // 주의할점: 오버로딩 vs 오버라이딩
    void show( int a ){ } // 매개변수 존재 => 오버로딩

    @Override // 메소드 위에 @override
    void show(){ // 상위클래스의 메소드 선언부 모두 동일하면 (재정의)
        System.out.println("하위 메소드가 재정의 실행");
    }
    // 즉, 여러개 인스턴스가 메소드를 공유
}