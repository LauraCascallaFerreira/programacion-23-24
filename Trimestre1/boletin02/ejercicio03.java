package Trimestre1.boletin02;

import java.util.Scanner;

public class ejercicio03 {

    /*10. Pedir 15 números y escribir la suma total. */

    public static void main(String[] args) {
        
        int num;
        int suma=0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<15; i++){
            System.out.println("Dame un numero:");
            num=sc.nextInt();
            suma+=num;
        }

        System.out.println("La suma de los números es: "+suma);
    }
    
}
