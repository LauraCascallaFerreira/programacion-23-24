package trimestre3.herencia.Inmueble;

public class Local_Oficina extends Local{

    public static final int VALOR_AREA=3500;//Cada metro cuadrado
    protected boolean sonDelGobierno;

    public Local_Oficina(int identificadorInmobiliario, int area, String direccion, localizacion localiz,
            boolean sonDelGobierno) {
        super(identificadorInmobiliario, area, direccion, localiz);
        this.sonDelGobierno = sonDelGobierno;
    }

    public boolean isSonDelGobierno() {
        return sonDelGobierno;
    }

    public void setSonDelGobierno(boolean sonDelGobierno) {
        this.sonDelGobierno = sonDelGobierno;
    }

    @Override
    public String toString() {
        return super.toString()+"Local_Oficina [sonDelGobierno=" + sonDelGobierno + "]";
    }
    
    @Override
    public double calculaPrecioVenta(){
        return area*VALOR_AREA;
    }
}
