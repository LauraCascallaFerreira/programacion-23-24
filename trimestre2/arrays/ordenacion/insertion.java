package trimestre2.arrays.ordenacion;

import java.util.Arrays;

//INSERTIONSORT
public class insertion {

    public static void insertionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int copyNumber = numbers[i];
            int j = i;
            while (j > 0 && copyNumber < numbers[j-1]) {
                numbers[j] = numbers[j-1];
                j--;
            }
            numbers[j] = copyNumber;
        }
    }

    public static void insertionSortInvertido(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortCaracteresInvertido(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            char key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void insertionSortCaracteres(char[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            char key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(args));
        insertionSort(arr);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(arr));
    }
}
