package trimestre2.hashMap.ejemplos.carta;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*Generar cinco secuencias de cartas de la baraja esañola que sume los puntos segun el
 * juego de la brisca. EL valor de las cartas se debe guardar en hashmap que contendra
 * parejas por figura, valor. La secuencia debe ser una estructura de arraylist que contiene
 * objetos de la clase carta. El valor de las cartas es : as, 11, 
 */
public class ejemplo10 {

    static HashMap<String, Integer> points = new HashMap<String, Integer>();

    static void ponPuntos(){
        points.put("as", 11);
        points.put("tres", 10);
        points.put("rey", 4);
        points.put("caballo", 3);
        points.put("sota", 2);
        points.put("siete", 0);
        points.put("seis", 0);
        points.put("cinco", 0);
        points.put("cuatro", 0);
        points.put("dos", 0);
    }

    static int totalPuntos(ArrayList<Carta> m ){
        ponPuntos();
        int total=0;
        for(Carta c : m){
            total+=points.get(c.getValor());
        }
        return total;
    }

    public static void main(String[] args) {
        ArrayList<Carta> mano = new ArrayList<Carta>();

		Carta carta = new Carta();
		mano.add(carta);

		do {
			Carta c = new Carta();
			if (!mano.contains(c))
				mano.add(c);

		} while (mano.size() < 5);

        Collections.sort(mano);

		for (Carta c : mano)
			System.out.println(c);

        System.out.println("total: "+totalPuntos(mano));
    }
}
