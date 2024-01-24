package trimestre1.tres.propuestos;

import java.util.Scanner;

public class propuesto04 {

    /*5. (Ejercicio de dificultad alta) Se desea conocer el lucky number (número de la 
    suerte) de cualquier persona. El número de la suerte se consigue reduciendo la fecha 
    de nacimiento a un número de un solo dígito. Por ejemplo, la fecha de nacimiento de 
    Emma es la siguiente: 16-08-1973 —► 16+8+1973 = 1997 —► 1+9+9+7=26 —► 2+6 =8. El
    número de la suerte de Emma será el 8. */

    public static int sumaDigitos(int n){
            int n1, n2, n3, n4, total;
            n1=n/1000;
            n2=n/100%10;
            n3=n/10%10;
            n4=n/1%10;
            total=n1+n2+n3+n4;
            return total;
    }

    public static void main(String[] args) {
        
        int day, month, year;
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Día de tu nacimiento:");
        day=sc.nextInt();
        System.out.println("Mes de tu nacimiento:");
        month=sc.nextInt();
        System.out.println("Dime año de nacimiento:");
        year=sc.nextInt();

        int suma=day+month+year;
        int luckyNumber=sumaDigitos(suma);

        while(luckyNumber>9){
            luckyNumber=sumaDigitos(luckyNumber);
        }

        System.out.println("Tú lucky number es: "+luckyNumber);

        /*if(sumaDigitos(luckyNumber)<10){
                    System.out.println("Tu lucky number es: "+sumaDigitos(luckyNumber));
        } else {
            luckyNumber=sumaDigitos(luckyNumber);
            System.out.println("Tu lucky number es: "+luckyNumber);
        }*/
    }
}
