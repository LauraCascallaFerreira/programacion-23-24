package repaso.arrays;

import java.util.Arrays;
import java.util.Scanner;

/*5. Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1o de A, el 1o de
B, el 2o de A, el 2o de B, etc.*/ 
public class ejercicio05 {
    public static void main(String[] args) {
        int num, num1;
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        int arr3[]=new int[20];
        int j=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 números:");

        for(int i=0; i<arr1.length; i++){
            num=sc.nextInt();
            arr1[i]=num;
        }

        System.out.println("Dame otros diez números:");
        
        for(int i=0; i<arr2.length; i++){
            num1=sc.nextInt();
            arr2[i]=num1;
        }

        for(int i=0; i<arr3.length/2; i++){
            System.out.println(arr3[j]=arr1[i]);
            j++;
            System.out.println(arr3[j]=arr2[i]);
            j++;
        }

        System.out.println(Arrays.toString(arr3));

    }
}
