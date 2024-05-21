package trimestre3.herencia.Deporte;

public class PartidoFutbolLE implements Partido, PartidoFutbol{

    String equipoLocal;
    String equipoVisitante;
    int golesEquipoLocal;
    int golesEquipoVisitante;

    @Override
    public void setEquipoLocal(String nombreEquipo) {
        this.equipoLocal=nombreEquipo;
    }

    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.equipoVisitante=nombreEquipo;
    }

    @Override
    public void setGolesEquipoLocal(int golesEquipo) {
        this.golesEquipoLocal=golesEquipo;
    }

    @Override
    public void setGolesEquipoVisitante(int golesEquipo) {
        this.golesEquipoVisitante=golesEquipo;    
    }

    @Override
    public String toString() {
        return "PartidoFutbolLE [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
                + ", golesEquipoLocal=" + golesEquipoLocal + ", golesEquipoVisitante=" + golesEquipoVisitante + "]";
    }

    

    
}
