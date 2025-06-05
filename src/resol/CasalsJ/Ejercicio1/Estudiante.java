package resol.CasalsJ.Ejercicio1;

public class Estudiante {

    String nombre;
    int edad;
    double notaFinal;

    public Estudiante(String nombre, int edad, double notaFinal) {

        this.nombre = nombre;
        this.edad = edad;
        this.notaFinal = notaFinal;
    }

    public void mostrarInformacion() {

        System.out.println(
                "El nombre del alumno es: " + nombre + "\nSu edad es: " + edad + "\nLa nota final es: " + notaFinal);
    }

    public void aprobo() {
        if (notaFinal < 6) {
            System.out.println("Desaprobó\n");
        } else if (notaFinal >= 6 && notaFinal <= 8) {
            System.out.println("Regulizó\n");
        } else {
            System.out.println("Promocionó\n");
        }
    }

    
}
