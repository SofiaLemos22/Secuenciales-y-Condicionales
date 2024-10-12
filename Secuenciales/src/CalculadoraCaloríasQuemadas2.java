/*
Escribe un programa que pida al usuario su peso en kilogramos, la duración del ejercicio en
minutos y el tipo de ejercicio (correr, nadar, andar en bicicleta), y luego calcule e imprima las
calorías quemadas. Utiliza diferentes tasas de calorías quemadas por minuto para cada tipo de
ejercicio.
 */


import java.util.Scanner;

public class CalculadoraCaloríasQuemadas2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su peso en kg: ");
        double peso = sc.nextDouble();

        System.out.println("Duración del ejercicio (mn)");
        int minutos = sc.nextInt();

        sc.nextLine();

        System.out.println(("Tipo de ejercicio (correr - nadar - andar en bicicleta)"));
        String tipoEjercicio = sc.nextLine();

        sc.close();

        double calorias = calcularCaloriasQuemadas(peso, minutos, tipoEjercicio);

        if (calorias != -1){
            System.out.println("Has quemado aproximadamente " + calorias + " calorías");
        } else {
            System.out.println("Tipo de ejercicio no válido");
        }
    }

    public static double calcularCaloriasQuemadas(double peso, int minutos, String tipoEjercicio) {

        double MET = 0;

        if (tipoEjercicio.equalsIgnoreCase("correr")){
            MET = 8.0;
        } else if (tipoEjercicio.equalsIgnoreCase("nadar")) {
            MET = 10.0;
        } else if (tipoEjercicio.equalsIgnoreCase("andar en bicicleta")) {
            MET = 8.0;
        } else {
            return -1;
        }

        return MET * peso * (minutos / 60.0);

    }
}



