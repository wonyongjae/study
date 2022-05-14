package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

    @Override
    public String apply(String s1, String s2) {
        if (s1.getBytes().length >= s2.getBytes().length) {
            return s1;
        } else {
            return s2;
        }
    }

}

public class ReduceTest {
    public static void main(String[] args) {

        String[] greeting = { "ㅎㅇ", "오우오우ㅇㅇㅇ!!", "헐ㄹㄹㄹ111", "반갑!?!" };

        // 문자열 length 로 비교
        // System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> s1.length()
        // >= s2.length() ? s1 : s2));

        // 문자열 getBytes().length 로 비교
        // System.out.println(Arrays.stream(greeting).reduce("", (s1, s2) -> {
        // if (s1.getBytes().length >= s2.getBytes().length) {
        // return s1;
        // } else {
        // return s2;
        // }
        // }));

        // 비교 로직 CompareString 클래스로 처리하고 객체사용
        System.out.println(Arrays.stream(greeting).reduce(new CompareString()).get());
    }
}
