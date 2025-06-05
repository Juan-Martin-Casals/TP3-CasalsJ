package resol.CasalsJ.Ejercicio4;

public class Produccion extends Empleado {

    String turnoTrabajo;

    public Produccion(String nombre, String dni, double sueldoBase, int antigüedad, String turnoTrabajo) {
        super(nombre, dni, sueldoBase, antigüedad);
        this.turnoTrabajo = turnoTrabajo;
    }

    
    public String getTurnoTrabajo() {
        return turnoTrabajo;
    }



    public void setTurnoTrabajo(String turnoTrabajo) {
        this.turnoTrabajo = turnoTrabajo;
    }


    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Turno de trabajo: " + turnoTrabajo);
        System.out.println("Salario neto: " + calcularSalario());
    }

    @Override
    public double calcularSalario(){
        double salario = getSueldoBase();

        if (turnoTrabajo.equalsIgnoreCase("diurno")) {
            salario -= salario * 0.08;
        }else if (turnoTrabajo.equalsIgnoreCase("nocturno")) {
            salario -= salario * 0.06;
        }
        
        if (getAntigüedad()>15) {
            salario += salario * 0.20;
            
        }else if (getAntigüedad()>10) {
            salario += salario * 0.15;
        }else if (getAntigüedad()>5) {
            salario += salario * 0.10;
        }

        return salario;


    }
    
    
}
