package trimestre3.herencia.Mamifero;

import java.util.ArrayList;

public class TestMamifero {
    public static void main(String[] args) {

        ArrayList <Mamifero> mamiferos = new ArrayList<>();
        
        Ballena ballena = new Ballena();
        mamiferos.add(ballena);
        Ornitorrinco ornitorrinco = new Ornitorrinco();
        mamiferos.add(ornitorrinco);
        Gato gato = new Gato();
        mamiferos.add(gato);
        Murcielago murcielago = new Murcielago();
        mamiferos.add(murcielago);

        for(int i=0; i<mamiferos.size(); i++){
            Mamifero a = (Mamifero) mamiferos.get(i);

            if(a instanceof Ballena){
                System.out.println("El objeto del indice "+i+" es de la clase Ballena");
                ((Ballena)a).amamantarCrias();
                continue;
            }
            if(a instanceof Ornitorrinco){
                System.out.println("El objeto del indice "+i+" es de la clase Ornitorrinco");
                ((Ornitorrinco)a).amamantarCrias();
                ((Ornitorrinco)a).ponerHuevos();;
                continue;
            }
            if(a instanceof Gato){
                System.out.println("El objeto del indice "+i+" es de la clase Gato");
                ((Gato)a).amamantarCrias();
                continue;
            }
            if(a instanceof Murcielago){
                System.out.println("El objeto de indice "+i+" es de la clase Murcielago");
                ((Murcielago)a).amamantarCrias();
                ((Murcielago)a).volar("alto como un pajaro");
            }
        }
    }
}
