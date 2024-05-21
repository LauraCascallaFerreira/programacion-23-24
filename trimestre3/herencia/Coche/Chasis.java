package trimestre3.herencia.Coche;

public class Chasis{
    
    tipoChasis tipo;

    public Chasis(tipoChasis tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Chasis [tipo=" + tipo + "]";
    }
}
