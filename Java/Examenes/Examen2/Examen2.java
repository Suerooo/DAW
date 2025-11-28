package Examenes.Examen2;

import java.util.*;

public class Examen2 {
    static final Scanner sc = new Scanner(System.in);
    static final int CAPACIDAD_MAXIMA = 5;
    static final String DELIMITADOR = ":";
    
    // ------------------------------------------
    // -------------- Auxiliar ------------------
    // ------------------------------------------
    static void mostrarJugador(String[] datosJugadores, int indiceJugador) {
        System.out.println("Jugador: " + (indiceJugador+1) + " Nombre: " + extraerNombreJugador(datosJugadores, indiceJugador) +
                    " | DNI: " + extraerDNIJugador(datosJugadores, indiceJugador) + 
                    " | Edad: " + extraerEdadJugador(datosJugadores, indiceJugador) + 
                    " | Puntuacion: " + extraerPuntuacionJugador(datosJugadores, indiceJugador));
    }
    
    static void mostrarMenu() {
        System.out.println("\n1. Añadir nuevo jugador");
        System.out.println("2. Eliminar nuevo jugador");
        System.out.println("3. Buscar jugador por DNI");
        System.out.println("4. Mostrar todos los registros");
        System.out.println("5. Listar por rango de edad");
        System.out.println("6. Ordenar por puntuacion");
        System.out.println("7. Puntuacion maxima y minima");
        System.out.println("8. FINAL BOSS: MATRIZ MAGICA");
        System.out.println("9. Salir");
    }
    
    
    
    static String extraerDNIJugador(String[] datosJugadores, int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return datosUnJugador[1];
        } else {
            return "";
        }
    }
    
    static String extraerNombreJugador(String[] datosJugadores, int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return datosUnJugador[0];
        } else {
            return "";
        }
    }
    
    static int extraerEdadJugador(String[] datosJugadores, int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return Integer.parseInt(datosUnJugador[2]);
        } else {
            return -1;
        }
    }
    
    static double extraerPuntuacionJugador(String[] datosJugadores, int indiceJugador) {
        if (datosJugadores[indiceJugador] != null) {
            String[] datosUnJugador = datosJugadores[indiceJugador].split(DELIMITADOR);
            return Double.parseDouble(datosUnJugador[3]);
        } else {
            return -1;
        }
    }
    
    static int buscarIndiceDNIJugador(String dni, String[] datosJugadores) {
        for (int i = 0; i < datosJugadores.length; i++) {
            if (extraerDNIJugador(datosJugadores, i).equalsIgnoreCase(dni)) {
                return i;
            }
        }
        
        return -1;
    }
    
    // ------------------------------------------
    // ------------ Agregar jugador -------------
    // ------------------------------------------
    static int agregarJugador(int contadorJugadores, String[] datosJugadores) {
        if (contadorJugadores >= CAPACIDAD_MAXIMA) {
            System.out.println("Se ha alcanzado la capacidad maxima");
        } else {
            String dni="";
            
            do {
                System.out.print("Introduce el DNI del nuevo jugador: ");
                dni = sc.next();
                
                if (buscarIndiceDNIJugador(dni, datosJugadores) != -1) System.out.println("Ese dni ya pertenece a un jugador");
            } while (buscarIndiceDNIJugador(dni, datosJugadores) != -1);

            System.out.print("Introduce el nombre del nuevo jugador: ");
            String nombre = sc.next();

            System.out.print("Introduce la edad del nuevo jugador: ");
            int edad = sc.nextInt();

            System.out.print("Introduce la puntuacion del nuevo jugador: ");
            double puntuacion = sc.nextDouble();

            String nuevoJugador = nombre + DELIMITADOR + dni + DELIMITADOR + edad + DELIMITADOR + puntuacion;

            datosJugadores[contadorJugadores] = nuevoJugador;
            contadorJugadores++;
            System.out.println("Jugador agregado");
        }
        return contadorJugadores;
    }
    
    // ------------------------------------------
    // ---------- Elimianar jugador -------------
    // ------------------------------------------
    static int eliminarJugador(String[] datosJugadores, int contadorJugadores) {
        System.out.print("Introduce el dni del jugador que desea eliminar: ");
        String dni = sc.next();
        
        int indiceDNI = buscarIndiceDNIJugador(dni, datosJugadores);
        
        if (contadorJugadores <= 0) {
            System.out.println("No hay ningún jugador registrado");
        } if (indiceDNI == -1) {
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
    static void mostrarJugadorPorDNI(String[] datosJugadores) {
        System.out.print("Introduce el dni del jugador que quiere mostrar: ");
        String dni = sc.next();
        
        int indiceJugador = buscarIndiceDNIJugador(dni, datosJugadores);
        
        if (indiceJugador == -1) {
            System.out.println("Ese DNI no pertenece a ningún jugador");
        } else {
            mostrarJugador(datosJugadores, indiceJugador);
        }
    }
    
    // ------------------------------------------
    // ----- Mostrar todos los jugadores --------
    // ------------------------------------------
    static void mostrarTodosJugadores(String[] datosJugadores) {
        for (int i = 0; i < datosJugadores.length; i++) {
            if (datosJugadores[i] != null) {
                mostrarJugador(datosJugadores, i);
            }
        }
    }
    
    // ------------------------------------------
    // ------- Mostrar por rango de edad --------
    // ------------------------------------------
    static void mostrarRangoEdad(String[] datosJugadores) {
        System.out.print("Introduce la edad minima de tu busqueda: ");
        int edad1 = sc.nextInt();
        
        System.out.print("Introduce la edad minima de tu busqueda: ");
        int edad2 = sc.nextInt();
        
        int edadMax = edad1 > edad2 ? edad1 : edad2;
        int edadMin = edad1 < edad2 ? edad1 : edad2;
        
        for(int i = 0; i < datosJugadores.length; i++) {
            if (extraerEdadJugador(datosJugadores, i) >= edadMin && extraerEdadJugador(datosJugadores, i) <= edadMax) {
                mostrarJugador(datosJugadores, i);
            }
        }
    }
    
    // ------------------------------------------
    // ---------- Ordenar descendente -----------
    // ------------------------------------------
    static void ordenarPuntuacionDescendente(String[] datosJugadores) {
        for(int i = 0; i < datosJugadores.length; i++) {
            for(int j = 0; j < datosJugadores.length -i -1; j++) {
                if (extraerPuntuacionJugador(datosJugadores, j) < extraerPuntuacionJugador(datosJugadores, j +1)) {
                    String tempPuntuacion = datosJugadores[j + 1];
                    datosJugadores[j + 1] = datosJugadores[j];
                    datosJugadores[j] = tempPuntuacion;
                }
            }
        }
    }
    
    // ------------------------------------------
    // --------- Puntuacion Max y Min -----------
    // ------------------------------------------
    static void motrarPuntuacionMaxMin(String[] datosJugadores, int contadorJugadores) {
        double puntuacionMax = extraerPuntuacionJugador(datosJugadores, 0);
        double puntuacionMin = extraerPuntuacionJugador(datosJugadores, 0);
        int indicePuntuacionMax = 0;
        int indicePuntuacionMin = 0;
        
        for(int i = 0; i < contadorJugadores; i++) {
            if (extraerPuntuacionJugador(datosJugadores, i) > puntuacionMax) {
                puntuacionMax = extraerPuntuacionJugador(datosJugadores, i);
                indicePuntuacionMax = i;
            }
            if (extraerPuntuacionJugador(datosJugadores, i) < puntuacionMin) {
                puntuacionMin = extraerPuntuacionJugador(datosJugadores, i);
                indicePuntuacionMin = i;
            }
        }
        System.out.println("Jugador con la maxima puntuacion: ");
        mostrarJugador(datosJugadores, indicePuntuacionMax);
        System.out.println("Jugador con la minima puntuacion: ");
        mostrarJugador(datosJugadores, indicePuntuacionMin);
        
    }
    
    
    static void comprobarMatrizMagica() {
        int[][] matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Introduce el valor de la fila numero "+(i+1)+" y colmuna numero "+(j+1)+": ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Tu matriz es: " + Arrays.deepToString(matriz));
        
        int numeroMagico = (matriz.length*((matriz.length*matriz.length)+1))/2;        
        boolean sumaDeFilas=true, sumaColumnas=true, sumaDiagonal1=true, sumaDiagonal2=true;
        
        int resultadoSumaFilas;
        for (int i = 0; i < matriz.length; i++) {
            resultadoSumaFilas=0;
            for (int j = 0; j < matriz[0].length; j++) {
                resultadoSumaFilas+=matriz[i][j];
            }
            if (resultadoSumaFilas != numeroMagico) {
                sumaDeFilas=false;
            }
        }
        
        int resultadoSumaColumnas;
        for (int i = 0; i < matriz.length; i++) {
            resultadoSumaColumnas=0;
            for (int j = 0; j < matriz[0].length; j++) {
                resultadoSumaColumnas+=matriz[j][i];
            }
            if (resultadoSumaColumnas != numeroMagico) {
                sumaColumnas=false;
            }
        }
        
        int resultadoSumaDiagonal1=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i == 0 && j == 0) || (i == 1 && j == 1) || (i == 2 && j == 2)) {
                    resultadoSumaDiagonal1+=matriz[i][j];
                }
            }
        }
        if (resultadoSumaDiagonal1 != numeroMagico) {
            sumaDiagonal1=false;
        }
        
        int resultadoSumaDiagonal2=0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i == 0 && j == 2) || (i == 1 && j == 1) || (i == 2 && j == 0)) {
                    resultadoSumaDiagonal2+=matriz[i][j];
                }
            }
        }
        if (resultadoSumaDiagonal2 != numeroMagico) {
            sumaDiagonal2=false;
        }
        
        if (sumaDeFilas && sumaColumnas && sumaDiagonal1 && sumaDiagonal2) {
            System.out.println("Y si es una matriz magica");
        } else {
            System.out.println("Y no es una matriz magica");
        }
    }
    
    // ------------------------------------------
    // ---------------- Main --------------------
    // ------------------------------------------
    public static void main(String[] args) {
        String[] datosJugadores = new String[CAPACIDAD_MAXIMA];
        int contadorJugadores = 2, opcion;
        datosJugadores[0] = "Raul:1:18:100";
        datosJugadores[1] = "Juan:2:20:120";
        
        do {
            mostrarMenu();
            System.out.print("Introduce una opcion: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1 -> contadorJugadores = agregarJugador(contadorJugadores, datosJugadores);
                case 2 -> contadorJugadores = eliminarJugador(datosJugadores, contadorJugadores);
                case 3 -> mostrarJugadorPorDNI(datosJugadores);
                case 4 -> mostrarTodosJugadores(datosJugadores);
                case 5 -> mostrarRangoEdad(datosJugadores);
                case 6 -> ordenarPuntuacionDescendente(datosJugadores);
                case 7 -> motrarPuntuacionMaxMin(datosJugadores, contadorJugadores);
                case 8 -> comprobarMatrizMagica();
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opcion no este en el menu");
            }
        } while (opcion != 9);
    }
}