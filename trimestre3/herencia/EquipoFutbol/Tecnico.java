package trimestre3.herencia.EquipoFutbol;

public class Tecnico extends Persona{
    
    private int anosExperiencia;

    public Tecnico(String nombre, String apellidos, int edad, int anosExperiencia) {
        super(nombre, apellidos, edad);
        this.anosExperiencia = anosExperiencia;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico [anosExperiencia=" + getAnosExperiencia() + ", getNombre()=" + getNombre() + ", getApellidos()="
                + getApellidos() + ", getEdad()=" + getEdad() + "]";
    }
    
}
