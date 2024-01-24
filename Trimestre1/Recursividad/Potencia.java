package trimestre1.recursividad;

public class Potencia {
	
	public static void main(String[] args) {
		
		
		
	}
	
	public static int potencia(int base, int exponente) {
	    if (exponente == 0) {
	        return 1;
	    } else {
	        return base * potencia(base, exponente - 1);
	    }
	}

}
