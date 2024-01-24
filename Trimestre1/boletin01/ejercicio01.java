package trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String[] args) {
        int num=0;
        Scanner sc = new Scanner(System.in);
        while(num>=0){
            System.out.println("Dame un número.");
            num=sc.nextInt();
            int cuadrado=num*num;
            System.out.println("El cuadrado es: "+cuadrado);
        }
    }
    
}
