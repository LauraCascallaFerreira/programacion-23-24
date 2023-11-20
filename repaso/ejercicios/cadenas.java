package repaso.ejercicios;

import java.util.Scanner;

/*Manejo de cadenas: Crea un programa que invierta una cadena, cuente la cantidad de 
caracteres o elimine los espacios en blanco. */

public class cadenas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una frase: ");
        String frase=sc.nextLine();

        System.out.println("La cantidad de caracteres que tiene la fase que has intrucido "+
        " es de: "+frase.length());
    }

}
