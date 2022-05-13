package ArrayList;

public class ArrayEx {
    public static void main(String[] args) {
        char[] arr = new char[26];
        char a = 'A';

        for (int i = 0; i < arr.length; i++) {
            arr[i] += a++;
        }

        for (char c : arr) {
            System.out.print(c);
        }
    }

}
