package trimestre2.repaso.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*Buscar un elemento en un arraylist */

public class repaso02 {
    public static void main(String[] args) {
        ArrayList<String> uno = new ArrayList<>();

        uno.add("Hasta");
        uno.add("luego");
        uno.add("Lucas");

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una palabra:");
        String palabra=sc.nextLine();
        sc.close();

        
        if(uno.contains(palabra))
            System.out.println("La palabra está en la cadena.");
        else 
            System.out.println("La palabra no esta en la cadena.");
    }
}
