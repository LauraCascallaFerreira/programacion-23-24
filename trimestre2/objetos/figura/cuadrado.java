package trimestre2.objetos.figura;

public class cuadrado extends figura{
    int lado; // Atributo que define el lado de un cuadrado
	
	public cuadrado(String nombre,int lado) {
        super(nombre);
	    this.lado = lado;
	}
	
	double calcularArea() {
	    return lado*lado;
	}

	double calcularPerímetro() {
	    return (4*lado);
	}

    @Override
    public String toString() {
        return super.toString()+"cuadrado [lado=" + lado + "]";
    }
}
