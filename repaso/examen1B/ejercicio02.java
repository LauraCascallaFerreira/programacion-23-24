package repaso.examen1B;

import java.util.Scanner;

/*Introducir dos números por teclado y mostrar si son novios o no.
Con un ejemplo es más fácil de entender. 48 y 75 son números novios
porque: La suma de los divisores de cada número por separado es igual a la suma de esos 
dos números más uno.
Divisores de (m) = Divisores de (n) = m + n + 1.
D (48) = 1 + 2 + 3 + 4 + 6 + 8 + 12 + 16 + 24 + 48 = 124,
D (75) = 1 + 3 + 5 + 15 + 25 + 75 = 124,
Si hacemos => 48 + 75 + 1 = 124*/

public class ejercicio02 {

    public static void main(String[] args) {
        int suma1=0; int suma2=0; int fin=0; double num1=0; double num2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número:");
        num1=sc.nextDouble();
        System.out.println("Dame otro número:");
        num2=sc.nextDouble();

        fin = (int) (num1+num2+1);

        for(int i=1; i<=num1; i++){
            if(num1%i==0){
                suma1+=i;
            }
        }

        for(int i=1; i<=num2; i++){
            if(num2%i==0){
                suma2+=i;
            }
        }

        System.out.println(suma1+" "+suma2);

        if(fin==suma1 && fin==suma2){
            System.out.println("Son números novios");
        } else System.out.println("No son números novios.");

        /*if(count1==count2){
            System.out.println("Son números novios.");
        } else System.out.println("No son números novios");*/
        
    }

    
    
}
