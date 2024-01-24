package trimestre1.dos;
import java.util.Scanner;

public class diasMes{

public static void main(String[] args) {
		
		int mes;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame el número de un mes.");
		mes=sc.nextInt();
		
		switch(mes) {
		
		case 1,3,5,7,8,10,12:
			System.out.println("El mes tiene 31 días.");
		break;
		
		case 4,6,9,11:
			System.out.println("El mes tiene 30 días.");
		break;
		
		case 2:
			int año;
			System.out.println("Dame el año.");
			año=sc.nextInt();
			if(año%4==0) {
				System.out.println("Tiene 29 días.");
			} else System.out.println("Tiene 28 días.");
		break;
		}
		
	}
}