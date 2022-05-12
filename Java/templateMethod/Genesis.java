package design_pattern.templateMethod;

public class Genesis extends Car {

    @Override
    public void drive() {
        System.out.println("Genesis 달립니다.");

    }

    @Override
    public void stop() {
        System.out.println("Genesis 멈춥니다.");

    }

    @Override
    public void startCar() {
        System.out.println("Genesis 시동을 켭니다.");

    }

    @Override
    public void turnOff() {
        System.out.println("Genesis 시동을 끕니다.");

    }

}
