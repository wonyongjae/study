package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    // 예외 넘기기
    // 여기서 예외를 처리하지 않고 호출하는 쪽에서 처리하도록 미룸
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();

        // 여기에서도 예외처리를 미루면 가상머신으로 넘겨지므로 여기서 처리해야됨
        try {
            test.loadClass("a.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            // 맨 마지막에 걸어두는게 나음. 위에다 두면 여기서 모든 익셉션이 걸리기 때문에
            // 아래에 하위익셉션을 걸어두는 의미가 없음
            System.out.println(e);
        }
        System.out.println("END");
    }
}
