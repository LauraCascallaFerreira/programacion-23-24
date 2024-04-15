package trimestre3.herencia.SeleccionFutbol;

public class Entrenador extends SeleccionFutbol{
    
    //Atributos
    private String licencia;

    //Constructor herencia
    public Entrenador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }

    //Constructor completo
    public Entrenador(int id, String nombre, String apellido, int edad, String licencia) {
        super(id, nombre, apellido, edad);
        this.licencia = licencia;
    }

    //Getters y setters
    public String getIdFederacion() {
        return licencia;
    }

    public void setIdFederacion(String licencia) {
        this.licencia = licencia;
    }

    public void Viajar(){
        super.Viajar();
        System.out.println("viaja pidiendo un guiskito.");
    }

    @Override
    public String toString() {
        return super.toString()+"Entrenador [licencia=" + licencia + "]";
    }
}
