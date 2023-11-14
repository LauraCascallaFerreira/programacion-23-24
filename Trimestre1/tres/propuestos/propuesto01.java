package Trimestre1.tres.propuestos;

import java.util.Scanner;

public class propuesto01 {

    /*1. Realiza un programa con tres variables de tipo entero a, b y c. El 
        programa deberá mostrar por pantalla el valor menor y mayor. */

    public static void esMayor(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1+" es el nº mayor.");
        } else {
            if(num2>num3 && num2>num3){
                System.out.println(num2+" es el nº mayor.");
            } else {
                if(num3>num1 && num3>num2){
                    System.out.println(num3+" es el nº mayor.");
                } else {
                    System.out.println("Hay dos nº mayores iguales.");
                }
            } 
        } 
    }

    public static void esMenor(int num1, int num2, int num3){
        if(num1<num2 && num1<num3){
            System.out.println(num1+" es el nº menor.");
        } else{
            if(num2<num1 && num2<num3){
                System.out.println(num2+" es el nº menor");
            } else {
                if(num3<num1 && num3<num2){
                    System.out.println(num3+" es el nº menor.");
                } else {
                    System.out.println("Hay dos números menores iguales.");
                }
            }
        }
    }
    
    public static void main(String[] args) {
        
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un nº");
        num1=sc.nextInt();
        System.out.println("Dame otro nº");
        num2=sc.nextInt();
        System.out.println("Dame un tercer nº");
        num3=sc.nextInt();

        esMayor(num1, num2, num3);
        esMenor(num1, num2, num3);
    }
}
