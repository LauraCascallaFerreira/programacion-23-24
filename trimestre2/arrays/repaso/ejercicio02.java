package trimestre2.arrays.repaso;

import java.util.Scanner;

/*2. Leer 5 números y mostrarlos en orden inverso al
introducido. */

public class ejercicio02 {

    public static void pedirArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 5 números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();;
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        pedirArray(arr);
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}
