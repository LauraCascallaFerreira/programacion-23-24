package trimestre3.herencia.Animales;

public class Lobos extends Canido{
    
    @Override
    public String getSonido() {
        return "Lobo-->aullo";
    }

    @Override
    public String getAlimentos() {
        return "Lobo-->Soy carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Lobo-->Vivo en el bosque"; 
    }

    @Override
    public String getNombreCientifico() {
        return "Lobo-->Canis Lupus";
    }
}
