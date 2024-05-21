package trimestre3.herencia.Universidad;

public class Profesor extends Persona{
    
    //Atributos propios
    public String departamento;
    public String categoria;

    //Constructor completo
    public Profesor(String nombre, String direccion, String departamento, String categoria) {
        super(nombre, direccion);
        this.departamento = departamento;
        this.categoria = categoria;
    }

    //Getters y setters
    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    //Metodos heredados
    @Override
    public void comer() {
        System.out.println("Profesor-->Como en la sala de profesores");
    }

    public void darClar(){
        System.out.println("Hago como que doy clase");
    }

    //ToString
    @Override
    public String toString() {
        return "Profesor [departamento=" + departamento + ", categoria=" + categoria + "]";
    }

    
} //Fin de la clase
