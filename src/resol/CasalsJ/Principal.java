package resol.CasalsJ;

import java.util.Scanner;

import resol.CasalsJ.Ejercicio1.Ejercicio1;
import resol.CasalsJ.Ejercicio2.Ejercicio2;
import resol.CasalsJ.Ejercicio3.Ejercicio3;
import resol.CasalsJ.Ejercicio4.Ejercicio4;
import resol.CasalsJ.Ejercicio5.Ejercicio5;

public class Principal{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("Seleccione el ejercicio a ejecutar:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". Ejercicio " + i);
        }

        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Ejercicio1.ejecutar();
                break;
            case 2:
                Ejercicio2.ejecutar();
                break;
            case 3:
                Ejercicio3.ejecutar();
                break;
            case 4:
                Ejercicio4.ejecutar();
                break;
            case 5:
                Ejercicio5.ejecutar();
                break;
            
        
            default:
                break;
        }

        scanner.close();

    }

}