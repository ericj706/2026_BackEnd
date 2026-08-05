package day06;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Post[] pArry = new Post[100];

        for(;;){
            System.out.println("============Community============");
            System.out.println("1. 글쓰기 | 2. 게시글 보기");
            System.out.println("===============================");
            System.out.print("선택> "); int ch = scan.nextInt();

            if (ch==1) {
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = false;

                for (int i = 0; i < pArry.length; i++) {
                    if (pArry[i] == null) {
                        pArry[i] = post;
                        result = true;
                        break;
                    }
                }
                if (result == true) {
                    System.out.println("작성 완료");
                }else{System.out.println("작성 실패");}

            }else if (ch==2) {
                for (int i = 0; i < pArry.length; i++) {
                    if (pArry[i] != null) {
                        System.out.printf("작성자: %s, 내용: %s\n", pArry[i].writer, pArry[i].content);
                    }
                }
            }
        }  
        

    }
}

class Post{
    String content; String writer;

    public Post() {}

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}