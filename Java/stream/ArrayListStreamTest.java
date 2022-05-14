package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();

        sList.add("토마스");
        sList.add("피카츄");
        sList.add("에어리언");
        sList.add("스파이더맨");

        sList.stream().sorted().forEach(s -> System.out.println(s));
        Stream<String> stream = sList.stream();
        // stream.forEach(s -> System.out.println(s));
        stream.forEach(s -> System.out.print(s + " "));
        System.out.println();
        sList.stream().map(s -> s.length()).forEach(n -> System.out.println(n));

    }
}
