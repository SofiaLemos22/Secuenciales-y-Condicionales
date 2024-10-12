/* Escribe un programa que pida al usuario su nivel de condición física (principiante, intermedio,
avanzado) y luego genere una rutina de ejercicio semanal con diferentes tipos de ejercicios y
duraciones.
*/

import java.util.Scanner;

public class GeneradorRutinasEjercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese su nivel de condición física (principiante - intermedio - avanzado): ");
        String nivelCondicionFisica = sc.nextLine();


        generarRutina(nivelCondicionFisica);


        sc.close();
    }

    public static void generarRutina(String nivelCondicionFisica) {
        if (nivelCondicionFisica.equalsIgnoreCase("principiante")) {
            System.out.println("Rutina para Principiantes:");
            System.out.println("- 15 minutos de bicicleta estática.");
        } else if (nivelCondicionFisica.equalsIgnoreCase("intermedio")) {
            System.out.println("Rutina para Intermedios:");
            System.out.println("- 30 minutos de bicicleta estática.");
            System.out.println("- 30 minutos de saltar la soga.");
            System.out.println("- 15 minutos de correr.");
        } else if (nivelCondicionFisica.equalsIgnoreCase("avanzado")) {
            System.out.println("Rutina para Avanzados:");
            System.out.println("- 45 minutos de bicicleta estática.");
            System.out.println("- 30 minutos de saltar la soga.");
            System.out.println("- 30 minutos de correr.");
        } else {

            System.out.println("Nivel de condición física no válido. Por favor ingrese 'principiante', 'intermedio' o 'avanzado'.");
        }
    }
}

