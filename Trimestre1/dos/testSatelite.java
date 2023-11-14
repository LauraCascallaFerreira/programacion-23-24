public class testSatelite {
    
    public static void main(String[] args) {
		
		satelite uno = new satelite(1, 42.2, 0.5);
		System.out.println(uno);
		
		double altura =  uno.getDistancia_tierra();
		System.out.println("La altura de uno es: "+altura);
		
	}
}
