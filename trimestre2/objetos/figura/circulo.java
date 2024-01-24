package trimestre2.objetos.figura;

public class circulo extends figura{

    int radio; // Atributo que define el radio de un círculo
	
	circulo(String nombre, int radio) {
        super(nombre);
	    this.radio = radio;
	}
	
	double calcularArea() {
	    return Math.PI*Math.pow(radio,2);
	}
	
	double calcularPerimetro() {
	    return 2*Math.PI*radio;
	}

    @Override
    public String toString() {
        
        return super.toString()+"circulo [radio=" + radio + "]";
    }
}
