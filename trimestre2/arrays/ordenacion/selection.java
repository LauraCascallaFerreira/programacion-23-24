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
