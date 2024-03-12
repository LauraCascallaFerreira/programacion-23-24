package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer 5 números y mostrarlos en orden inverso al
introducido.*/
public class arrays02 {

    public static void recogerArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Orden normal:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        recogerArray(arr);
        System.out.println("Orden invertido:");
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
