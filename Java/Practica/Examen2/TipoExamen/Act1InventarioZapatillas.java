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

    static int guardarCodigoNoRepetido(int[] codigo) {
        boolean estaRepetido;
        int codigoNoRepetido;

        do {
            System.out.print("Introduce el código del producto (escribe -1 si quieres salir): ");
            codigoNoRepetido=sc.nextInt();

            if (codigoNoRepetido==-1) {
                return -1;
            }

            estaRepetido=false;

            for (int i=0; i<codigo.length; i++) {
                if (codigoNoRepetido==codigo[i]) {
                    System.out.println("El código esta repetido prueba con otro");
                    estaRepetido=true;
                }
            }
        } while (estaRepetido);
        
        return codigoNoRepetido;
    }

    static int[] agregarCodigo(int[] codigo, int codigoNoRepetido) {
        codigo=Arrays.copyOf(codigo, codigo.length+1);
        codigo[codigo.length-1]=codigoNoRepetido;
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

    static int encontrarIndiceProducto(int[] codigo) {
        boolean estaEnInventario;
        int codigoABuscar;
        int indiceProducto=-1;

        do {
            System.out.print("Introduce el código del producto (escribe -1 si quieres salir): ");
            codigoABuscar=sc.nextInt();

            if (codigoABuscar==-1) {
                return -1;
            }

            estaEnInventario=false;

            for (int i=0; i<codigo.length; i++) {
                if (codigoABuscar==codigo[i]) {
                    indiceProducto=i;
                    estaEnInventario=true;
                }
            }

            if (!estaEnInventario) {
                System.out.println("El código introducido no se encuentra en el inventario");    
            }

        } while (!estaEnInventario);

        return indiceProducto;
    }

    static int[] eliminarCodigo(int[] codigo, int indiceProductoAEliminar) {
        int[] codigoActualizado=new int[0];

        for(int i=0; i<codigo.length; i++) {
            if (indiceProductoAEliminar!=i) {
                codigoActualizado=Arrays.copyOf(codigoActualizado, codigoActualizado.length+1);
                codigoActualizado[codigoActualizado.length-1]=codigo[i];
            }
        }

        return codigoActualizado;
    }

    static double[] eliminarPrecio(double[] precio, int indiceProductoAEliminar) {
        double[] precioActualizado=new double[0];

        for(int i=0; i<precio.length; i++) {
            if (indiceProductoAEliminar!=i) {
                precioActualizado=Arrays.copyOf(precioActualizado, precioActualizado.length+1);
                precioActualizado[precioActualizado.length-1]=precio[i];
            }
        }

        return precioActualizado;
    }

    static String[] eliminarMarca(String[] marca, int indiceProductoAEliminar) {
        String[] marcaActualizada=new String[0];

        for(int i=0; i<marca.length; i++) {
            if (indiceProductoAEliminar!=i) {
                marcaActualizada=Arrays.copyOf(marcaActualizada, marcaActualizada.length+1);
                marcaActualizada[marcaActualizada.length-1]=marca[i];
            }
        }

        return marcaActualizada;
    }

    static void mostrarXProducto(int[] codigo, double[] precio, String[] marca, int indiceProducto) {
        System.out.print((indiceProducto+1)+"º producto:");
        System.out.print(" código: "+codigo[indiceProducto]);
        System.out.print(" - precio: "+precio[indiceProducto]);
        System.out.print(" - marca: "+marca[indiceProducto]+"\n");
    }

    
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
                    int codigoNoRepetido=guardarCodigoNoRepetido(codigo);

                    if (codigoNoRepetido!=-1) {
                        codigo=agregarCodigo(codigo, codigoNoRepetido);
                        precio=agregarPrecio(precio);
                        marca=agregarMarcar(marca);
                    }
                    
                }
                case 3 -> {
                    int indiceProductoAEliminar=encontrarIndiceProducto(codigo);

                    if (indiceProductoAEliminar!=-1) {
                        codigo=eliminarCodigo(codigo, indiceProductoAEliminar);
                        precio=eliminarPrecio(precio, indiceProductoAEliminar);
                        marca=eliminarMarca(marca, indiceProductoAEliminar);
                        System.out.println("Producto eliminado");
                    }
                }
                case 4 -> {
                    int indiceProducto=encontrarIndiceProducto(codigo);
                    
                    if (indiceProducto!=-1) mostrarXProducto(codigo, precio, marca, indiceProducto);
                }
                case 5 -> System.out.println("Saliendo...");
                default -> System.out.println("Esa opción no existe");
            }
        } while (opcion!=5);
    }
}
