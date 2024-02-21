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

    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(args));
        insertionSort(arr);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(arr));
    }
}
