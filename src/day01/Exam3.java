package day01;

import java.net.Socket;
import java.util.Scanner;

public class Exam3 {    // class s
    public static void main(String[] args) {    // main s
        // [1] 출력함수
        // System(클래스).out(출력객체).print(출력함수)
        // 1. System.out.println(); 출력후 자동 줄바꿈
        System.out.println("자바안녕1" );
        // 2. System.out.print(); 출력만.
        System.out.print("자바안녕2" );

        // [2] 이스케이프 / 제어 문자 :  \백슬래시 이용한 특수기능
        // \n: 줄바꿈, \t: 들여쓰기, \', \", \\: \뒤를 출력
        System.out.println("\n자바안녕3\t자바안녕4\"\'\\");
        // 1. System.out.printf("형식", "자료")
        // %s : 문자열이 들어갈 자리, %c : 문자가 들어갈자리
        // %d : 정수가 들어갈 자리, %f : 실수가 들어갈 자리
            /* % 자릿수d:
            %-자릿수d:
            %0자릿수d:
            %전체자릿수.소수자릿수f
            */
        System.out.printf("저는 %s이고 나이는 %d입니다", "유재석", 40);
        // %s에는 유재석, %d에는 40이 매칭된다.
        System.out.printf("\n저는 %s이고 나이는 %6d입니다\n", "유재석", 40);
        System.out.printf("저는 %s이고 나이는 %-6d입니다\n", "유재석", 40);
        System.out.printf("저는 %6s이고 나이는 %06d입니다\n", "유재석", 40);
        System.out.printf("저는 %-6s이고 점수는 %5.2f입니다","유재석", 123.4567);


        // [3] 입력객체/함수
        // 1. Scanner : *코드파일 상단에 immport java.until.Scanner; 자동추가 확인 *(해당 폴더에서 클래스를 가져온다)


        Scanner scanner = new Scanner(System.in);
        System.out.print("2) 정수입력: ");
        int i = scanner.nextInt();
        System.out.printf("입력받은자료: %d\n", i);

    }// main end 
}// class end
