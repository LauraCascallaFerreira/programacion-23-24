package trimestre2.arrays.ejercicios.examen;

import java.util.Arrays;

public class ejercicio2B {
    /* Genera un array de 60 posiciones enteras que tomarán valores entre 0 y 100.
     * Recorriendo dicho array separe en dos arrays distintos los valores pares e impares
     * Ordenar ambos arrays por el metodo quicksort, considerando el cero par.
     * Mostrar ambos arrays por pantalla.*/

    public static void generaArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)Math.random()*60;
        }
        System.out.println(Arrays.toString(arr));
    }

     public static void main(String[] args) {
        int arr[] = new int[60];
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)Math.random()*60;
        }
        System.out.println(Arrays.toString(arr));
        //generaArray(arr);
     }
}
