package trimestre2.hashMap.ejemplos.carta;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo08 {
    /*
	 * Reliza un programa que escoja al azar 10 cartas de la baraja española (10
	 * objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
	 * almacenarlas y asegurate de que no se repita ninguna
	 */
	
	public static void main(String[] args) {

		ArrayList<Carta> mano = new ArrayList<Carta>();

		Carta carta = new Carta();
		mano.add(carta);

		do {
			Carta c = new Carta();
			if (!mano.contains(c))
				mano.add(c);

		} while (mano.size() < 10);
		
		Collections.sort(mano);

		System.out.println("\n------Tu partida de tute------");
		System.out.println();

		for (Carta c : mano)
			System.out.println(c);
		
		System.out.println();
		System.out.println("\n------------------------------");
	}
}
