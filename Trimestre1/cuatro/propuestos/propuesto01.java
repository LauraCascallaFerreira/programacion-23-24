package propuestos;

import java.util.Arrays;
import java.util.Scanner;

public class propuesto01 {

    /* 1 1  1  1  1 
       1 2  3  4  5
       1 3  6 10 15
       1 4 10 20 35
       1 5 15 35 70
     */

     //posicion(fila i, columna j) = posicion (fila i, columna j-1)
     //posicion(fila i-1, columna);

     public static void ver(int arr[][]){
        int filas  = arr.length;

        for(int j=0; j<filas; j++){
            for(int i=0; i<filas; i++){
                System.out.print(arr[j][i]+" ");
            } //interno
            System.out.println();
        }//externo
     }

    public static void main(String[] args) {
        int filas=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de filas");
        filas=sc.nextInt();
        int arr[][] = new int[filas][filas];

        ver(arr);

        //for(int k=0; k<filas; k++){
        //    System.out.println(Arrays.toString(arr[k]));
        //}
    }
    
}
