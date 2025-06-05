package resol.CasalsJ.Ejercicio3;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Cuenta {
    String nroCuenta;
    double saldo;
    String titular;

    public Cuenta(String nroCuenta, double saldo, String titular) {

        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;

    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;

        } else {
            System.out.println("Error fondos insuficientes");
        }
    }

    public void consultarSaldo() {
        System.out.println("El saldo actual es de " + saldo + "$");
        System.out.println("------------------------------------------");
    }

    public void registrarTransaccion(String tipo, double monto) {

        LocalDateTime fechaHoraActual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String fechaFormateada = fechaHoraActual.format(formato);

        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Tipo de transaccion: " + tipo);
        System.out.println("Monto: " + monto + "$\n");

    }

    
}
