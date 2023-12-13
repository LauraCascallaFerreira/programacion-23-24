package repaso.examen1A;

import java.util.Scanner;

/*Dos números amigos son dos números enteros positivos a y b tales que
a es la suma de los divisores de b, y b es la suma de los divisores
de a.
Pedir dos números a y b al usuario y mostrar si son números amigos o no lo son.
Un ejemplo es el par de números (220, 284), ya que: los divisores de
220 son 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 y 110, que suman 284; y los divisores de 284 
son 1, 2, 4, 71 y 142, que suman 220. */
//gemelos
//perfectos

public class ejercicio02 {

    public static void main(String[] args) {
        double num1; double num2; int suma1=0; int suma2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        num1=sc.nextDouble();
        System.out.println("Dame otro número:");
        num2=sc.nextDouble();

        for(int i=1; i<num1; i++){
            if(num1%i==0){
                suma1+=i;
            }
        }
        System.out.println("La suma de los divisores de "+num1+" es: "+suma1);

        for(int i=1; i<num2; i++){
            if(num2%i==0){
                suma2+=i;
            }
        }
        System.out.println("La suma de los divisores de "+num2+" es: "+suma2);

        if(suma2==num1 && suma1==num2){
            System.out.println("Son números amigos.");
        } else System.out.println("No son números amigos.");
        
    }
    
}
