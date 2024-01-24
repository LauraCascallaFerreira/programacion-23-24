package trimestre1.recursividad;

public class ContarDigitos {

	
	public static int contarDigitos(int numero) {
	    if (numero == 0) {
	        return 0;
	    } else {
	        return 1 + contarDigitos(numero / 10);
	    }
	}
	
	
	
}
