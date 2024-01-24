package trimestre1.tres;

import java.util.Scanner;

public class armstrong2 {

    public static void main(String[] args) {
        int num=0;
        int nCifras=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número.");
        num=sc.nextInt();
        int resultado=num;

        while(resultado>=10){
            resultado=resultado/10;
            nCifras++;
        }

        resultado=0;

        for(int i=nCifras; i>=0; i--){
            resultado+=Math.pow((int)(num/Math.pow(10, i))%10, nCifras+1);
        }

        System.out.println("La suma de sus cifras elevadas a "+(nCifras+1)+" es: "+resultado);
        System.out.println((resultado==num)?"El número introducido es Armstrong!!":"El número no es Armstrong");
    }
    
}
