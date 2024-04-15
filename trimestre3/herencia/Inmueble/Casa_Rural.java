package trimestre3.herencia.Inmueble;

public class Casa_Rural extends Casa{

    public static final int VALOR_AREA=1500;

    protected int distanciaCabecera;
    protected int altura;

    public Casa_Rural(int identificadorInmobiliario, int area, String direccion, int numBaños, int numHabitaciones,
            int numPisos, int distanciaCabecera, int altura) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones, numPisos);
        this.distanciaCabecera = distanciaCabecera;
        this.altura = altura;
    }

    public int getDistanciaCabecera() {
        return distanciaCabecera;
    }

    public void setDistanciaCabecera(int distanciaCabecera) {
        this.distanciaCabecera = distanciaCabecera;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Casa_Rural [distanciaCabecera=" + distanciaCabecera + ", altura=" + altura + "]";
    }

    public double calculaPrecioVenta(){
        return area*VALOR_AREA;
    }
}
