package trimestre3.herencia.Mamifero;

public class Murcielago extends Mamifero{

    @Override
    void amamantarCrias() {
        System.out.println("El murcielago amamanta a sus crias.");
    }

    public void volar(String para){
        System.out.println("El murcielago vuela "+para);
    }
}
