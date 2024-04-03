package trimestre2.repaso.examenAñoPasado;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio04A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase: ");
        String texto = sc.nextLine();

        HashMap<Character, Integer> frecuenciaLetras = new HashMap<>();

        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (Character.isLetter(letra)) {
                letra = Character.toLowerCase(letra);
                frecuenciaLetras.put(letra, frecuenciaLetras.getOrDefault(letra, 0) + 1);
            }
        }

        int max1 = 0, max2 = 0, max3 = 0;
        char letra1 = ' ', letra2 = ' ', letra3 = ' ';

        for (char letra : frecuenciaLetras.keySet()) {
            int frecuencia = frecuenciaLetras.get(letra);
            if (frecuencia > max1) {
                max3 = max2;
                letra3 = letra2;
                max2 = max1;
                letra2 = letra1;
                max1 = frecuencia;
                letra1 = letra;
            } else if (frecuencia > max2) {
                max3 = max2;
                letra3 = letra2;
                max2 = frecuencia;
                letra2 = letra;
            } else if (frecuencia > max3) {
                max3 = frecuencia;
                letra3 = letra;
            }
        }

        System.out.println("Las tres letras que más se repiten son:");
        System.out.println(letra1 + " - " + max1 + " veces");
        System.out.println(letra2 + " - " + max2 + " veces");
        System.out.println(letra3 + " - " + max3 + " veces");

        sc.close();
    }
}
