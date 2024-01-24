package trimestre1.dos;
import java.util.Scanner;

public class testMiNumero {
    
    public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		n=sc.nextInt();
		
		miNumero mn = new miNumero(n);
		System.out.println(mn.toString());
		System.out.println(mn.dobleNumero());
		System.out.println(mn.tripleNumero());
		System.out.println(mn.cuadrupleNumero());
	}
}
