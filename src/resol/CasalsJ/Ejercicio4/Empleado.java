package resol.CasalsJ.Ejercicio4;


public abstract class Empleado implements Calculable{

    private String nombre;
    private String dni;
    private double sueldoBase;
    private int antigüedad;
    private static int contadorEmpleados = 0;

    public Empleado(String nombre, String dni, double sueldoBase, int antigüedad){
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBase = sueldoBase;
        this.antigüedad = antigüedad;

        contadorEmpleados++;
    }

    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public double getSueldoBase() {
        return sueldoBase;
    }
    public int getAntigüedad() {
        return antigüedad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }
    public void setAntigüedad(int antigüedad) {
        this.antigüedad = antigüedad;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Sueldo base: " + sueldoBase);
        System.out.println("Antigüedad: " + antigüedad + " años");
    }

    public static int getCantidadEmpleados(){
        return contadorEmpleados;
    }
    
    @Override
    public abstract double calcularSalario();

    
    
}
