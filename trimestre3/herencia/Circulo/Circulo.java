package trimestre3.herencia.Circulo;

import javafx.scene.paint.Color;

public class Circulo {
    
    private int radio;
    Punto punto;
    Color color;
    
    public Circulo(int radio, int x, int y, Color color) {
        this.radio = radio;
        punto= new Punto(x, y);
        this.color=color;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public void imprimir(){
        System.out.println("El radio es: "+radio+" la x esta en: "+punto.getX()+
        ", la y esta en: "+punto.getY()+" y el color es "+color);
    }
}
