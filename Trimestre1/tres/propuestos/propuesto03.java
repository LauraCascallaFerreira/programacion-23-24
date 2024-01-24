package trimestre1.tres.propuestos;

import java.util.Scanner;

public class propuesto03 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("dime cuantas filas");
        int filas = sc.nextInt();
        System.out.println("Total de filas: "+filas);

        for(int i=filas-1; i>=0; i--){
            for(int k=0; k<filas-1; k++){
                System.out.print(" ");
            }
            for(int j=1; j<2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
