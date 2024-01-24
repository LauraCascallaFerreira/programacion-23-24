package trimestre2.objetos;

public class persona {
    
    private String nombre;
    private String apellido;
    private int id;
    private int añoNacimiento;

    public persona(String nombre, String apellido, int id, int añoNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.añoNacimiento = añoNacimiento;
    }

    @Override
    public String toString() {
        return "persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", añoNacimiento="
                + añoNacimiento + "]";
    }
}
