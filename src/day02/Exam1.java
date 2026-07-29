package day02;

public class Exam1 {
    public static void main(String[] args) {
        // [1] 자동(묵시적) 타입 변환 : byte->short->int->long->float->double (다형성, 상속/인터페이스)
        byte bytevalue = 100;   // byte 타입에 bytevalue 변수명으로 100 리터럴 대입
        short shortvalue = bytevalue; // [가능] byte->short[*자료유지, 타입변경]
        int intvalue = shortvalue; 
        long longvalue = intvalue;
        float floatvalue = longvalue;
        double doublevalue = floatvalue;

        // *연산(계산)중에 자동타입변환, byte/short 연산결과 => int() , 두 항중에 더 큰 타입으로 결과 타입 변환
        byte b1 = 10; byte b2 = 20; short s1 =30; int i1 = 40; long l1 = 50L;
        int result1 = b1 + b2; // byte+byte => int
        int result2 = b2 + s1; // byte+short => int
        int result3 = i1 + i1; // int+int => int
        long result4 = i1 + l1;


        // [2] 강제 타입 변환 : 큰것 -> 작은것, *자료손실*
        double dvalue = 3.14;
        float fvalue = (float)dvalue; //강제타입변환

    }//m e
}//c e
