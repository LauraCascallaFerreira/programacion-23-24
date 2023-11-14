/* El restaurante mejicano de Israel cuya especialidad son las papas con chocos 
 * nos pide diseñar un método con el que se pueda saber cuántos clientes pueden 
 * atender con la materia prima que tienen en el almacén. El método recibe la 
 * cantidad de papas y chocos en kilos y devuelve el número de clientes que puede 
 * atender el restaurante teniendo en cuenta que por cada tres personas, Israel 
 * utiliza un kilo de papas y medio de chocos.*/

public class israel {

    private double chocos;
	private double patatas;
	
	public israel(double chocos, double patatas) {
		super();
		this.chocos = chocos;
		this.patatas = patatas;
	}

	public double getChocos() {
		return chocos;
	}



	public void setChocos(double chocos) {
		this.chocos = chocos;
	}

	public double getPatatas() {
		return patatas;
	}

	public void setPatatas(double patatas) {
		this.patatas = patatas;
	}

	@Override
	public String toString() {
		return "israel [chocos=" + chocos + ", patatas=" + patatas + "]";
	}

	public void addPatatas(double x) {
		this.patatas+=x;
	}

	public void addChocos(double x) {
		this.chocos+=x;
	}
	
	public int getComensales() {
		int comensales=0;
		
		if (patatas>2*chocos) {
			//sobran patatas o se acaban chocos
			
			comensales=3*(int)(chocos/0.5);
			patatas-=(comensales/3);
			chocos-=(comensales/3)/2;
		}
		
		else {
			//sobran chocos y faltan patatas
			comensales= 3*(int)(patatas/1);
			chocos-=(comensales/3);
			patatas-=(comensales/3)/2;
		}
		return comensales;
	}
	
	public void irMercado(double x, double y) {
		
		addChocos(x);
		addPatatas(y);
	}
    
}
