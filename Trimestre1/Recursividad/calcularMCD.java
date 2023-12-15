package Recursividad;

public class calcularMCD {
	
	
	
	
	
	
	
	public static int calcularMCD(int a, int b) {
	    if (b == 0) {
	        return a;
	    } else {
	        return calcularMCD(b, a % b);
	    }
	}

}
