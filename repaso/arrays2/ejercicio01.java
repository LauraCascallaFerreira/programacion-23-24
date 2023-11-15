package repaso.arrays2;

import java.util.Scanner;

public class ejercicio01 {

    /*Crea un método que encuentre el número más grande en un array de números enteros.*/

    public static void numeroMayor(int[] arr){
        int mayor=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>mayor){
                mayor = arr[i];
                System.out.println("El número mayor es: "+mayor);
            }
        }

        }
    

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 5 números");

        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        numeroMayor(arr);
    }
    
}
