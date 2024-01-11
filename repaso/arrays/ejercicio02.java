package repaso.arrays;

import java.util.Scanner;

/*2. Leer 5 números y mostrarlos en orden inverso al
introducido.*/

public class ejercicio02 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Dame cinco números: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
