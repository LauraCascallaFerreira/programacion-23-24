package trimestre2.repaso;

import java.util.Scanner;

/*Hacer un programa que calcula las raices de una ecuacion cuadratica */

public class cuadraticaEcuacion {
    
    public static void main(String[] args) {
        double disc=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una a: ");
        double a=sc.nextDouble();
        System.out.println("Dame una b: ");
        double b=sc.nextDouble();
        System.out.println("Dame una c: ");
        double c=sc.nextDouble();
        System.out.println("La ecuación es: "+a+"x2 + "+b+"x + "+c+" = 0 ");

        disc=Math.pow(b, 2)-4*a*c;
        System.err.println("El disc es: "+disc);

        if(disc>0){
            System.out.println("Hay dos soluciones:");
            double solucion01=(-b+Math.sqrt(disc))/(2*a);
            double solucion02=(-b-Math.sqrt(disc))/(2*a);
            System.out.println("Solución 1: "+solucion01);
            System.out.println("Solución 2: "+solucion02);
        } else if(disc==0){
            double solucion=-b/(2*a);
            System.out.println("Hay una solución "+solucion);
        } else {
            System.out.println("No tiene solución.");
        }
    }
}
