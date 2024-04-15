package trimestre3.herencia.Inmueble;

public class Local_Comercial extends Local{

    public static final int VALOR_AREA=3000; //Cada metro cuadrado vale 300
    protected String centroComercial;

    public Local_Comercial(int identificadorInmobiliario, int area, String direccion, localizacion tipoLocal,
            String centroComercial) {
        super(identificadorInmobiliario, area, direccion, tipoLocal);
        this.centroComercial = centroComercial;
    }

    public String getCentroComercial() {
        return centroComercial;
    }

    public void setCentroComercial(String centroComercial) {
        this.centroComercial = centroComercial;
    }

    @Override
    public String toString() {
        return "Local_Comercial [centroComercial=" + centroComercial + "]";
    }

    @Override
    public double calculaPrecioVenta(){
        return area*VALOR_AREA;
    }
}
