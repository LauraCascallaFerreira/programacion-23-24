package trimestre3.herencia.Deporte;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class TestDeporte {
    public static void main(String[] args) {

        ArrayList<PartidoFutbolLE>partido1 = new ArrayList<>();

        PartidoFutbolLE futbol = new PartidoFutbolLE();
        partido1.add(futbol);

        futbol.setEquipoLocal("Madrid");
        futbol.setEquipoVisitante("Barça");
        futbol.setGolesEquipoLocal(0);
        futbol.setGolesEquipoVisitante(3);

        for(PartidoFutbolLE f : partido1){
            System.out.println(f.toString());
        }

        ArrayList<PartidoBaloncestoLE> partido2 = new ArrayList<>();

        PartidoBaloncestoLE baloncesto = new PartidoBaloncestoLE();
        partido2.add(baloncesto);

        baloncesto.setEquipoLocal("Barça");
        baloncesto.setEquipoVisitante("Madrid");
        baloncesto.setPuntosEquipoLocal(55);
        baloncesto.setPuntosEquipoVisitante(89);


        for(PartidoBaloncestoLE b : partido2){
            System.out.println(b);
        }
    }
}
