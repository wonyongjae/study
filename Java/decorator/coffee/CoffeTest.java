package design_pattern.decorator.coffee;

public class CoffeTest {
    public static void main(String[] args) {
        Coffee americano = new KenyaAmericano();
        americano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();
        System.out.println();

        Coffee mocha = new Mocha(new Latte(new KenyaAmericano()));
        mocha.brewing();
        System.out.println();

        Coffee etiopoaMocha = new Mocha(new Latte(new EtiopiaAmericano()));
        etiopoaMocha.brewing();
    }
}
