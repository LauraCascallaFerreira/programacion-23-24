package repaso.arrays;

import java.util.Scanner;

/*2. Leer 5 números y mostrarlos en orden inverso al
introducido.*/

public class ejercicio02 {

    public static void main(String[] args) {
        
        int num;
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame cinco números.");

        for(int i=0; i<arr.length; i++){
            num=sc.nextInt();
            arr[i]=num;
        }

        //Hay que poner la longitud del array menos uno porque empieza a cubrir desde
        //el cero, por tanto en vez de cinco es cuatro porque el cero también cuenta.
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
    
}
