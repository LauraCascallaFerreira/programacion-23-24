package trimestre3.herencia.SeleccionFutbol2;

import java.util.ArrayList;

public class TestSeleccion {
    public static void main(String[] args) {

        ArrayList<SeleccionFutbol> integrantes = new ArrayList<>();

        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60);
        integrantes.add(delBosque);
        Futbolista iniesta = new Futbolista(8, "Andrés", "Iniesya", 30, 6, "Interior Derecho");
        integrantes.add(iniesta);
        Masajista raulMartinez = new Masajista(3, "Raúl", "Martínez", 41, "Fisioterapia", 18);
        integrantes.add(raulMartinez);

        //CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentración.");
        for(SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.toString()+"--> ");
            integrante.concentrarse();
        }

        //VIAJES
        System.out.println("Todos los integrantes se van de viaje.");
        for(SeleccionFutbol integrante : integrantes){
            System.out.println(integrante.getNombre()+" "+integrante.getApellidos()+"--> ");
            integrante.viajar();
        }

        //recorre los metodos especificos o propios de cada objeto
        for(SeleccionFutbol integrante : integrantes){
            if(integrante==delBosque){
                delBosque.viajar();
            } else if(integrante==iniesta){
                iniesta.viajar();
            } else if(integrante==raulMartinez){
                raulMartinez.viajar();
            }
        }

    }//fin del main
}
