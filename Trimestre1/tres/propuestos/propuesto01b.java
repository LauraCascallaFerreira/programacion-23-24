package trimestre1.tres.propuestos;

import java.util.Scanner;

public class propuesto01b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;

        System.out.println("Dame el valor de la a: ");
        a = sc.nextInt();

        System.out.println("Dame el valor de la b: ");
        b = sc.nextInt();

        System.out.println("Dame el valor de la c: ");
        c = sc.nextInt();

        // Encontrar el valor menor
        int minValor = Math.min(Math.min (a, b),c);

        // Encontrar el valor mayor
        int maxValor = Math.max(Math.max(a, b), c);

        // Mostrar el valor menor y mayor
        System.out.println("El valor menor es: " + minValor);
        System.out.println("El valor mayor es: " + maxValor);
    }
   
}
    

