package trimestre3.herencia.Inmueble;

public class Vivienda extends Inmueble {

    protected int numBaños;
    protected int numHabitaciones;

    public Vivienda(int identificadorInmobiliario, int area, String direccion, int numBaños, int numHabitaciones) {
        super(identificadorInmobiliario, area, direccion);
        this.numBaños = numBaños;
        this.numHabitaciones = numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }

    public void setNumBaños(int numBaños) {
        this.numBaños = numBaños;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    @Override
    public String toString() {
        return super.toString()+"Vivienda [numBaños=" + numBaños + ", numHabitaciones=" + numHabitaciones + "]";
    }
}
