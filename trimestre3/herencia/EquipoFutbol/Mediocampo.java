package trimestre3.herencia.EquipoFutbol;

public class Mediocampo extends Jugador{

    private int numeroAsistencia;

    public Mediocampo(String nombre, String apellidos, int edad, boolean esTitular, int numeroAsistencia) {
        super(nombre, apellidos, edad, esTitular);
        this.numeroAsistencia = numeroAsistencia;
    }

    public int getNumeroAsistencia() {
        return numeroAsistencia;
    }

    public void setNumeroAsistencia(int numeroAsistencia) {
        this.numeroAsistencia = numeroAsistencia;
    }

    @Override
    public String toString() {
        return "MedioCampo [numeroAsistencia=" + numeroAsistencia + ", isEsTitular()=" + isEsTitular()
                + ", getNombre()=" + getNombre() + ", getApellidos()=" + getApellidos() + ", getEdad()=" + getEdad()
                + "]";
    }
}
