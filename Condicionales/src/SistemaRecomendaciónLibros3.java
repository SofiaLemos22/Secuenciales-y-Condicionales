
/* Sistema de Recomendación de Libros
Escribe un programa que pida al usuario su género de libro favorito (fantasía, misterio, romance,
ciencia ficción) y luego recomiende un libro basado en su elección.*/

import java.util.Scanner;

public class SistemaRecomendaciónLibros3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese su género de libro favorito (fantasía, misterio, romance, ciencia ficción):");
            String genero = sc.nextLine().toLowerCase();

            switch (genero) {
                case "romance":
                    System.out.println("Libro recomendado:\n- Orgullo y Prejuicio\n  Autora: Jane Austen");
                    break;
                case "ciencia ficción":
                    System.out.println("Libro recomendado:\n- Gris\n  Autor: Carlos Sisí");
                    break;
                case "misterio":
                    System.out.println("Libro recomendado:\n- Otra vuelta de tuerca\n  Autor: Henry James");
                    break;
                case "fantasía":
                    System.out.println("Libro recomendado:\n- Harry Potter y el prisionero de Azkaban\n  Autor: J.K. Rowling");
                    break;
                default:
                    System.out.println("Género ingresado no válido. Ingréselo nuevamente.");
                    continue;
            }

            break;
        }

        sc.close();
    }
}
