package trimestre3.herencia.Vehiculos;

import java.util.ArrayList;

public class TestVehiculos {
    public static void main(String[] args) {

        ArrayList<Vehiculo>vehiculos = new ArrayList<>();

        Terrestre terrestre = new Terrestre(20, 300);
        vehiculos.add(terrestre);
        Acuatico acuatico = new Acuatico(50, 200);
        vehiculos.add(acuatico);
        Aereo aereo = new Aereo(900, 1500);
        vehiculos.add(aereo);

        for(int i=0; i<vehiculos.size(); i++){
            Vehiculo v = (Vehiculo)vehiculos.get(i);
            
            if(v instanceof Terrestre){
                System.out.println("El objeto del indice "+i+" es de la clase Terrestre");
                ((Terrestre)v).acelerar(30);
                ((Terrestre)v).frenar(10);
                System.out.println("Las revoluciones del motor son: "+((Terrestre)v).calculaRevolucionesMotor(30,20));
                continue;
            }
            if(v instanceof Acuatico){
                System.out.println("El objeto del indice "+i+" es de la clase Acuatico");
                ((Acuatico)v).acelerar(30);
                ((Acuatico)v).frenar(10);
                System.out.println("Las revoluciones del motor son: "+((Acuatico)v).calculaRevolucionesMotor(30,20));
                System.out.println("Deberia de circular a una velocidad de: "+((Acuatico)v).recomendarVelocidad(100));
                continue;
            }
            if(v instanceof Aereo){
                System.out.println("El objeto del indice "+i+" es de la clase Aereo");
                ((Aereo)v).acelerar(400);
                ((Aereo)v).frenar(100);
                ((Aereo)v).soltar();
                ((Aereo)v).encender();
                ((Aereo)v).despegar();
                ((Aereo)v).volar();
                ((Aereo)v).aterrizar();
                ((Aereo)v).subir();
                ((Aereo)v).apagar();
            }
        }

    }
}
