package trimestre3.herencia.LineaPedido;

import java.util.ArrayList;

public class Orden {
    
    int identificador;
    ArrayList<LineaPedido> lineaPedido = new ArrayList<>();

    public Orden(int identificador, ArrayList<LineaPedido> lineaPedido) {
        this.identificador = identificador;
        this.lineaPedido = lineaPedido;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public int calculoTotal(){
        int total=0;
        /*for(int i=0; i<lineaPedido.size(); i++){
            LineaPedido linea = (LineaPedido) lineaPedido.get(i);
            total+=linea.calculoSubtotal();
        }*/
        for(LineaPedido linea : lineaPedido){
            total+=linea.calculoSubtotal();
        }
        return total;
    }

    public void añadirLineaPedido(LineaPedido orden){
        lineaPedido.add(orden);
    }

    @Override
    public String toString() {
        return "Orden [identificador=" + identificador + ", lineaPedido=" + lineaPedido + "]";
    }
}
