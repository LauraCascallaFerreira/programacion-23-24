package trimestre3.herencia.Mamifero;

public class Ornitorrinco extends Mamifero implements Oviparo{

    @Override
    void amamantarCrias() {
        System.out.println("El ornitorrinco amamanta a sus crias.");
    }
    
    @Override
    public void ponerHuevos() {
        System.out.println("El ornitorrinco pone huevos");
    }
}
