package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer 5 números y mostrarlos en el mismo orden
introducido.*/
public class arrays01 {

    public static void recogerArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        recogerArray(arr);
    }
}
