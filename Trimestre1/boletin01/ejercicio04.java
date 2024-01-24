package trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String[] args) {
        int num=0; int count=0;
        Scanner sc = new Scanner(System.in);

        while(num>=0){
            System.out.println("Dame un número:");
            num=sc.nextInt();
            count++;
        }
        System.out.println("Se han introducido: "+count+" números.");
    }
    
}
