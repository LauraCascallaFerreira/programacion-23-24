package Trimestre1.sucesion;

import java.util.Arrays;
import java.util.Scanner;

public class aritmeticaArray {

    public static void main(String[] args) {

        int inicial, razon, termino, tope;
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
            arr[i]=inicial+i*razon;
            suma+=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("La suma de los "+tope+" nº mostrados es: "+suma);
    }
    
}
