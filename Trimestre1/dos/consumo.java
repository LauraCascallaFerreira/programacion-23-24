package trimestre1.dos;
public class consumo {

    int km;
	double litros;
	double velocidadMedia;
	double precioGas;
	
	consumo(){
		
	}

	public consumo(int km, double litros, double velocidadMedia, double precioGas) {
		this.km = km;
		this.litros = litros;
		this.velocidadMedia = velocidadMedia;
		this.precioGas = precioGas;
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	public double getVelocidadMedia() {
		return velocidadMedia;
	}

	public void setVelocidadMedia(double velocidadMedia) {
		this.velocidadMedia = velocidadMedia;
	}

	public double getPrecioGas() {
		return precioGas;
	}

	public void setPrecioGas(double precioGas) {
		this.precioGas = precioGas;
	}

	@Override
	public String toString() {
		return "consumo [km=" + km + ", litros=" + litros + ", velocidadMedia=" + velocidadMedia + ", precioGas="
				+ precioGas + "]";
	}
	
	public double getTiempo(double tiempo){
		tiempo=km/velocidadMedia;
		return tiempo;
		
	}
	
	public double consumoMedio(double consumo) {
		consumo=(litros/km)*100;
		return consumo;
		
	}
	
	public double consumoEuros(double euros) {
		euros=(precioGas/km)*100;
		return euros;
	}
	
	/* cosumo medio consumo medio del vehiculo en litros cada 100 km
	 * consumo euros consumo medio del vehiculo en euros cada 100 km*/
    
}
