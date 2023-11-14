package Trimestre1.tres.ejemplos;

import java.util.Scanner;

public class ejemplo09 {
    public static void main(String[] args) {
        
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número.");
        num=sc.nextInt();
        System.out.println("La tabla de multiplicar de "+num+" es:");

        for(int i=0; i<=10; i++){
            int mult=num*i;
            System.out.println(num+"x"+i+"="+mult);
        }
    }
}
