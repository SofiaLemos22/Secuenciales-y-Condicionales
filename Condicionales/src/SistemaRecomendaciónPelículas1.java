/* Ejercicio 1: Sistema de Recomendación de Películas
Escribe un programa que pida al usuario su género de película favorito (acción, comedia, drama,
ciencia ficción) y luego recomiende una película basada en su elección.*/

import java.util.Scanner;

public class SistemaRecomendaciónPelículas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese su género de película preferido: (acción/comedia/drama/ciencia ficción)");
            String genero = sc.nextLine().toLowerCase();

            switch (genero) {
                case "acción":
                    System.out.println("Película recomendada:\nJhon Wick");
                    break;
                case "comedia":
                    System.out.println("Película recomendada:\nMi pobre Angelito");
                    break;
                case "ciencia ficción":
                    System.out.println("Película recomendada:\nMatrix");
                case "drama":
                    System.out.println("Película recomendada:\nHugo");
                    break;
                default:
                    System.out.println("No ha ingresado un género válido.Por favor, inténtelo de nuevo.");
                    continue;
            }
            break;
        }

        System.out.println("¡Gracias por usar el Sistema de Recomendación de Películas!");
    }
}
