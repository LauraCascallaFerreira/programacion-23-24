package trimestre1.tres;

import java.util.Scanner;

public class resuelto02 {
    
    public static void main(String[] args) {
        
        int filas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el numero de filas que quieres: ");
        filas=sc.nextInt();

        for (int i=1; i<filas; i++){

            for (int k=1; k<filas-i; k++) {
                System.out.print(" ");
            }
            for (int j=1; j<=2*(i-1)+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
