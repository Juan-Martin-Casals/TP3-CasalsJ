package resol.CasalsJ.Ejercicio4;

public class Administrativo extends Empleado {

    private String modoTrabajo;

    public Administrativo(String nombre, String dni, double sueldoBase, int antigüedad, String modoTrabajo) {
        super(nombre, dni, sueldoBase, antigüedad);
        this.modoTrabajo = modoTrabajo;
    }

    
    public String getModoTrabajo() {
        return modoTrabajo;
    }



    public void setModoTrabajo(String modoTrabajo) {
        this.modoTrabajo = modoTrabajo;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Modo de trabajo: " + modoTrabajo);
        System.out.println("Salario neto: " + calcularSalario());
    }

        @Override
    public double calcularSalario(){

        double salario = getSueldoBase();

        if (modoTrabajo.equalsIgnoreCase("remoto")) {
            salario -= salario * 0.12;
            
            
        }else if (modoTrabajo.equalsIgnoreCase("presencial")) {
            salario -= salario * 0.08;
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
