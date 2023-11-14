package repaso.examen1A;

import java.util.Scanner;

/*Se desea realizar un pago mediante billetes de curso legal. El programa pedirá la 
cantidad de dólares a pagar y mostrará en pantalla el número de billetes de 100, 50, 20, 
10, 5, 2 y 1 necesarios para realizar el pago. Así mismo devolverá el resto a pagar en 
monedas.*/

public class ejercicio05 {

    public static void main(String[] args) {
        
        double dolares;
        int cien=0;
        int cincuenta=0;
        int veinte=0;
        int diez=0;
        int cinco=0;
        int dos=0;
        int uno=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame el número de dolares:");
        dolares=sc.nextInt();

        while (dolares>=100){
            dolares-=100;
            cien++;
        }

        while (dolares>=50 && dolares<100){
            dolares-=50;
            cincuenta++;
        }

        while (dolares>=20 && dolares<50){
            dolares-=20;
            veinte++;
        }

        while (dolares>=10 && dolares<20){
            dolares-=10;
            diez++;
        }

        while (dolares>=5 && dolares<10){
            dolares-=5;
            cinco++;
        }

        while (dolares>=2 && dolares<5){
            dolares-=2;
            dos++;
        }

        while (dolares>=1 && dolares<2){
            dolares-=1;
            uno++;
        }

        System.out.println("Billetes de 100: "+cien+" billetes de 50: "+cincuenta+
        " billetes de 20: "+veinte+" billetes de 10: "+diez+" billetes de 5: "+cinco+
        " billetes de 2: "+dos+" billetes de 1: "+uno);
    }
}
