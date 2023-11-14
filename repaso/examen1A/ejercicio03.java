package repaso.examen1A;

import java.util.Scanner;

/*Método que introduzca la estatura en cm de una persona y la convierta a su cantidad
 equivalente en pies y pulgadas.
1 pie (ft) = 12 in = 0.3048 m
1 pulgada (in) = 0.0254 m
Método que pida la altura en pies y pulgadas y lo devuelva en centímetros.
5 pies y 10 pulgadas =  = 179cm;
 */

public class ejercicio03 {

    public static void piesPulgadas(double metros){
        double pies, pulgadas;
        pies=metros/0.0254;
        pulgadas=metros/0.3048;
        System.out.println("Los metros son "+pies+" pies y "+pulgadas+" pulgadas.");
    }

    public static void metros(double pies, double pulgadas){
        double metros1, metros2;
        metros1=pies*0.3048;
        metros2=pulgadas*0.0254;
        System.out.println("Los pies son: "+metros1+" metros y las pulgadas son "+metros2+
        " pulgadas.");
    }

    public static void main(String[] args) {
        char metodo;
        Scanner sc = new Scanner(System.in);
        System.out.println("A que quieres convertir a metros(a) o a pies y pulgadas(b):");
        metodo=sc.next().charAt(0);

        switch (metodo){
            case 'a':
                double metros;
                System.out.println("Dame los metros:");
                metros=sc.nextInt();
                piesPulgadas(metros);
            break;
            case 'b':
                double pies, pulgadas;
                System.out.println("Dame la altura en pies:");
                pies=sc.nextDouble();
                System.out.println("Dame la altura en pulgadas: ");
                pulgadas=sc.nextDouble();
                metros(pies, pulgadas);
        }

    }
    
}
