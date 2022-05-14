package stream;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
        TravelCustomer customerKim = new TravelCustomer("김유신", 20, 100);
        TravelCustomer customerHong = new TravelCustomer("홍길등", 13, 50);

        List<TravelCustomer> travelList = new ArrayList<TravelCustomer>();

        travelList.add(customerLee);
        travelList.add(customerKim);
        travelList.add(customerHong);

        System.out.println(travelList);

        // 리스트 명단에서 이름만 출력
        travelList.stream().map(t -> t.getName()).forEach(s -> System.out.println(s));

        // 리스트 명단의 총 가격 출력
        int total = travelList.stream().mapToInt(t -> t.getPrice()).sum();
        System.out.println(total);

        // 리스트 명단 정렬 filter 를 이용해 20세 이상만으로 추린 뒤, 이름을 기준으로 정렬
        travelList.stream().filter(t -> t.getAge() >= 20).map(t -> t.getName()).sorted()
                .forEach(s -> System.out.println(s));
    }
}
