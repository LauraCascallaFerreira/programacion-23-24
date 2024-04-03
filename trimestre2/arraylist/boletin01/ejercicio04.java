package trimestre2.arraylist.boletin01;

import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio04 {

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

        System.out.println("Tamaño de la lista: "+array.size());
        System.out.println("Introduce indice: ");
        int indice=sc.nextInt();

        String valor=array.get(indice/*valor a obtener*/);
        System.out.println(valor);

        sc.close();
    }
}