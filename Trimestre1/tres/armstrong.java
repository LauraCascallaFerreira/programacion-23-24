package Trimestre1.tres;

import java.util.Scanner;

public class armstrong {

    /*Realiza un método que, dado un número de tres cifras, averigüe si es un número 
    Armstrong. Un número es Armstrong cuando la suma de cada uno de los números que lo 
    componen elevado al número de dígitos de dicho número da como resultado el propio 
    número. Como esta definición es algo compleja, con la siguiente imagen se verá más 
    claro qué es un número Armstrong: */

    //Sacar un public boolean esArmstrong.
    //Luego hacer el mismo programa pero para nº de todas las cifras.

    public static void esArmstrong(int num){
        int cifra1, cifra2, cifra3;
        cifra1=num/10/10;
        System.out.println(cifra1);
        cifra2=(num/10)%10;
        System.out.println(cifra2);
        cifra3=num%10;
        System.out.println(cifra3);
        int suma=(int)(Math.pow(cifra3, 3)+Math.pow(cifra2, 3)+Math.pow(cifra1, 3));
        if(num==suma){
            System.out.println("Es número armstrong");
        } else System.out.println("No es número armstrong");
    }
    public static void main(String[] args) {
        
        int num;
        boolean armstrong=false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número: ");
        num=sc.nextInt();

        esArmstrong(num);
        
        
    }
    
}
