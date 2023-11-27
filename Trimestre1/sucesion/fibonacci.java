package Trimestre1.sucesion;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciIterativo(int veces){
        int tCero=0;
        int tUno=1;
        int aux=0;
        System.out.println(tCero);
        System.out.println(tUno);
        for(int i=0; i<=veces; i++){
            aux=tCero+tUno;
            System.out.println("Fibonacci "+(i+2)+" "+aux);
            tCero=tUno;
            tUno=aux;
        }
        return aux;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números de fibonacci quieres sacar: ");
        int veces=sc.nextInt();
        System.out.println("El termino "+veces+"es:");
        System.out.println(fibonacciIterativo(veces)); 
    }
    
}
