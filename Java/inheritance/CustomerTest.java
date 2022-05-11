package inheritance;

import java.util.ArrayList;

public class CustomerTest {
    public static void main(String[] args) {

        // Customer customer = new Customer(10010, "이순신");
        // customer.setBounsPoint(1000);
        // System.out.println(customer.showCustomerInfo());

        // VIPCustomer vipCustomer = new VIPCustomer(10020, "김유신");
        // vipCustomer.setBounsPoint(10000);
        // System.out.println(vipCustomer.showCustomerInfo());
        Customer silver1 = new Customer(1, "실버1");
        Customer silver2 = new Customer(2, "실버2");
        Customer gold1 = new GoldCustomer(3, "골드1");
        Customer gold2 = new GoldCustomer(4, "골드2");
        Customer vip = new VIPCustomer(5, "브이아이피", 12345);

        ArrayList<Customer> list = new ArrayList<Customer>();

        list.add(silver1);
        list.add(silver2);
        list.add(gold1);
        list.add(gold2);
        list.add(vip);

        System.out.println("===========================고객정보출력===========================");
        for (Customer customer : list) {
            System.out.println(customer.showCustomerInfo());
        }
        System.out.println("===========================할인율과 보너스===========================");
        int price = 10000;
        for (Customer customer : list) {
            int cost = customer.calcPrice(price);
            System.out.println(customer.getCustomerName() + " 님이 " + cost + "원 지불하셨습니다.");
            System.out.println(customer.getCustomerName() + " 님의 현재 보너스 포인트는 " + customer.getBounsPoint() + "점 입니다.");
        }
    }

}
