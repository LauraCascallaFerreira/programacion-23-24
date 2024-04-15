package trimestre3.herencia.TiendaAnimales;

import java.util.ArrayList;

import trimestre3.herencia.TiendaAnimales.Gato_Pelo_Corto.tiposCorto;
import trimestre3.herencia.TiendaAnimales.Gato_Pelo_Largo.tiposLargo;
import trimestre3.herencia.TiendaAnimales.Gato_Sin_Pelo.tiposSinPelo;
import trimestre3.herencia.TiendaAnimales.Mascota.colores;
import trimestre3.herencia.TiendaAnimales.Perro_Grande.tipos;
import trimestre3.herencia.TiendaAnimales.Perro_Mediano.tiposMediano;
import trimestre3.herencia.TiendaAnimales.Perro_Pequeño.tiposPequeño;

public class testMascotas {

    /* PAGAR IMPUESTOS MUNICIPALES 
     * implementar un sistema de pago de chips de vigo
	 * mascota y sacar carnet mascota: 50€
	 * todos los perros: 100€por chip; los gatos 75€ por chip
	 * vacuna perros grandes: 150€ ; perro mediano 125€; perrro pequeño 100€
	 * la desparasitacion de gatos con pelo largo: 200€; pelo corto: 100€; 50€ gatos sin pelo
	 * calcule los impuestos municipales que ha de pagar una protectora sabiendo que tiene
	 * 2 perros grandes, un perro mediano y 3 perros pequeños; 2 gatos con pelo largo, 3 gatos
	 * pelo corto y 1 sin pelo
	 */ 

	public static void main(String[] args) {
		
		ArrayList<Mascota> an = new ArrayList<>();
		
		Mascota perro1 = new Perro_Grande("G-UNO", 10, colores.BLANCO, 50, false, tipos.DOBERMAN);
		an.add(perro1);
		Mascota perro2 = new Perro_Grande("G-DOS", 15, colores.NEGRO, 50, false, tipos.DOBERMAN);
		an.add(perro2);
		
		Mascota perro3 = new Perro_Mediano("M-UNO", 1, colores.NEGRO, 5, true, tiposMediano.COLLIE);
		an.add(perro3);
		
		Mascota perro4 = new Perro_Pequeño("P-UNO", 3, colores.BLANCO, 0, false, tiposPequeño.SCHNAUZER);
		an.add(perro4);
		Mascota perro5 = new Perro_Pequeño("P-DOS", 7, colores.NEGRO, 40, true, tiposPequeño.CANICHE);
		an.add(perro5);
		Mascota perro6 = new Perro_Pequeño("P-TRES", 1, colores.BLANCO, 1, false, tiposPequeño.CANICHE);
		an.add(perro6);
		
		Mascota gato1 = new Gato_Sin_Pelo("SP-UNO", 1, colores.GRIS, 0, 0, tiposSinPelo.ELFO);
		an.add(gato1);
		
		Mascota gato2 = new Gato_Pelo_Largo("PL-UNO", 3, colores.NARANJA, 10, 50, tiposLargo.ANGORA);
		an.add(gato2);
		Mascota gato3 = new Gato_Pelo_Largo("PL-DOS", 7, colores.NEGRO, 20, 30, tiposLargo.BALINÉS);
		an.add(gato3);
		
		Mascota gato4 = new Gato_Pelo_Corto("PC-UNO", 9,colores.MARRON, 30, 40, tiposCorto.AZUL_RUSO);
		an.add(gato4);
		Mascota gato5 = new Gato_Pelo_Corto("PC-DOS", 11, colores.NEGRO, 40, 20, tiposCorto.BRITÁNICO);
		an.add(gato5);
		
		double precio = 0d;
		
		for(Mascota m : an) {
			System.out.println("\n"+m.toString());
			double p = m.pagarImpuestosMunicipales();
			System.out.println("Pecio :"+p+" €");
			precio+=p;
		}
		
		System.out.println("\n--------------TIKECT TIENDA MASCOTAS--------------");
		System.out.println("\n 	Precio total = "+ precio+" €");
		System.out.println("\n 	IVA (21%) "+ 0.21*precio+" €");
		System.out.println();
		System.out.println("\n		PAGO FINAL "+1.21*precio+" €");
		System.out.println("\n--------------------------------------------------");
		
	}
}
