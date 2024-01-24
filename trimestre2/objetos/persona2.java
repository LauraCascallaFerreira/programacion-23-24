package trimestre2.objetos;

public class persona2 {

    private String nombre;
    private String apellido;
    private String paisNacimiento;
    private int id;
    private int añoNacimiento;
    //modificador nombre enum nombre atributo
    private genero genero;

    public persona2(String nombre, String apellido, String paisNacimiento, int id, int añoNacimiento, genero genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.paisNacimiento = paisNacimiento;
        this.id = id;
        this.añoNacimiento = añoNacimiento;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "persona2 [nombre=" + nombre + ", apellido=" + apellido + ", paisNacimiento=" + paisNacimiento + ", id="
                + id + ", añoNacimiento=" + añoNacimiento + ", genero=" + genero + "]";
    }
    
}
