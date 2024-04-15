package trimestre3.herencia.TiendaAnimales;

public class Gato_Sin_Pelo extends Gato{
    enum tiposSinPelo {ESFINGE, ELFO, DONSKOY}
    tiposSinPelo tipo;

    public Gato_Sin_Pelo(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
            tiposSinPelo tipo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.tipo = tipo;
    }

    public tiposSinPelo getTipo() {
        return tipo;
    }

    public void setTipo(tiposSinPelo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Gato_Sin_Pelo [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+50;
	}
}
