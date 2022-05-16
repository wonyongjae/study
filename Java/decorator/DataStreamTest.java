package design_pattern.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
    public static void main(String[] args) {

        // 데코레이터 패턴
        // dos(fos) , dis(fis)
        try (FileOutputStream fos = new FileOutputStream("data.txt");
                DataOutputStream dos = new DataOutputStream(fos);
                FileInputStream fis = new FileInputStream("data.txt");
                DataInputStream dis = new DataInputStream(fis)) {

            dos.writeByte(100);
            dos.writeChar('A');
            dos.writeUTF("안녕하십니까");

            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
            System.out.println(dis.readUTF());

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
