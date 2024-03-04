package trimestre2.arraylist.ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Realizar un programa que ordene 10 palabras introducidas por teclado,
 * ordenar las palabras.*/
public class ejercicio02 {

    public static final int numero=10;

    public static void main(String[] args) {
        ArrayList<String> palabras = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 10 frases: ");

        for(int i=0; i<numero; i++){
            String cadena=sc.nextLine();
            palabras.add(cadena);
        }

        System.out.println("Desordenadas:");
        System.out.println(palabras.toString());
        Collections.sort(palabras);
        System.out.println("Ordenadas alfabéticamente:");
        System.out.println(palabras.toString());
        Collections.reverse(palabras);
        System.out.println("Ordenadas alfabéticamente del reves:");
        System.out.println(palabras.toString());
        sc.close();
    }
}
