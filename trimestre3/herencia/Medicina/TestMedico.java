package trimestre3.herencia.Medicina;

import java.util.ArrayList;

public class TestMedico {
    public static void main(String[] args) {

        ArrayList<Medico>listaMedicos = new ArrayList<>();

        Medico uno = new Medico("Manolo");
        listaMedicos.add(uno);
        Medico dos = new Pediatra("Pepe", TipologiaP.NEUROLOGO);
        listaMedicos.add(dos);
        Medico tres = new Ortopedista("Antonio", TipologiaO.PEDIATRICA);
        listaMedicos.add(tres);

        for(int i=0; i<listaMedicos.size(); i++){
            //Se debe de realizar un proceso de casting con la clase padre (medico)
            Medico a = (Medico) listaMedicos.get(i);

            if(a instanceof Ortopedista){
                //Determina si el elemento es un ortopedista
                System.out.println("El objeto del indice "+i+" es de la clase Ortopedista");
                ((Ortopedista)a).soyOrtopedista();
                continue;
            }
            if(a instanceof Pediatra){
                //Determina si el elemento es un ortopedista
                System.out.println("El objeto del indice "+i+" es de la clase Pediatra");
                ((Pediatra)a).tePsicoanalizo();
                continue;
            }
            if(a instanceof Medico){
                //Determina si el elemento es un ortopedista
                System.out.println("El objeto del indice "+i+" es de la clase Medico");
                a.soyMedico();
                continue;
            }
        }

        for(Medico m : listaMedicos){
            System.out.println(m.toString());
        }

        Alumno alumno1 = new Alumno("Max", "uno");
        Fontanero fontanero1 = new Fontanero("Pako", 23);

        System.out.println(alumno1.toString());
        alumno1.verVideos();
        alumno1.escucharPodcast();

        System.out.println(fontanero1);
        fontanero1.verVideos();
        fontanero1.escucharPodcast();
    }
}
