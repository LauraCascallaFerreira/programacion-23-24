package trimestre2.hashMap.ejemplos.diccionario;

/*Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras 
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para 
almacenar las parejas de palabras. El programa pedirá una palabra en español y dará 
la correspondiente traducción en inglés */

import java.util.HashMap;
import java.util.Scanner;

public class ejemplo01{

    //	Ejercicio 10
//	Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras (con
//	su correspondiente traducción). Utiliza un objeto de la clase HashMap para almacenar
//	las parejas de palabras. El programa pedirá una palabra en español y dará la
//	correspondiente traducción en inglés.

	static HashMap<String, String> diccionario = new HashMap<String, String>();
	static Scanner sc = new Scanner(System.in);

	static void poblarDiccionario() {
		diccionario.put("ordenador", "computer");
		diccionario.put("gato", "cat");
		diccionario.put("rojo", "red");
		diccionario.put("árbol", "tree");
		diccionario.put("pingüino", "penguin");
		diccionario.put("sol", "sun");
		diccionario.put("agua", "water");
		diccionario.put("viento", "wind");
		diccionario.put("siesta", "siesta");
		diccionario.put("arriba", "up");
		diccionario.put("ratón", "mouse");
		diccionario.put("estadio", "arena");
		diccionario.put("calumnia", "aspersion");
		diccionario.put("aguacate", "avocado");
		diccionario.put("cuerpo", "body");
		diccionario.put("concurso", "contest");
		diccionario.put("cena", "dinner");
		diccionario.put("salida", "exit");
		diccionario.put("lenteja", "lentil");
		diccionario.put("cacerola", "pan");
		diccionario.put("pastel", "pie");
		diccionario.put("membrillo", "quince");
	}

//	Métodos by Breixo
	public static void inglesEspañol() {
		String palabra;
		System.out.println("Dime la palabra: ");
		palabra = sc.nextLine();

		if (diccionario.containsValue(palabra)) {
			for (HashMap.Entry<String, String> a : diccionario.entrySet()) {
				if (a.getValue().equals(palabra)) {
					System.out.println(a.getKey());
				}
			}
		} else {
			System.out.println("El diccionario no conoce esa palabra");
		}
	} // cierre inglesEspañol

	public static void españolIngles() {
		String palabra;
		System.out.println("Dime la palabra: ");
		palabra = sc.nextLine();

		if (diccionario.containsKey(palabra)) {
			System.out.println(diccionario.get(palabra));
		} else {
			System.out.println("El diccionario no conoce esa palabra");
		}
	} // cierre españolIngles

    public static String dimePalabra(){
        poblarDiccionario();
        int dc = (int) (Math.random()*diccionario.size());
        Object [] pal =diccionario.keySet().toArray();
        return (String)pal[dc];
        
    }

	public static void main(String[] args) {

		poblarDiccionario();

		System.out.println("---- TRADUCTOR DE INGLÉS A ESPAÑOL -----");
		inglesEspañol();

		System.out.println("---- TRADUCTOR DE ESPAÑOL A INGLÉS -----");
		españolIngles();

        Scanner sc = new Scanner(System.in);

        int aciertos=0;
        for(int i=0; i<10; i++){
            String trad = dimePalabra();
            System.out.println("Traduce la palabra -->"+trad);
            String string = sc.nextLine();

            if(string.equals(diccionario.get(trad))){
                System.out.println("has acertado");
                aciertos++;
            } else {
                System.out.println("Has fallado");
            }
            System.out.println("Aciertos "+aciertos);
        }

        sc.close();

	} // cierre main
}
