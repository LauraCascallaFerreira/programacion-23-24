package trimestre2.repaso.examenAñoPasado;

import java.util.Scanner;

/*Pedir por teclado la introducción de una tabla de 10 elementos
numéricos enteros.
Eliminar el elemento situado en una posición pedida por teclado al
usuario sin dejar huecos en la tabla.
Mostrar la tabla por consola después de la eliminación de dicho
elemento.*/

public class ejercicio01A {

    public static void rellenarArray(int arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame " + arr.length + " números: ");
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        rellenarArray(arr);

        System.out.println("Dame la posición que deseas eliminar: ");
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

        // Este bucle está duplicado, eliminamos uno de ellos
        // arr[arr.length - 1] = 0;

        // Imprimir los elementos del array
        System.out.println();
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}


