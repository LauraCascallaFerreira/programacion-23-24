package trimestre2.arrays.repaso;

import java.util.Scanner;

/*3. Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros. */

public class ejercicio03 {

    public static void pedirArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 5 números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();
    }
    public static void main(String[] args) {
        int arr[] = new int[5];
        pedirArray(arr);
        int ceros=0; int sumap=0; int countp=0; int suman=0; int countn=0; 
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                ceros++;
            } else if(arr[i]>0){
                countp++;
                sumap+=arr[i];
            } else if(arr[i]<0) {
                countn++;
                suman+=arr[i];
            }
        }

        System.out.println("El numero de ceros es: "+ceros);
        System.out.println("La media de numeros positivos es: "+sumap/countp);
        System.out.println("La media de numeros negativos es: "+suman/countn);
    }
}
