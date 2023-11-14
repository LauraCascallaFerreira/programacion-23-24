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

    public static void main(String[] args) {
        char tarjeta, star;
        Scanner sc = new Scanner(System.in);
        System.out.println("De qué es tu tarjeta: oro(o), plata(p) o bronce(b)");
        tarjeta=sc.next().charAt(0);
        System.out.println("Es tarjeta star: si(s) o no(n)");
        star=sc.next().charAt(0);

        if(tarjeta=='o'){
            if(star=='s'){
                System.out.println("Tu descuento es del 25%");
            } else System.out.println("Tu descuento es del 20%.");
        } else if (tarjeta=='p'){
            if(star=='s'){
                System.out.println("Tu descuento es del 15%");
            } else System.out.println("Tu descuento es del 10%.");
        } else if(tarjeta=='b'){
            if(star=='s'){
                System.out.println("Tu descuento es del 10%");
            } else System.out.println("Tu descuento es del 5%.");
        }

    }


    
}
