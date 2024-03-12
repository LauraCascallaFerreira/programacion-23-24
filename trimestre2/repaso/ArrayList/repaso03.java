package trimestre2.repaso.ArrayList;

import java.util.ArrayList;

/* Introducir valores aleatorios entre 0 y 100 en un arraylist
 * Calcular la suma la media el maximo y el minimo de los numeros
 * El tamaño sera aleatorio y podra oscilar entre 10 y 20 elementos
 */

public class repaso03 {
    public static void main(String[] args) {

        int suma=0;

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        int n= (int)(10+Math.random()*11);
        
        for(int i=0; i<n; i++){
            int t=(int)(Math.random()*100);
            System.out.println(t);
            numeros.add(t);
        }

        for(int i=0; i<numeros.size(); i++){
            suma+=numeros.get(i);
        }

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La media de los números es: "+(suma/numeros.size()));
        System.out.println("Máximo: "+numeros.get(numeros.size()-1));
        System.out.println("Mínimo: "+numeros.get(0));
    }
}
