package trimestre1.dos;
/*Realiza una clase finanzas que convierta dólares a euros y viceversa. Codifica 
 * los métodos dolaresToEuros
 * y eurosToDolares. Prueba que dicha clase funciona 
 * correctamente haciendo conversiones entre euros y dólares. La clase tiene que 
 * tener:
 * Un constructor finanzas() por defecto el cual establecerá el cambio Dólar-Euro 
 * en 1.36.
 * Un constructor finanzas (double), el cual permitirá configurar el cambio 
 * dólar-euro.*/

import java.util.Scanner;

public class finanzas {

    public static final double cambioEaD=1.05;
	
	double cambio;
	
	finanzas(){
		this.cambio=cambioEaD;
	}
	
	finanzas(double c){
		this.cambio=c;
	}
	
	public double eurosDolar(double e) {
		double d;
		d=e*cambio;
		return d;
	}
	
	public double dolarEuros(double d) {
		double e;
		e=d/cambio;
		return e;
	}
	
	public double obtenerCantidad(String mensaje) {
		double can;
		Scanner sc = new Scanner(System.in);
		System.out.println(mensaje);
		can=sc.nextDouble();
		return can;
	}
	
	public void menu() {
        //teniamos el metodo scanner del main mal iniciado, 
		//al tenerlo arriba no necesitamos declararlo abajo.
        //Por eso solo es "sc = new Scanner(System.in);" y no 
		//"Scanner sc = new Scanner(System.in);"
       

        int operacion;
        // double cantidadDinero;
        boolean seguir = true;
        double cantidad;

        do {
        
        	Scanner sc=new Scanner(System.in);
        	System.out.println("D (DOLAR, E (EURO), S (SALIR)");
        	operacion = sc.next().charAt(0);

       
        switch (operacion) {
            case 'D':
            cantidad = obtenerCantidad("Introduce euros");
            System.out.println("De euro a dolar es: "+eurosDolar(cantidad));
            break;

            case 'E':
            cantidad = obtenerCantidad("Introduce dolares");
            System.out.println("De dolar a euro es: "+dolarEuros(cantidad));
            break;

            case 'S':
            seguir = false;
            System.out.println("Saliendo del programa...");
            break;

            default:
            System.out.println("Operacion no valida, repita.");
            break;
        }

        } while (seguir);
		
		
	}

	@Override
	public String toString() {
		return "finanzas [cambio=" + cambio + "]";
	}
    
}
