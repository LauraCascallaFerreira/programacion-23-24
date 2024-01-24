package trimestre1.dos;
public class satelite {
    
    //atributos
	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//constructor
	
	satelite (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	//constructor
	
	satelite (){
		meridiano=paralelo=distancia_tierra=0;
	}
	
	//getters(mostrar el valor)
	//setters(ajustar un valor)
	
	public double getMeridiano() {
		return meridiano;
	}

	public void setMeridiano(double meridiano) {
		this.meridiano = meridiano;
	}

	public double getParalelo() {
		return paralelo;
	}

	public void setParalelo(double paralelo) {
		this.paralelo = paralelo;
	}

	public double getDistancia_tierra() {
		return distancia_tierra;
	}

	public void setDistancia_tierra(double distancia_tierra) {
		this.distancia_tierra = distancia_tierra;
	}

	//localizar la posicion del satelite
	
	public void setPosicion(double m,double p,double d){
		setMeridiano(m);
		setParalelo(p);
		setDistancia_tierra(d);
	}
}
