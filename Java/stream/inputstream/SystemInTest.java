package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
    public static void main(String[] args) {
        System.out.println("입력 후 '끝' 이라고 쓰세요! ");
        try {
            int i;

            // InputStreamReader = 보조 스트림 // 들어온 데이터를 한글로 읽을 수 있도록 도와주는 스트림
            InputStreamReader isr = new InputStreamReader(System.in);
            while ((i = isr.read()) != '끝') {
                // System.out.println(i);
                System.out.print((char) i);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
