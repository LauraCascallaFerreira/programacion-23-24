package trimestre2.repaso.ArrayList;
/*Añadir elementos a una lista, sacar el tamaño, elminar un elemento */
import java.util.ArrayList;
 
public class repaso01 {
    public static void main(String[] args) {

        ArrayList<String> uno = new ArrayList<>();

        uno.add("Hasta");
        uno.add("luego");
        uno.add("Lucas");

        for(String palabra : uno){
            System.out.println(palabra);
        }

        System.out.println("El tamaño del array es: "+uno.size());

        uno.remove(2);
        
        for(String palabra : uno){
            System.out.println(palabra);
        }
    }
}
