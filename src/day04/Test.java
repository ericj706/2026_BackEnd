package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /* 1. 요소 추가 기능, 2. 요소삭제기능 0.종료 
        // [1] 배열
        int[] arry = new int[0];    // 0개 저장 가능한 배열
        // [2] 배열내 꼬리(마지막인덱스)에 요소 추가, array.length-1
        // arry [arry.length-1] = 30;   오류=> 인덱스가 존재x

        // [3] 현재 배열내 +1 증가한 배열 만들기
        int[] newArry = new int[arry.length+1];
        // *기존배열내 요소들의 값들을 새로운 배열에 복사->이동, 삭제: 삭제할 인덱스를 제외하고 대입
        for (int i = 1; i <= arry.length-1; i++) {
            newArry[i] = arry[i];   // 오른쪽 기존배열 index값을 왼쪽 새로운 배열에 대입
        }
        // [4] [2]반복
        newArry [newArry.length-1] = 30;

        // [5] 기존배열변수에 새로운 배열 대입
        arry = newArry;
        
        System.out.println(Arrays.toString(arry));
        */

        Scanner scan = new Scanner(System.in);
        int[] arry = new int[0];
        while(true) {
            System.out.print("현재 배열[크기:"+arry.length+"]: ");
            System.out.println(Arrays.toString(arry));
            System.out.print("1.요소추가|2.삭제|0.종료\n메뉴를 선택하세요: ");
            String menu = scan.next();

            if (menu.equals("1")) {
                System.out.print("추가할 정수 값을 입력하세요:"); int 추가값 = scan.nextInt();

                int[] newArry = new int[arry.length+1];
                for (int i = 0; i < arry.length; i++) {
                    newArry[i] = arry[i];
                }
                newArry [newArry.length-1] = 추가값;
                arry = newArry;
                System.out.println(추가값+"값이 성공적으로 추가되었습니다.");
            }

            if (menu.equals("2")) {
                System.out.print("삭제할 인덱스번호(0~ "+ (arry.length-1) +")를 입력하세요:"); int 삭제인덱스 = scan.nextInt();
                if(삭제인덱스 < 0 || 삭제인덱스 >= arry.length){
                    System.out.println("잘못된 인덱스입니다.");
                }else{
                    int 삭제값 = arry[삭제인덱스];
                    int[] newArry = new int[arry.length-1];
                    int index = 0;
                    for (int i = 0; i < arry.length; i++) {
                        if(i!=삭제인덱스){
                            newArry[index] = arry[i];
                        }
                    }
                    arry = newArry;
                    System.out.println(삭제값+"값이 성공적으로 삭제되었습니다.");
                }
            }

            if (menu.equals("0")) {
                System.out.println("프로그램 종료");
                break;
            } 
        }
        
    
    }
}
