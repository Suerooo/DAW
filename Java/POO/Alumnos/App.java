package POO.Alumnos;

public class App {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Raul", "Suero Hurtado", "raulsuerodaw@gmail.com", 18, 666666666L);
        Alumno alumno2 = new Alumno("Juan", "Hurtado Hurtado", "juanito@gmail.com", 16, 777777777L);
        Alumno alumno3 = new Alumno("Jose", "Fernandez Hurtado", "joseee@gmail.com", 20, 777777777L);
        Alumno alumno4 = new Alumno("Pedro", "Fernandez Hurtado", "fernandezz@gmail.com", 15, 777777777L);

        Alumno[] listaAlumnos = {alumno1, alumno2, alumno3, alumno4};
        Alumno alumnoMasJoven = listaAlumnos[0];

        for (int i = 0; i < listaAlumnos.length; i++) {
            alumnoMasJoven = alumnoMasJoven.getEdad() < listaAlumnos[i].getEdad() ? alumnoMasJoven : listaAlumnos[i];
        }

        System.out.println(alumnoMasJoven.toString());
    }
}
