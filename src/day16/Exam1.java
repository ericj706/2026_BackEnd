package day16;

import java.util.HashMap;
import java.util.Map;

public class Exam1 {
    public static void main(String[] args) {
        
        /*
            제네릭: 클래스 (정의할때)만들때 타입 정하지 않고 클래스 사용할때 타입 정한다.
                List<BoardDto> list = new ArrayList<>()
                - List 인터페이스 만들때 정의하지 않고 List 인터페이스 사용할때 BoardDto타입 정했다
                - 정의/만들기: class 클래스명{} , 사용/호출: 클래스명 변수명;



            컬렉션 프레임워크
                List 인터페이스: 중복허용, 인덱스(순서)보장, ArrayList, LinkedList, Vector
                Set 인터페이스:  중복불가, 인덱스(순서)없다, HashSet, TreeSet
                Map 인터페이스:  KEY중복불가/VALUE중복허용 , 인덱스(순서)없다, HashMap, TableMap, TreeMap
        */
       // [1] Map: KEY와 VALUE 한쌍(엔트리)으로 여러개 쌍(엔트리) 저장하는 구조 = JSON( {} )
       Map<String, Integer> map = new HashMap<>();
       // [2] 사용법 (메소드)
       //   1) .put( key,value ) : key/value 한쌍 엔트리 추가
       map.put("유재석", 95);   // "유재석"이라는 키로 95값 저장
       map.put("강호동", 100);
        System.out.println(map); // {유재석 = 80, 강호동=100,신동엽=78}
        //  2) .get(key): key 해당하는 value 반환
        System.out.println(map.get("강호동"));
        //  3) .size( ) : 총 엔트리 수 반환
        System.out.println(map.size());
        //  4) .containsKey(찾을key) : 찾을 Key 존재하면 true / false
        //     .containsValue(찾을value) : 찾을 Value 존재하면 true / false
        System.out.println( map.containsKey("강호동"));
        System.out.println( map.containsValue(95));
        //  5) .keySet(): 모든 key반환,  .values(): 모든 value반환
        System.out.println(map.keySet());
        System.out.println(map.values());
        //  6) .remove(key): 해당하는 key의 엔트리(key:value) 삭제
        map.remove("강호동");   System.out.println(map);
        //  7) .clear( ): 모든 엔트리 삭제
        //map.clear();
        //  8) .isEmpty( ): 엔트리가 1개도 없으면 true/false
        System.out.println(map.isEmpty());
        // **활용처: [1] JSON(JS) <--통신--> DTO/MAP(JAVA)
        //  9) 반복문 관계
        //  (1) 일반 For문 불가능, 인덱스X
        //  (2) 향상된 For문, KEY 주로 사용
        for (String key : map.keySet()) { // 모든 Key를 꺼내서 반복
            System.out.println(key+" : "+map.get(key));
        }
        //  (3) .forEach( (반복변수명) -> { } );
        map.keySet().forEach((key) -> {System.out.println( key + ":" +map.get(key));});



    }//me
}//ce
