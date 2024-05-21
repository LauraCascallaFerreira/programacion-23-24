package trimestre3.herencia.Medicina;

public class Pediatra extends Medico{

    private TipologiaP tipo;

    public Pediatra(String nombre, TipologiaP tipo) {
        super(nombre);
        this.tipo = tipo;
    }

    public TipologiaP getTipo() {
        return tipo;
    }

    public void setTipo(TipologiaP tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Pediatra [nombre=" + nombre + ", tipo=" + tipo + "]";
    }   

    public void tePsicoanalizo(){
        System.out.println("Anda con ojo que te psicoanalizo");
    }
}
