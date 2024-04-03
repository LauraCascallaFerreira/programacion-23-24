package trimestre2.repaso.examenAñoPasado;

import java.util.HashSet;
import java.util.Scanner;

public class ejercicio04B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un texto.");
        String texto = sc.nextLine();

        HashSet<Character> alfabeto = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alfabeto.add(c);
        }

        for (int i = 0; i < texto.length(); i++) {
            char letra = Character.toLowerCase(texto.charAt(i));
            if (Character.isLetter(letra)) {
                alfabeto.remove(letra);
            }
        }

        System.out.println("Las letras que no han aparecido en el texto son:");
        if (alfabeto.isEmpty()) {
            System.out.println("Todas las letras del alfabeto han aparecido en el texto.");
        } else {
            for (char letra : alfabeto) {
                System.out.print(letra + " ");
            }
        }

        sc.close();
    }
}

