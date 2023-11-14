package Trimestre1.boletin01;

import java.util.Random;
import java.util.Scanner;

public class ejercicio05 {

    public static void main(String[] args) {
		
		Random random = new Random();
		int aleatorio = random.nextInt(100);
		
		int num = 0;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número del 1 al 100:");
		
		do {
			num=sc.nextInt();
				
			if(num>aleatorio) {
				System.out.println("Dame un número menor:");
				count++;
			} else if(num<aleatorio) {
				System.out.println("Dame un número mayor:");
				count++;
			} else {
				System.out.println("¡Enhorabuena has acertado el número!");
				System.out.println("Acertaste en "+count+" intentos.");
			} 
			
		} while(count<10 && num!=aleatorio); 
			
		if(count>=10) {
			System.out.println("Se han acabado los intentos.");
			System.out.println("El número era: "+aleatorio);
		}
	}
    
}
