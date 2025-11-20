package Practica.Examen2.TipoExamen;

import java.util.Arrays;
import java.util.Scanner;

public class Act1InventarioZapatillas {
    static Scanner sc=new Scanner(System.in);

    static void mostrarMenu() {
        System.out.println("\n1. Mostrar productos disponibles");
        System.out.println("2. Agregar productos al inventario");
        System.out.println("3. Eliminar productos del inventario");
        System.out.println("4. Buscar un producto por su código");
        System.out.println("5. Salir");
    }

    static void mostrarInventario(int[] codigo, double[] precio, String[] marca) {
        if (codigo.length<=0) {
            System.out.println("Actualmente no hay ninguna articulo en el inventario");

        } else {
            for(int i=0; i<codigo.length; i++) {
                System.out.print((i+1)+"º producto:");
                System.out.print(" código: "+codigo[i]);
                System.out.print(" - precio: "+precio[i]);
                System.out.print(" - marca: "+marca[i]+"\n");
            }
        }
    }

    static int[] agregarCodigo(int[] codigo) {
        boolean estaRepetido;
        int codigoAAgregar;

        do {
            System.out.print("Cual es el código del producto nuevo: ");
            codigoAAgregar=sc.nextInt();
            estaRepetido=false;

            for (int i=0; i<codigo.length; i++) {
                if (codigoAAgregar==codigo[i]) {
                    System.out.println("El código esta repetido prueba con otro");
                    estaRepetido=true;
                }
            }
        } while (estaRepetido);

        codigo=Arrays.copyOf(codigo, codigo.length+1);
        codigo[codigo.length-1]=codigoAAgregar;
        System.out.println("Código guardado\n");

        return codigo;
    }

    static double[] agregarPrecio(double[] precio) {
        System.out.print("Cual es el precio del producto nuevo: ");
        precio=Arrays.copyOf(precio, precio.length+1);
        precio[precio.length-1]=sc.nextDouble();
        System.out.println("Precio guardado\n");

        return precio;
    }

    static String[] agregarMarcar(String[] marca) {
        System.out.print("Cual es la marca del producto nuevo: ");
        marca=Arrays.copyOf(marca, marca.length+1);
        marca[marca.length-1]=sc.next();
        System.out.println("Marca guardada\n");

        return marca;
    }

    /*static void eliminarProducto(int[] codigo, double[] precio, String[] marca) {
        boolean estaEnInventario;
        int productoAEliminar, indiceProductoAEliminar;

        do {
            System.out.print("Cual es el código del producto que quiere eliminar: ");
            productoAEliminar=sc.nextInt();
            estaEnInventario=true;

            for (int i=0; i<codigo.length; i++) {
                if (productoAEliminar==codigo[i]) {
                    indiceProductoAEliminar=i;
                } else {
                    System.out.println("El código introducido no se encuentra en el inventario");
                    estaEnInventario=false;
                }
            }
        } while (!estaEnInventario);

        int[] codigoSinEditar=Arrays.copyOf(codigo, codigo.length);
        double[] precioSinEditar=Arrays.copyOf(precio, precio.length);
        String[] marcaSinEditar=Arrays.copyOf(marca, marca.length);

        codigo=Arrays.copyOf(codigo, codigo.length-1);
        precio=Arrays.copyOf(precio, precio.length-1);
        marca=Arrays.copyOf(marca, marca.length-1);

        for(int i=0; i<codigoSinEditar.length; i++) {
            if (productoAEliminar) {
                
            }
        }

    }*/

    
    public static void main(String[] args) {

        int opcion;
        int[] codigo=new int[0];
        double[] precio=new double[0];
        String[] marca=new String[0];

        do {
            mostrarMenu();

            System.out.print("Que opción elijes: ");
            opcion=sc.nextInt();

            switch (opcion) {
                case 1 -> mostrarInventario(codigo, precio, marca);
                case 2 -> {
                    codigo=agregarCodigo(codigo);
                    precio=agregarPrecio(precio);
                    marca=agregarMarcar(marca);
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }
            
        } while (opcion!=5);
    }
}
