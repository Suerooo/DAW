# Formato en Java

## Métodos principales

```java
// String formateado
String.format();

// Print formateado
System.out.printf();

---

## Ejemplos

### %s - String (texto)
String nombre = "Juan";
System.out.printf("Nombre: %s%n", nombre);

### %d - Enteros (int, long)
int edad = 25;
System.out.printf("Edad: %d años%n", edad);

### %f - Decimales (float, double)
double precio = 19.99;
System.out.printf("Precio: %.2f€%n", precio); // .2f = 2 decimales

### %c - Carácter
char letra = 'A';
System.out.printf("Letra: %c%n", letra);

### %b - Boolean
boolean activo = true;
System.out.printf("Activo: %b%n", activo);

### %n - Salto de línea
Multiplataforma (mejor que `\n`)

---

## Ejemplos avanzados

### Alinear texto
System.out.printf("%-10s | %10s%n", "Izquierda", "Derecha");

### Rellenar con ceros
int numero = 42;
System.out.printf("Número: %05d%n", numero); // Output: 00042

### Múltiples valores
String producto = "Laptop";
int cantidad = 3;
double precioUnitario = 899.99;
System.out.printf("Producto: %s | Cantidad: %d | Total: %.2f€%n", producto, cantidad, cantidad * precioUnitario);
```
