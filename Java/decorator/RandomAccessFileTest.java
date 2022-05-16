package design_pattern.decorator;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
        rf.writeInt(100);
        System.out.println(rf.getFilePointer());
        rf.writeDouble(3.14);
        rf.writeUTF("방갑슴당");
        // System.out.println();

        rf.seek(0);

        int i = rf.readInt();
        double d = rf.readDouble();
        String str = rf.readUTF();

        System.out.println(i);
        System.out.println(d);
        System.out.println(str);

        rf.close();

    }
}
