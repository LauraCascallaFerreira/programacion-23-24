package trimestre2.hashMap.ejemplos.carta;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo09 {
    /*
	 * Modifica e programa anterior de tal forma que las cartas se muestren
	 * ordenadas.Primero se ordenrara coincida el palo, se ordenará por número: as
	 * 2, 3, 4, 5, 6, 7, sota, caballo, rey.
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
