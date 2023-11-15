package Trimestre1.sucesion;

import java.util.Arrays;
import java.util.Scanner;

public class geometrica {

    public static void main(String[] args) {

        //termino enesimo inicial * razon elevado a (n-1)
        //1
        //razon 2
        //1ter 1*2=2
        //2ter 2*2=4
        //3term 4*2=8

        int inicial, razon, termino, tope;
        int mult=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Término inicial: ");
        inicial=sc.nextInt();

        System.out.println("Razón:");
        razon=sc.nextInt();

        System.out.println("Cuántos términos quieres sacar:");
        tope=sc.nextInt();

        int[] arr = new int[tope];

        for(int i=0; i<tope; i++){
            arr[i]=(int)(inicial*Math.pow(razon, i-1));
            mult*=arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("La suma de los "+tope+" nº mostrados es: "+mult);
    }
    
}
