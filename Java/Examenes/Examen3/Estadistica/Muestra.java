package Examenes.Examen3.Estadistica;

public class Muestra {
    private int[] muestra;
    private int cantidadValores;
    static final int DEFAULT_SIZE = 10;

    public Muestra() {
        this.muestra = new int[DEFAULT_SIZE];
        this.cantidadValores = 0;
    }

    public Muestra(int tamanioArray) {
        this.muestra = new int[tamanioArray];
        this.cantidadValores = 0;
    }

    public Muestra(int[] muestra) {
        this.muestra = muestra;
        this.cantidadValores = muestra.length;
    }

    public int[] getMuestra() {
        return muestra;
    }

    public int getCantidadValores() {
        return cantidadValores;
    }

    public void agregarNumero(int numero) {
        this.muestra[cantidadValores] = numero;
        cantidadValores++;
    }   
}
