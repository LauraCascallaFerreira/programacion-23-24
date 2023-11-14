package Trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio06 {

    public static void main(String[] args) {
        int num=1;
        int suma=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Dame un número:");
            num=sc.nextInt();
            suma+=num;
        } while(num!=0);

        System.out.println("La suma de los números introducidos es: "+suma);
    }
    
}
