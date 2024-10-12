/*Ejercicio 4: Calculadora de IMC con Recomendaciones
        Escribe un programa que pida al usuario su peso en kilogramos y su altura en metros, y luego
        calcule su Índice de Masa Corporal (IMC). Imprime una recomendación basada en el IMC (bajo
        peso, peso normal, sobrepeso, obesidad).
        */

import java.util.Scanner;

public class CalculadoraIMC4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese su peso (kg):");
            double peso = sc.nextDouble();

            // Validar el peso
            if (peso <= 0) {
                System.out.println("Peso incorrecto. Vuelva a ingresar su peso.");
                continue;
            }

            System.out.println("Ingrese su altura (m):");
            double altura = sc.nextDouble();

            if (altura <= 0) {
                System.out.println("Altura incorrecta. Vuelva a ingresar su altura.");
                continue;
            }


            double IMC = peso / (altura * altura);


            if (IMC < 18.5) {
                System.out.println("Su IMC es " + IMC + ": Bajo peso");
            } else if (IMC >= 18.5 && IMC <= 24.9) {
                System.out.println("Su IMC es " + IMC + ": Peso normal");
            } else if (IMC >= 25 && IMC <= 29.9) {
                System.out.println("Su IMC es " + IMC + ": Sobrepeso");
            } else {
                System.out.println("Su IMC es " + IMC + ": Obesidad");
            }

            break;
        }

        sc.close();
    }
}
