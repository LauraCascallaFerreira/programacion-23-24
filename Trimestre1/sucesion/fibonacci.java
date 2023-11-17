package Trimestre1.sucesion;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int t0=0;
        int t1=1;
        int aux=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números de fibonacci quieres sacar: ");
        int veces=sc.nextInt();
        for(int i=0; i<veces; i++){
            aux=t0+t1;
            System.out.println("Fibonacci: "+aux);
            t0=t1;
            t1=aux;
        }
    }
    
}
