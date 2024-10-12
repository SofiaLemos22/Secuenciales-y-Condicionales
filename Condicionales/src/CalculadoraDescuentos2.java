/*Ejercicio 2: Calculadora de Descuentos
Escribe un programa que pida al usuario el precio de un producto y la categoría del cliente
(estudiante, adulto, jubilado). Aplica un descuento del 10% para estudiantes, 5% para adultos y
15% para jubilados. Imprime el precio final después del descuento.
 */

import java.util.Scanner;

public class CalculadoraDescuentos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el precio del producto: ");
            double precio = sc.nextDouble();

            if (precio <= 0){
                System.out.println("El precio no puede ser menor que 0");
                continue;
            }

            System.out.println("Ingrese la categoría (estudiante, adulto, jubilado)");
            String categoria = sc.next().toLowerCase();

            double descuento = 0;

            switch (categoria) {
                case "estudiante":
                    descuento = 0.10;
                    break;
                case "adulto":
                    descuento = 0.5;
                    break;

                case "jubilado":
                    descuento = 0.15;
                    break;
                default:
                    System.out.println("No ha ingresado una categoría válida");
                    continue;
            }

            double montoDescuento = precio * descuento;
            double precioFinal = precio - montoDescuento;

            System.out.println("El descuento es de: $" + montoDescuento);
            System.out.println("El precio final con descuento es: $" + precioFinal);

            break;
        }

        sc.close();
    }
}