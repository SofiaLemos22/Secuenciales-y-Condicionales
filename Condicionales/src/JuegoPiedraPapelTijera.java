
/* Ejercicio 5: Juego de Piedra, Papel o Tijera
Escribe un programa que pida al usuario que elija entre piedra, papel o tijera. Luego, el programa
elige una opción al azar y determina quién gana. Imprime el resultado del juego. */

import java.util.Scanner;
import java.util.Random;

public class JuegoPiedraPapelTijera {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        String[] opciones = {"piedra", "papel", "tijera"};


        System.out.println("¡Bienvenido al Juego de Piedra, Papel o Tijera!");
        System.out.print("Elige tu opción (piedra, papel, tijera): ");
        String eleccionUsuario = sc.nextLine().toLowerCase();

        if (!esOpcionValida(eleccionUsuario, opciones)) {
            System.out.println("Opción inválida. Por favor, elige entre piedra, papel o tijera.");
            sc.close();
            return;
        }


        int indiceComputadora = random.nextInt(opciones.length);
        String eleccionComputadora = opciones[indiceComputadora];


        System.out.println("\nTu elección: " + eleccionUsuario);
        System.out.println("Elección de la computadora: " + eleccionComputadora);


        String resultado = determinarGanador(eleccionUsuario, eleccionComputadora);
        System.out.println("\nResultado: " + resultado);


        sc.close();
    }

    public static boolean esOpcionValida(String eleccion, String[] opciones) {
        for (String opcion : opciones) {
            if (opcion.equals(eleccion)) {
                return true;
            }
        }
        return false;
    }

    public static String determinarGanador(String usuario, String computadora) {
        if (usuario.equals(computadora)) {
            return "¡Es un empate!";
        }

        switch (usuario) {
            case "piedra":
                return (computadora.equals("tijera")) ? "¡Ganaste! Piedra aplasta Tijera." : "¡Perdiste! Papel cubre Piedra.";
            case "papel":
                return (computadora.equals("piedra")) ? "¡Ganaste! Papel cubre Piedra." : "¡Perdiste! Tijera corta Papel.";
            case "tijera":
                return (computadora.equals("papel")) ? "¡Ganaste! Tijera corta Papel." : "¡Perdiste! Piedra aplasta Tijera.";
            default:
                return "Error en la determinación del ganador.";
        }
    }
}

