package repaso.arrays2;

import java.util.Scanner;

public class ejercicio02 {

    /*Escribe un método para invertir el orden de los elementos en un array.*/

    public static void invertirArray(int[] arr){
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco números.");

        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        
        System.out.println();
        invertirArray(arr);
    }
    
}
