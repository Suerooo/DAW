package Unidad9.Act5Banco;

public class Persona implements Empleados, Clientes {
    private final String DNI;
    private String nombre;
    private boolean esCliente;
    private boolean esEmpleado;
    private int horasTrabajadas;
    private double saldo;

    // ------------------------------------------------
    // ---------------VARIABLES DEFAULT----------------
    // ------------------------------------------------

    // Mensaje de eror en caso de que la persona no sea un cliente
    private static final String CLIENTE_ERROR = "Esta persona no es un cliente";
    // Mensaje de eror en caso de que la persona no sea un cliente
    private static final String EMPLEADO_ERROR = "Esta persona no es un empleado";

    /**
     * Crear cliente
     */
    public Persona(String dni, String nombre, double saldo) {
        this.DNI = dni;
        setNombre(nombre);
        setSaldo(saldo);
        this.horasTrabajadas = 0;
        setEsEmpleado(false);
        setEsCliente(true);
    }

    /**
     * Crear empleado
     */
    public Persona(String dni, String nombre, int horasTrabajadas) {
        this.DNI = dni;
        setNombre(nombre);
        this.saldo = 0;
        setHorasTrabajadas(horasTrabajadas);
        setEsCliente(false);
        setEsEmpleado(true);
    }

    /**
     * Crear cliente y empleado
     */
    public Persona(String dni, String nombre, int horasTrabajadas, double saldo) {
        this.DNI = dni;
        setNombre(nombre);
        setHorasTrabajadas(horasTrabajadas);
        setSaldo(saldo);
        setEsEmpleado(true);
        setEsCliente(true);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: campo nombre vacío");
            this.nombre = "desconocida";
        } else {
            this.nombre = nombre;
        }
    }

    public boolean esCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }

    public boolean esEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((DNI == null) ? 0 : DNI.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Persona other = (Persona) obj;
        if (DNI == null) {
            if (other.DNI != null)
                return false;
        } else if (!DNI.equals(other.DNI))
            return false;
        return true;
    }

    @Override
    public String toString() {
        String persona = String.format("DNI: %s%n Nombre: %s%n", DNI, nombre);
        String cliente = String.format(" Saldo: %.2f%n", saldo);
        String empleado = String.format(" Horas Trabajadas: %d%n", horasTrabajadas);

        if (esCliente && esEmpleado) {
            return persona + cliente + empleado;
        } else if (esCliente) {
            return persona + cliente;
        } else if (esEmpleado) {
            return persona + empleado;
        } else {
            return persona;
        }
    }

    @Override
    public void aumentarHorasTrabajadas(int aumentoHoras) {
        if (!esEmpleado) {
            System.out.println(EMPLEADO_ERROR);
        } else {
            this.horasTrabajadas += aumentoHoras;
        }
    }

    @Override
    public void aumentarSaldo(int aumentoSaldo) {
        if (!esCliente) {
            System.out.println(CLIENTE_ERROR);
        } else {
            this.saldo += aumentoSaldo;
        }
    }

    @Override
    public int getHorasTrabajadas() {
        if (!esEmpleado) {
            System.out.println(EMPLEADO_ERROR);
            return -1;
        } else {
            return horasTrabajadas;
        }
    }

    @Override
    public void setHorasTrabajadas(int horasTrabajadas) {
        if (!esEmpleado) {
            System.out.println(EMPLEADO_ERROR);
            this.horasTrabajadas = 0;
        } else {
            if (horasTrabajadas < 0) {
                System.out.println("Error: campo horas trabajadas no puede ser menor que 0");
                this.horasTrabajadas = 0;
            } else {
                this.horasTrabajadas = horasTrabajadas;
            }
        }

    }

    @Override
    public double getSaldo() {
        if (!esCliente) {
            System.out.println(CLIENTE_ERROR);
            return -1;
        } else {
            return saldo;
        }

    }

    @Override
    public void setSaldo(double saldo) {
        if (!esCliente) {
            System.out.println(CLIENTE_ERROR);
            this.saldo = 0;
        } else {
            if (saldo < 0) {
                System.out.println("Error: campo saldo no puede ser menor que 0");
                this.saldo = 0;
            } else {
                this.saldo = saldo;
            }
        }
    }

}
