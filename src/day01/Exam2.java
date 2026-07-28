package day01;
public class Exam2 {    // 클래스 시작
    // [1] m+엔터 : main함수 작성
    public static void main(String[] args) {
        // [2] 리터럴 : 상수, 키보드로 입력한 것
        // 3, 'a', true
        System.out.println(3); // so + 엔터
        System.out.println('유');   // '작은따옴표' : 문자 1글자
        System.out.println("유재석");   // "큰따옴표" : 문자 n글자
        System.out.println(true);
        // [3] 자료타입/자료형 : 자료(데이터) 효율적으로 분류하는 방법
        // *효율이란? 자료 크기에 따라 적당한 타입(크기) 선정하여 빈공간(여백) 줄이기
        // C/JAVA : 정적(직접)타입 vs Py/JS 동적(자동)타입

        // 1) boolean : true or false 저장하는 타입, 1byte( 1bir->8bit->1byte)
        boolean bool1 = true;   // let/const --> boolean
        System.out.println(bool1);

        // 2) char : '작은따옴표'로 감싼 문자 1개 저장하는 타입, 유니코드( 코드 <--> 자연어 번역단위)
        char ch1 ='a';  
        System.out.println(ch1);

        // 3) String : "큰따옴표"로 감싼 문자 N개 저장하는 타입, N * 2 byte, 객체(문자열)
        String str1 = "abc";
        System.out.println(str1);
        // === 정수 ===
        // 4) byte : -128~127 저장하는 타입, 1byte
        byte b1 = 100; System.out.println(b1);
        // 5) short : +-3만정도, 2byte
        short sh = 30000;
        // 6) int : +-21억정도, 4byte, *** 정수의 리터럴 타입 ***
        int i1 = 2000000000; System.out.println(i1);
        // 7) long : +-21억이상, 8byte
        long l1= 2100000000;


    } // main end

} // class end
