package Practica.Examen2;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class Act0Examen2RaulSueroTest {

    private String[] datosJugadores;

    @Before
    public void setUp() {
        datosJugadores = new String[5];
        datosJugadores[0] = "Raul:12345678A:18:100.0";
        datosJugadores[1] = "Juan:87654321B:20:120.5";
        datosJugadores[2] = "Ana:11111111C:25:95.3";
    }

    @Test
    public void testExtraerNombreJugador() {
        String nombre = Act0Examen2RaulSuero.extraerNombreJugador(datosJugadores, 0);
        assertEquals("Raul", nombre);

        nombre = Act0Examen2RaulSuero.extraerNombreJugador(datosJugadores, 1);
        assertEquals("Juan", nombre);
    }

    @Test
    public void testExtraerDNIJugador() {
        String dni = Act0Examen2RaulSuero.extraerDNIJugador(datosJugadores, 0);
        assertEquals("12345678A", dni);

        dni = Act0Examen2RaulSuero.extraerDNIJugador(datosJugadores, 2);
        assertEquals("11111111C", dni);
    }
    
    @Test
    public void testExtraerEdadJugador() {
        int edad0 = Act0Examen2RaulSuero.extraerEdadJugador(datosJugadores, 0);
        assertEquals(18, edad0);

        int edad1 = Act0Examen2RaulSuero.extraerEdadJugador(datosJugadores, 1);
        assertEquals(20, edad1);
    }

    @Test
    public void testExtraerPuntuacionJugador() {
        double p0 = Act0Examen2RaulSuero.extraerPuntuacionJugador(datosJugadores, 0);
        assertEquals(100.0, p0, 0.001);

        double p1 = Act0Examen2RaulSuero.extraerPuntuacionJugador(datosJugadores, 1);
        assertEquals(120.5, p1, 0.001);
    }

    @Test
    public void testBuscarIndiceDNIJugador() {
        int indiceRaul = Act0Examen2RaulSuero.buscarIndiceDNIJugador("12345678A", datosJugadores);
        assertEquals(0, indiceRaul);

        int indiceAna = Act0Examen2RaulSuero.buscarIndiceDNIJugador("11111111C", datosJugadores);
        assertEquals(2, indiceAna);

        int indiceNoExiste = Act0Examen2RaulSuero.buscarIndiceDNIJugador("99999999Z", datosJugadores);
        assertEquals(-1, indiceNoExiste);
    }
}