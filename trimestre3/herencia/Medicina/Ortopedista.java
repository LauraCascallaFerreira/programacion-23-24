package trimestre3.herencia.Medicina;

public class Ortopedista extends Medico{

    private TipologiaO tipo;

    public Ortopedista(String nombre, TipologiaO tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public TipologiaO getTipo() {
        return tipo;
    }

    public void setTipo(TipologiaO tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Ortopedista [nombre=" + nombre + ", tipo=" + tipo + "]";
    }

    public void soyOrtopedista(){
        System.out.println("Ni yo se a que me dedico");
    }
}
