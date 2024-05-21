package trimestre3.herencia.Animales;

public class Gatos extends Felino{
    
    @Override
    public String getSonido() {
        return "Gato-->Maúllo";
    }

    @Override
    public String getAlimentos() {
        return "Gato-->Me alimento de ratones";
    }

    @Override
    public String getHabitat() {
        return "Gato-->Soy un animal doméstico"; 
    }

    @Override
    public String getNombreCientifico() {
        return "Gato-->Felis Silvestris Catus";
    }
}
