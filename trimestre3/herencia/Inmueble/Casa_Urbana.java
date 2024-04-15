package trimestre3.herencia.Inmueble;

public class Casa_Urbana extends Casa{

    public Casa_Urbana(int identificadorInmobiliario, int area, String direccion, int numBaños, int numHabitaciones,
            int numPisos, float distanciaCabecera, float altitudMar) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones, numPisos);
    }

    @Override
    public String toString() {
        return super.toString();
    }   
}