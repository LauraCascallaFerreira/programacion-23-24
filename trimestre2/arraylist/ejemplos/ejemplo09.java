package trimestre2.arraylist.ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo09 {
    public static void main(String[] args) {

        ArrayList<gato> g = new ArrayList<gato>();

        g.add(new gato("Garfield", "naranja", "europeo"));
        g.add(new gato("Pepito", "gris", "angora"));
        g.add(new gato("Eustaquio","blanco", "manx"));
        g.add(new gato("Ulises", "marrón", "persa"));
        g.add(new gato("Adán", "negro", "angora"));

        Collections.sort(g);

        System.out.println("\nDatos de los gatos ordenados por nombre:");
        for(gato gatoAux : g){
            System.out.println(gatoAux.toString());
        }

        gato uno=g.get(1);
        gato dos=g.get(4);
        System.out.println(uno.compareTo(dos));
        System.out.println(uno.equals(dos));
    }
}
