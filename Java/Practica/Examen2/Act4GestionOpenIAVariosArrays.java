package Practica.Examen2;

import java.util.*;

public class Act4GestionOpenIAVariosArrays {
    static final Scanner sc = new Scanner(System.in);
    static final String DELIMITADOR = ":";

    // ---------------------------------------
    // ---------- Métodos: Mostrar -----------
    // ---------------------------------------

    static void mostrarMenu() {
        System.out.println("1. Ingresar");
        System.out.println("2. Mostrar");
        System.out.println("3. Lenguaje");
        System.out.println("4. Eliminar");
        System.out.println("5. Salarios");
        System.out.println("6. Aumento");
        System.out.println("7. Ordenar");
        System.out.println("8. Matriz");
        System.out.println("0. Salir");
    }

    static void mostrarLenguajes() {
        System.out.println("1. JAVA");
        System.out.println("2. PYTHON");
        System.out.println("3. PHP");
        System.out.println("4. JS");
        System.out.println("5. CPP");
    }

    // ---------------------------------------
    // ----------- Métodos: Agregar ----------
    // ---------------------------------------

    static String[] agregarElementoString(String[] array, String elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }

    static double[] agregarElementoDouble(double[] array, double elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }

    static int[] agregarElementoInt(int[] array, int elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }

    // ---------------------------------------
    // ----------- Métodos: Otros ------------
    // ---------------------------------------

    static String elegirLanguage() {
        String language = "";
        int opcion;

        do {
            mostrarLenguajes();

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> language = "JAVA";
                case 2 -> language = "PYTHON";
                case 3 -> language = "PHP";
                case 4 -> language = "JS";
                case 5 -> language = "CPP";
                default -> System.out.println("Esa opción no existe");
            }
        } while (opcion < 1 || opcion > 5);

        return language;
    }

    static int buscarIndiceKey(int[] key, int keyABuscar) {
        for (int i = 0; i < key.length; i++) {
            if (key[i] == keyABuscar) return i;
        }
        
        return -1;
    }

    static void mostrarUnEmpleado(String[] userName, String[] language, int[] key, double[] salary, int indiceEmpleado) {
        System.out.println("\n" + (indiceEmpleado + 1) + "º empleado:");
        System.out.println("Nombre: " + userName[indiceEmpleado] + " | Lenguaje: " + language[indiceEmpleado] + " | Key: " + key[indiceEmpleado] + " | Salario: " + salary[indiceEmpleado]);
        
    }

    static int generarKey(int[] key) {
        String nuevaKey;

        do {
            System.out.print("Introduce la key del nuevo empleado (3 dígitos ej. 067): ");
            nuevaKey = sc.next();

            if (!nuevaKey.matches("\\d{3}") || comprobarRepeticionKey(key, Integer.parseInt(nuevaKey))) System.out.println("Key repetida o con mal formato.");
            
        } while (!nuevaKey.matches("\\d{3}") || comprobarRepeticionKey(key, Integer.parseInt(nuevaKey)));

        return Integer.parseInt(nuevaKey);
    }

    // ---------------------------------------
    // ---------- Métodos: Validar -----------
    // ---------------------------------------

    static boolean comprobarRepeticionKey(int[] key, int keyAComprobar) {
        boolean keyRepetida = false;

        if (buscarIndiceKey(key, keyAComprobar) != -1) {
            return true;
        }

        return keyRepetida;
    }

    // ---------------------------------------
    // ------------ Métodos: Menú ------------
    // ---------------------------------------

    // 2ª opción "Mostrar"
    static void mostrarEmpleados(String[] userName, String[] language, int[] key, double[] salary) {
        for (int i = 0; i < key.length; i++) {
            mostrarUnEmpleado(userName, language, key, salary, i);
        }
    }

    // 3ª opción "Lenguaje"
    static String[] extraerEmpleadosXLenguaje(String[] userName, String[] language, int[] key, double[] salary, String lenguajeElegido) {
        String[] listaEmpleadosXLenguaje = new String[0];
        String empleado="";

        for (int i = 0; i < language.length; i++) {
            if (lenguajeElegido.equalsIgnoreCase(language[i])) {
                empleado = userName[i] + DELIMITADOR + language [i] + DELIMITADOR + key[i] + DELIMITADOR + salary[i];
                listaEmpleadosXLenguaje = agregarElementoString(listaEmpleadosXLenguaje, empleado);
            }
        }

        return listaEmpleadosXLenguaje;
    }

    // 4ª opción "Eliminar"
    static String[] eliminarUserName(String[] userName, int indiceEmpleadoAEliminar) {
        String[] userNameModificado = new String[0];

        for (int i = 0; i < userName.length; i++) {
            if (indiceEmpleadoAEliminar != i) {
                userNameModificado = agregarElementoString(userNameModificado, userName[i]);
            }
        }

        return userNameModificado;
    }

    static String[] eliminarLanguage(String[] language, int indiceEmpleadoAEliminar) {
        String[] languageModificado = new String[0];

        for (int i = 0; i < language.length; i++) {
            if (indiceEmpleadoAEliminar != i) {
                languageModificado = agregarElementoString(languageModificado, language[i]);
            }
        }

        return languageModificado;
    }

    static int[] eliminarKey(int[] key, int indiceEmpleadoAEliminar) {
        int[] keyModificado = new int[0];

        for (int i = 0; i < key.length; i++) {
            if (indiceEmpleadoAEliminar != i) {
                keyModificado = agregarElementoInt(keyModificado, key[i]);
            }
        }

        return keyModificado;
    }

    static double[] eliminarsalary(double[] salary, int indiceEmpleadoAEliminar) {
        double[] salaryModificado = new double[0];

        for (int i = 0; i < salary.length; i++) {
            if (indiceEmpleadoAEliminar != i) {
                salaryModificado = agregarElementoDouble(salaryModificado, salary[i]);
            }
        }

        return salaryModificado;
    }

    // 5ª opción "Salarios"
    static void mostrarEntreSalarios(String[] userName, String[] language, int[] key, double[] salary, double salario1, double salario2) {
        double salarioMax = salario1 > salario2 ? salario1 : salario2;
        double salarioMin = salario1 < salario2 ? salario1 : salario2;

        for (int i = 0; i < salary.length; i++) {
            if (salary[i] >= salarioMin && salary[i] <= salarioMax) {
                mostrarUnEmpleado(userName, language, key, salary, i);
            }
        }
    }

    // 6ª opción "Aumento"
    static double[] aumentarSalario(double[] salary, double aumento) {
        aumento /= 100;

        for (int i = 0; i < salary.length; i++) {
            salary[i] += (salary[i] * aumento);
        }

        return salary;
    }

    // 7ª opción "Ordenar"
    static void ordenarKeyAscendente(String[] userName, String[] language, int[] key, double[] salary) {
        for (int i = 0; i < key.length; i++) {
            for (int j = 0; j < key.length - i - 1; j++) {
                if (key[j] > key[j + 1]) {
                    String tempUserName = userName[j + 1];
                    String tempLanguage = language[j + 1];
                    int tempKey = key[j + 1];
                    double tempSalary = salary [j + 1];

                    userName[j + 1] = userName[j];
                    language[j + 1] = language[j];
                    key[j + 1] = key[j];
                    salary[j + 1] = salary[j];

                    userName[j] = tempUserName;
                    language[j] = tempLanguage;
                    key[j] = tempKey;
                    salary[j] = tempSalary;
                }
            }
        }
    }

    


    public static void main(String[] args) {
        String[] userName = {"Ale", "Nico", "Margarita", "Clara", "Luis", "Jorge", "Noelia", "Montse", "Paula", "Iván", "Gabriel"};
        String[] language = {"JAVA", "PYTHON", "PYTHON", "JAVA", "CPP", "PHP", "JS", "CPP", "PHP", "CPP", "JS"}; //Solo se usan JAVA, PYTHON, PHP, JS, CPP
        int[] key = {342, 555, 322, 567, 777, 888, 877, 999, 222, 76, 333}; //es de 3 dígitos
        double[] salary = {652.2, 2000.5, 1000.1, 1589.55, 4895, 3200, 3501, 2009, 8000.4, 5000.60, 654.98};
        int opcion;
        

        do {
            mostrarMenu();

            System.out.print("Introduce una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> {
                    key = agregarElementoInt(key, generarKey(key));

                    System.out.print("Introduce el nombre del nuevo empleado: ");
                    userName = agregarElementoString(userName, sc.next());

                    System.out.println("Introduce el lenguaje del nuevo empleado: ");
                    language = agregarElementoString(language, elegirLanguage());
                    
                    System.out.print("Introduce el salario del nuevo empleado: ");
                    salary = agregarElementoDouble(salary, sc.nextDouble());
                }

                case 2 -> mostrarEmpleados(userName, language, key, salary);
                case 3 -> System.out.println("Lista: " + Arrays.toString(extraerEmpleadosXLenguaje(userName, language, key, salary, elegirLanguage())));
                case 4 -> {
                    System.out.print("Introduce la key del empleado que quiere eliminar: ");
                    int indiceEmpleadoAEliminar = buscarIndiceKey(key, sc.nextInt());

                    if (indiceEmpleadoAEliminar == -1) {
                        System.out.println("Esa key no perteneces a ningún empleado");
                        
                    } else {
                        userName = eliminarUserName(userName, indiceEmpleadoAEliminar);
                        language = eliminarLanguage(language, indiceEmpleadoAEliminar);
                        key = eliminarKey(key, indiceEmpleadoAEliminar);
                        salary = eliminarsalary(salary, indiceEmpleadoAEliminar);
                        
                        System.out.println("Empleado eliminado");
                    }
                }
                case 5 -> {
                    System.out.print("Introduce desde que salario quieres buscar: ");
                    double salario1 = sc.nextDouble();

                    System.out.print("Introduce hasta que salario quieres buscar: ");
                    double salario2= sc.nextDouble();

                    mostrarEntreSalarios(userName, language, key, salary, salario1, salario2);
                }
                case 6 -> {
                    System.out.println("Introduce el porcentaje de aumento que quieres aplicar a los empleados (entre 1% y 20%): ");
                    double aumento = sc.nextDouble();

                    if (aumento < 1 || aumento > 20) {
                        System.out.println("Error: El aumento introducido es menor que 1 o superior que 2");

                    } else {
                        salary = aumentarSalario(salary, aumento);
                        System.out.println("Salario aumentado");
                    }
                }
                case 7 -> ordenarKeyAscendente(userName, language, key, salary);
                case 0 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }


        } while (opcion != 0);
    }
}