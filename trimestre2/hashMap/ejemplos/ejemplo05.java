package trimestre2.hashMap.ejemplos;

import java.util.HashMap;
import java.util.Scanner;

public class ejemplo05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		HashMap<Integer, String> mapa = new HashMap<Integer, String>();

		mapa.put(924, "Amalia Núñez");
		mapa.put(921, "Cindy Nero");
		mapa.put(700, "César Vázquez");
		mapa.put(219, "Víctor Tilla");
		mapa.put(537, "Alan Brito");
		mapa.put(607, "Esteban Quito");

		System.out.println(mapa.keySet());
		System.out.println("Por favor, introduzca un código: ");
		int code = sc.nextInt();

		if (mapa.containsKey(code)) {
			System.out.println("El código " + code + " corresponde a " + mapa.get(code));
		} else {
			System.out.println("El código introducido no existe.");
		}
		
		System.out.println(mapa.values());
    }
}
