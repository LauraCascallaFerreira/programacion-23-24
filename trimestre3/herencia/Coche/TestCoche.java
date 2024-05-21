package trimestre3.herencia.Coche;

import java.util.Scanner;

public class TestCoche {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Dame el volumen del motor: ");
        int volumen=sc.nextInt();
        /*System.out.println("Dime el color del coche:");
        String color=sc.nextLine();"*/
        System.out.print("Dime la marca del coche:");
        String marca=sc.nextLine();
        System.out.println("Dime el diámetro de las llantas:");
        int diametroRin=sc.nextInt();
        System.out.println("Dime la altura de las llantas: ");
        int altura=sc.nextInt();
        System.out.println("Dime la anchura de las llantas:");
        int anchura=sc.nextInt();
        System.out.print("\nDime el color del coche:");
        String color=sc.nextLine();
        
        
        Coche coche = new Coche(volumen, tipoChasis.INDEPENDIENTE, color, tipoCarroceria.INDEPENDIENTE, marca, diametroRin, altura, anchura);
        System.out.println(coche.toString());

        sc.close();
    }
}
