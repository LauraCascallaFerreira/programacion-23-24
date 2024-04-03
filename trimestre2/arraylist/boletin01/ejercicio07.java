package trimestre2.arraylist.boletin01;

import java.util.ArrayList;
import java.util.Scanner;

/*Código Java para buscar un elemento en un array list.*/
public class ejercicio07 {

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

        Scanner sc = new Scanner(System.in);

        ArrayList<String>array=pueblaLista();
        //pedir el elemento a buscar
        System.out.println("Tamaño de la lista: "+array.size());
        System.out.println(array);
        System.out.println("Introduce valor a buscar: ");
        String valor=sc.nextLine();

        System.out.println("Buscando valor "+valor);
        int indice=array.indexOf(valor);
        System.out.println("Encontrado en posicion: "+indice);
        sc.close();
    }
}
