import java.util.Scanner;

public class ejercicio02B{
    /*Dos números primos son primos gemelos si su diferencia es igual a 2. Es decir, una 
    pareja de la forma (p, p+2) siendo p un número primo es una pareja de números primos. 
    Por ejemplo, las parejas (3, 5) y (11,13) son dos parejas de primos gemelos. 
    Listar por pantalla todos los números gemelos entre 0 y 1000.*/

    public static boolean esPrimo(int num){
        boolean primo=false;
        if(num%2!=0)
            primo=true;
        else primo=false;
        return primo;
    }

    public static int esMayor(int num1, int num2){
        int mayor=0;
        if(num1>num2)
            mayor=num1;
        else mayor=num2;

        return mayor;
    }

    public static int esMenor(int num1, int num2){
        int menor=0;
        if(num1>num2)
            menor=num2;
        else menor=num1;
        return menor;
    }

    public static boolean esGemelo(int num1, int num2){
        boolean gemelo=false;
        if(esPrimo(num1)==true && esPrimo(num2)==true){
            if(esMayor(num1, num2)-esMenor(num1, num2)==2)
            gemelo=true;
        } else gemelo=false;

        return gemelo;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número.");
        int num1=sc.nextInt();
        System.out.println("Dame otro número.");
        int num2=sc.nextInt();

        System.out.println("Los números "+num1+" y "+num2+" son gemelos? "+esGemelo(num1, num2));
    }
}