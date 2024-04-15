package trimestre3.herencia.Inmueble;

public class Apartamento_ApartaEstudio extends Apartamento{

    public static final int VALOR_AREA=1500; //cada metro cuadrad

    public Apartamento_ApartaEstudio(int identificadorInmobiliario, int area, String direccion, int numBaños,
            int numHabitaciones, double valorArea) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public double calcularPrecioVenta(){
        return area*VALOR_AREA;
    }
}
