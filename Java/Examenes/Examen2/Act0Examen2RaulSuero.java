package Examenes.Examen2;

import java.util.*;

public class Act0Examen2RaulSuero {
    static final Scanner sc = new Scanner(System.in);
    static final int CAPACIDAD_MAXIMA = 5;
    static final String DELIMITADOR = ":";
    static int contadorJugadores = 0;
    static String[] datosJugadores = new String[CAPACIDAD_MAXIMA];

    // ------------------------------------------
    // -------------- Auxiliar ------------------
    // ------------------------------------------
    static void mostrarJugador(int indiceJugador) {
        System.out.println(
                "Jugador: " + (indiceJugador + 1) + " Nombre: " + extraerNombreJugador(indiceJugador) +
                        " | DNI: " + extraerDNIJugador(indiceJugador) +
                        " | Edad: " + extraerEdadJugador(indiceJugador) +
                        " | Puntuación: " + extraerPuntuacionJugador(indiceJugador));
    }

    static void mostrarMenu() {
        System.out.println();
        System.out.println("------------------------------");
        System.out.println("1. Añadir nuevo jugador");
        System.out.println("2. Eliminar nuevo jugador");
        System.out.println("3. Buscar jugador por DNI");
        System.out.println("4. Mostrar todos los registros");
        System.out.println("5. Listar por rango de edad");
        System.out.println("6. Ordenar por puntuación");
        System.out.println("7. Puntuación maxima y minima");
        System.out.println("8. FINAL BOSS: MATRIZ MÁGICA");
        System.out.println("9. Salir");
        System.out.println("------------------------------");
    }

    static String extraerDNIJugador(int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return datosUnJugador[1];
        } else {
            return "";
        }
    }

    static String extraerNombreJugador(int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return datosUnJugador[0];
        } else {
            return "";
        }
    }

    static int extraerEdadJugador(int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return Integer.parseInt(datosUnJugador[2]);
        } else {
            return -1;
        }
    }

    static double extraerPuntuacionJugador(int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return Double.parseDouble(datosUnJugador[3]);
        } else {
            return -1;
        }
    }

    static int buscarIndiceDNIJugador(String dni) {
        for (int i = 0; i < datosJugadores.length; i++) {
            if (extraerDNIJugador(i).equalsIgnoreCase(dni)) {
                return i;
            }
        }

        return -1;
    }

    // ------------------------------------------
    // ------------ Agregar jugador -------------
    // ------------------------------------------
    static int agregarJugador() {
        if (contadorJugadores >= CAPACIDAD_MAXIMA) {
            System.out.println("Se ha alcanzado la capacidad maxima");
        } else {
            String dni = "";

            do {
                System.out.print("Introduce el DNI del nuevo jugador: ");
                dni = sc.next();

                if (buscarIndiceDNIJugador(dni) != -1)
                    System.out.println("Ese dni ya pertenece a un jugador");
            } while (buscarIndiceDNIJugador(dni) != -1);

            System.out.print("Introduce el nombre del nuevo jugador: ");
            String nombre = sc.next();

            System.out.print("Introduce la edad del nuevo jugador: ");
            int edad = sc.nextInt();

            System.out.print("Introduce la puntuación del nuevo jugador: ");
            double puntuacion = sc.nextDouble();

            String nuevoJugador = nombre + DELIMITADOR + dni + DELIMITADOR + edad + DELIMITADOR + puntuacion;

            datosJugadores[contadorJugadores] = nuevoJugador;
            contadorJugadores++;
            System.out.println("Jugador agregado");
        }
        return contadorJugadores;
    }

    // ------------------------------------------
    // ---------- Eliminar jugador -------------
    // ------------------------------------------
    static int eliminarJugador() {
        System.out.print("Introduce el dni del jugador que desea eliminar: ");
        String dni = sc.next();

        int indiceDNI = buscarIndiceDNIJugador(dni);

        if (contadorJugadores <= 0) {
            System.out.println("No hay ningún jugador registrado");
        } else if (indiceDNI == -1) {
            System.out.println("Ese dni no pertenece a ningún jugador");
        } else {
            String[] datosJugadoresActualizado = new String[datosJugadores.length];
            int j = 0;

            for (int i = 0; i < datosJugadores.length; i++) {
                if (indiceDNI != i) {
                    datosJugadoresActualizado[j] = datosJugadores[i];
                    j++;
                }
            }
            System.arraycopy(datosJugadoresActualizado, 0, datosJugadores, 0, datosJugadores.length);
            contadorJugadores--;
            System.out.println("Jugador eliminado");
        }

        return contadorJugadores;
    }

    // ------------------------------------------
    // ----------- Mostrar por DNI --------------
    // ------------------------------------------
    static void mostrarJugadorPorDNI() {
        System.out.print("Introduce el dni del jugador que quiere mostrar: ");
        String dni = sc.next();

        int indiceJugador = buscarIndiceDNIJugador(dni);

        if (indiceJugador == -1) {
            System.out.println("Ese DNI no pertenece a ningún jugador");
        } else {
            mostrarJugador(indiceJugador);
        }
    }

    // ------------------------------------------
    // ----- Mostrar todos los jugadores --------
    // ------------------------------------------
    static void mostrarTodosJugadores() {
        for (int i = 0; i < datosJugadores.length; i++) {
            if (datosJugadores[i] != null) {
                mostrarJugador(i);
            }
        }
    }

    // ------------------------------------------
    // ------- Mostrar por rango de edad --------
    // ------------------------------------------
    static void mostrarRangoEdad() {
        System.out.print("Introduce la edad minima de tu busqueda: ");
        int edad1 = sc.nextInt();

        System.out.print("Introduce la edad minima de tu busqueda: ");
        int edad2 = sc.nextInt();

        int edadMax = edad1 > edad2 ? edad1 : edad2;
        int edadMin = edad1 < edad2 ? edad1 : edad2;

        for (int i = 0; i < datosJugadores.length; i++) {
            if (extraerEdadJugador(i) >= edadMin && extraerEdadJugador(i) <= edadMax) {
                mostrarJugador(i);
            }
        }
    }

    // ------------------------------------------
    // ---------- Ordenar descendente -----------
    // ------------------------------------------
    static void ordenarPuntuacionDescendente() {
        for (int i = 0; i < contadorJugadores; i++) {
            for (int j = 0; j < contadorJugadores - i - 1; j++) {
                if (extraerPuntuacionJugador(j) < extraerPuntuacionJugador(j + 1)) {
                    String tempPuntuacion = datosJugadores[j + 1];
                    datosJugadores[j + 1] = datosJugadores[j];
                    datosJugadores[j] = tempPuntuacion;
                }
            }
        }
    }

    // ------------------------------------------
    // --------- Puntuación Max y Min -----------
    // ------------------------------------------
    static void motrarPuntuacionMaxMin() {
        double puntuacionMax = extraerPuntuacionJugador(0);
        double puntuacionMin = extraerPuntuacionJugador(0);
        int indicePuntuacionMax = 0;
        int indicePuntuacionMin = 0;

        for (int i = 0; i < contadorJugadores; i++) {
            if (extraerPuntuacionJugador(i) > puntuacionMax) {
                puntuacionMax = extraerPuntuacionJugador(i);
                indicePuntuacionMax = i;
            }
            if (extraerPuntuacionJugador(i) < puntuacionMin) {
                puntuacionMin = extraerPuntuacionJugador(i);
                indicePuntuacionMin = i;
            }
        }
        System.out.println("Jugador con la maxima puntuación: ");
        mostrarJugador(indicePuntuacionMax);
        System.out.println("Jugador con la minima puntuación: ");
        mostrarJugador(indicePuntuacionMin);

    }

    // ------------------------------------------
    // ------------- Matriz Mágica --------------
    // ------------------------------------------
    static boolean comprobarSumaMagicaFilas(int[][] matriz, boolean esMagica, int numeroMagico) {
        int resultadoSumaFilas;
        for (int i = 0; i < matriz.length; i++) {
            resultadoSumaFilas = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                resultadoSumaFilas += matriz[i][j];
            }
            if (resultadoSumaFilas != numeroMagico) {
                esMagica = false;
            }
            System.out.println(resultadoSumaFilas);
        }

        return esMagica;
    }

    static boolean comprobarSumaMagicaColumnas(int[][] matriz, boolean esMagica, int numeroMagico) {
        int resultadoSumaColumnas;
        for (int i = 0; i < matriz.length; i++) {
            resultadoSumaColumnas = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                resultadoSumaColumnas += matriz[j][i];
            }
            if (resultadoSumaColumnas != numeroMagico) {
                esMagica = false;
            }
            System.out.println(resultadoSumaColumnas);
        }

        return esMagica;
    }

    static boolean comprobarSumaMagicaDiagonalPrincipal(int[][] matriz, boolean esMagica, int numeroMagico) {
        int resultadoSumaDiagonalPrincipal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
                    resultadoSumaDiagonalPrincipal += matriz[i][j];
                }
            }
        }
        if (resultadoSumaDiagonalPrincipal != numeroMagico) {
            esMagica = false;
        }
        System.out.println(resultadoSumaDiagonalPrincipal);

        return esMagica;
    }

    static boolean comprobarSumaMagicaDiagonalAlternativa(int[][] matriz, boolean esMagica, int numeroMagico) {
        int resultadoSumaDiagonalAlternativa = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    resultadoSumaDiagonalAlternativa += matriz[i][j];
                }
            }
        }
        if (resultadoSumaDiagonalAlternativa != numeroMagico) {
            esMagica = false;
        }
        System.out.println(resultadoSumaDiagonalAlternativa);

        return esMagica;
    }

    static boolean comprobarNumeroRepetidoMatriz(int[][] matriz, int numero) {
        boolean repetido = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == numero) {
                    repetido = true;
                }
            } 
        }

        return repetido;
    }

    static boolean comprobarRangoNumero(int numero) {
        boolean rangoCorrecto = false;

        if (numero >= 1 && numero <= 9) {
            rangoCorrecto = true;
        }

        return rangoCorrecto;
    }

    static void comprobarMatrizMagica() {
        int[][] matriz = new int[3][3];
        int numero;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                do {
                    System.out.print("Introduce el valor de la fila numero " + (i + 1) + " y columna numero " + (j + 1) + ": ");
                    numero = sc.nextInt();
                    
                    if (comprobarNumeroRepetidoMatriz(matriz, numero) || !comprobarRangoNumero(numero)) System.out.println("Ese numero ya lo introdujiste antes vuelve a pon otro diferente");
                } while (comprobarNumeroRepetidoMatriz(matriz, numero) || !comprobarRangoNumero(numero));
                matriz[i][j] = numero;
            }
        }

        System.out.println("Tu matriz es: " + Arrays.deepToString(matriz));

        int numeroMagico = (matriz.length * ((matriz.length * matriz.length) + 1)) / 2;
        boolean esMagica = true;
        System.out.println(numeroMagico);

        esMagica = comprobarSumaMagicaFilas(matriz, esMagica, numeroMagico);
        esMagica = comprobarSumaMagicaColumnas(matriz, esMagica, numeroMagico);
        esMagica = comprobarSumaMagicaDiagonalPrincipal(matriz, esMagica, numeroMagico);
        esMagica = comprobarSumaMagicaDiagonalAlternativa(matriz, esMagica, numeroMagico);

        if (esMagica) {
            System.out.println("Y si es una matriz mágica");
        } else {
            System.out.println("Y no es una matriz mágica");
        }
    }

    // ------------------------------------------
    // ---------------- Main --------------------
    // ------------------------------------------
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> contadorJugadores = agregarJugador();
                case 2 -> contadorJugadores = eliminarJugador();
                case 3 -> mostrarJugadorPorDNI();
                case 4 -> mostrarTodosJugadores();
                case 5 -> mostrarRangoEdad();
                case 6 -> ordenarPuntuacionDescendente();
                case 7 -> motrarPuntuacionMaxMin();
                case 8 -> comprobarMatrizMagica();
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no este en el menu");
            }
        } while (opcion != 9);
    }
}
