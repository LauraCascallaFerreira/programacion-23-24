package trimestre2.objetos.pelicula;

public class pelicula{
    
    private String nombre;
	private String director;
	enum tipo {ACCION, COMEDIA, DRAMA, SUSPENSO};
	tipo genero;
	private int duracion;
	private int año;
	private double calificacion;
	
	public pelicula(String nombre, String director, tipo genero, int duracion, int año, double calificacion) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.duracion = duracion;
		this.año = año;
		this.calificacion = calificacion;
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public tipo getGenero() {
        return genero;
    }

    public void setGenero(tipo genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public boolean esPeliculaEpica(){
        /*if (this.duracion>=180)
            return true;
        else 
            return false;*/
        return this.duracion>=180;
    }

    String calcularValoracion(){
        if(calificacion>0 && calificacion<=2){
            return "La valoración es muy mala";
        } else if(calificacion>2 && calificacion<=5){
            return "La calificación es mala";
        } else if(calificacion>5 && calificacion<=7){
            return "La calificación es regular";
        } else if(calificacion>7 && calificacion<=8){
            return "La calificación es buena";
        } else if (calificacion>8 && calificacion<=10) {
            return "La calificación es sobresaliente";
        } else return "Error: La calificación debe estar en el rango de 0 a 10";
    }

    boolean esSimilar(pelicula pel){
        /*if(this.genero==pel.genero && this.calcularValoracion()==pel.calcularValoracion())
            return true;
        else return false;*/
        return (this.genero==pel.genero && this.calcularValoracion()==pel.calcularValoracion());
    }

    @Override
    public String toString() {
        return "pelicula [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", duracion=" + duracion
                + ", año=" + año + ", calificacion=" + calificacion + "]";
    }
    
}