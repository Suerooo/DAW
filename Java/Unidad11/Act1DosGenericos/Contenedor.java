package Unidad11.Act1DosGenericos;

public class Contenedor<T, U> {
    private T value1;
    private U value2;

    public Contenedor(T value1, U value2) {
        setValue1(value1);
        setValue2(value2);
    }

    public T getValue1() {
        return value1;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public U getValue2() {
        return value2;
    }

    public void setValue2(U value2) {
        this.value2 = value2;
    }

    @Override
    public String toString() {
        return value1 + " | " + value2;
    }

}
