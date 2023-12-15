package Recursividad;

public class ContarDigitos {

	
	public static int contarDigitos(int numero) {
	    if (numero == 0) {
	        return 0;
	    } else {
	        return 1 + contarDigitos(numero / 10);
	    }
	}
	
	
	
}
