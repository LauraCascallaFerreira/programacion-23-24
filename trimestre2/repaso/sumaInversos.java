package trimestre2.repaso;

import java.util.Scanner;

public class sumaInversos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un entero: ");
        double n=sc.nextDouble();

        double suma=0;
        int i=1;

        while(i<=n){
            suma+=(1/i);
            i++;
        }
        System.out.println("La suma de los inversos es: "+suma);
    }
}
