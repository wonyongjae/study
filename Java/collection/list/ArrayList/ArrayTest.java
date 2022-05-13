package ArrayList;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++, num++) {
            arr[i] = num;
            // System.out.println(arr[i]);
            total += arr[i];

        }
        System.out.println(total);

        int cnt = 0;
        double[] dArr = new double[5];

        dArr[0] = 1.1;
        cnt++;
        dArr[1] = 2.1;
        cnt++;
        dArr[2] = 3.1;
        cnt++;

        double mtotal = 1;
        for (int i = 0; i < cnt; i++) {

            mtotal *= dArr[i];
            System.out.println(mtotal);
        }

        System.out.println(mtotal);
    }
}
