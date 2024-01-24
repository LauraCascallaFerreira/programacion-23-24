package trimestre1.pruebas;

import java.util.Scanner;

public class LauraCascallanaFerreira_ejercicio2A {

    //1 partido de tenis 6 sets
    //para ganar un set el jugador tiene que ganar 6 juegos 
    //si estan empatados a 5 se seguira a 7
    //si estan empatados a 6, el proximo que marque será el ganador

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame los juegos ganados del primer jugador: ");
        int primero=sc.nextInt();
        System.out.println("Dame los juegos ganados del segundo jugador: ");
        int segundo=sc.nextInt();

        if (primero >= 6 && primero - segundo >= 2) {
            System.out.println("Ha ganado el primer jugador.");
        } else if (segundo >= 6 && segundo - primero >= 2) {
            System.out.println("Ha ganado el segundo jugador.");
        } else if(primero>7&&segundo>7){
            System.out.println("Algo ha ido mal en el número de sets");
        } else System.out.println("Nadie ha ganado todavia.");
    }
    
}
