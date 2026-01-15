package lucas.javabnb.outils;

public class Comparateur<T extends Compare> {
    private T obj1;
    private T obj2;

    public Comparateur(T obj1, T obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public T getHigher() {
        return this.obj1.getValueToCompare() > this.obj2.getValueToCompare() ? this.obj1 : this.obj2;
    }

    public T getLower() {
        return this.obj1.getValueToCompare() < this.obj2.getValueToCompare() ? this.obj1 : this.obj2;
    }

}