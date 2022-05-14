package lambda;

public class TestMyNumber {
    public static void main(String[] args) {

        // 인터페이스로 정의한 람다식 사용
        MyMaxNumber myMax = (x, y) -> (x >= y) ? x : y;
        System.out.println(myMax.getMaxNumber(10, 20));
    }
}
