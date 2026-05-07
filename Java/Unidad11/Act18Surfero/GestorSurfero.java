package Unidad11.Act18Surfero;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashMap;
import java.util.Map;

public class GestorSurfero {
    private Map<Integer, Surfero> listaSuerferos = new LinkedHashMap<>();
    private Integer contadorSurferos = 0;

    public boolean insertarSurfero(Surfero surferoNuevo) {
        if (listaSuerferos.containsValue(surferoNuevo)) {
            return false;
        }

        listaSuerferos.put(contadorSurferos++, surferoNuevo);
        guardarDatos();
        return true;
    }

    public boolean buscarSurfero(Integer id) {
        return listaSuerferos.containsKey(id);
    }

    public boolean eliminarPorID(Integer id) {

        if (!listaSuerferos.containsKey(id)) {
            return false;
        }

        listaSuerferos.remove(id);
        guardarDatos();
        return true;
    }

    public boolean actualizarNivel(Integer id, Integer nivel) {
        Surfero surfero = listaSuerferos.get(id);

        if (surfero == null)
            return false;

        surfero.setNivel(nivel);
        guardarDatos();
        return true;

    }

    public void mostrarSurfero(Integer id, Surfero surfero) {
        System.out.printf("| ID: %d -> %s | %n", id, surfero);
    }

    public void mostrarTodosSurferos() {
        for (Map.Entry<Integer, Surfero> entry : listaSuerferos.entrySet()) {

            mostrarSurfero(entry.getKey(), entry.getValue());
        }
    }

    public void mostrarSurferosPorPlaya(String playaFav) {
        boolean existen = false;

        for (Map.Entry<Integer, Surfero> entry : listaSuerferos.entrySet()) {
            Surfero surfero = entry.getValue();

            if (surfero.getPlayaFav().equalsIgnoreCase(playaFav)) {

                mostrarSurfero(entry.getKey(), surfero);
                existen = true;
            }
        }

        if (!existen) {
            System.out.println("Esa playa no es la favorita de ningun surfero");
        }
    }

    public void mostrarSurferosPorNombre(String nombre) {
        boolean existen = false;

        for (Map.Entry<Integer, Surfero> entry : listaSuerferos.entrySet()) {
            Surfero surfero = entry.getValue();

            if (surfero.getNombre().toLowerCase().contains(nombre.toLowerCase().trim())) {

                mostrarSurfero(entry.getKey(), surfero);
                existen = true;
            }
        }

        if (!existen) {
            System.out.println("No hay coincidencias con ese nombre");
        }
    }

    public void mostrarSurferoNivelMasAlto() {
        Surfero surferoMax = new Surfero("Test", "Test", "Test", 0);

        for (Map.Entry<Integer, Surfero> entry : listaSuerferos.entrySet()) {
            Surfero surfero = entry.getValue();

            surferoMax = surfero.getNivel() >= surferoMax.getNivel() ? surfero : surferoMax;
        }

        System.out.println(surferoMax);
    }

    public Integer calcularPromedioNivel() {
        Integer total = 0;

        for (Map.Entry<Integer, Surfero> entry : listaSuerferos.entrySet()) {

            total += entry.getValue().getNivel();
        }

        return (total / listaSuerferos.size());
    }

    public void guardarDatos() {
        try (ObjectOutputStream out = new ObjectOutputStream(
                new FileOutputStream("Java\\Unidad11\\Act18Surfero\\surferos.dat"))) {

            out.writeObject(listaSuerferos);
            out.writeObject(contadorSurferos);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cargarDatos() {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Java\\Unidad11\\Act18Surfero\\surferos.dat"))) {

            listaSuerferos = (Map<Integer, Surfero>) in.readObject();
            contadorSurferos = (Integer) in.readObject();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
