/* Escribe un programa que pida al usuario su estado de ánimo (feliz, triste, enérgico, relajado) y luego
genere una lista de reproducción con canciones sugeridas para ese estado de ánimo.
*/

import java.util.Scanner;
public class GeneradorListasReproducción4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su estado de ánimo (feliz, triste, enérgico, relajado):");
        String estadoDeAnimo = sc.nextLine();

        listaDeReproducciones(estadoDeAnimo);

        sc.close();
    }

    public static void listaDeReproducciones(String estadoDeAnimo) {
        if (estadoDeAnimo.equalsIgnoreCase("feliz")) {
            System.out.println("Lista de reproducción Feliz");
            System.out.println("1. Happy - Pharrell Williams");
        } else if (estadoDeAnimo.equalsIgnoreCase("triste")) {
            System.out.println("Lista de reproducción Triste");
            System.out.println("1. Someone Like You - Adele");
        } else if (estadoDeAnimo.equalsIgnoreCase("enérgico")) {
            System.out.println("Lista de reproducción Enérgico");
            System.out.println("1. Eye of the Tiger - Survivor");
        } else if (estadoDeAnimo.equalsIgnoreCase("relajado")) {
            System.out.println("Lista de reproducción Relajado");
            System.out.println("1. Weightless - Marconi Union");
        } else {
            System.out.println("Estado de ánimo no válido. Por favor ingrese 'feliz', 'triste', 'enérgico', o 'relajado'.");
        }
    }
}
