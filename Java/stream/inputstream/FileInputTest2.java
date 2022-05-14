package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputTest2 {

    public static void main(String[] args) {
        // FileInputStream fis = null;
        try (FileInputStream fis = new FileInputStream("input2.txt");) {
            // fis = new FileInputStream("input.txt");

            int i;
            byte[] bs = new byte[10];
            while ((i = fis.read(bs)) != -1) {
                // for (byte b : bs) {
                // System.out.print((char) b);
                // }
                // 위 코드를 돌렸을 시에 Z까지 출력하고 나머지 byte[10] 공간까지 버퍼상에 남은 데이터로 채움

                // 아래 코드는 길이 만큼만 가져와서 Z까지 출력한 뒤 나머지 값은 출력 안함
                for (int k = 0; k < i; k++) {
                    System.out.print((char) bs[k]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // System.out.println("끝");
    }

}
