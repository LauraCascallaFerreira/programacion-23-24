package trimestre1.dos;
import java.util.Scanner;

public class testNumero {

    public static void main(String[] args) {
		
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Dame un número entero:");
		num=sc.nextInt();
		
		numero numero = new numero(num);
		System.out.println(numero.toString());
		
		int suma;
		int resta;
		System.out.println("Dame la cantidad a sumar:");
		suma=sc.nextInt();
		numero.suma(suma);
		System.out.println(numero);
		
		System.out.println("Dame la cantidad a restar:");
		resta=sc.nextInt();
		numero.resta(resta);
		System.out.println(numero);
		
	}
    
}
