package repaso.arrays;

import java.util.Scanner;

/*3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.*/
public class ejercicio03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("Dame cinco números: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }

        
    }
}
