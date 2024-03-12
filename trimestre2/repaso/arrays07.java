package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Leer por teclado una serie de 10 números enteros. La
aplicación debe indicarnos si los números están ordenados
de forma creciente, decreciente, o si están desordenados.*/
public class arrays07 {

    public static void recogerArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println("Orden normal:");
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        recogerArray(arr);

        //variable que va a ir aumentando a medida que recorremos el array, por lo que 
        //su valor final será el nº de elementos que tenga el array, por eso igualamos
        //las otras variables en el ultimo if
        int i=0;
        //variables contador
        int creciente=0;
        int decreciente=0;
        //recorremos el array
        for(i=0; i<arr.length-1; i++){
            //si el nº anterior es mayor al siguiente
            if(arr[i]>arr[i+1]){
                //aumentamos el contador de decreciente
                decreciente++;
            //si el nº anterior es menor al siguiente
            } else if(arr[i]<arr[i+1]){
                //aumentamos el contador de creciente
                creciente++;                
            }
        }

        //si el contador de decreciente, es igual a i que representa el nº de elementos 
        //de la cadena, eso significa que todos los elementos son menores al anterior,
        //por lo que la cadena está en un orden decreciente
        if(decreciente==i){
            System.out.println("La cadena está en orden decreciente.");
        //aquí lo mismo que en decreciente pero con la variable creciente
        } else if(creciente==i){
            System.out.println("La cadena está en orden creciente.");
        //aquí al recorrer el array la cadena fue dando creciente y decreciente por lo que
        //obviamente está desordenada
        } else System.out.println("La cadena está desordenada.");
    }
}
