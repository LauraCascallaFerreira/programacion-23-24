package trimestre2.objetos.figura;

public abstract class figura {

    //atributos
    String nombre;

    figura(){
        this.nombre="";
    }

    figura(String nombre){
        this.nombre=nombre;
    }

    double calcularPerimetro(){
        return 0d;
    }

    abstract double calcularArea();

    @Override
    public String toString() {
        return "figura [nombre=" + nombre + "]";
    }
}
