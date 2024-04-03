package trimestre2.arraylist.boletin01;

import java.util.ArrayList;

public class ejercicio03 {

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
        ArrayList<String>array=pueblaLista();//ArrayList ejemplo
        array.add(0,"ceeeero");//Valor a insertar en primera posicion
        System.out.println(array);
    }
}
