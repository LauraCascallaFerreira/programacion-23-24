package Trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        
        int num=1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Dame un número:");
            num=sc.nextInt();
            if(num%2==0){
                System.out.println("El número es par.");
            } else System.out.println("El número es impar.");

        } while(num!=0);
    }
    
}
