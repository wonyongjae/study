package stream.inputstream;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("이름 : ");
        // 일반 문자열은 String, 메서드는 readLine
        String name = console.readLine();

        System.out.println("비밀번호 : ");
        // 비밀번호는 char[] 로 받음. 메서드는 readPassword
        char[] pass = console.readPassword();

        System.out.println(name);
        System.out.println(pass);
    }
}
