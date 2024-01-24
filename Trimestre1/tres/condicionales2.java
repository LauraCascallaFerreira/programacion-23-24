package trimestre1.tres;

import java.util.Scanner;

public class condicionales2 {

    public static double calcularPago(double descuento1, double descuento2){
    double precio;
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el precio:");
    precio=sc.nextDouble();
    return precio*(1-descuento1)*(1-descuento2);
    }

    public static void main(String[] args) {
        
        char res=' ';
        boolean joven=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("oro(O), club(C), ninguna(N)");
        res=sc.nextLine().charAt(0);       


        if(res=='O'){
            System.out.println("joven true/false");
            joven=sc.nextBoolean(); 
            if(joven){
                System.out.println("Precio final: "+calcularPago(0.15, 0.05));
            } else {
                System.out.println("Precio final: "+calcularPago(0.015, 0));
            }

        } else if(res=='C'){
            System.out.println("joven true/false");
            joven=sc.nextBoolean(); 
            if(joven){
                System.out.println("Precio final: "+calcularPago(0.05, 0.05));
            } else {
                System.out.println("Precio final: "+calcularPago(0.05, 0));
            }
        } else {
            System.out.println("Precio final: "+calcularPago(0, 0));
        }

    }
    
}
