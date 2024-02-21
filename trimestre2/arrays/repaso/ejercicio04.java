package trimestre2.arrays.repaso;

import java.util.Scanner;

/*4. Leer 10 números enteros. Debemos mostrarlos en el
siguiente orden: el primero, el último, el segundo, el
penúltimo, el tercero, etc. */
public class ejercicio04 {

    public static void pedirArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();
    }

    public static void main(String[] args) {
        int arr[] = new int[10];
        pedirArray(arr);
        //hacemos una variable que sea la ultima posicion del array
        int maximo=arr.length-1;

        //vamos recorriendo el array, a medida que recorre va mostrando la primera y
        //y la ultima posicion
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
            System.out.println(arr[maximo-i]);
        }
    }
}
