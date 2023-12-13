package sucesion;

import java.util.Scanner;

public class aritmetica {

    //una sucesion de numeros donde se va sumando o restando el mismo numero
    //progresivamente

    public static void main(String[] args) {

        int inicial, razon, termino, tope;

        Scanner sc = new Scanner(System.in);
        System.out.println("Término inicial: ");
        inicial=sc.nextInt();

        System.out.println("Razón:");
        razon=sc.nextInt();

        System.out.println("Cuantos términos quieres mostrar?");
        tope=sc.nextInt();

        for(int i=inicial; i<=tope; i++){
            termino=inicial+i*razon;
            System.out.println(termino);
        }
    }
}
