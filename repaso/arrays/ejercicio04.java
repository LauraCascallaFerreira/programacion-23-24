package repaso.arrays;

import java.util.Scanner;

/*4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc.*/
public class ejercicio04 {

    public static void main(String[] args) {
        int num;
        int arr[] = new int[10];
        int arr2[] = new int[1];
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 números.");

        for(int i=0; i<arr.length; i++){
            num=sc.nextInt();
            arr[i]=num;
        }

        System.out.println("Resultado:");

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            System.out.println(arr[i]-i);
        }

    }
    
}
