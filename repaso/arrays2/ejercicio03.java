package repaso.arrays2;

import java.util.Scanner;

public class ejercicio03 {

    /*Escribe un método que calcule el promedio de los valores en un array de números 
    enteros. */

    public static double media(double suma, double count){
        double media = suma/count;
        return media;
    }

    public static void promedioValores(int arr[]){
        double suma=0;
        double count=0;
        double media=0;
        for(int i=0; i<arr.length; i++){
            suma+=arr[i];
            count++;
        }
        System.out.println("La media de los números introducidos es: "+media(suma, count));
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 5 números.");

        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        promedioValores(arr);
    }
    
}
