package Unidad7.Act3ClasePerro;

public class Perro {
    String nombre;
    String raza;
    int edad;
    String color;

    Perro() {}

    Perro(String nombre, String raza) {
        this(nombre, raza, 0, null);
    }

    Perro(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
    }

    void ladrar() {
        System.out.println(this.nombre + " está ladrando");
    }

    void comer() {
        System.out.println(this.nombre + " está comiendo");
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println(" Raza: " + this.raza);
        System.out.println(" Edad: " + this.edad);
        System.out.println(" Color: " + this.color);
        System.out.println();
    }
}
