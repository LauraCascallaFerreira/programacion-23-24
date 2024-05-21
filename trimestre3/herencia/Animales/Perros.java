package trimestre3.herencia.Animales;

public class Perros extends Canido{

    @Override
    public String getSonido() {
        return "Perro-->Yo ladro";
    }

    @Override
    public String getAlimentos() {
        return "Perro-->Soy carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Perro-->Soy domestico";
    }

    @Override
    public String getNombreCientifico() {
        return "Perro-->Canis Lupus Familiaris";
    }
}
