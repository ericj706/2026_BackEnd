package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Exam3 {
    public static void main(String[] args) {

        // Set 인터페이스 : 여러개 자료들을 저장하는 컬렉션, 자동 중복제거, 인덱스(순서)X
        // 1. Set 구현
        Set <String> set1 = new HashSet<>();
        // 2. Set   .add(추가할 값);
        set1.add("유재석"); set1.add("강호동");
        set1.add("유재석");
        set1.add(new String("유재석")); // 중복 방지
        System.out.println(set1);   // [유재석, 강호동]
        // 3. .get(인덱스); 없다
            // set1.get(0); -> X
        // 4. .size(); :항목 개수 반환
        System.out.println(set1.size());
        // 5. .remove(인덱스X, 자료O) 인덱스가 아닌 자료 자체 삭제
        set1.remove("유재석");
        // 6. .indexOf(찾을값) : 인덱스 X
        set1.contains("강호동"); // true
        // 7. .clear() : 항목 전체 삭제
        set1.clear();   
        // 8. .isEmpty(): 항목이 하나도 없으면 true / false
        set1.isEmpty();
        // 9. .set 컬렉션과 반복문 관계
            // (1) 일반 for문, 불가능(인덱스가 없어서)
            // (2) 향상된 for문 지원
            for (String str : set1) {System.out.println(str);}
            // (3) forEach문 지원
            set1.forEach( (str) -> {System.out.println(str);});
        // -활용처: Set( JDBC ResultSet )

        Iterator<String> 순회자 = set1.iterator(); // 인덱스가 아닌 자료들을 순회하는 인터페이스 반환
        while (순회자.hasNext()) { 
            System.out.println(순회자.next());
        } // hasNext(): 목록(컬렉션)에서 자료 하나씩 꺼내기 (저장된 순서)
        
        // 10. TreeSet 이용한 자동 정렬
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(50);   set2.add(55);   set2.add(60);
        System.out.println(set2);   // [50, 55, 60]: 기본값이 오름차순
        System.out.println(set2.descendingSet()); // 내림차순


    }//me
}
