package trimestre1.dos;
import java.util.Scanner;

public class testFinanzas {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double dato;
		
		System.out.println("Cambio por defecto");
		finanzas p = new finanzas();
		p.menu();
		
		System.out.println("Cambio a 1,5 dol por eur");
		finanzas pc = new finanzas(1.5); 
		pc.menu();
		
		System.out.println("Dime tu el cambio (dol por eur)");
		dato=sc.nextDouble();
		
		finanzas pcd = new finanzas(dato);
		pcd.menu();
	}
    
}
