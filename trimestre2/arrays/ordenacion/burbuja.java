package trimestre2.arrays.ordenacion;

import java.util.Arrays;

//BUBBLESORT
public class burbuja {
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

    public static void bubbleSortInvertido(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

	public static void bubbleSortCaracteresInvertido(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

	public static void bubbleSortCaracteres(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,1,3,5,7,9,4,8};
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(num));
        bubble(num);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(num));
    }
}
