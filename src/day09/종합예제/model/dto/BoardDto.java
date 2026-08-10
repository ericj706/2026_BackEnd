package day09.종합예제.model.dto;

public class BoardDto {
    // DTO: 데이터 이동객체. 자바는 저장소X, 데이터베이스가 저장소
    // 1. 데이터베이스에서 (CRUD)사용할 자료들을 private 멤버변수로 구성
    private String num;
    private int count;

    // 2. 기본생성자, 전체 매개변수 생성자
    
    public BoardDto() { }

    public BoardDto(String num, int count) {
        this.num = num;
        this.count = count;
    }
    // 3. setter & getter & toString
    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "BoardDto [num=" + num + ", count=" + count + "]";
    }
    
}
