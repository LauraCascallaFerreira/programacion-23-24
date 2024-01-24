package trimestre1.sucesion;

import java.util.Scanner;

public class fibonacci {

    public static int fibonacciIterativo(int orden){
        int tCero=0;
        int tUno=1;
        int aux=0;
        for(int i=0; i<orden; i++){
            aux=tCero+tUno;
            tCero=tUno;
            tUno=aux;
        }
        return aux;
    }

    public static int fibonacciRecursivo(int orden){
        //caso limite
        if(orden==0){
            return 0;
        } else if(orden==1){
            return 1;
        } else{
        //caso simplificado
        return fibonacciRecursivo(orden - 1)+fibonacciRecursivo(orden-2);
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos números de fibonacci quieres sacar: ");
        int orden=sc.nextInt();
        System.out.println("El termino "+orden+" es:");
        System.out.println(fibonacciIterativo(orden)); 
        System.out.println(fibonacciRecursivo(orden));
    }
    
}
