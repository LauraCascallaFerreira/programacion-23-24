package trimestre2.arrays;

import java.util.Scanner;

public class testTienda {
    public static void main(String[] args) {
        
        tienda tiendita = new tienda("Tienda cuántica", "Pepe", 123456, 5);

        computador computador1 = new computador("Acer", 50, "Intel iCore7", "Windows", 185000);
        System.out.println(computador1);
        computador computador2 = new computador("Toshiba", 80, "Intel iCore5", "Windows", 155000);
        System.out.println(computador2);

        tiendita.anadir(computador1);
        tiendita.anadir(computador2);
        System.out.println(tiendita);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce marca:");
        String marca = sc.next();
        System.out.println("El computador buscar: "+marca+" se encuentra en la posición " +
        tiendita.buscar(marca));

        System.out.println("Eliminando...");
        tiendita.eliminar(marca);
        System.out.println(tiendita);
        sc.close();
    }
}
