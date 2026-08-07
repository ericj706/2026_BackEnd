package day08;

public class Exam3 {
    int a;
    void b(){};

    static int c;
    static void c(){};

    public static void main(String[] args) {
        // [**]
        // System.out.println(a);
        Exam3 exam3 = new Exam3();
        System.out.println(exam3.a);
        exam3.b();
        c();

        // [1] final
        D 변수 = new D();
        // 변수.고정변수 = 20; //오류

        // [2] static: 클래스명.(클래스마다)정적변수
        D.정적변수 = 20;

        // vs 멤버변수: 객체명.(인스턴스마다)멤버변수
        D 변수1 = new D();
        변수1.멤버변수 = 20;
        D 변수2 = new D();
        변수2.멤버변수 = 30;    // 총 메모리 2개



    }
}
class D{
    // - final 키워드: 초기값(필수) 이후에 수정 불가능
    public final int 고정변수 = 10;
    // - static 키워드: (정적) 우선(프로그램실행시)할당
    public static int 정적변수 = 10;    // = 클래스/정적 변수
    public int 멤버변수 = 10;
    // **무분별한 사용은 메모리의 효율성 떨어진다.
    // **static 프로그램 시작시 할당되고 프로그램 종료시 사라진다.

    // - public static final: 상수
    public static final int 상수 = 30;
    // **주의: static 우선할당이므로 static 아닌 변수/메소드 접근불가
    // ->해결방안: 인스턴스(new)/객체(추상) 통해 멤버변수/메소드 사용하자.

}