package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/
public class arrays04 {
    
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
        int arr[] = new int[10];
        recogerArray(arr);
        int ultimo = arr.length-1;

        for(int i=0; i<arr.length/2; i++){
            System.out.println(arr[i]);
            System.out.println(arr[ultimo-i]);
        }
    }
}
