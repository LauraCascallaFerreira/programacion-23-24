package trimestre1.boletin01;

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String[] args) {
        int num=0; int suma=0; int count=0; double media=0;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("Dame un número: ");
            num=sc.nextInt();
            suma+=num;
            count++;

        } while(num>=0);

        media=(double) (suma/count);
        System.out.println("La media de los números es: "+media);
    }
    
}
