package trimestre2.arraylist.boletin01;
/*Copiar un arraylist en otro */

import java.util.ArrayList;
import java.util.Collections;

public class ejercicio09 {
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
        ArrayList<String>array2=new ArrayList<String>();

        System.out.println(array);
        System.out.println(array2);

        for(int i=0; i<array.size(); i++){
            array2.add(" ");
        }

        Collections.copy(array2, array);
        System.out.println(array);
        System.out.println(array2);
    }
}
