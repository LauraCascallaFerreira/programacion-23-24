package repaso.examen1B;

import java.util.Scanner;

/*Método que introduzca el peso en Kg de una persona y lo convierta a su cantidad 
equivalente en stones y libras.
1 stone (st) = 14 lb = 6,35 kg
1 libra (lb) = 0,453 g
Método que introduzca el peso en stones y libras y devuelva su cantidad equivalente en 
kilos.*/

public class ejercicio03 {

    public static void convertirAStonesLibras(double kilos){
        double libras=kilos/0.453;
        double stones=kilos/6.35;
        System.out.println("El peso introducido en stones es: "+stones+" y en libras es: "+
        libras);
    }

    public static void convertirAKilos(double stones, double libras){
        double metro1=stones*6.35;
        double metro2=libras*0.453;
        System.out.println("En metros las libras son: "+metro2+" y los stones: "+metro1);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("A que quieres convertir: kilo (a) o stones y libras(b)");
        char conversion=sc.next().charAt(0);

        switch (conversion) {
            case 'a':
                System.out.println("Dame una cantidad en libras:");
                double libras = sc.nextDouble();
                System.out.println("Dame una cantidad en stones:");
                double stones=sc.nextDouble();
                convertirAKilos(stones, libras);
            break;
            case 'b':
                System.out.println("Dame una cantidad en kilos:");
                double kilos=sc.nextDouble();
                convertirAStonesLibras(kilos);
            break;
        
            default:
                System.out.println("Has introducido mal la opción payaso");
            break;
        }
    }
    
}
