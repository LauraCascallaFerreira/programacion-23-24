package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/*Crear un programa que lea por teclado una tabla de 10
números enteros y la desplace una posición hacia abajo: el
primero pasa a ser el segundo, el segundo pasa a ser el
tercero y así sucesivamente. El último pasa a ser el
primero. */
public class arrays09 {

    public static void recogerArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime números para el array:");
        for (int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        int arr2[] = new int[10];
        recogerArray(arr);
        //Cambia los valores metiendolos en otra cadena
        for(int i=0; i<arr2.length; i++){
            //si i es igual a la ultima posicion entonces ese valor pasa a estar en la 0
            if(i==arr.length-1){
                arr2[0]=arr[i];
            //el resto de valores se mueven a la siguiente posicion
            }else{
                arr2[i+1]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
