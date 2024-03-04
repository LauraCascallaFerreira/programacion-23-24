package trimestre2.arraylist.ejemplos;

import java.util.ArrayList;

public class ejemplo02 {
    public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(18);
		a.add(22);
		a.add(-30);
		System.out.println("Nº de elementos: " + a.size());
		System.out.println("El elemento que hay en la posición 1 es " + a.get(1));
	}
}
