package trimestre2.arraylist.ejemplos;

import java.util.ArrayList;

public class ejemplo05 {
    public static void main(String[] args) {

		ArrayList<String> a = new ArrayList<String>();

		a.add("rojo");
		a.add("verde");
		a.add("azul");
		a.add("blanco");
		a.add("amarillo");

		System.out.println("Contenido de la lista: ");

		for (String color : a)
			System.out.println(color);

		a.set(2, "turquesa");

		System.out.println("Contenido de la lista después de machacar la posición 2: ");
        
		for (String color : a) {
			System.out.println(color);
		}
	}
}
