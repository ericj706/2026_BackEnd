package day10;

public class Exam1 {
    public static void main(String[] args) {
        
        // 1. 동물 객체 생성
        동물 animal1 = new 동물();  // 생성자 실행
        animal1.name = "강아지";    // 멤버변수 접근
        animal1.show();            // 메소드 실행
        // 2. 조류객체 생성
        조류 bird1 = new 조류();    // 조류생성자 + 동물생성자 실행
        bird1.name = "비둘기";      // 동물 멤버변수 접근
        bird1.show();              // 동물 메소드 실행
        // 즉, 하위/자식 클래스의 객체는 상위/부모 클래스의 멤버(변수/메소드) 사용
        // 3. 참새 객체 생성
        참새 sparrow1 = new 참새();
        sparrow1.name = "참새";   
        sparrow1.show();      

        // 4. 닭 객체 생성
        닭 chicken1 = new 닭();  // 닭생성자 + 조류생성자 + 동물생성자
        chicken1.name = "닭";
        chicken1.show();
        // 즉, 상위 클래스의 객체가 먼저 생성되고 하위 클래스의 객체가 생성된다.
        // *****다양성*****
        // *하나의자료*가 다양한 형(형식/모양/형태/구분) 성질

        // 1. 참새가 조류로 타입으로 변환/ 가능
        // 가능이유 1) 상속관계(논리) 2) 참새인스턴스가 생성될때+조류+동물 인스턴스생성
        조류 bird2 = sparrow1;  // 자동타입 타입 / 업캐스팅(올라가기)
        // 2. 참새타입에서 동물 타입으로 변환 / 가능
        동물 animal2 = sparrow1; // 업캐스팅 
        // 3. 동물 타입에서 참새 타입으로 변환 / 주의
        // 주의: 1) 변환타입명시 2) 변환할 자료가 변환할 타입 포함하는지?
        참새 sparrow2 = (참새)animal2; // 강제타입변환 / 다운캐스팅(내려가기)
        
        // 4. 동물 타입에서 참새 타입으로 변환 / 주의
        // 주의: 자식이 태어날때 부모도 태어나지만 자식은 X
        참새 sparrow3 = (참새)animal1; // 오류발생. 동물 태어날때 참새는 생성X

    }//me
}//ce

class 동물{ // 부모 클래스
    String name; // 1. 멤버변수

    동물(){       // 2. 생성자
        System.out.println("동물 탄생");
    }
    void show(){ // 메소드
        System.out.println("동물 뛴다");
    }
} //ce
class 조류 extends 동물{ } // 하위클래스명 extends 상위클래스
class 참새 extends 조류{ }
class 닭 extends 조류{ }
