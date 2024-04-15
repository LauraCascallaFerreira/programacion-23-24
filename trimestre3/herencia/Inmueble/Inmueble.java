package trimestre3.herencia.Inmueble;

public class Inmueble {

    protected int identificadorInmobiliario;
    protected int area;
    protected String direccion;
    protected double precioVenta=0d;
    
    public Inmueble(int identificadorInmobiliario, int area, String direccion) {
        this.identificadorInmobiliario = identificadorInmobiliario;
        this.area = area;
        this.direccion = direccion;
    }

    public int getIdentificadorInmobiliario() {
        return identificadorInmobiliario;
    }

    public void setIdentificadorInmobiliario(int identificadorInmobiliario) {
        this.identificadorInmobiliario = identificadorInmobiliario;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double calculaPrecioVenta(){
        return 0d;
    }

    @Override
    public String toString() {
        return "inmueble [identificadorInmobiliario=" + identificadorInmobiliario + ", area=" + area + ", direccion="
                + direccion + "]";
    }
}
