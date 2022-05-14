package stream;

import java.util.Arrays;

public class IntArrayTest {
    public static void main(String[] args) {

        // 배열에 stream 을 이용해서 연산

        int[] arr = { 1, 2, 3, 4, 5 };
        int sum = Arrays.stream(arr).sum();
        int count = (int) Arrays.stream(arr).count();

        System.out.println(sum);
        System.out.println(count);
    }
}
