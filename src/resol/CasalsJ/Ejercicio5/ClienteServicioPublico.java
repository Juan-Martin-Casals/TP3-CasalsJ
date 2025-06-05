package resol.CasalsJ.Ejercicio5;

import java.time.LocalDate;

public class ClienteServicioPublico extends Cliente{

        public ClienteServicioPublico(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactada,LocalDate fechaPago) {
        super(nombre, dni, fechaPrestamo, montoSolicitado, fechaPactada, fechaPago);


    }


    
    @Override

    public double calcularInteres(double monto, int meses) {

        return monto * 0.10 * meses;
    }




    
}
