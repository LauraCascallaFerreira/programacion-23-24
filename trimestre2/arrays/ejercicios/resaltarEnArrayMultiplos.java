package trimestre2.arrays.ejercicios;

import java.util.Random;
import java.util.Scanner;

public class resaltarEnArrayMultiplos {
    
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int menu;
		int[] arrayNum = new int[50];
		generarArray(arrayNum);
		
		do {
		menu = menu();
		if(menu==1)multiplo5(arrayNum);
		if(menu==2)multiplo7(arrayNum);
		}while(menu!=3);
		
	}
	
	
	
	public static void generarArray(int[] array) {
		Random rand = new Random();
		for(int i = 0; i< array.length; i++) {
			array[i] = rand.nextInt(0,500); 
		}
	}
	
	public static void multiplo5(int[] array) {
		System.out.println();
		for(int i : array) {
			if(i%5==0) {
				System.out.print("["+i+"], ");
			}else {
				System.out.print(i+", ");
			}
		}
	}
	
	
	public static void multiplo7(int[] array) {
		System.out.println();
		for(int i : array) {
			if(i%7==0) {
				System.out.print("["+i+"],");
			}else {
				System.out.print(i+", ");
			}
		}
	}
	
	public static int menu() {
		System.out.println();
		System.out.println("1.Resaltar Multiplos de 5");
		System.out.println("2.Resaltar Multiplos de 7");
		System.out.println("3.Salir");
		return sc.nextInt();
	}
}
