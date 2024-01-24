package trimestre1.tres.propuestos;

import java.util.Random;

public class propuesto07 {

    /*Modifica el programa para que valor esté entre el rango [300-400] y muestre por
     * pantalla si valor es par o impar. */

    public static void main(String[] args) {
        Random rnd = new Random();
        for(int i=0; i<1000; i++){
            int otroValor=rnd.nextInt(300, 401);
            System.out.println(otroValor);
        }
    }
    
}
