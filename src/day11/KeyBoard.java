package day11;

public interface KeyBoard{
// 폴더 -> new java file -> interface 생성
// 1. 상수, 초기값 필수  
    public static final String info = "인텔";
    String date = "2026-08-12";
// 2.추상메소드, { } 생략한 선언부만 작성 
    public abstract void aKey();
    int bkey( int x );
}