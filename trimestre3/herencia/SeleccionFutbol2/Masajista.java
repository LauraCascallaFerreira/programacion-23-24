package trimestre3.herencia.SeleccionFutbol2;

public class Masajista extends SeleccionFutbol{

    private String titulacion;
    private int aniosExperiencia;

    public Masajista(){
        super();
    }

    public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellidos, edad);
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

    //Métodos propios
    @Override
    public void entrenar(){
        System.out.println("Da asistencia en el entrenamiento");
    }

    public void darMasaje(){
        System.out.println("Te doy un masaje");
    }

    @Override
     public void concentrarse(){
      System.out.println("Me concentro haciendo respiraciones diafragmaticas");
     }

     @Override
     public void viajar(){
         System.out.println("Masajista--> Viajo en bodega sin transportin");
     }

    @Override
    public String toString() {
        return super.toString()+"Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }
}
