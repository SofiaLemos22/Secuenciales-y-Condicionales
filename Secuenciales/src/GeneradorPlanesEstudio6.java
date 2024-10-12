
/*
Ejercicio 6: Generador de Planes de Estudio
Escribe un programa que pida al usuario cuántas horas al día puede estudiar y luego genere un
plan de estudio semanal distribuyendo esas horas en diferentes materias.
*/

import java.util.Scanner;
public class GeneradorPlanesEstudio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas que puede estudiar: ");
        int horasPorDia = sc.nextInt();

        int horasPorSemana = horasPorDia * 7;

        int horasLaboratorio = 0;
        int horasOrganizacionEmpresarial = 0;
        int horasProgramacion = 0;

        if (horasPorSemana >= 30) {
            horasLaboratorio = 10;
            horasOrganizacionEmpresarial = 10;
            horasProgramacion = 10;
        } else if (horasPorSemana >= 20) {
            horasLaboratorio = 7;
            horasOrganizacionEmpresarial = 7;
            horasProgramacion = 6;
        } else {
            horasLaboratorio = 4;
            horasOrganizacionEmpresarial = 4;
            horasProgramacion = 3;
        }

        System.out.println("\nPlan de estudio semanal:");
        System.out.println("Laboratorio: " + horasLaboratorio + " horas");
        System.out.println("Organización Empresarial: " + horasOrganizacionEmpresarial + " horas");
        System.out.println("Programación: " + horasProgramacion + " horas");

        sc.close();
    }
}
