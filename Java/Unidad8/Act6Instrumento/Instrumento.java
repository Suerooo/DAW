package Unidad8.Act6Instrumento;

import java.util.*;

public abstract class Instrumento {
    private char[] notasMusicales;
    private int contador = 0;

    protected Instrumento() {
        this.notasMusicales = new char[6];
    }

    public char[] getNotasMusicales() {
        return notasMusicales;
    }

    public void add(char nota) {
        this.notasMusicales[this.contador] = nota;
        this.contador++;
    }
    
    public  abstract interpretar();
    
}



    
