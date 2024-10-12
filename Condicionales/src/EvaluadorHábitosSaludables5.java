/*
Ejercicio 6: Evaluador de Hábitos Saludables
Escribe un programa que pida al usuario cuántas horas al día duerme, cuántas horas al día hace
ejercicio y cuántas comidas saludables consume al día. Luego, imprime una evaluación de sus
hábitos saludables basada en estos datos.
*/


import java.util.Scanner;

public class EvaluadorHábitosSaludables5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("Horas al día que duerme:");
            int horasDormidas = sc.nextInt();
            if (horasDormidas < 0) {
                System.out.println("Número inválido. Vuelva a ingresar.");
                continue;
            }

            System.out.println("Horas al día que hace ejercicio:");
            int horasEjercicio = sc.nextInt();
            if (horasEjercicio < 0) {
                System.out.println("Número inválido. Vuelva a ingresar.");
                continue;
            }

            System.out.println("Cantidad de comidas saludables al día:");
            int comidasSaludables = sc.nextInt();
            if (comidasSaludables < 0) {
                System.out.println("Número inválido. Vuelva a ingresar.");
                continue;
            }

            if (horasDormidas >= 6 && horasDormidas <= 8) {
                System.out.println("Horas dormidas: Adecuadas.");
            } else {
                System.out.println("Horas dormidas: Inadecuadas.");
            }

            if (horasEjercicio >= 1) {
                System.out.println("Ejercicio: Suficiente.");
            } else {
                System.out.println("Ejercicio: Insuficiente.");
            }

            if (comidasSaludables >= 2) {
                System.out.println("Comidas saludables: Adecuadas.");
            } else {
                System.out.println("Comidas saludables: Insuficientes.");
            }

            System.out.println("¿Desea realizar otra evaluación? (s/n):");
            char respuesta;
            do {
                System.out.println("¿Desea realizar otra evaluación? (s/n):");
                respuesta = sc.next().charAt(0);

                if (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N') {
                    System.out.println("Respuesta inválida. Por favor ingrese 's' para sí o 'n' para no.");
                }
            } while (respuesta != 's' && respuesta != 'S' && respuesta != 'n' && respuesta != 'N');

            if (respuesta == 'n' || respuesta == 'N') {
                salir = true;
            }
        }
    }

}


