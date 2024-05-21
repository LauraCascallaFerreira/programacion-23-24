package trimestre3.herencia.fockingCiclistas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Carrera {

    private String nombre;
    private String pais;
    
    private ArrayList<Equipo> listaEquipos;
    //private ArrayList<Ciclista> clasificacionParcial;
    private ArrayList<Ciclista> clasificacionGeneral;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<Equipo> getListaEquipos() {
        return listaEquipos;
    }

    public void setListaEquipos(ArrayList<Equipo> listaEquipos) {
        this.listaEquipos = listaEquipos;
    }

    public ArrayList<Ciclista> getClasificacionGeneral() {
        return clasificacionGeneral;
    }

    public void setClasificacionGeneral(ArrayList<Ciclista> clasificacionGeneral) {
        this.clasificacionGeneral = clasificacionGeneral;
    }

    //CALCULAR Y MOSTRAR TODOS LOS TIEMPOS ("ETAPA")
    public void calculaYMuestraTiempos(){
        //NO SIRVE
        /*for(Ciclista c : clasificacionGeneral){
            c.calculaTiempoParcial();
            c.acumulaTiempoTotal();
            Collections.sort(clasificacionGeneral, (o1, o2) -> (int) (o1.getTiempoAcumulado())
            -(int)(o2.getTiempoAcumulado()));
            System.out.println(c.toString());
        }*/

        Ciclista c;

        //calcula parcial
        for(int i=0; i<clasificacionGeneral.size(); i++){
            c=clasificacionGeneral.get(i);
            c.calculaTiempoParcial();
        }
        Collections.sort(clasificacionGeneral, (o1, o2) -> 
        (int) (o1.getTiempoAcumulado()) - (int)(o2.getTiempoAcumulado())); 

        System.out.println("CLASIFICACION PARCIAL");
        for(Ciclista manolin : clasificacionGeneral){
            System.out.println(manolin);
        }

        //calcula total
        for(int i=0; i<clasificacionGeneral.size(); i++){
            c=clasificacionGeneral.get(i);
            c.acumulaTiempoTotal();
        }
        Collections.sort(clasificacionGeneral, (o1, o2) -> 
        (int) (o1.getTiempoAcumulado()) - (int)(o2.getTiempoAcumulado())); 
        
        System.out.println("CLASIFICACION PARCIAL");
        for(Ciclista manolin : clasificacionGeneral){
            System.out.println(manolin);
        }
    }

    public Carrera(String nombre, String pais, ArrayList<Equipo> listaEquipos,
            ArrayList<Ciclista> clasificacionGeneral) {
        this.nombre = nombre;
        this.pais = pais;
        this.listaEquipos = listaEquipos;
        this.clasificacionGeneral = clasificacionGeneral;
    }

    public void añadirEquipo(Equipo equipo){
        listaEquipos.add(equipo);
    }

    public void listarEquipo(){
        //REPETIR DURANTE EL TAMAÑO DE LISTAEQUIPOS
        for(int i=0; i<listaEquipos.size(); i++){
            //VAMOS OBTENIENDO LOS EQUIPOS DE CADA POSICION Y LO GUARDAMOS EN EQUIPO
            Equipo e = (Equipo)listaEquipos.get(i);
            //MOSTRAMOS EN PANTALLA LO GUARDADO EN E
            System.out.println(e.toString());
        }
    }

    //BUSCAMOS EL EQUIPO
    public void buscarEquipo(){
        //CREAMOS UNA VARIABLE BOOLEANA
        boolean estar = false;
        //GUARDAMOS EL NOMBRE DEL EQUIPO
        Scanner sc = new Scanner(System.in);
        String nombre=sc.next();
        //SI ES FALSE SACAMOS ESTE MENSAJE POR PANTALLA
        if(!estar)System.out.println("Ningun equipo con ese nombre");
    }

    //clasificacion equipos 
    public void clasificacionEquipos() {
    	
    	for(int i=0; i<listaEquipos.size(); i++) {
    		Equipo c =  listaEquipos.get(i);
            System.out.println(c.toString());
    	}
    	

        //clasificacion ciclista
    
        ListIterator<Equipo> iter = listaEquipos.listIterator();
        //MIENTRAS HAYA ELEMENTOS EN LA SIGUIENTE POSICION
        while(iter.hasNext()) {
    	//SE OBTIENE EL SIGUIENTE METODO Y SE ESTABLECE SU POSICION
    	//EL NEXTINDEX ES PARA PASAR A LA SIGUIENTE POSICION
    	    iter.next().setPosicion(iter.nextIndex());
    	//AVANZAR AL SIGUIENTE ELEMENTO DE LA LISTA
    	    iter.next();
        } 
    }

    //SE IMPRIME LA CLASICACION
    public void imprimirClasificacion() {
    	ListIterator<Ciclista> iter = clasificacionGeneral.listIterator();
    	//MIENTRAS HAYA SIGUIENTE PUESTO SE IMPRIME EL EQUIPO
    	while(iter.hasNext()) {
    		iter.next().imprimirTipo();
    	}
    }
}
