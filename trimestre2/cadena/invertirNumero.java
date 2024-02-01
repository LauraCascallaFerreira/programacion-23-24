package trimestre2.cadena;

import java.util.Scanner;

import trimestre2.repaso.sumaInversos;

public class invertirNumero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Recoger un número
        System.out.println("Dame un número entero: ");
        int numero=sc.nextInt();

        
        String cadena=String.valueOf(numero);
        System.out.println(cadena);
        StringBuilder sb = new StringBuilder(cadena);
        String reverse = sb.reverse().toString();
        System.out.println(reverse);

        int invertido = Integer.parseInt(reverse);
        System.out.println(invertido);
        System.out.println(invertido + 1000);
    }
}
