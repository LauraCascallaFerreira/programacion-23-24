package trimestre3.herencia.SeleccionFutbol;

public class Masajista extends SeleccionFutbol{
    
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){
        super();
    }

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println("Te doy un masaje");
    }

    public void Viajar(){
        super.Viajar();
        System.out.println("con los cascos puestos.");
    }

    @Override
    public String toString() {
        return super.toString()+"Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }
}
