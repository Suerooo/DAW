package Unidad11.Act17Academico;

public class Academico {
    private String nombre;
    private Integer anioIngreso;
    
    public Academico(String nombre, Integer anioIngreso) {
        setNombre(nombre);
        setAnioIngreso(anioIngreso);
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
    }
    
    public Integer getAnioIngreso() {
        return anioIngreso;
    }
    
    public void setAnioIngreso(Integer anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    
}
