/*
Ejercicio 1: Generador de Horóscopo
Escribe un programa que pida al usuario su fecha de nacimiento (en formato DD/MM/AAAA) y luego
imprima su signo del zodiaco y un mensaje de horóscopo correspondiente.
 */


import java.util.Scanner;
public class GeneradorHoróscopo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su fecha de nacimiento (DD/MM/AAAA): ");
        String fechaNacimiento = sc.nextLine();

        String[] partes = fechaNacimiento.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);

        String signo = determinarSigno(dia, mes);
        System.out.println("Su signo es: " + signo);
        System.out.println("Horóscopo " + obtenerHoroscopo(signo));

        sc.close();

    }

    public static String determinarSigno(int dia, int mes) {
        if (mes == 1) {
            return (dia <= 20) ? "Capricornio" : "Acuario";
        } else if (mes == 2) {
            return (dia <= 19) ? "Acuario" : "Piscis";
        } else if (mes == 3) {
            return (dia <= 20) ? "Piscis" : "Aries";
        } else if (mes == 4) {
            return (dia <= 20) ? "Aries" : "Tauro";
        } else if (mes == 5) {
            return (dia <= 21) ? "Tauro" : "Géminis";
        } else if (mes == 6) {
            return (dia <= 21) ? "Géminis" : "Cáncer";
        } else if (mes == 7) {
            return (dia <= 22) ? "Cáncer" : "Leo";
        } else if (mes == 8) {
            return (dia <= 23) ? "Leo" : "Virgo";
        } else if (mes == 9) {
            return (dia <= 23) ? "Virgo" : "Libra";
        } else if (mes == 10) {
            return (dia <= 23) ? "Libra" : "Escorpio";
        } else if (mes == 11) {
            return (dia <= 22) ? "Escorpio" : "Sagitario";
        } else if (mes == 12) {
            return (dia <= 21) ? "Sagitario" : "Capricornio";
        } else {
            return "Fecha no válida";
        }
    }

    public static String obtenerHoroscopo(String signo) {
        if (signo.equals("Aries")) {
            return "Hoy es un buen día para tomar decisiones.";
        } else if (signo.equals("Tauro")) {
            return "La paciencia te llevará a donde deseas.";
        } else if (signo.equals("Géminis")) {
            return "Comunícate con aquellos que te rodean.";
        } else if (signo.equals("Cáncer")) {
            return "Dedica tiempo a tus seres queridos.";
        } else if (signo.equals("Leo")) {
            return "Tu energía inspirará a otros hoy.";
        } else if (signo.equals("Virgo")) {
            return "Organiza tus ideas y prioriza tus tareas.";
        } else if (signo.equals("Libra")) {
            return "Busca el equilibrio en tus relaciones.";
        } else if (signo.equals("Escorpio")) {
            return "Tu intuición te guiará hacia el éxito.";
        } else if (signo.equals("Sagitario")) {
            return "Aventúrate a explorar nuevas posibilidades.";
        } else if (signo.equals("Capricornio")) {
            return "El trabajo duro dará sus frutos pronto.";
        } else if (signo.equals("Acuario")) {
            return "Tu originalidad será valorada hoy.";
        } else if (signo.equals("Piscis")) {
            return "Deja que tu creatividad brille.";
        } else {
            return "Sin horóscopo disponible.";
        }
    }
}
