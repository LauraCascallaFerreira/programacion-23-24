package trimestre3.herencia.Inmueble;

public class Apartamento extends Vivienda{

    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numBaños, int numHabitaciones) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones);
    }

    @Override
    public String toString() {
        return super.toString()+"Apartamento []";
    }
}
