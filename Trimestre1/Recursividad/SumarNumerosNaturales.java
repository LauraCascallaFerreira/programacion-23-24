package trimestre1.recursividad;

import java.util.Scanner;

public class SumarNumerosNaturales {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Un numero y te calculo la suma de todos los numeros hasta ese");
		int num = scanner.nextInt();
		
		System.out.println("Numeros naturales suma: " + sumaNumerosNaturales(num));
		
		
	}
	
	public static int sumaNumerosNaturales(int numero) {
		if(numero<1) {
			return 0;
		}
		return numero + sumaNumerosNaturales(numero-1);
		
	}
}
