package repaso.arrays;

import java.util.Scanner;

/*1. Leer 5 números y mostrarlos en el mismo orden
introducido.*/

public class ejercicio01 {
    
    public static void main(String[] args) {
        
        int num=0;
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco numeros.");

        for(int i=0; i<arr.length; i++){
            num=sc.nextInt();
            arr[i]=num;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
