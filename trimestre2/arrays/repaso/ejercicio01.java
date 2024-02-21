package trimestre2.arrays.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*1. Leer 5 números y mostrarlos en el mismo orden
introducido */

public class ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Dame 5 números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}
