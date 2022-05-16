package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {
    public static void main(String[] args)
            throws ClassNotFoundException, InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {

        // 객체 정보를 로컬에서 알 수 있는 경우 아래처럼 간단히 객체생성
        Person person = new Person("용재");
        System.out.println(person);

        Class c1 = Class.forName("classex.Person");

        // null 출력
        // toString에서 이름을 출력하는데 아무것도 인자값을 받지 않는 기본 생성자를 호출하기 때문
        Person person1 = (Person) c1.newInstance();
        System.out.println(person1);

        // 로컬에 타입이 없는 경우
        Class[] parameterTypes = { String.class };
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] initargs = { "원용재" };
        Person person2 = (Person) cons.newInstance(initargs);
        System.out.println(person2);
    }
}
