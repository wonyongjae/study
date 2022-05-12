package design_pattern.templateMethod;

import java.util.ArrayList;

public class CarTest {

    public static void main(String[] args) {

        // Car aiCar = new AICar();
        // aiCar.run();

        // System.out.println("===========================================");

        // Car manualCar = new ManualCar();
        // manualCar.run();

        ArrayList<Car> carList = new ArrayList<Car>();
        carList.add(new Sonata());
        carList.add(new Grandeur());
        carList.add(new Avante());
        carList.add(new Genesis());

        for (Car car : carList) {
            car.run();
            System.out.println("===========================================");
        }

    }
}
