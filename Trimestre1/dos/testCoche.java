public class testCoche {

    public static void main(String[] args) {
		
		coche zito = new coche();
		System.out.println(zito);
		
		zito.acelerar(40);
		System.out.println(zito);
		
		zito.frenar(60);
		System.out.println(zito);
		
		coche rayo = new coche(120);
		System.out.println(rayo);
	}
    
}
