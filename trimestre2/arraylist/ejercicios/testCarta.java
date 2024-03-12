package trimestre2.arraylist.ejercicios;
/*Escoger al azar 10 cartas de la baraja. Emplear arraylist para almacenar sin repetir */

import java.util.ArrayList;
import java.util.Collections;

public class testCarta {

    public static void main(String[] args) {
        ArrayList<carta> mano = new ArrayList<carta>();
        carta carta = new carta();
        mano.add(carta);

        do{
            carta c = new carta();
            if(!mano.contains(c))
                mano.add(c);

        } while(mano.size()<10);

        Collections.sort(mano);

        System.out.println("tu partida del tute: ");
        for(carta c : mano)
            System.out.println(c);
    }
}
