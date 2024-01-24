package trimestre1.boletin02;

import java.util.Scanner;

public class ejercicio05 {

    /*12. Pedir un número y calcular su factorial.*/

    public static void main(String[] args) {
        int num;
        int factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        num=sc.nextInt();

        for(int i=num; i>0; i--){
            factorial*=i;
        }

        System.out.println("La factorial de: "+num+" es: "+factorial);
        
    }


    
}
