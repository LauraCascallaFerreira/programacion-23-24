package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1º de A, el 1º de
B, el 2º de A, el 2º de B, etc. */
public class arrays05 {

    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[] = new int[10];
        int arr3[] = new int[20];
        int j=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Dime otros números para el array:");
        for (int i=0; i<arr2.length; i++){
            int num=sc.nextInt();
            arr2[i]=num;
        }
        sc.close();        

        for(int i=0; i<10; i++){
            arr3[j]=arr[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }
        System.out.println(Arrays.toString(arr3));
    }
}
