package Trimestre1.tres;

import java.util.Scanner;

public class condicionales4 {

    static double nomina;

    public static void calcularPlus(double plus){
        nomina+=nomina+plus;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean castigo=false;
        boolean alto=false;
        boolean encargado=false;

        System.out.println("castigo tru/false");
        castigo=sc.nextBoolean();
        System.out.println("alto true/false");
        alto=sc.nextBoolean();
        encargado=sc.nextBoolean();

        System.out.println("Dime nomina:");
        nomina=sc.nextDouble();

        if(castigo){
            System.out.println("A cobrar"+nomina);
        } else {
            if(alto){
                calcularPlus(0.1);
            }
            if(encargado){
                calcularPlus(0.2);
            }
            System.out.println("A cobrar: "+nomina);
        }
    }
    
}
