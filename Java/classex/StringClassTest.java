package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        // Class c1 = String.class;

        // String str = new String();
        // Class c2 = str.getClass();

        // 클래스에 대한 정보가 로컬에 없을 경우 클래스의 정보를 가져옴
        // Class.forName = 런타임 시 동적 로딩
        Class c3 = Class.forName("java.lang.String");

        Constructor[] cons = c3.getConstructors();
        for (Constructor con : cons) {
            System.out.println(con);
        }

        Method[] methods = c3.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
