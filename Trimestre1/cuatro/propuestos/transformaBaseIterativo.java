package propuestos;

import java.util.Scanner;

public class transformaBaseIterativo {


    public static String transformaIterCBase(int dato, int base){
        String res="";
        int d=dato;
        int b=base;
        do{
            res=(int)(d%b)+res;
            //para añadir posiciones a la cifra
            System.out.println("res: "+res);
            d=d/b;

            if(d<b){
                res=d+res;
                System.err.println("Resultado: "+res);
            }
        } while(b<=d);
        return res;
    }

    public static void muestraCifra(int dato){
        if(dato<10){
            System.out.println(dato);
        } else {
            dato-=10;
            char c = (char) ('A'+dato);
            System.out.println(c);
        }
    }

    public static int transformaIterativo(int dato, int base){
        int res=0;
        int d=dato;
        int b=base;
        int i=0;
        do{
            res+=(int) ((d%b)*Math.pow(b, i)); //para añadir posiciones a la cifra
            d=d/b;
            i++;
            if(d<b)
                res+=(d)*Math.pow(b, i);
        } while (b<=d);

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base, dato;
        System.out.println("Dame la base: ");
        base=sc.nextInt();
        System.out.println("Dame el dato: ");
        dato=sc.nextInt();
        int resultado=transformaIterativo(dato, base);
        System.out.println(resultado);
    }
    
}
