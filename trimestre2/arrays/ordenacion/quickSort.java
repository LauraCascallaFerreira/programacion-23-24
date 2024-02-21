package trimestre2.arrays.ordenacion;

public class quickSort {
    
    static void qsort(char items[]) {
		qs(items, 0, items.length - 1);// llamada al metodo de la linea 13
	}

	// A recursive version of Quicksort for characters.
	private static void qs(char items[], int left, int right) {

		int i, j;
		char x, y;
		i = left;
		j = right;
		x = items[(left + right) / 2];

		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;

			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j); // fin do

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}

	static void qsort(int items[]) {
		qs(items, 0, items.length - 1);// llamada al metodo de la linea 13
	}

//A recursive version of Quicksort for characters. 
	private static void qs(int items[], int left, int right) {

		int i, j;
		int x, y;
		i = left;
		j = right;
		x = items[(left + right) / 2];

		do {
			while ((items[i] < x) && (i < right))
				i++;
			while ((x < items[j]) && (j > left))
				j--;

			if (i <= j) {
				y = items[i];
				items[i] = items[j];
				items[j] = y;
				i++;
				j--;
			}
		} while (i <= j); // fin do

		if (left < j)
			qs(items, left, j);
		if (i < right)
			qs(items, i, right);
	}

}
