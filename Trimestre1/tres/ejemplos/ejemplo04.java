package Trimestre1.tres.ejemplos;

import java.util.Scanner;

public class ejemplo04 {
    
    public static void main(String[] args) {
        
    String tipoDia = "";
    String diaSemana;

    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el dia de la semana");
    diaSemana=sc.nextLine();

    switch (diaSemana.toLowerCase()) {
        case "lunes":
            tipoDia = "Inicio de semana";
        break;
        case "martes","miercoles","jueves":
            tipoDia = "Mediados de semana";
        break;
        case "viernes":
            tipoDia = "Inicio de fin se semana";
        break;
        case "sabado","domingo":
            tipoDia = "Fin de semana";
        break;
        default:
            tipoDia="No existe ese dia.";
    }
    System.out.println(diaSemana + " es " + tipoDia);
    }
}
