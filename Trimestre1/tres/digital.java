package trimestre1.tres;

import java.util.Scanner;

public class digital {

    // public static int sumDigitos(int numero) {
    //     int cifra1, cifra2, cifra3, cifra4;
    //     cifra1 = numero/1000;
    //     cifra2 = (numero-1000*cifra1)/100;
    //     cifra3 = (numero -1000*cifra1 - 100*cifra2)/10;
    //     cifra4 = numero -1000 * cifra1 - 100*cifra2- 10*cifra3;

    //     int suma = cifra1+cifra2+cifra3+cifra4;

    //     return suma;
    // }

    //metodo repetitivo
    public static int sumaDigitos(int num) {
        int total=0;
        int digitos = cuentaDigitos(num);
        int cifra=0;

        while (digitos > 0) {
            cifra=(int) (num / Math.pow(10, digitos-1) % 10);
            System.out.println("cifra: "+cifra);
            total+=num / Math.pow(10, digitos-1) % 10;
            System.out.println(total);
            num-= cifra*Math.pow(10, digitos-1);
            System.out.println(num);
            digitos--;
        }
        return total;

    }

    public static int invierteNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }

    //Cuenta digitos iterativo
    public static int cuentaDigitos(int numero) {
        int aux=0;//auxiliar
        // System.out.println(numero);

        if (numero == 0) {
            return 1;
        }else{

        }

        while (numero>0) {
            numero/=10;
            // System.out.println(numero);
            aux++;
            // System.out.println("aux: "+aux);
        }
        return aux;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un numero: ");
        int numero = sc.nextInt();
        int resultadoDigitos = cuentaDigitos(numero);        
        System.out.println("Tiene digitos: "+resultadoDigitos);
        System.out.println("--------------------");

        int total = sumaDigitos(numero);
        System.out.println("Suma digitos: "+total);
        System.out.println("-----------------------");

        int numero1;
        System.out.println("Dame un numero para invertir: ");
        numero1 = sc.nextInt();
        int invertido = invierteNumero(numero1);
        System.out.println("El número " + numero1 + " invertido es " + invertido);
    }
    
}
