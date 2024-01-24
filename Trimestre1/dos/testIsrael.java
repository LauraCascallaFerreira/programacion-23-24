package trimestre1.dos;
public class testIsrael {

    public static void main(String[] args) {
		
		System.out.println("Restaurante israel.");
		israel palestina = new israel(5, 2);
		System.out.println(palestina.toString());
		
		System.out.println("Servicio de comidas.");
		System.out.println("Comensales: "+palestina.getComensales());
		System.out.println("Fin comidas almacén.");
		System.out.println(palestina.toString());
		
		System.out.println("Ir a la compra.");
		palestina.irMercado(10, 6);
		System.out.println("Después de la compra.");
		System.out.println(palestina.toString());
		
		System.out.println("Mañana más.");
	}
    
}
