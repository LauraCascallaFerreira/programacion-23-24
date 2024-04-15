package trimestre3.herencia.Inmueble;

public class Apartamento_Familiar extends Apartamento{

    public static final int VALOR_AREA=2000; //cada metro cuadrado
    protected float valorAdministracion;

    public Apartamento_Familiar(int identificadorInmobiliario, int area, String direccion, int numBaños,
            int numHabitaciones, float valorAdministracion) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones);
        this.valorAdministracion = valorAdministracion;
    }

    public float getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(float valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public String toString() {
        return super.toString()+"Apartamento_Familiar [valorAdministracion=" + valorAdministracion + "]";
    }

    public double calcularPrecioVenta(){
        return area*VALOR_AREA;
    }
}
