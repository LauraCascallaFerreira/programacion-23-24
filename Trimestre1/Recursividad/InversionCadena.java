package Recursividad;

import java.util.Scanner;

public class InversionCadena {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	
		String cadena = scanner.next();
		scanner.nextLine();
		System.out.println("Cadena invertida: " + inversionCadena(cadena));
		
		
	}
	
	public static String inversionCadena(String cadena) {
		 if (cadena.isEmpty()) {
		        return cadena;
		    } else {
		        return inversionCadena(cadena.substring(1)) + cadena.charAt(0);
		    }
	}

}
