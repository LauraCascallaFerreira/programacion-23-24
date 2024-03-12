package trimestre2.repaso.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*Realizar un programa que ordene 10 palabras introducidas por teclado,
 * ordenar las palabras.*/

public class repaso04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> palabras = new ArrayList<String>();

        System.out.println("Dime 10 palabras.");
        for(int i=0; i<10; i++){
            String palabra=sc.nextLine();
            palabras.add(palabra);
        }
        Collections.sort(palabras);
        sc.close();
    }
}
