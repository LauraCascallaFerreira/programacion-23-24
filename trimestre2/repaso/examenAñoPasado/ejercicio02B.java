package trimestre2.repaso.examenAñoPasado;

import java.util.Arrays;

/*Genera un array de 60 posiciones enteras que tomarán valores entre 0
y 100.
Recorriendo dicho array separe en dos arrays distintos los valores
(no las posiciones) pares e impares.
Ordene ambos arrays por el método Quicksort. Considere el cero par.
Muestre ambos arrays obtenidos por pantalla */
public class ejercicio02B {

    public static void generarArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = new int[60];
        generarArray(arr);

        int par=0;
        int impar=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0)
                par++;
            else 
                impar++;
        }

        int pares[] = new int[par];
        int impares[] = new int[impar];
        int posicionesp=0;
        int posicionesi=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                pares[posicionesp]=arr[i];
                posicionesp++;
            } else {
                impares[posicionesi]=arr[i];
                posicionesi++;
            }
        }

        System.out.println("Arrays de pares:");
        System.out.println(Arrays.toString(pares));
        System.out.println("Arrays de impares:");
        System.out.println(Arrays.toString(impares));
    }
}
