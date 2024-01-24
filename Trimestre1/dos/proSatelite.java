package trimestre1.dos;
/*Modifica la clase satélite y añádele los siguientes métodos:
 * Método void variaAltura(double desplazamiento). Este método acepta un parámetro 
 * que será positivo o negativo dependiendo de si el satélite tiene que alejarse o 
 * acercarse a La Tierra.
 * Método boolean enOrbitaQ. Este método devolverá false si el satélite está en 
 * tierra y true en caso contrario.
 * Método void variaPosicion(double variap, double variam). Este método permite 
 * modificar los atributos de posición (meridiano y paralelo) mediante los 
 * parámetros variap y variam. Estos parámetros serán valores positivos o negativos 
 * relativos que harán al satélite modificar su posición.*/

public class proSatelite {
    
    //atributos	
	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
		
	//constructor
	proSatelite (double m,double p,double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;	
	}
		
	//constructor
	proSatelite (){
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
	
	public void variaAltura(double desplazamiento) {
		distancia_tierra+=desplazamiento;
	}
	
	public boolean enOrbita() {
		boolean orbita=false;
		if(distancia_tierra>0) orbita=true;
		return orbita;
	}

	public void variaPosicion (double variap, double variam) {
		paralelo+=variap;
		meridiano+=variam;
	}
}
