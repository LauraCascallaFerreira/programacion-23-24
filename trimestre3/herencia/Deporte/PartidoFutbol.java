package trimestre3.herencia.Deporte;

public interface PartidoFutbol {

    //Atributo estático 
    final public int duracion=90;
    
    //Método que establece el nº de goles de ambos equipos
    public void setGolesEquipoLocal(int golesEquipo);
    public void setGolesEquipoVisitante(int golesEquipo);
}
