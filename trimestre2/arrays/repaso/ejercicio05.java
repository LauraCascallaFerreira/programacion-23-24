package trimestre2.arrays.repaso;

import java.util.Scanner;

/*5. Leer por teclado dos tablas de 10 números enteros y
mezclarlas en una tercera de la forma: el 1º de A, el 1º de
B, el 2º de A, el 2º de B, etc. */
public class ejercicio05 {
    
    public static void pedirArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 números:");
        for(int i=0; i<arr.length; i++){
            int num=sc.nextInt();
            arr[i]=num;
        }
        sc.close();
    }
}
