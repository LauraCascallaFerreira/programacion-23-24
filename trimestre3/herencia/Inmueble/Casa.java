package trimestre3.herencia.Inmueble;

public class Casa extends Vivienda{

    protected int numPisos;

    public Casa(int identificadorInmobiliario, int area, String direccion, int numBaños, int numHabitaciones,
            int numPisos) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones);
        this.numPisos = numPisos;
    }

    public int getNumPisos() {
        return numPisos;
    }

    public void setNumPisos(int numPisos) {
        this.numPisos = numPisos;
    }

    @Override
    public String toString() {
        return super.toString()+"Casa [numPisos=" + numPisos + "]";
    }
}
