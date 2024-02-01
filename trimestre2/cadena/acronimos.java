package trimestre2.cadena;

import java.util.Scanner;

public class acronimos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase = sc.nextLine();
        String acronimo="";
        //con el metodo split separamos la frase en palabras
        String[] palabras = frase.split(" ");
        //Aquí cogemos la primera letra (char) de cada palabra y las guardamos en acronimo
        for(int i=0; i<palabras.length; i++){
           acronimo+=palabras[i].charAt(0);
        }
        //Mostramos poniendo en mayúsculas el acrónimo
        System.out.println("El acronimo es: "+acronimo.toUpperCase());

    }
}
