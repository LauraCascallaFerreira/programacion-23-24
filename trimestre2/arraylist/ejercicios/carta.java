package trimestre2.arraylist.ejercicios;

import java.util.Objects;

/*Realiza un programa que escoja al azar 10 cartas de a baraja española
 * (10 objetos de la clase carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna
 */
public class carta implements Comparable{

    String palo;
    String valor;

    static final String[] side = {"oros", "copas", "espadas", "bastos"};
    static final String[] pos = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete" +
                                 "sota", "caballo", "rey"};
    
    carta(){
        this.palo = side[(int) (Math.random()*4)];
		this.valor = pos[(int) (Math.random()*52)];
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public static String[] getSide() {
        return side;
    }

    public static String[] getPos() {
        return pos;
    }

    @Override
    public String toString() {
        return "carta [palo=" + palo + ", valor=" + valor + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(palo, valor);
    }

    @Override
    public boolean equals(Object obj) {
        //si los dos objetos son el mismo:true
        if (this == obj)
            return true;
        //si el objeto que le pasas es nulo:false
        if (obj == null)
            return false;
        //si la clase del objeto al que llama no coincide con la clase que le pasas:false
        if (getClass() != obj.getClass())
            return false;
        carta otra = (carta) obj;
        return Objects.equals(palo, otra.palo)&&Objects.equals(valor, otra.valor);
    }

    @Override
    public int compareTo(Object o) {
        carta c = (carta) o;
        if(this.getPalo().equals(c.getPalo()))
            return this.getValor().compareTo(c.getValor());
        else
            return this.getPalo().compareTo(c.getPalo());
    }


}
