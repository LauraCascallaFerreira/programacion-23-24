package trimestre2.objetos.figura;

public class rectangulo extends figura{
    int base; // Atributo que define la base de un rectángulo
	int altura; // Atributo que define la altura de un rectángulo
	
	rectangulo(String nombre, int base, int altura) {
        super(nombre);
	    this.base = base;
	    this.altura = altura;
	}
	
	double calcularArea() {
	    return base * altura;
	}
	
	double calcularPerimetro() {
	    return (2 * base) + (2 * altura);
	}

    @Override
    public String toString() {
        
        return super.toString()+"rectangulo [base=" + base + ", altura=" + altura + "]";
    }
}
