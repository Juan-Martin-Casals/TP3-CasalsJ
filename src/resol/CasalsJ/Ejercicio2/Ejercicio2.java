package resol.CasalsJ.Ejercicio2;

public class Ejercicio2 {
    public static void ejecutar(){
        System.out.println("Ingresaste al ejercicio 2");
        System.out.println();

        Vehiculo vehiculo1 = new Vehiculo("Fiat", 2003, 10000);
        Vehiculo vehiculo2 = new Vehiculo("Toyota", 2020, 20000);

        vehiculo1.mostrarInformacionV();
        vehiculo1.recorrer(20000);
        vehiculo1.proximoServicio();

        vehiculo2.mostrarInformacionV();
        vehiculo2.recorrer(30000);
        vehiculo2.proximoServicio();
        
    }
}
