package resol.CasalsJ.Ejercicio2;

public class Vehiculo {
    String marca;
    int modelo;
    double kilometros;

    public Vehiculo(String marca, int modelo, double kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public void mostrarInformacionV() {

        System.out.println("La marca del vehiculo es: " + marca + "\nEl modelo es: " + modelo + "\nTiene " + kilometros
                + " kilometros\n");

    }

    public void recorrer(int kms) {
        kilometros += kms;

        System.out.println("El nuevo kilometraje es: " + kilometros + " km\n");
    }

    public void proximoServicio() {

        double kilometrosServicio = (Math.floor(kilometros / 10000) + 1) * 10000;

        System.out.println("El proximo servico debe realizarse a los " + kilometrosServicio + "km\n");

    }
    
}
