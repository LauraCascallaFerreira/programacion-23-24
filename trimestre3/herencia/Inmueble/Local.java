package trimestre3.herencia.Inmueble;

public class Local extends Inmueble{

    enum localizacion{INTERNO, CALLE};
    localizacion tipoLocal;

    public Local(int identificadorInmobiliario, int area, String direccion, localizacion tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal = tipoLocal;
    }

    public localizacion getTipoLocal() {
        return tipoLocal;
    }

    public void setTipoLocal(localizacion tipoLocal) {
        this.tipoLocal = tipoLocal;
    }
    
    @Override
    public String toString() {
        return super.toString()+"Local [localiz=" + tipoLocal + "]";
    }
}
