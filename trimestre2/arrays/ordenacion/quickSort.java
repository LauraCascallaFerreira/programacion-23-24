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

	public static void quickSortInvertido(int[] arr, int low, int high) {
        if (low < high) {
            int pi = qs2(arr, low, high);

            quickSortInvertido(arr, low, pi - 1);
            quickSortInvertido(arr, pi + 1, high);
        }
    }

    public static int qs2(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

	public static void quickSortCaracteresInvertido(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSortCaracteresInvertido(arr, low, pi - 1);
            quickSortCaracteresInvertido(arr, pi + 1, high);
        }
    }

	public static int partition(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] >= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

	public static void quickSortCaracteres(char[] arr, int low, int high) {
        if (low < high) {
            int pi = partition2(arr, low, high);

            quickSortCaracteres(arr, low, pi - 1);
            quickSortCaracteres(arr, pi + 1, high);
        }
    }

    public static int partition2(char[] arr, int low, int high) {
        char pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        char temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

}
