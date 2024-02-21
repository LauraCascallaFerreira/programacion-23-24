package trimestre2.arrays.ejercicios.examen;

import java.util.Arrays;
import java.util.Scanner;

/*Pedir por teclado la introduccion de una tabla de 10 elementos numericos enteros. Eliminar
 * el elemento situado en una posicion pedida por teclado al usuario sin dejar huecos en
 * la tabla. Mostrar la tabla por consola después de la eliminación de dicho elemento.*/

public class ejercicio01A {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        System.err.println("Dame 10 números para el array: ");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("El número de qué posición quieres borrar? del 0 al 9");
        int posicion=sc.nextInt();

        for(int i=posicion; i<arr.length-1; i++)
            arr[i]=arr[i+1];
        

        arr[arr.length-1]=-1;
        System.out.println(Arrays.toString(arr));
        sc.close();
    }
}