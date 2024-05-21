package trimestre3.herencia.Animales;

public class Leones extends Felino{
    
    @Override
    public String getSonido() {
        return "Leon-->Mi sonido es el rugido";
    }

    @Override
    public String getAlimentos() {
        return "Leon-->Soy carnívoro";
    }

    @Override
    public String getHabitat() {
        return "Leon-->Vivo en la pradera"; 
    }

    @Override
    public String getNombreCientifico() {
        return "Leon-->Panthera Leo";
    }
}
