package resol.CasalsJ.Ejercicio1;

public class Ejercicio1 {
    public static void ejecutar(){

        System.out.println("Ingresaste al ejercicio 1");
        System.out.println();

        Estudiante estudiante1 = new Estudiante("Juan", 18, 10);
        Estudiante estudiante2 = new Estudiante("Pedro", 19, 5);
        Estudiante estudiante3 = new Estudiante("Federico", 20, 2);

        estudiante1.mostrarInformacion();
        estudiante1.aprobo();

        estudiante2.mostrarInformacion();
        estudiante2.aprobo();

        estudiante3.mostrarInformacion();
        estudiante3.aprobo();


        
    }
    
}


