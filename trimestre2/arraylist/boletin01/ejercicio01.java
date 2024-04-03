package trimestre2.arraylist.boletin01;
/*Código Java para crear un nuevo array list, añadir algunos colores
(string) e imprimir la colección. */

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio01 {
    /**
	 * Código Java para crear un nuevo array list, añadir algunos colores (string) e
	 * imprimir la colección.
	 */

	private final static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		ArrayList<String> colores = new ArrayList<String>();

		String value = "";
		System.out.println("Introduzca colores (0 para salir): ");

		while (!value.equals("0")) {
			value = sc.next();
			if (!value.equals("0")) {
				colores.add(value);
				System.out.println("Añadido: " + value);
			}
		}

		for (int i = 0; i < colores.size(); i++) {
			System.out.println("Color " + (i + 1) + ": " + colores.get(i));
		}
	}
}
