package trimestre3.herencia.SistemaPago;

import java.util.ArrayList;

public class Peaje{
    
    private String nombre;
    private String departamento;
    private int totalPeaje=0;
    private static int totalCamiones=0;
    private static int totalMotos=0;
    private static int totalCoches=0;

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    public Peaje(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void añadirVehiculo (Vehiculo vehiculo){
        if(vehiculo instanceof Moto){
            Peaje.totalMotos++;
        } else if(vehiculo instanceof Camion){
            Peaje.totalCamiones++;
        } else if(vehiculo instanceof Coche){
            Peaje.totalCoches++;
        }
        vehiculos.add(vehiculo);
    }

    public int calcularPeaje(Vehiculo vehiculo){
        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculo instanceof Moto){
                totalPeaje+=((Moto)vehiculo).getValorPeaje();
            } else if(vehiculo instanceof Camion){
                totalPeaje+=((Camion)vehiculo).getValorPeajeEje()*((Camion)vehiculo).getNumeroEjes();
            } else if(vehiculo instanceof Coche){
                totalPeaje+=((Coche)vehiculo).getValorPeaje();
            }
        }
        return totalPeaje;
    }

    @Override
    public String toString() {
        return "Peaje [nombre=" + nombre + ", departamento=" + departamento + ", totalPeaje=" + totalPeaje + ", totalCoches="+totalCoches+", totalMotos="+totalMotos+", totalCamiones="+totalCamiones+"]";
    }

    
}
