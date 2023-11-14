package Trimestre1.tres;

import java.util.Scanner;

public class armstrong3 {

    public static boolean esBrazoFuerte(int num){
        boolean es=false;
        int numero=num;
        int digitos=cuentaDigitos(num);
        int cifra=0;
        int total=0;
        while (digitos > 0) {
            cifra=(int) (num / Math.pow(10, digitos-1) % 10);
            System.out.println("cifra: "+cifra);
            total+=Math.pow(cifra, digitos);
            System.out.println(total);
            num-= cifra*Math.pow(10, digitos-1);
            System.out.println(num);
            digitos--;
        }

        if(numero==total)
            es=true;

        return es;
    }

    //metodo repetitivo
    public static int sumaDigitos(int num) {
        int total=0;
        int digitos = cuentaDigitos(num);
        int cifra=0;
        return total;

    }

    //iterativo
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

        System.out.println("Es armstrong: "+esBrazoFuerte(numero));
    }
    
}
