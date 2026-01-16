package Unidad8.Act6Instrumento;

import java.util.Arrays;

public abstract class Instrumento {
    private Notas[] notasMusicales;

    protected Instrumento() {
        this.notasMusicales = new Notas[0];
    }

    public void add(Notas nota) {
        notasMusicales = Arrays.copyOf(notasMusicales, notasMusicales.length + 1);
        notasMusicales[notasMusicales.length-1] = nota;
    }
    public abstract void interpretar();

    public Notas[] getNotasMusicales() {
        return notasMusicales;
    }
}