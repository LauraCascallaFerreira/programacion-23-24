/*Crea la clase coche con dos constructores. Uno toma parametros y el otro no. Los dos 
 * constructores inicializaran
 * los atributos marcha y modelo de la clase. Crea dos objetos(Cada objeto llama a 
 * un constructor distinto) y verifica que todo funciona correctamente.*/

public class coche2 {

    private int velocidad;
	private String marca;
	private String modelo;
	
	coche2(){
		velocidad=0;
	}
	
	public coche2(int velocidad, String marca, String modelo) {
		if(velocidad<0 || velocidad>120) {
			this.velocidad = 0;
		} else this.velocidad = velocidad;
		
		this.marca=marca;
		this.modelo=modelo;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void acelerar(int mas) {
		if(velocidad+mas>300) {
			velocidad=300;
		} else velocidad+=mas;
	
	}
	
	public void frenar(int menos) {
		if(velocidad-menos<0) {
			velocidad=0;
		} else velocidad-=menos;
	}

	@Override
	public String toString() {
		return "coche2 [velocidad=" + velocidad + ", marca=" + marca + ", modelo=" + modelo + "]";
	}
    
}
