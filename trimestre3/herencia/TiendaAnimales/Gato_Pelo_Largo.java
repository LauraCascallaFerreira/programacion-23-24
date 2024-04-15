package trimestre3.herencia.TiendaAnimales;

public class Gato_Pelo_Largo extends Gato{
    
    enum tiposLargo {ANGORA, HIMALAYO, BALINÉS, SOMALÍ};
    tiposLargo tipo;
    
    public Gato_Pelo_Largo(String nombre, int edad, colores color, double alturaSalto, double longitudSalto,
            tiposLargo tipo) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.tipo = tipo;
    }

    public tiposLargo getTipo() {
        return tipo;
    }

    public void setTipo(tiposLargo tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Gato_Pelo_Largo [tipo=" + tipo + "]";
    }

    @Override
	public int pagarImpuestosMunicipales() {
		return super.pagarImpuestosMunicipales()+200;
	}
    
}
