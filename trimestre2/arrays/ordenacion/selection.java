package trimestre2.arrays.ordenacion;

import java.util.Arrays;

public class selection {
    public static int[] selectionSort(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			int index = i;

			for (int j = i + 1; j < numbers.length; j++)
				if (numbers[j] < numbers[index]) // Finds smallest number
					index = j;

			int smallerNumber = numbers[index]; // Swap
			numbers[index] = numbers[i];
			numbers[i] = smallerNumber;
		}
		return numbers;
	} // cierre selection

	public static void selectionSortInvertido(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

	public static void selectionSortCaracteresInvertido(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }
            char temp = arr[maxIndex];
            arr[maxIndex] = arr[i];
            arr[i] = temp;
        }
    }

	public static void selectionSortCaracteres(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            char temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

		int[] num = new int[5000];

		for (int i = 0; i < num.length; i++)
			num[i] = (int) (Math.random() * 1000);

		System.out.println("desordenado");
		System.out.println(Arrays.toString(num));
		selectionSort(num);
		System.out.println("ordenado");
		System.out.println(Arrays.toString(num));

	} // cierre main
}
