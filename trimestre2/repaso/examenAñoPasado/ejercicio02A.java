package trimestre2.repaso.examenAñoPasado;

import java.util.Arrays;

/*Genera un array de 50 posiciones enteras que tomarán valores entre
-100 y 100.
Recorriendo dicho array separe en dos arrays distintos los valores
positivos de los negativos.
Ordene ambos arrays por el método de la Burbuja. Considere el cero
positivo.
Mostrar por teclado ambos arrays obtenidos y ordenados*/

public class ejercicio02A {
    public static void generaArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            arr[i]=(int)(-100+Math.random()*200);
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {

        int arr[] = new int[50];
        generaArray(arr);
        int positivo=0;
        int negativo=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                positivo++;
            } else {
                negativo++;
            }
        }

    int positivos[] = new int[positivo];
    int negativos[] = new int[negativo];

    int posicionesp=0;
    int posicionesn=0;

    for(int i=0; i<arr.length; i++){
        if(arr[i]>0){
            positivos[posicionesp]=arr[i];
            posicionesp++;
        } else {
            negativos[posicionesn]=arr[i];
            posicionesn++;
        }
    }

    System.out.println("Numeros positivos.");
        System.out.println(Arrays.toString(positivos));
        System.out.println("Numeros negativos");
        System.out.println(Arrays.toString(negativos));
        System.out.println("Cadenas ordenadas:");
        System.out.println("Numeros positivos:");
        bubble(positivos);
        System.out.println(Arrays.toString(positivos));
        System.out.println("Numeros negativos:");
        bubble(negativos);
        System.out.println(Arrays.toString(negativos));
    }

    public static void bubble(int arr[]){

        int aux;

        for(int i=arr.length; i>0; i--){

            for(int j=0; j<i-1; j++){

                if(arr[j]>arr[j+1]){

                    aux=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=aux;
                }
            }
        }
    }
}
