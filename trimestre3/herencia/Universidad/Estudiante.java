package trimestre3.herencia.Universidad;

public class Estudiante extends Persona{

    //Atributos
    public String carrera;
    public int semestre;

    //Constructor completo
    public Estudiante(String nombre, String direccion, String carrera, int semestre) {
        super(nombre, direccion);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    //Getters y setters
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    //Métodos heredados
    @Override
    public void comer() {
        System.out.println("Estudiante-->Como en el comedor");
    }

    public void contrentrarse(){
        System.out.println("Hago el intento de concentrarme");
    }

    public void examen(){
        System.out.println("Hoy tengo examen");
    }

    //ToString
    @Override
    public String toString() {
        return "Estudiante [carrera=" + carrera + ", semestre=" + semestre + "]";
    }
}
