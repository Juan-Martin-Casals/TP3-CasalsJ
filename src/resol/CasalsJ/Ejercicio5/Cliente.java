package resol.CasalsJ.Ejercicio5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Cliente implements PrestamoCalculable {
    private String nombre;
    private String dni;
    private LocalDate fechaPrestamo;
    private double montoSolicitado;
    private LocalDate fechaPactada;
    private LocalDate fechaPago;
    
    
    public Cliente(String nombre, String dni, LocalDate fechaPrestamo, double montoSolicitado, LocalDate fechaPactada, LocalDate fechaPago) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaPrestamo = fechaPrestamo;
        this.montoSolicitado = montoSolicitado;
        this.fechaPactada = fechaPactada;
        this.fechaPago = fechaPago;
    }


    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public String getDni() {
        return dni;
    }
    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    public double getMontoSolicitado() {
        return montoSolicitado;
    }
    public LocalDate getFechaPactada() {
        return fechaPactada;
    }
    public LocalDate getFechaPago(){
        return fechaPago;
    }

    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    public void setMontoSolicitado(double montoSolicitado) {
        this.montoSolicitado = montoSolicitado;
    }
    public void setFechaPactada(LocalDate fechaPactada) {
        this.fechaPactada = fechaPactada;
    }
    public void setFechaPago(LocalDate fechaPago){
        this.fechaPago = fechaPago;
    }

    //MOSTRAR INFORMACION
    public void mostrarInformacion(){
        System.out.println("Nombre del cliente: " + nombre);
        System.out.println("Monto solicitado: " + montoSolicitado);
        System.out.println("Fecha pactada de pago: " + fechaPactada);
        System.out.println("Fecha de pago: " + fechaPago);

    }


    //CALCULAR MESES
    public  int calcularMeses(LocalDate fechaPrestamo, LocalDate fechaPago){
        long meses = ChronoUnit.MONTHS.between(fechaPrestamo, fechaPago);

        return (int)meses;
    }

    @Override
    public abstract double calcularInteres(double monto, int meses);

    //CALCULAR MONTO CON INTERES Y MULTA SI ES QUE HAY

    public double calcularMontoConInteresYMulta(){
        int meses= calcularMeses(fechaPrestamo, fechaPago);
        double interes = calcularInteres(montoSolicitado, meses);
        double montoInteres= montoSolicitado+interes;

        double multa=0;


        if (fechaPago.isAfter(fechaPactada)) {
        long dias=ChronoUnit.DAYS.between(fechaPactada, fechaPago);
        multa = montoSolicitado * 0.02 * dias;
        System.out.println("La multa por atraso de pago es de: " + multa + "$");

    }else{
        System.out.println("El monto se ha pagado en el timepo determinado");
    }

    System.out.println();

    double montoFinal = montoInteres + multa;
    System.out.println("Monto inicial solicitado: " + montoSolicitado + "$");
    System.out.println("Interes calculado: " + interes);
    System.out.println("Multa por atraso: " + multa);
    System.out.println("Monto total: " + montoFinal + "$");

    return montoFinal;

    }

    
    

    

    


}
