package ArrayList;

import java.util.ArrayList;

public class ExStudent {
    private String name;
    private ArrayList<ExBook> arr;

    public ExStudent(String name) {
        this.name = name;
        arr = new ArrayList<ExBook>();

    }

    public void addExBook(String title) {
        ExBook exBook = new ExBook(title);
        arr.add(exBook);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showInfo() {

        String allBook = "";

        for (int i = 0; i < arr.size(); i++) {

        }

        for (ExBook exBook : arr) {
            allBook += exBook.getTitle() + " ";

        }
        System.out.println(this.name + " 학생이 읽은 책은 : " + allBook + "입니다.");
    }

}
