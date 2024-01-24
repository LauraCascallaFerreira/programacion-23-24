package trimestre1.dos;
public class testCoche2 {
    public static void main(String[] args) {
		
		coche2 zito = new coche2();
		System.out.println(zito);
		
		zito.acelerar(40);
		System.out.println(zito);
		
		zito.frenar(60);
		System.out.println(zito);
		
		coche2 rayo = new coche2(120, "Chevrolet Corvette", "C6");
		System.out.println(rayo);
		rayo.acelerar(100);
		System.out.println(rayo);
	}
}
