
/*
Ejercicio 7: Calculadora de Índice de Felicidad
Escribe un programa que pida al usuario varios factores de felicidad (nivel de satisfacción con la
vida, nivel de estrés, nivel de salud, etc.) en una escala del 1 al 10 y luego calcule e imprima un
índice de felicidad basado en esos factores.
 */

import java.util.Scanner;

public class CalculadoraÍndiceFelicidad7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidadFactores = 4;
        String[] nombresFactores = {
                "satisfacción con la vida",
                "nivel de estrés",
                "nivel de salud",
                "satisfacción en el trabajo"
        };

        double suma = 0;

        for (int i = 0; i < cantidadFactores; i++) {
            System.out.print("Ingrese su " + nombresFactores[i] + " (1-10): ");
            double valor = sc.nextDouble();

            if (valor >= 1 && valor <= 10) {
                suma += valor;
            } else {
                System.out.println("Valor no válido. Debe estar entre 1 y 10.");
                System.out.print("Ingrese su " + nombresFactores[i] + " (1-10): ");
                valor = sc.nextDouble();

                if (valor >= 1 && valor <= 10) {
                    suma += valor;
                } else {
                    System.out.println("Valor no válido. Se usará 0 para este factor.");
                }
            }
        }

        double indiceFelicidad = suma / cantidadFactores;

        System.out.println("Su índice de felicidad es: " + indiceFelicidad);

        sc.close();
    }
}
