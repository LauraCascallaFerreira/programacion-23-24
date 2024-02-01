package trimestre2.cadena;

import java.util.Scanner;

public class troceandoCadenas {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadenas larga: ");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");
        System.out.println("La frase tiene "+palabras.length+" palabras.");

        for(int i=0; i<palabras.length; i++){
            System.out.println(palabras[i]);
        }

        System.out.println("La frase invirtiendo el orden de las palabras es: ");
        for(int i=palabras.length-1; i>=0; i--){
            System.out.println(palabras[i]+" ");
        }
        System.out.println();
    }
}
