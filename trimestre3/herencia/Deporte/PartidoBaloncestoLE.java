package trimestre3.herencia.Deporte;

public class PartidoBaloncestoLE implements Partido, PartidoBaloncesto{
    
    String nombreEquipoLocal;
    String nombreEquipoVisitante;
    int puntosEquipoLocal;
    int puntosEquipoVisitante;

    @Override
    public void setEquipoLocal(String nombreEquipo) {
        this.nombreEquipoLocal=nombreEquipo;
    }

    @Override
    public void setEquipoVisitante(String nombreEquipo) {
        this.nombreEquipoVisitante=nombreEquipo;
    }

    @Override
    public void setPuntosEquipoLocal(int puntosEquipo) {
        this.puntosEquipoLocal=puntosEquipo;
    }

    @Override
    public void setPuntosEquipoVisitante(int puntosEquipo) {
        this.puntosEquipoVisitante=puntosEquipo;
    }

    @Override
    public String toString() {
        return "PartidoBaloncestoLE [nombreEquipoLocal=" + nombreEquipoLocal + ", nombreEquipoVisitante="
                + nombreEquipoVisitante + ", puntosEquipoLocal=" + puntosEquipoLocal + ", puntosEquipoVisitante="
                + puntosEquipoVisitante + "]";
    }
}
