package trimestre2.cadena;

import java.util.Scanner;

public class palindromoPalabra {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra para comprobar si es PALINDROMO: ");
        String word = sc.nextLine();

        String sin = word.replace(" ", "");
        String low = sin.toLowerCase();

        // constructor de cadenas.
        StringBuilder sb = new StringBuilder(low);
        String reves = sb.reverse().toString();

        if(low.equals(reves)){
            System.out.println("Es PALINDROMO");
        }else{
            System.out.println("No es PALINDROMO");
        }
    }
}
