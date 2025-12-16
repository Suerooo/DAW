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
        System.out.println(nombre + " está ladrando");
    }

    void comer() {
        System.out.println(nombre + " está comiendo");
    }

    void mostrarInfo() {
        System.out.println("Nombre: " + nombre);
        System.out.println(" Raza: " + raza);
        System.out.println(" Edad: " + edad);
        System.out.println(" Color: " + color);
    }
}
