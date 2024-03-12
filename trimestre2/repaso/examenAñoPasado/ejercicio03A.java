package trimestre2.repaso.examenAñoPasado;

import java.util.Arrays;
import java.util.Scanner;

/*Programa que pida al usuario la introducción de dos cadenas de
caracteres.
A continuación construya una tercera cadena intercalando las
palabras de las cadenas recibidas.
Muestre dicha cadena por pantalla. */
public class ejercicio03A {

    public static void pedirArray(String arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame "+arr.length+" caracteres:");
        for(int i=0; i<arr.length; i++){
            String caracter=sc.nextLine();
            arr[i]=caracter;
        }
    }

    public static void main(String[] args) {
        String arr[] = new String[10];
        String arr2[] = new String[10];
        String arr3[] = new String[20];

        pedirArray(arr);
        pedirArray(arr2);
        int j=0;

        for(int i=0; i<10; i++){
            arr3[j]=arr[i];
            j++;
            arr3[j]=arr2[i];
            j++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }
}
