package adapter;

public class Cleaner implements Electronic220V{

    @Override
    public void connect() {
        System.out.println("클리너 220V");
    }
}
