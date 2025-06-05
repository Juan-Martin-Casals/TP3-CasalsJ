package resol.CasalsJ.Ejercicio4;

public class Ejercicio4 {
    public static void ejecutar(){


        System.out.println("Ingresaste al ejercicio 4");
        System.out.println();

        Administrativo admin1 = new Administrativo("Juan","12345678",100000,16,"Remoto");
        Produccion prod1 = new Produccion("Pedro", "12345671", 20000, 10, "Diurno");

        admin1.mostrarInformacion();
        admin1.calcularSalario();

        System.out.println();

        
        prod1.mostrarInformacion();
        prod1.calcularSalario();

        System.out.println("Total de empleados: " + Empleado.getCantidadEmpleados());

    }
    
}
