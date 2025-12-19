package Unidad7.Act6MarcaPagina;

public class MarcaPagina {
    private int paginaActual;

    public MarcaPagina() {}
    
    public MarcaPagina(int paginaActual) {
        setPaginaActual(paginaActual);
    }
    
    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        if (paginaActual < 0) {
            this.paginaActual = 0;
        } else {
            this.paginaActual = paginaActual;
        }
    }
    
    public void empezar() {
        this.paginaActual = 0;
    }
    
    public void incrementar() {
        incrementar(1);
    }
    
    public void incrementar(int incremento) {
        if (incremento <= 0) {
            System.out.println("No puedes incrementar 0 o negativo");
        } else {
            this.paginaActual += incremento;
        }
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + paginaActual;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MarcaPagina other = (MarcaPagina) obj;
        if (paginaActual != other.paginaActual)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Página actual: " + this.paginaActual;
    }

    
}
