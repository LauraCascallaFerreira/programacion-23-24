package trimestre2.arrays.ejercicios.examen;

import java.util.Arrays;

/* Pedir por teclado 10 numeros.
 * Pedir un valor entero y desplazar ese numero de veces las posiciones del array.
 * Los números que salgan por el principio deberán entrar por el finald el mismo.
 * PEDIR AL USUARIO HACIA DONDE QUIERE MOVER EL ARRAY Y EL NUMERO DE VECES QUE QUIERE 
 * ROTAR.*/
public class ejercicio01B {

    public static int[] rotaDerecha(int num[]){
        int aux=num[num.length-1];

        for(int i=num.length-2; i>=0; i--){
            num[i+1]=num[i];
        }

        num[0]=aux;
        System.out.println(Arrays.toString(num));

        return num;
    }

    public static void rotaIzquierda(int num[]){
        int aux=num[0];

        for(int i=num.length-2; i>=0; i--){
            num[i+1]=num[i];
        }

        num[num.length-1]=aux;
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {
        
    }
}
