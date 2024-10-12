/*Ejercicio 7: Sistema de Recomendación de Actividades
Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
recomiende una actividad basada en su estado de ánimo.
*/

import java.util.Scanner;

public class SistemaRecomendaciónActividades7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado):");
            String estadoDeAnimo = sc.next().toLowerCase();

            switch (estadoDeAnimo) {
                case "feliz":
                    System.out.println("Recomendación: Ayuda a alguien en alguna tarea.");
                    break;
                case "triste":
                    System.out.println("Recomendación: Escucha música alegre.");
                    break;
                case "enérgico":
                    System.out.println("Recomendación: Haz ejercicio.");
                    break;
                case "relajado":
                    System.out.println("Recomendación: Lee un libro.");
                    break;
                default:
                    System.out.println("Estado de ánimo incorrecto. Vuelve a ingresarlo.");
                    continue;
            }

            System.out.println("¿Desea ingresar otro estado de ánimo? (s/n):");
            char respuesta = sc.next().toLowerCase().charAt(0);
            if (respuesta == 'n') {
                break;
            }
        }

        sc.close();
    }
}