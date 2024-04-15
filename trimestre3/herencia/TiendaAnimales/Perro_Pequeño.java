package trimestre3.herencia.TiendaAnimales;

public class Perro_Pequeño extends Perro{
    
    enum tiposPequeño {CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA};
    tiposPequeño tipo;
    
    public Perro_Pequeño(String nombre, int edad, colores color, double peso, boolean morder, tiposPequeño tipo) {
        super(nombre, edad, color, peso, morder);
        this.tipo = tipo;
    }

    public tiposPequeño getTipo() {
        return tipo;
    }

    public void setTipo(tiposPequeño tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Perro_Pequeño [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+100;
	}
}
