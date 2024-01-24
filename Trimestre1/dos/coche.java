package trimestre1.dos;
public class coche {
	
	private int velocidad;
	
	coche(){
		velocidad=0;
	}
	
	public coche(int velocidad) {
		if(velocidad<0 || velocidad>120) {
			this.velocidad = 0;
		} else this.velocidad = velocidad;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	
	public void acelerar(int mas) {
		if(velocidad+mas>120) {
			velocidad=120;
		} else velocidad+=mas;
	
	}
	
	public void frenar(int menos) {
		if(velocidad-menos<0) {
			velocidad=0;
		} else velocidad-=menos;
	}

	@Override
	public String toString() {
		return "coche [velocidad=" + velocidad + "]";
	}

}