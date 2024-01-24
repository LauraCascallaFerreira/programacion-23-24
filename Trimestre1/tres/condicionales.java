package trimestre1.tres;

import java.util.Scanner;

public class condicionales {

    public static double calcularPago(double descuento1, double descuento2){
    double precio;
    Scanner sc = new Scanner(System.in);
    System.out.println("Dime el precio:");
    precio=sc.nextDouble();
    return precio*(1-descuento1)*(1-descuento2);
}

    public static void main(String[] args) {
        
        boolean oro=false;
        boolean club=false;
        boolean joven=false;

        Scanner sc = new Scanner(System.in);
        System.out.println("oro true/false");
        oro=sc.nextBoolean();
        System.out.println("club true/false");
        club=sc.nextBoolean();
        System.out.println("joven true/false");
        joven=sc.nextBoolean();         

       if(oro){

        if(club){
            //O C
            if(joven){
                System.out.println("oro, club, joven");
                System.out.println("NO VIABLE");
            } else {
                System.out.println("oro, club y no joven");
                System.out.println("NO VIABLE");
            }

        } else {
            //O NO C
            if(joven){
                System.out.println("oro, no club, joven");
                System.out.println("Descuento del 15% por oro y del 5% por joven");
                System.out.println("Precio final: "+calcularPago(0.15,0.05));
            } else {
                System.out.println("oro, no club y no joven");
                System.out.println("Descuento del 15% por oro.");
                System.out.println("Precio final: "+calcularPago(0.15,0));
            }
          }

       } else {

         if(club){
            //NO O  C
            if(joven){
                System.out.println("no oro, club, joven");
                System.out.println("Descuento del 5% por club y el mismo por joven.");
                System.out.println("Precio final: "+calcularPago(0.05,0.05));
            } else {
                System.out.println("no oro, club y no joven");
                System.out.println("Descuento del 5% por joven.");
                System.out.println("Precio final: "+calcularPago(0.05,0));
            }
        } else {
            //NO O  NO C
            if(joven){
                System.out.println("no oro, no club, joven");
                System.out.println("NO ES VIABLE");
            } else {
                System.out.println("no oro, no club y no joven");
                System.out.println("No tienes descuentos.");
            }
          }

       }
       
    }
    
}
