package trimestre2.repaso;
//NO ENTENDI MUCHO LA VERDAD
import java.util.Arrays;
import java.util.Scanner;

/*Leer por teclado una tabla de 10 elementos numéricos
enteros y una posición (entre 0 y 9). Eliminar el elemento
situado en la posición dada sin dejar huecos.*/
public class arrays12 {
    
    public static void recogerArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void main(String[] args) {
        
        int arr[] = new int[10];
        recogerArray(arr);

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la posición que quieres eliminar: ");
        int posicion = sc.nextInt();

        if (posicion < 0 || posicion >= arr.length) {
            System.out.println("Posición inválida. Debe estar entre 0 y " + (arr.length - 1));
        } else {
            for (int i = posicion; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = 0;

            System.out.println("Nuevo array:");
            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
