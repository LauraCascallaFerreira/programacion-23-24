package Trimestre1.boletin02;

import java.util.Scanner;

public class ejercicio01 {

    /*8. Pedir un número N, y mostrar todos los números del 1 al N.*/

    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        num=sc.nextInt();

        for(int i=0; i<=num; i++){
            System.out.println(i);
        }
    }
    
}
