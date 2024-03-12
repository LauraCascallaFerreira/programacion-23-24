package trimestre2.hashMap.ejemplos;

import java.util.HashMap;
import java.util.Scanner;

public class ejemplo04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> mapa = new HashMap<Integer, String>();

        mapa.put(924, "Amalia Nuñez");
        mapa.put(33, "Alejandro Blanco");
        mapa.put(185, "Maria Troncoso");
        mapa.put(24, "Laura Cascallana");
        mapa.put(389, "Gabriel Pazos");

        System.out.println("Por favor, introduzca un código");
        int code=sc.nextInt();

        if(mapa.containsKey(code)){
            System.out.println("El codigo "+code+" corresponde a:");
            System.out.println(mapa.get(code));
        } else {
            System.out.println("El código introducido no existe");
        }
        
        sc.close();
    }
}
