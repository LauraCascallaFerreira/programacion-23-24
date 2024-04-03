package trimestre2.arraylist.ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class BlackJack {
    static Scanner sc = new Scanner(System.in);
	public static ArrayList<CartaBlack> cartasEnMesa = new ArrayList<CartaBlack>();
	public static HashMap<String, Integer> valoresCartas = new HashMap<String, Integer>();
	static int puntuacionJugador;
	static int puntuacionBanca;
	
	
	public static void main(String[] args) {
	int menu;
	ponerValores();
	puntuacionJugador = 0;
	puntuacionBanca = 0;
	do {
		menu = menu();
		if(menu!=2) {
			cartasEnMesa.add(cogerCarta());
			puntuacionJugador = calcularValorMesa(puntuacionJugador);
			menu = comprobarJuego(puntuacionJugador);
		}
	}while(menu != 2);
	System.out.println("Has conseguido " + puntuacionJugador + " puntos" + " siendo 21 lo máximo");
	mostrarMesa();
	System.out.println();
	if(puntuacionJugador!=21 || puntuacionJugador>21) {
		System.out.println("Has acabado tu turno, le toca a la banca");	
		juegoBanca();
		if((puntuacionBanca>21&& puntuacionJugador<21) || (puntuacionBanca-21>puntuacionJugador-21)) {
			System.out.println("Le has ganado a la banca");
		}else {
			System.out.println("La banca te ha ganado");
		}
	}
}
	
	


	
	public static void ponerValores() {
		valoresCartas.put("A", 11);
		valoresCartas.put("K", 10);
		valoresCartas.put("Q", 10);
		valoresCartas.put("J", 10);
		valoresCartas.put("diez", 10);
		valoresCartas.put("nueve", 9);
		valoresCartas.put("ocho", 8);
		valoresCartas.put("siete", 7);
		valoresCartas.put("seis", 6);
		valoresCartas.put("cinco", 5);
		valoresCartas.put("cuatro", 4);
		valoresCartas.put("tres", 3);
		valoresCartas.put("dos", 2);
	}
	
	

	public static CartaBlack cogerCarta() {	
		do {
			boolean cartaValida = true;
			CartaBlack carta = new CartaBlack();
			for(CartaBlack a : cartasEnMesa) {
				if(carta.equals(a)) {
					cartaValida = false;
				}
			}
			if(cartaValida)
				System.out.println("Sacaste: " +carta.toString());
				return carta;	
		}while(true);	
	}
	
	public static int calcularValorMesa(int puntos) {
		if(puntos>10) {
			valoresCartas.replace("A", 1);
		}
		int temp = 0;
		for(CartaBlack a : cartasEnMesa) {
			temp += valoresCartas.get(a.getValor());
		}
		return temp;
	}
	
	
	public static int menu() {
		System.out.println("Quieres coger carta?");
		System.out.println("1.Si");
		System.out.println("2.No");
		return sc.nextInt();
	}
	
	public static int comprobarJuego(int puntos) {
		if(puntos>21) {
			System.out.println("Has sobrepasado los 21 puntos con tu mano: " + puntos + " puntos");
			return 2;
		}else if(puntos==21){
			System.out.println("HAS GANADO!!!");
			return 2;
		}else {
			System.out.println("Tienes " + puntos + " puntos");
		}
		return -1;
		
	}
	
	
	public static void mostrarMesa() {
		for(CartaBlack a : cartasEnMesa) {
			System.out.println(a.toString());
		}
	}
	
	public static void juegoBanca() {
		ponerValores();
		cartasEnMesa.removeAll(cartasEnMesa);
		do {
			cartasEnMesa.add(cogerCarta());
			puntuacionBanca = calcularValorMesa(puntuacionBanca);
			comprobarJuego(puntuacionBanca);
		}while(puntuacionBanca<16);
		System.out.println("La banca ha conseguido " + puntuacionBanca + " puntos" + " siendo 21 lo máximo");
		mostrarMesa();
		
		
	}
}
