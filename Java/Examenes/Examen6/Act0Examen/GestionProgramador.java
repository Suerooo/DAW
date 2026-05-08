package Examenes.Examen6.Act0Examen;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class GestionProgramador {
    private Map<Integer, Programador> listaProgramadores = new LinkedHashMap<>();

    // ==================================================
    // INSERTAR/ELIMINAR/EDITAR
    // ==================================================

    public boolean insertarProgramador(Integer id, String nombre, String lenguajeProg, Double sueldo)
            throws IllegalArgumentException {

        if (listaProgramadores.containsKey(id)) {
            return false;
        }

        listaProgramadores.put(id, new Programador(id, nombre, lenguajeProg, sueldo));
        guardarDatos();
        return true;

    }

    public boolean eliminarPorgramador(Integer id) {
        if (!listaProgramadores.containsKey(id)) {
            return false;
        }

        listaProgramadores.remove(id);
        guardarDatos();
        return true;
    }

    public boolean editarProgramador(Integer id, String lenguajeProg) throws IllegalArgumentException {
        Programador programador = listaProgramadores.get(id);

        if (programador == null) {
            return false;
        }

        programador.setLenguajeProg(lenguajeProg);
        guardarDatos();
        return true;
    }

    // ==================================================
    // MOSTRAR
    // ==================================================

    private void mostrarProgramador(Programador programador) {
        System.out.printf("| %s | %n", programador);
    }

    public boolean mostrarProgramador(Integer id) {
        Programador programador = listaProgramadores.get(id);

        if (programador == null) {
            return false;
        }

        mostrarProgramador(programador);
        return true;
    }

    public boolean mostrarListaProgramadores() {
        if (listaProgramadores.isEmpty()) {
            return false;
        }

        for (Programador programador : listaProgramadores.values()) {
            mostrarProgramador(programador);
        }

        return true;
    }

    // ==================================================
    // CARGAR/GUARDAR
    // ==================================================

    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("plantilla.dat"))) {
            out.writeObject(listaProgramadores);

        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("No se han encontrado datos creando 'plantilla.dat'");
            listaProgramadores = new LinkedHashMap<>();

        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("plantilla.dat"))) {
            listaProgramadores = (Map<Integer, Programador>) in.readObject();

        } catch (FileNotFoundException e) {
            System.out.println(e);
            System.out.println("No se han encontrado datos creando 'plantilla.dat'");
            listaProgramadores = new LinkedHashMap<>();

        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }

}
