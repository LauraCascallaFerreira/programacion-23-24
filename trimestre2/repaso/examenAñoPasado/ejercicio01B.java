package trimestre2.repaso.examenAñoPasado;

import java.util.Arrays;
import java.util.Scanner;

/*Pedir por teclado la introducción de una tabla de 10 elementos
numéricos enteros.
Pedir por teclado un valor entero al usuario y desplace dicho número
de veces las posiciones del array.
Los números que salgan por el final del ARRAY deberán entrar de
nuevo por el principio del mismo. */

public class ejercicio01B {

    //PREGUNTAR
    
    public static void poblarArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame "+arr.length+" números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int arr2[] = new int[10];
        poblarArray(arr);

        System.out.println("Dime un nº");
        int desplazar=sc.nextInt();

        for(int i=0; i<desplazar; i++){
            for(int j=0; j<arr.length; j++){
                if(i==arr.length-1){
                    arr2[0]=arr2[i];
                    arr2[1]=arr2[i+1];
                } else {
                    arr2[i+2]=arr2[i];
                }
            }
        }

        System.out.println("Array original:");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array nuevo:");
        System.out.println(Arrays.toString(arr2));
    }
}
