package repaso.examen1B;

import java.util.Scanner;

import repaso.examen1A.cuentaAhorro;

/*Escribe un programa que calcule la cuota final que se debe abonar en un club de tenis. 
La cuota normal es de 800 euros. Tendrán un 40% de descuento las personas mayores de 65 
años y un 25% de descuento los menores de 21 años, si los padres no son socios, y un 45% 
si los padres son socios.*/

public class ejercicio01 {

    final static int cuotaNormal=800;

    public static void descuento (int edad){
        double descuento;
        double total;
        if(edad>65){
            descuento=cuotaNormal*0.4;
            total=cuotaNormal-descuento;
            System.out.println("Descuento del 40%, cuota final: "+total);
        } else if(edad<21){
            String socio="";
            Scanner sc = new Scanner(System.in);
            System.out.println("Tus padres son socios? si(si) o no(no)");
            socio=sc.nextLine();
            if(socio=="si"){
                
            } else if(socio=="no"){
                descuento=cuotaNormal*0.45;
                total=cuotaNormal-descuento;
                System.out.println("Descuento del 45%, cuota final: "+total);
            }
        } else System.out.println("Tu se mantiene como es: "+cuotaNormal);
    }

    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad: ");
        edad=sc.nextInt();
        descuento(edad); 
    }
    
     
    
}
