
package day07;

class 의류별세탁법 {
    int 의류ID;
    String 물온도;
    String 세탁방법;
    String 권장세제;
    String 주의사항;
}

class 세탁기호{
    int 기호ID;
    String 기호명;
    String 이미지경로;
}

class 카테고리{
    int 카테고리ID;
    String 카테고리명;
}

class 의류{
    int 의류ID;
    String 의류명;
    int 카테고리ID;
    int 소재ID;
    String 이미지경로;
}

class 건조방법{
  int 건조ID;
  String 건조방법;
  String 방법;
  String 장점;
  String 주의사항;
}