package trimestre1.tres.propuestos;

import java.util.Scanner;

public class propuesto09 {

    /*9. (Ejercicio de dificultad alta) Realiza una clase minumero con un método esOmirp 
    que diga si un número es Omirp o no. Un número es Omirp si es un número primo y, 
    además, al invertir sus dígitos da otro número primo. Por ejemplo: 7951 y 1597.*/
    
    public static void esOmirp(int num){
        if(num%2!=0){
            int numeroInvertido = 0;
            while(num > 0) {
                int digito = num % 10;
                numeroInvertido = numeroInvertido * 10 + digito;
                num /= 10;
            } System.out.println("Es Omirp.");
        } else System.out.println("No es Omirp");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        int num = sc.nextInt();
        esOmirp(num);
    }
}
