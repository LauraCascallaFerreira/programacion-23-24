package trimestre1.tres;

import java.util.Scanner;

public class condicionales3 {

    public static double calcularPago(double descuento1, double descuento2, double descuento3){
        double nomina;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la nomina:");
        nomina=sc.nextDouble();
        return (nomina*(1-descuento1)*(1-descuento2))/(1-descuento3);
    }

    public static void main(String[] args) {
        
        char res=' ';
        boolean infraccionGrave=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Productivo(P), Encargado(E), los dos (D), o ninguno(N)");
        res=sc.nextLine().charAt(0);

        //productivo 10% y encargado 20%

        if(res=='P'){
            System.out.println("¿Tienes una infracción grave(true), o no(false?");
            if(infraccionGrave){
                System.out.println(calcularPago(0.1, 0, 0));
            } else System.out.println(calcularPago(0, 0, 0.15));;

        } else if(res=='E'){
            System.out.println("¿Tienes una infracción grave(true), o no(false?");
            if(infraccionGrave){
                System.out.println(calcularPago(0, 0.2, 0));
            } else System.out.println(calcularPago(0, 0, 0.15));;

        } else if(res=='D'){
            System.out.println("¿Tienes una infracción grave(true), o no(false?");
            if(infraccionGrave){
                System.out.println(calcularPago(0.2, 0.1, 0));
            } else System.out.println(calcularPago(0, 0, 0.15));;

        } else if(res=='N'){
            System.out.println("¿Tienes una infracción grave(true), o no(false?");
            if(infraccionGrave){
                System.out.println(calcularPago(0, 0, 0));
            } else System.out.println(calcularPago(0, 0, 0.15));;
        }
    }
    
}
