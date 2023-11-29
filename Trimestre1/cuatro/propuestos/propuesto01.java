package propuestos;

import java.util.Scanner;

//COMPLETAR

public class propuesto01 {

    /* 1 1  1  1  1 
       1 2  3  4  5
       1 3  6 10 15
       1 4 10 20 35
       1 5 15 35 70
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el número de filas");
        int filas=sc.nextInt();

        for(int j=0; j<filas; j++){
            for(int i=0; i<1; i++){
                System.out.print("1 ");
            } //interno
            System.out.println();
        }//externo
    }
    
}
