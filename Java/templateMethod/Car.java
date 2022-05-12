package design_pattern.templateMethod;

public abstract class Car {
    public abstract void drive();

    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켭니다.");

    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    public void washCar() {
    }

    // final
    // 변수에 붙을 경우 상수값으로 적용되어 변수를 바꿀 수 없음
    // 메서드에 붙을 경우 하위클래스에서 재정의(오버라이딩) 할 수 없음
    final public void run() {
        startCar();
        drive();
        stop();
        turnOff();
        washCar();
    }
}
