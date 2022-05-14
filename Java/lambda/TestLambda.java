package lambda;

interface PrintString {
    void showString(String str);
}

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("용재짱!");

        // 람다식을 변수처럼 활용
        showMyString(lambdaStr);

        PrintString test = returnString();
        test.showString("TEST");
    }

    // lambdaStr 를 showMyString 에 변수로 던져서 활용
    public static void showMyString(PrintString p) {
        p.showString("str");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "!!!");
    }
}
