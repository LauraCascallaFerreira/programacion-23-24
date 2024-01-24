package trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String[] args) {
        
        int num=1;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Dame un número:");
            num=sc.nextInt();
            if(num>=0){
                System.out.println("El número es positivo.");
            } else System.out.println("El número es negativo.");

        } while(num!=0);
    }
    
}
