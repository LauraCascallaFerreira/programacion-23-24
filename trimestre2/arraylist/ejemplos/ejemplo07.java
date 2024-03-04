package trimestre2.arraylist.ejemplos;

import java.util.ArrayList;
import java.util.Collections;

public class ejemplo07 {
    public static void main(String[] args) {
        ArrayList<gato> g = new ArrayList<gato>();

        g.add(new gato("Garfield", "naranja", "europeo"));
        g.add(new gato("Pepito", "gris", "angora"));
        g.add(new gato("Eustaquio","blanco", "manx"));
        g.add(new gato("Ulises", "marrón", "persa"));

        System.out.println("\nDatos de los gatos:\n");
        for(gato gatoAux : g){
            System.out.println(gatoAux+"\n");
        }

        //Comparacion entre dos gatos
        gato g1=g.get(0);
        gato g2=g.get(3);
        System.out.println(g1.compareTo(g2));
        System.out.println(g2.compareTo(g1));

        //ordeno alfabeticamente gracias al compare to
        Collections.sort(g);
        for(gato gatoAux : g){
            System.out.println(gatoAux.toString());
        }

        System.out.println(g1.equals(g2));
        System.out.println(g2.equals(g2));
    }
}
