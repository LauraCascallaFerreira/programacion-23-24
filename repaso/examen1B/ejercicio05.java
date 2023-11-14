package repaso.examen1B;

import java.util.Scanner;

/*Se desea realizar un pago mediante billetes de curso legal. El programa pedirá la 
cantidad de pesetas a pagar y mostrará en pantalla el número de billetes de 10000, 5000, 
2000, 1000, 500, 200 y 100 necesarios para realizar el pago. Así mismo devolverá el resto 
a pagar en monedas. */

public class ejercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir la cantidad de pesetas a pagar
        System.out.print("Ingrese la cantidad de pesetas a pagar: ");
        int cantidadPesetas = scanner.nextInt();

        // Inicializar los valores de los billetes y el resto
        int billetes10000 = 0;
        int billetes5000 = 0;
        int billetes2000 = 0;
        int billetes1000 = 0;
        int billetes500 = 0;
        int billetes200 = 0;
        int billetes100 = 0;

        // Calcular el número de billetes de 10000
        while (cantidadPesetas >= 10000) {
            billetes10000++;
            cantidadPesetas -= 10000;
        }

        // Calcular el número de billetes de 5000
        while (cantidadPesetas >= 5000) {
            billetes5000++;
            cantidadPesetas -= 5000;
        }

        // Calcular el número de billetes de 2000
        while (cantidadPesetas >= 2000) {
            billetes2000++;
            cantidadPesetas -= 2000;
        }

        // Calcular el número de billetes de 1000
        while (cantidadPesetas >= 1000) {
            billetes1000++;
            cantidadPesetas -= 1000;
        }

        // Calcular el número de billetes de 500
        while (cantidadPesetas >= 500) {
            billetes500++;
            cantidadPesetas -= 500;
        }

        // Calcular el número de billetes de 200
        while (cantidadPesetas >= 200) {
            billetes200++;
            cantidadPesetas -= 200;
        }

        // Calcular el número de billetes de 100
        while (cantidadPesetas >= 100) {
            billetes100++;
            cantidadPesetas -= 100;
        }

        // Mostrar los resultados
        System.out.println("Billetes de 10000: " + billetes10000);
        System.out.println("Billetes de 5000: " + billetes5000);
        System.out.println("Billetes de 2000: " + billetes2000);
        System.out.println("Billetes de 1000: " + billetes1000);
        System.out.println("Billetes de 500: " + billetes500);
        System.out.println("Billetes de 200: " + billetes200);
        System.out.println("Billetes de 100: " + billetes100);
        System.out.println("Resto a pagar en monedas: " + cantidadPesetas);
    }
}
 
    
    

