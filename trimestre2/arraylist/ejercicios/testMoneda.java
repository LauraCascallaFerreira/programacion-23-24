package trimestre2.arraylist.ejercicios;

/*Simula mediante un programa, la generacion de 6 monedas aleatorias siguiendo la pauta
correcta. Cada moneda generada debe ser una instancia de la clase moneda y la secuencia se 
debe ir almacenando en un alista.*/

import java.util.ArrayList;

public class testMoneda {

    public static boolean valido(moneda m, moneda ultima){
        boolean vale=false;
        if(m.getValor().equals(ultima.getValor()))
            vale=true;
        
        if(m.getLado().equals(ultima.getLado()))
            vale=true;
        
        return vale;
    }
    
    public static void main(String[] args) {

        ArrayList<moneda> monedero = new ArrayList<moneda>();
        monedero.add(new moneda());
        System.out.println(monedero);

        do{

            moneda mon = new moneda();
            if(valido(mon, monedero.get(monedero.size()-1)))
                monedero.add(mon);

        } while (monedero.size()<6);

        System.out.println("Coleccion de 6 monedas eurocoin: ");
        for(moneda m : monedero)
            System.out.println(m);
    }
}
