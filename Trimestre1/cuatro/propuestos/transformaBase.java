package propuestos;

import java.util.Scanner;

public class transformaBase {

    public static void muestraCifra(int dato){
        if(dato<10){
            System.out.println(dato);
        } else {
            dato-=10;
            char c = (char) ('A'+dato);
            System.out.println(c);
        }
    }

    public static void transforma(int dato, int base){
        if(base>dato){
            muestraCifra(dato);
        } else{
            transforma(dato/base, base);
            muestraCifra(dato%base);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, dato;
        System.out.println("Dame la base: ");
        base=sc.nextInt();
        System.out.println("Dame el dato: ");
        dato=sc.nextInt();
        transforma(dato, base);
    }
}
