package Examenes.Examen3.Estadistica;

public class Muestra {
    private int[] array;
    private int cantidadValores;
    static final int DEFAULT_SIZE = 10;

    public Muestra() {
        this.array = new int[DEFAULT_SIZE];
        this.cantidadValores = 0;
    }

    public Muestra(int tamanioArray) {
        this.array = new int[tamanioArray];
        this.cantidadValores = 0;
    }

    public Muestra(int[] array) {
        this.array = array;
        this.cantidadValores = array.length;
    }

    public int[] getMuestra() {
        return array;
    }

    public int getCantidadValores() {
        return cantidadValores;
    }

    public void agregarNumero(int numero) {
        this.array[cantidadValores] = numero;
        cantidadValores++;
    }   
}
