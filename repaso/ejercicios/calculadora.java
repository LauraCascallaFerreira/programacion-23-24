package repaso.ejercicios;

import java.util.Scanner;

/*Calculadora básica: Crea un programa que realice operaciones simples como suma, resta, 
multiplicación y división. */

public class calculadora {

    public static int suma(int n1, int n2){
        return n1+n2;
    }

    public static int resta(int n1, int n2){
        return n1-n2;
    }

    public static int multiplicacion(int n1, int n2){
        return n1*n2;
    }

    public static double division(int n1, int n2){
        return n1/n2;
    }
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Dame un número: ");
        int n1=sc.nextInt();
        System.out.println("Dame otro número: ");
        int n2=sc.nextInt();

        System.out.println("¿Qué operación quieres realizar?");
        System.out.println("Sumar(a), restar(b), multiplicar(c), dividir(d)");
        char calculo=sc.next().charAt(0);

        switch (calculo){
            case 'a':
                System.out.println(suma(n1, n2));
            break;
            case 'b':
                System.out.println(resta(n1, n2));
            break;
            case 'c':
                System.out.println(multiplicacion(n1, n2));
            break;
            case 'd':
                System.out.println(division(n1, n2));
            break;
            default:
                System.out.println("Has introducido una opción incorrecta.");
        }
    }
}
