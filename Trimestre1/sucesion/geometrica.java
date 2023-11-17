package Trimestre1.sucesion;

import java.util.Arrays;
import java.util.Scanner;

public class geometrica {

    public static void main(String[] args) {

        //termino enesimo inicial * razon elevado a (n-1)

        int inicial, razon, termino;
        int tope;
        int suma=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Término inicial: ");
        inicial=sc.nextInt();

        System.out.println("Razón:");
        razon=sc.nextInt();

        System.out.println("Cuántos términos quieres sacar:");
        tope=sc.nextInt();

        int[] arr = new int[tope];

        for(int i=0; i<tope; i++){
            arr[i]=inicial*((int)Math.pow(razon, i-1));
            suma+=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("La suma de los "+tope+" nº mostrados es: "+suma);
    }
    
}
