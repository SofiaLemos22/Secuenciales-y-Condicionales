
/* Escribe un programa que pida al usuario la distancia del viaje en kilómetros, el consumo de
combustible del vehículo en litros por kilómetro y el precio del combustible por litro, y luego
calcule e imprima el costo total del viaje. */

import java.util.Scanner;
public class CalculadoraCostodeViaje {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrse la distancia del viaje (km): ");
        int distancia = sc.nextInt();

        System.out.println("Ingrese consumo de combusitble: ");
        double consumo = sc.nextDouble();

        System.out.println("Ingrese el precio de combustible: ");
        double precio = sc.nextDouble();

        double consumoTotal = consumodeCombustible(distancia, consumo);
        double costoTotal = consumoTotal * precio;

        sc.close();

        System.out.printf("El costo total del viaje es: %.2f\n", costoTotal);

    }

    public static double consumodeCombustible(int distancia, double consumo){
        return distancia * consumo;

    }
}
