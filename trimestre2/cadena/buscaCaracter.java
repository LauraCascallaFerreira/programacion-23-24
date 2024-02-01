package trimestre2.cadena;

import java.util.Scanner;

public class buscaCaracter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		//Recogemos la línea de texto
        System.out.println("Escribe una línea de texto cualquiera y pulsa retorno: ");
		String texto = sc.nextLine();
		
		//Recogemos el caracter a buscar
		System.out.println("¿Qué carácter quieres buscar?");
		String charText = sc.next();
		sc.nextLine();
		
		//Variables
		char busca = charText.charAt(0);
		//indexOf es la primera posicion de la cadena de texto
		int posIn = texto.indexOf(busca);
		//la ultima posicion de la cadena de texto
		int posFi = texto.lastIndexOf(busca);

		if (posIn > -1) {
			System.out.println("Las apariciones del carácter " + busca + " son:");
			System.out.println("Primera vez en: " + posIn);
			System.out.println("Última vez en: " + posFi);
		} else {
			System.out.println("Este carácter no se encuentra en el texto.");
		}
    }
}
