package design_pattern.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        long milliseconds = 0;

        try (FileInputStream fis = new FileInputStream("a.zip");
                FileOutputStream fos = new FileOutputStream("copy.zip");
                BufferedInputStream bis = new BufferedInputStream(fis);
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            milliseconds = System.currentTimeMillis();

            int i;
            while ((i = fis.read()) != -1) {
                fos.write(i);
            }

            milliseconds = System.currentTimeMillis() - milliseconds;
        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();

        // 데코레이더 패턴
        // socket의 getInputStream을 InputStreamReader 객체가 감싸서 기능을 추가하고,
        // 또 거기에서 BufferedReader 객체가 감싸서 기능을 추가
        BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        System.out.println("시간: " + milliseconds);
    }
}
