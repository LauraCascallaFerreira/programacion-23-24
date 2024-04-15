package trimestre3.herencia.Inmueble;

public class Urbana_Independiente extends Casa_Urbana{
    public static final int VALOR_AREA=3000;
    public Urbana_Independiente(int identificadorInmobiliario, int area, String direccion, int numBaños,
            int numHabitaciones, int numPisos, float distanciaCabecera, float altitudMar) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones, numPisos, distanciaCabecera,
                altitudMar);
    }
    @Override
    public String toString() {
        return super.toString()+"Urbana_Independiente []";
    }
    
    public double calcularPrecioVenta(){
        return area*VALOR_AREA;
    }
    
}
