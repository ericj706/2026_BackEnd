package day04;

public class Exam2 {
    public static void main(String[] args) {
        
        // 1.for(초기값; 조건문; 증감식){ 실행문; }
        // 중첩 for문 : for(){for()}
        for( int 단 =0; 단<=9;단++){

        }

        for(int i=0; i<=9; i++){
            if(i==3){ continue; }
            if(i ==9) break;
            System.out.println( i );
        }

        // 3. 무한루프: 실행문 계속반복, 특정조건에 따른 break 활용
        for( ; ; ){System.out.println("무한반복"); break;}
        while(true){System.out.println("무한반복"); break;}

        // 4. 초기값; while(조건문){실행문;} [vs] for문
        int i = 1; // [1] 초기값
        while(i<=10){ // [2] 조건식
            System.out.println(i);
            // [3] 증감식
            i++;
        } // w end

        // 5. 반복문과 배열관계 : 배열 내 저장된 자료들을 인덱스(저장된 순서번호)로 식별(0~)
        int[ ] ary = { 92, 80, 75 };    // 자바 배열! [vs] 자바스크립트 배열
        // * 배열은 인덱스가 0부터 마지막 인덱스까지 순차 저장
        for(int j= 0; j<=ary.length-1; j++){
            System.out.println(ary[j]);
        }

        // * 향상된 for문,  for(타입명 변수명 : 배열명){ },  :콜론 기준 오른쪽 배열내 요소들을 왼쪽 변수에 하나씩 대입
        for(int data : ary){
            System.out.println(data);
        }
        


    }//m e
}//c e
