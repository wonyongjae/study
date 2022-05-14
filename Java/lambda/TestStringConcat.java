package lambda;

public class TestStringConcat {
    public static void main(String[] args) {

        // 인터페이스 implements 사용해 클래스를 구현해서 사용
        StringConcat strCon = new StringConImpl();
        strCon.makeString("asd", "qwe");

        // 인터페이스를 람다식으로 사용
        StringConcat strCon1 = (s1, s2) -> System.out.println(s1 + ", " + s2 + " = " + s1 + s2);
        strCon1.makeString("hello", " world");
    }
}
