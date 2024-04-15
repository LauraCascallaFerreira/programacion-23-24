package trimestre3.herencia.Inmueble;

public class Rural_Conjunto_Cerrado extends Casa_Urbana{

    protected float valorAdministracion;
    protected boolean tieneCamposDeportivos;
    protected boolean tienePiscina;

    public Rural_Conjunto_Cerrado(int identificadorInmobiliario, int area, String direccion, int numBaños,
            int numHabitaciones, int numPisos, float distanciaCabecera, float altitudMar, float valorAdministracion,
            boolean tieneCamposDeportivos, boolean tienePiscina) {
        super(identificadorInmobiliario, area, direccion, numBaños, numHabitaciones, numPisos, distanciaCabecera,
                altitudMar);
        this.valorAdministracion = valorAdministracion;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
        this.tienePiscina = tienePiscina;
    }

    public float getValorAdministracion() {
        return valorAdministracion;
    }

    public void setValorAdministracion(float valorAdministracion) {
        this.valorAdministracion = valorAdministracion;
    }

    public boolean isTieneCamposDeportivos() {
        return tieneCamposDeportivos;
    }

    public void setTieneCamposDeportivos(boolean tieneCamposDeportivos) {
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    public boolean isTienePiscina() {
        return tienePiscina;
    }

    public void setTienePiscina(boolean tienePiscina) {
        this.tienePiscina = tienePiscina;
    }

    @Override
    public String toString() {
        return super.toString()+"Rural_Conjunto_Cerrado [valorAdministracion=" + valorAdministracion + ", tieneCamposDeportivos="
                + tieneCamposDeportivos + ", tienePiscina=" + tienePiscina + "]";
    }
}
