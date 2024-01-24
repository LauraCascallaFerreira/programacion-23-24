package trimestre1.boletin02;

import java.util.Scanner;

public class ejercicio07 {

    /*14. Pedir 10 sueldos. Mostrar su suma y cuantos hay mayores de 1000€. */

    public static void main(String[] args) {
        
        int sueldo;
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 10 sueldos:");
        for(int i=0; i<10; i++){
            sueldo=sc.nextInt();
            if(sueldo>1000){
                count++;
            }
        }

        System.out.println("El número de sueldos mayores de 1000 son: "+count);
    }
    
}
