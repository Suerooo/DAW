package src;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;

        do {
            mostrarMenu();
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            System.out.println();

            switch (opcion) {
                case 1 -> mostrarLineasModificadas(
                        addAlumno(pedirNum(), pedirNombre(), pedirDate(), pedirMedia(), pedirCurso()));

                case 2 -> mostrarLineasModificadas(eliminarAlumnos(pedirNum()));

                case 3 -> mostrarLineasModificadas(updateMedia1B());

                case 4 -> mostrarAlumnos();

                case 5 -> mostrarAlumnosPorCurso(pedirCurso());

                case 6 -> System.out.println("Saliendo...");

                default -> System.out.println("Esa opcion no existe");
            }
        } while (opcion != 6);
    }

    public static void mostrarMenu() {
        System.out.println();
        System.out.println("1. Añadir alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. Sumar 1 a todas las medias de la clase 1B");
        System.out.println("4. Mostrar alumnos");
        System.out.println("5. Mostrar alumnos por curso");
        System.out.println("6. Salir");
    }

    public static int addAlumno(int num, String nombre, Date fnac, Double media, String curso) {
        try (Connection con = Conexion.getConexion();
                Statement s = con.createStatement()) {

            return s.executeUpdate("INSERT INTO alumnos VALUES (" + num + ", '" + nombre + "', '" + fnac + "', " + media
                    + ", '" + curso + "');");

        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }
    }

    public static int eliminarAlumnos(int num) {
        try (Connection con = Conexion.getConexion();
                Statement s = con.createStatement()) {

            return s.executeUpdate("delete from alumnos where num=" + num + ";");

        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }

    }

    public static int updateMedia1B() {
        try (Statement s = Conexion.getConexion().createStatement()) {

            return s.executeUpdate("update alumnos set media=media+1 where curso like '1B'");
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }
    }

    public static void mostrarAlumnos() {
        try (Statement s = Conexion.getConexion().createStatement()) {
            ResultSet rs = s.executeQuery("select num, nombre, fnac, media, curso from alumnos");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " - ");
                System.out.print(rs.getString(2) + " - ");
                System.out.print(rs.getString(3) + " - ");
                System.out.print(rs.getString(4) + " - ");
                System.out.print(rs.getString(5) + "\n");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void mostrarAlumnosPorCurso(String curso) {
        try (Statement s = Conexion.getConexion().createStatement()) {
            ResultSet rs = s.executeQuery("select nombre, fnac from alumnos where curso like '" + curso + "'");

            while (rs.next()) {
                System.out.print(rs.getString(1) + " - ");
                System.out.print(rs.getString(2) + "\n");
            }

        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void mostrarLineasModificadas(int numLineas) {
        System.out.println("Lineas modficadas: " + numLineas);
    }

    public static int addAlumnoPrepare() {
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("INSERT INTO alumnos VALUES (?, ?, ?, ?, ?);");) {

            System.out.print("Introduce el numero del alumno: ");
            ps.setInt(1, sc.nextInt());

            System.out.print("Introduce el nombre del alumno: ");
            ps.setString(2, sc.next());

            System.out.print("Introduce la fecha de nacimiento del alumno yyyy-[m]m-[d]d: ");
            ps.setDate(3, Date.valueOf(sc.next()));

            System.out.print("Introduce la media del alumno: ");
            ps.setDouble(4, sc.nextDouble());

            System.out.print("Introduce el curso del alumno: ");
            ps.setString(5, sc.next());

            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }
    }

    public static int eliminarAlumnosPrepare() {
        try (Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("delete from alumnos where num=?;")) {

            System.out.print("Introduce el numero del alumno que quiere eliminar: ");
            ps.setInt(1, sc.nextInt());

            return ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return -1;
        }
    }

    public static int pedirNum() {
        System.out.print("Introduce el numero del alumno: ");
        return sc.nextInt();
    }

    public static String pedirNombre() {
        System.out.print("Introduce el nombre del alumno: ");
        return sc.next();
    }

    public static Date pedirDate() {
        System.out.print("Introduce la fecha de nacimiento del alumno yyyy-[m]m-[d]d: ");
        return Date.valueOf(sc.next());
    }

    public static Double pedirMedia() {
        System.out.print("Introduce la media del alumno: ");
        return sc.nextDouble();
    }

    public static String pedirCurso() {
        System.out.print("Introduce el curso del alumno: ");
        return sc.next();
    }
}