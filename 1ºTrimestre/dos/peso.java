/*Crea la clase peso, la cual tendrá las siguientes características:
 * Deberá tener un atributo donde se almacene el peso de un objeto en kilogramos.
 * En el constructor se le pasará el peso y la medida en la que se ha tomado (‘Lb’ 
 * para libras, ‘Li’ para lingotes, ‘Oz para onzas, ‘P’ para peniques, ‘K’ para 
 * kilos, ‘G’ para gramos y ‘Q’ para quintales).
 * Deberá de tener los siguientes métodos:
 * getLibras. Devuelve el peso en libras.
 * getLingotes. Devuelve el peso en lingotes.
 * getPeso. Devuelve el peso en la medida que se pase como parámetro (‘Lb’ para 
 * libras, ‘Li’ para lingotes, ‘Oz para onzas, ‘P’ para peniques, ‘K’ para kilos, 
 * ‘G’ para gramos y ‘Q’ para quintales).
 * Para la realización del ejercicio toma como referencia los siguientes datos:
 * 1 Libra = 16 onzas = 453 gramos.
 * 1 Lingote = 32,17 libras = 14,59 kg.
 * 1 Onza = 0,0625 libras = 28,35 gramos.
 * 1 Penique = 0,05 onzas = 1,55 gramos.
 * 1 Quintal =100 libras = 43,3 kg.*/

import java.util.Scanner;

public class peso {
    
    static double peso=0;
	static double libra, lingote, onza, penique, gramo, quintal;
	
	peso(double peso){
		this.peso=peso;
	}
	
	public static void getLibras() {
		libra=peso*453000;
		System.out.println(libra);
	}
	
	public static void getLingotes() {
		lingote=peso*14.59;
		System.out.println(lingote);
	}
	
	public static void conversion() {
		double peso;
		String conversion = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un peso en kilos:");
		peso=sc.nextDouble();
		System.out.println("¿A qué lo quieres convertir? Libras(LB), Lingotes(LI), "
				+ "onzas(OZ), Peniques(P), Kilos(K), Gramos(G), Quintales(Q)");
		
		switch(conversion) {
		
		case "LB":
			getLibras();
		break;
		case "LI":
			getLingotes();
		break;
		case "OZ":
			//2850
			onza=peso*28350;
			System.out.println(onza);
		break;
		case "P"://1550
			penique=peso*1550;
			System.out.println(penique);
		break;
		case"K":
			System.out.println(peso);
		break;
		case"G":
			gramo=peso/1000;
		break;
		case "Q":
			quintal=peso*43.3;
			System.out.println(quintal);
		break;
		}
	}
	
	public static void main(String[] args) {
		
		conversion();
	}
}
