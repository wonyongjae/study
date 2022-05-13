package generic;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        Powder powder = new Powder();
        powderPrinter.setMaterial(powder);
        System.out.println(powderPrinter);

        powderPrinter.printing();

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        Plastic plastic = new Plastic();
        plasticPrinter.setMaterial(plastic);
        System.out.println(plasticPrinter);

        plasticPrinter.printing();

        // GenericPrinter<Water> waterPrinter = new GenericPrinter<>();
        // Water water = new Water();
        // plasticPrinter.setMaterial(water);
        // System.out.println(plasticPrinter);
    }
}
