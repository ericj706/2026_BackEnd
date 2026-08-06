package day07;

// 의류카테고리
class CATEGORY {
    int CATEGORYID; //PK
    String CATEGORYname;
}
// 의류table
class CLOTHES {
    int CLOTHESID;  // PK
    String CLOTHESname;
    int CATEGORYID; // FK
    int MATERIALID; // FK
    String IMGPATH;
}
// 소재table
class MATERIAL{
    int MATERIALID; //PK
    String MATERIALname;
}
//건조방법
class DRY {
    int DRYID;  // PK
    String DRYguide;
    String advantage;
    String caution;
}
//세탁기호
class SYMBOl {
    int SYMBOLID; // PK
    String SYMBOLname;
    String IMGPATH;
}
// 의류별 심볼기호
class CLOTHESSYMBOLLIST {
    int CLOTHESID;
    int SYMBOLID;
}
//의류별 건조방법
class CLOTHESDRYINGLIST{
    int COLTHESID;
    int DRYID;
}