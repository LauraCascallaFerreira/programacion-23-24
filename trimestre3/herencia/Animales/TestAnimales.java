package trimestre3.herencia.Animales;

import java.util.ArrayList;

public class TestAnimales {
    public static void main(String[] args) {

        ArrayList<Animal> animales = new ArrayList<>();
        Animal uno = new Gatos();
        animales.add(uno);
        Animal dos = new Leones();
        animales.add(dos);
        Animal tres = new Lobos();
        animales.add(tres);
        Animal cuatro = new Perros();
        animales.add(cuatro);

        for(Animal animal :animales){

            System.out.println(animal.getNombreCientifico());
            System.out.println(animal.getSonido());
            System.out.println(animal.getAlimentos());
            System.out.println(animal.getHabitat());
        }
    }
}
