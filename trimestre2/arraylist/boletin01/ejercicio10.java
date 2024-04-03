package trimestre2.arraylist.boletin01;

import java.util.ArrayList;
import java.util.Collections;

/*10. Código Java para mover entre si los elementos de un array list. */
public class ejercicio10 {

    public static ArrayList<String> pueblaLista(){
        ArrayList<String> numeros = new ArrayList<String>();
        numeros.add("uno");
        numeros.add("dos");
        numeros.add("tres");
        numeros.add("cuatro");
        numeros.add("cinco");
        numeros.add("seis");
        numeros.add("siete");
        numeros.add("ocho");
        numeros.add("nueve");
        numeros.add("diez");
        numeros.add("once");
        return numeros;
    }

    public static void main(String[] args) {
        ArrayList<String>array=pueblaLista();
        ArrayList<String>array2=pueblaLista();
        System.out.println(array);

        Collections.swap(array, 0, 4);
        System.out.println("Cambiar posiciones:");
        System.out.println(array);
        System.out.println("Invertir el orden:");
        Collections.reverse(array);
        System.out.println("Comparar dos arrays:");
        System.out.println(array.equals(array2));
        
    }
}
