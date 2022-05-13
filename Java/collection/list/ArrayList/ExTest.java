package ArrayList;

public class ExTest {
    public static void main(String[] args) {

        ExStudent studentLee = new ExStudent("Lee");
        ExStudent studentKim = new ExStudent("Kim");
        ExStudent studentCho = new ExStudent("Cho");

        studentLee.addExBook("태백산맥1");
        studentLee.addExBook("태백산맥2");
        studentLee.addExBook("태백산맥3");

        studentKim.addExBook("토지1");
        studentKim.addExBook("토지2");
        studentKim.addExBook("토지3");

        studentCho.addExBook("해리포터1");
        studentCho.addExBook("해리포터2");
        studentCho.addExBook("해리포터3");
        studentCho.addExBook("해리포터4");
        studentCho.addExBook("해리포터5");
        studentCho.addExBook("해리포터6");

        studentLee.showInfo();
        studentKim.showInfo();
        studentCho.showInfo();
    }
}
