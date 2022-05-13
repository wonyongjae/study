package generic;

public class GenericPrinter<T extends Material> {

    private T material;

    public T getMaterial() {
        return this.material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }

    public void printing() {
        material.doPrinting();
    }

}
