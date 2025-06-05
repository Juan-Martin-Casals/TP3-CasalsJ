package resol.CasalsJ.Ejercicio5 ;


import java.time.LocalDate;


public class Ejercicio5 {
    public static void ejecutar(){
        Jubilado jubi1 = new Jubilado("Pedro", "12345", LocalDate.of(2025, 7, 1), 100,LocalDate.of(2025,9, 1) , LocalDate.of(2025, 9, 2));

        jubi1.mostrarInformacion();
        jubi1.calcularMontoConInteresYMulta();

        System.out.println();

        ClienteServicioPublico clienteS1= new ClienteServicioPublico("Pedro", "12131212", LocalDate.of(2025, 8, 21),2000,LocalDate.of(2025, 10, 1),
        LocalDate.of(2025, 9, 22));

        clienteS1.mostrarInformacion();
        clienteS1.calcularMontoConInteresYMulta();

        System.out.println();

        ClienteNoServicio clienteNoS1= new ClienteNoServicio("Santiago", "12345679", LocalDate.of(2025, 2, 21),3000,LocalDate.of(2025, 4, 25),
        LocalDate.of(2025, 6, 22));

        clienteNoS1.mostrarInformacion();
        clienteNoS1.calcularMontoConInteresYMulta();
    }
    
}
