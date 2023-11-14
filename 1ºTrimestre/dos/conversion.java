import java.util.Scanner;

//conversion pulgadas y de codos a centimetros
//pie = 30,48 cm
//pulgada = 2.54 cm

public class conversion {

    public static double piesCentimetros(double pie) {
		double cm;
		cm=pie*30.38;
		return cm;
	}
	
	public static double pulgadasCentimetros(double pulgada) {
		double cm;
		cm=pulgada*2.54;
		return pulgada;
	}
	
	public static void main(String[] args) {
		
		char conversion;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce pies (a) o pulgada (b)");
		conversion=sc.next().charAt(0);
	}
    
}
