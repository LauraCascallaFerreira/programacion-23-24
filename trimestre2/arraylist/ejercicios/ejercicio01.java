package trimestre2.arraylist.ejercicios;

import java.util.ArrayList;
import java.util.Collections;

/* Introducir valores aleatorios entre 0 y 100 en un arraylist
 * Calcular la suma la media el maximo y el minimo de los numeros
 * El tamaño sera aleatorio y podra oscilar entre 10 y 20 elementos
 */

public class ejercicio01 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int n= (int)(10+Math.random()*11);
        
        for(int i=0; i<n; i++){
            int t=(int)(Math.random()*100);
            System.out.println(t);
            numeros.add(t);
        }

        Collections.sort(numeros);
        System.out.println(numeros);

        int suma=0;
        for(int j=0; j<numeros.size(); j++){
            suma+=numeros.get(j);
        }

        System.out.println("numero: "+numeros.size());
        System.out.println("suma: "+suma);
        System.out.println("media: "+suma/numeros.size());
        System.out.println("maximo: "+numeros.get(numeros.size()-1));
        System.out.println("minimo: "+numeros.get(0));
    }
}