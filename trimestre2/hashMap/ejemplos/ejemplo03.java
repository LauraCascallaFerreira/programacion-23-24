package trimestre2.hashMap.ejemplos;

import java.util.HashMap;
import java.util.Map;

public class ejemplo03 {
    public static void main(String[] args) {
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();

        mapa.put(924, "Amalia Nuñez");
        mapa.put(33, "Alejandro Blanco");
        mapa.put(185, "Maria Troncoso");
        mapa.put(24, "Laura Cascallana");
        mapa.put(389, "Gabriel Pazos");

        System.out.println("Todas las entradas del diccionario extraidas con entrySet:");
        System.out.println(mapa.entrySet());

        System.out.println("\nEntradas del diccionario extraídas una a una:");
        for(Map.Entry pareja : mapa.entrySet()){
            System.out.println("Esta entrada del set es: "+pareja);
        }
    }
}
