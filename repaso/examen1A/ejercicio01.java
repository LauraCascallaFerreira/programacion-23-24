package repaso.examen1A;

import java.util.Scanner;

/*Los clientes de un gran almacén tendrán ventajas  según estos criterios:  


Si pagan con tarjeta ORO tendrán un 20% de descuento.
Si pagan con tarjeta PLATA tendrán un 10% de descuento.
Si pagan con tarjeta BRONCE tendrán un 5% de descuento.  


Si dichas tarjetas son además de clase STAR, tendrán un 5% de  descuento.  


Los descuentos son acumulables.  


Preguntar al usuario un precio normal y el tipo de tarjeta y  la clase presentar 
por pantalla el descuento y el precio final. */

public class ejercicio01 {

    public static float pedirPrecio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu precio a pagar:");
        float precio=sc.nextFloat();
        return precio;
    }

    public static char pedirDatosTarjeta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("De que tipo es tu tarjeta? Oro (o), plata(p), bronce(c)");
        char tarjeta=sc.next().charAt(0);
        return tarjeta;
    }

    public static char esStar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres clase STAR? SI(s) NO(n)");
        char star=sc.next().charAt(0);
        return star;
    }

    public static void Calculos(){
        pedirPrecio();
        pedirDatosTarjeta();
        switch (pedirDatosTarjeta()){
            case 'o':
                
        }

    }
    
     public static void main(String[] args) {
        pedirPrecio();
        pedirDatosTarjeta();
     }


    
}
