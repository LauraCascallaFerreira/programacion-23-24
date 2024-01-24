package trimestre1.cuatro.recursos;

import java.util.Scanner;

public class potencial {

    public static int exponente(int base, int exponente){
        int potencia=1;
        for(int i=0; i<exponente; i++){
            potencia*=base;
        }
        return potencia;
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Dame la base: ");
        int base=sc.nextInt();
        System.out.println("Dame la potencia: ");
        int exponente=sc.nextInt();

        System.out.println("La potencia del número es: "+exponente(base, exponente));
    }
}
