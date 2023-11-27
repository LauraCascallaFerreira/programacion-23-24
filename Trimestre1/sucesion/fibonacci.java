package Trimestre1.sucesion;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciIterativo(int veces){
        int tCero=0;
        int tUno=1;
        int aux=0;
        for(int i=0; i<veces; i++){
            aux=tCero+tUno;
            tCero=tUno;
            tUno=aux;
        }
        return aux;
    }

    public static int fibonacciRecursivo(int veces){
        //caso limite

        //caso simplificado

        return veces;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números de fibonacci quieres sacar: ");
        int veces=sc.nextInt();
        System.out.println("El termino "+veces+" es:");
        System.out.println(fibonacciIterativo(veces)); 
    }
    
}
