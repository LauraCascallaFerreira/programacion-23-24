package trimestre2.repaso;

import java.util.Scanner;

public class IMC {

    /* pide altura y peso y calcula el imc
     * luego calcula si esta en la media o como está
     */

    public static void comoEstas (double IMC){
        if (IMC < 16) {
            System.out.println("La persona tiene delgadez severa.");
        } else if (IMC < 17) {
            System.out.println("La persona tiene delgadez moderada.");
        } else if (IMC < 18.5) {
            System.out.println("La persona tiene delgadez leve.");
        } else if (IMC < 25) {
            System.out.println("La persona tiene peso normal.");
        } else if (IMC < 30) {
            System.out.println("La persona tiene sobrepeso.");
        } else if (IMC < 35) {
            System.out.println("La persona tiene obesidad leve.");
        } else if (IMC < 40) {
            System.out.println("La persona tiene obesidad media.");
        } else {
            System.out.println("La persona tiene obesidad mórbida.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu masa en kilos: ");
        double masa=sc.nextDouble();
        System.out.println("Dame tu altura en metros: ");
        double altura=sc.nextDouble();
        double IMC = masa/Math.pow(altura, 2);
        System.out.println("Su IMC es: "+IMC);

        comoEstas(IMC);
    }
    
}
