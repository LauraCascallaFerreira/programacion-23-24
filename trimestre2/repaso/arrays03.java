package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer 5 números por teclado y a continuación realizar la
media de los números positivos, la media de los negativos y
contar el número de ceros.*/
public class arrays03 {

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

    public static void mediaNumeros(int arr[]){
        double sumap=0;
        double suman=0;
        double countp=0;
        double countn=0;
        double ceros=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                sumap+=arr[i];
                countp++;
            } else if(arr[i]<0){
                suman+=arr[i];
                countn++;
            } else {
                ceros++;
            }
        }

        System.out.println("La media de los nº positivos es: "+sumap/countp);
        System.out.println("La media de los nº negativos es: "+suman/countn);
        System.out.println("El nº de ceros es: "+ceros);
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        recogerArray(arr);
        mediaNumeros(arr);
    }
}
