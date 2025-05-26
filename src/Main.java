public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Juan", 20, 5);

        Estudiante estudiante2 = new Estudiante("Pedro", 21, 7);

        Estudiante estudiante3 = new Estudiante("Marco", 19, 9);

        estudiante1.mostrarInformacion();
        estudiante1.aprobo();

        estudiante2.mostrarInformacion();
        estudiante2.aprobo();

        estudiante3.mostrarInformacion();
        estudiante3.aprobo();

        Vehiculo vehiculo1 = new Vehiculo("Fiat", 2003, 22500);

        Vehiculo vehiculo2 = new Vehiculo("Renault", 2003, 10000);

        vehiculo1.mostrarInformacionV();
        vehiculo1.recorrer(10000);
        vehiculo1.proximoServicio();

        vehiculo2.mostrarInformacionV();
        vehiculo2.recorrer(20000);
        vehiculo2.proximoServicio();

        Cuenta cuenta1 = new Cuenta("100", 10000, "Juan Hernandez");
        Cuenta cuenta2 = new Cuenta("101", 30000, "Pedro Perez");

        cuenta1.retirar(5000);
        cuenta1.consultarSaldo();

        cuenta2.depositar(10000);
        cuenta2.consultarSaldo();

    }
}
