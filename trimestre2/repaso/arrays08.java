package trimestre2.repaso;

import java.util.Arrays;
import java.util.Scanner;

/* Diseñar una aplicación que declare una tabla de 10
elementos enteros. Leer mediante el teclado 8 números.
Después se debe pedir un número y una posición, insertarlo
en la posición indicada, desplazando los que estén detrás.*/
public class arrays08 {
    public static void main(String[] args) {

        int arr[] = new int[10];

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 9 nº");

        for(int i=0; i<9; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }

        System.out.println("Dame un nº: ");
        int num2=sc.nextInt();
        System.out.println("Dame una posición: ");
        int pos=sc.nextInt();

        //for que va recorriendo el array EMPEZANDO POR LA ULTIMA POSICION
        //hasta que llega a la posición introducida
        for(int i=9; i>pos; i--){
            //COMO ESTA RECORRIENDO EL ARRAY DE ATRAS PARA DELANTE, ES DECIR VA RESTANDO
            //LA POSICION, SI EL NUMERO NO SE ENCUENTRA EN LA POSICION LO DESPLAZA A LA
            //POSICION ANTERIOR QUE EN EL ORDEN NORMAL SERIA LA POSICION SIGUIENTE
            arr[i]=arr[i-1];
        }

        //aqui introduce el numero en la posicion que ha quedado vacía después del for 
        //anterior
        arr[pos]=num2;

        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
