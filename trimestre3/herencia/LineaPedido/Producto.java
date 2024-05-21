package trimestre3.herencia.LineaPedido;

public class Producto {

    int identificador;
    String nombre;
    String descripcion;
    int precio;

    public Producto(int identificador, String nombre, String descripcion, int precio) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto [identificador=" + identificador + ", nombre=" + nombre + ", descripcion=" + descripcion
                + ", precio=" + precio + "]";
    }
}
