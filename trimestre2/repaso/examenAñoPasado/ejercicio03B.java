package trimestre2.repaso.examenAñoPasado;

import java.util.Scanner;

/*Crea un programa que reciba una cadena de caracteres y la devuelva
invertida con efecto espejo, esto es, se concatena a la palabra
original su inversa, compartiendo la última letra, que hará de
espejo, por lo que la palabra obtenida se lee igual hacia adelante
que hacia atrás.
Por ejemplo, al introducir “teclado” devolverá “tecladodalcet” y al
introducir “goma” devolverá “gomamog” */
public class ejercicio03B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        String palabraEspejo = obtenerPalabraEspejo(palabra);
        
        System.out.println("Palabra con efecto espejo: " + palabraEspejo);

        scanner.close();
    }

    public static String obtenerPalabraEspejo(String palabra) {
        StringBuilder palabraInvertida = new StringBuilder(palabra).reverse();
        String espejo = palabraInvertida.substring(1); // Excluye la primera letra invertida
        return palabra + espejo;
    }
}
