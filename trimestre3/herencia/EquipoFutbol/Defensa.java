package trimestre3.herencia.EquipoFutbol;

public class Defensa extends Jugador{

    private int numeroPatadas;

    public Defensa(String nombre, String apellidos, int edad, boolean esTitular, int numeroPatadas) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroPatadas = numeroPatadas;
    }
    
    public int getNumeroPatadas() {
        return numeroPatadas;
    }
    public void setNumeroPatadas(int numeroPatadas) {
        this.numeroPatadas = numeroPatadas;
    }

    @Override
    public String toString() {
        return "Defensa [numeroPatadas=" + getNumeroPatadas() + ", isEsTitular()=" + isEsTitular() + ", getNombre()="
                + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad() + "]";
    } 
}
