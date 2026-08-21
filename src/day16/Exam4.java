package day16;

import java.time.LocalDate;
import java.time.LocalTime;

public class Exam4 {
    public static void main(String[] args) {
        
        // [1] 시계 구현
        // 1. 새로운 작업(시계) 스레드 실행
        시계스레드 runnable1 = new 시계스레드();       // 구현체 생성
        Thread thread1 = new Thread( runnable1 );   // 스레드 객체에 구현체 대입
        thread1.start();     // 스레드 객체 시작, [1.Main]이 작업스레드 On 
        
        // [2]
        

    }//me
}//ce
class 시계스레드 implements Runnable{ // Runnable 인터페이스 구현하면 멀티스레드 정의
    @Override
    public void run() { // 멀티스레드가 처리할 작업
        while (true) {
            System.out.println(LocalTime.now() ); // 현재시간
            try{Thread.sleep(998);}catch(Exception e){} // 1초 일시정지

        }
    }
}