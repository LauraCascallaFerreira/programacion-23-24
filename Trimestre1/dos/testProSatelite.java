public class testProSatelite {
    
    public static void main(String[] args) {
		proSatelite uno = new proSatelite(1, 42.2, 0.5);
		System.out.println(uno.toString());
		uno.setPosicion(1, 42.0, 0.5);
		System.out.println(uno.toString());
		System.out.println(uno.enOrbita());
		
		proSatelite dos = new proSatelite();
		System.out.println(dos.toString());
		
		dos.variaPosicion(20, -15);
		dos.variaAltura(30);
		
		System.out.println(dos);
		
		double altura =  uno.getDistancia_tierra();
		System.out.println("La altura de uno es: "+altura);
	}
}
