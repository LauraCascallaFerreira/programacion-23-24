package trimestre2.hashMap.ejemplos;

import java.util.HashMap;

public class ejemplo01 {
    public static void main(String[] args) {

        HashMap<Integer, String> mapa = new HashMap<>();

        mapa.put(924, "Amalia Nuñez");
        mapa.put(33, "Alejandro Blanco");
        mapa.put(185, "Maria Troncoso");
        mapa.put(24, "Laura Cascallana");
        mapa.put(389, "Gabriel Pazos");

        System.out.println("Los elementos del mapa son: \n"+mapa);
    }
}
