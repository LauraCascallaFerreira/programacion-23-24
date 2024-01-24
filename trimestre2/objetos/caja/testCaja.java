package trimestre2.objetos.caja;

import trimestre2.objetos.caja.caja.tipo;

public class testCaja {
    public static void main(String[] args) {

        caja caja1 = new caja(20);
		System.out.println(caja1);
		
		System.out.println();
		caja caja2 = new caja(30, 50, 10);
		System.out.println(caja2);
		
		System.out.println();
		caja caja3 = new caja(10, 10, 10, tipo.MADERA);
		System.out.println(caja3);
		
		System.out.println();
		caja caja4 = new caja();
		System.out.println(caja4);
		
	}
}
