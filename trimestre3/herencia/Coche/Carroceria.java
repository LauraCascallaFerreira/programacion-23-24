package trimestre3.herencia.Coche;

public class Carroceria {
    
    String color;
    tipoCarroceria tipo;

    public Carroceria(String color, tipoCarroceria tipo) {
        this.color = color;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carroceria [color=" + color + ", tipo=" + tipo + "]";
    }
}
