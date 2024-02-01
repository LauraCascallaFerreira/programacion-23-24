package trimestre2.cadena;

import java.util.Scanner;

public class adivinaPalabra {
    // La palabra para adivinar es "java".
    public static final String PALABRA_SECRETA = generaPalabra();

    public static String generaPalabra() {
        //generamos cinco caracteres random
        String palabra = "";
        for(int j=0; j<4; j++) {
            char random = (char) (97 + Math.random()*26);
            palabra+=random;
        }
        return palabra;
    }

    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Empezamos el juego.");
        System.out.println ("Adivina la palabra: ");
        int veces = 0;

        boolean correcto = false;
        while (!correcto && veces<=10) {
            //vamos aumentando el contador
            veces++;
            //vamos mostrando los intentos que le quedan
            System.out.println("Te quedan "+(10-veces)+" intentos");
            //recogemos la palabra que escribe
            System.out.print ("¿Qué palabra crees que es?");
            String palabra = sc.next();
            sc.nextLine();
            //comparamos la palabra escrita con la generada
            int comp = palabra.compareTo(PALABRA_SECRETA);
            if (comp <0) {// La palabra del usuario es anterior a la secreta.
                System.out.println("Has fallado! La palabra va después alfabeticamente");
            } else if (comp> 0) {
                // La palabra del usuario es posterior a la secreta
                System.out.println ("Has fallado! La palabra va antes alfabeticamente");
            } else {
                // Si vale 0, es que se ha acertado.
            correcto = true;
            }
            veces++;
            System.out.println("Te queda "+(10-veces)+" intentos.");
        }

        if(correcto)
            System.out.println("Enhorabuena has acertado en "+veces+" intentos.");
        else 
            System.out.println("Has agotado los intentos. HAS PERDIDO");
    }
}
