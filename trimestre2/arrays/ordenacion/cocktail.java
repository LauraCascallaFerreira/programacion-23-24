package trimestre2.arrays.ordenacion;

import java.util.Arrays;

//BUCLE BIDIRECCIONAL
public class cocktail {

    public static int[] cocktailSort(int[] numbers) {
        boolean swapped = true;
        int i = 0;
        int j = numbers.length - 1;

        while(i < j && swapped) {
            swapped = false;
            for(int k = i; k < j; k++) {
                if(numbers[k] > numbers[k + 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                    swapped = true;}
            }
            j--;
            if(swapped) {
                swapped = false;
                for(int k = j; k > i; k--) {
                    if(numbers[k] < numbers[k - 1]) {
                        int temp = numbers[k];
                        numbers[k] = numbers[k - 1];
                        numbers[k - 1] = temp;
                        swapped = true;}
                }
            }
            i++;
        }
        return numbers;    
    }

    public static void cocktailSortInvertido(int[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void cocktailSortCaracteresInvertido(char[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; i++) {
                if (arr[i] < arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] < arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void cocktailSortCaracteres(char[] arr) {
        boolean swapped = true;
        int start = 0;
        int end = arr.length;

        while (swapped) {
            swapped = false;

            for (int i = start; i < end - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            swapped = false;
            end--;

            for (int i = end - 1; i >= start; i--) {
                if (arr[i] > arr[i + 1]) {
                    char temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swapped = true;
                }
            }

            start++;
        }
    }

    public static void main(String[] args) {

        int num[] = new int[200];

        for(int i=0; i<num.length; i++){
            num[i]=(int)Math.random()*200;
        }
        System.out.println("Desordenado");
        System.out.println(Arrays.toString(num));
        cocktailSort(num);
        System.out.println("Ordenado");
        System.out.println(Arrays.toString(num));
    }
}
