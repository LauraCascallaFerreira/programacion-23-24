package trimestre2.objetos.atleta;

public class atleta {
    
    int id;
    String nombre;
    double tiempo;

    static int count=0;
    static String seleccion="Colombia";
    static double tiempoEquipo=0d;

    public atleta(String nombre) {
        count++; //DIFERENCIAS COUNT++ Y ++COUNT
        this.id = count;
        this.nombre = nombre;
        this.tiempo = Math.random()*11;
    }

    //CORRER 400 METROS ACTUALIZANDO EL TIEMPO TOTAL DE CARRERA DEL EQUIPO SUMANOD EL TIEMPO
    //DE CARRERA DE CADA ATLETA
    //IMPRIMIR EL NOMBRE DE LA SELECCION DE ATLETISMO, SIENDO ATRIBUTO ESTATICO
    public static void imprimeDatos(){
        System.out.println(seleccion+" --- "+tiempoEquipo);
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    //IMPRIMIR EL TIEMPO TOTAL OBTENIDO POR EL EQUIPO DE ATLETISMO
    public static void calcularTiempo(atleta[] equipo){
        for(int i=0; i<equipo.length; i++){
            tiempoEquipo+=equipo[i].getTiempo();
        }
    }

    @Override
    public String toString() {
        return "atleta [id=" + id + ", nombre=" + nombre + ", tiempo=" + tiempo + "]";
    }
}
