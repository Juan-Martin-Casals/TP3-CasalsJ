package resol.CasalsJ.Ejercicio3;

public class Ejercicio3 {
    public static void ejecutar(){

        System.out.println("Ingresaste al ejercicio 3");
        System.out.println();

        Cuenta cuenta1 = new Cuenta("20", 5000, "Juan");

        cuenta1.depositar(5000);
        cuenta1.registrarTransaccion("Deposito", 5000);
        
        cuenta1.retirar(1000);
        cuenta1.registrarTransaccion("Retiro", 1000);
        
        cuenta1.consultarSaldo();
        
    }
}
