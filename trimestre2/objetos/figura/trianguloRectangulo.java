package trimestre2.objetos.figura;

public class trianguloRectangulo extends figura{

    enum TipoTriangulo{EQUILATERO,ESCALENO,ISOSCELES}
	
	TipoTriangulo nome;
	int base; // Atributo que define la base de un triángulo rectángulo
	int altura; // Atributo que define la altura de un triángulo rectángulo

	public trianguloRectangulo(String nombre,int base, int altura) {
        super(nombre);
		this.base = base;
		this.altura = altura;
		setTipoTriangulo();
	}

	double calcularArea() {
		return (base * altura / 2);
	}

	double calcularPerimetro() {
		return (base + altura + calculaHipotenusa());
	}

	public double calculaHipotenusa() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(base, 2));
	}

	void setTipoTriangulo() {
		if ((base == altura) && (base == calculaHipotenusa()) && (altura == calculaHipotenusa())) {
			System.out.println("Es un triángulo equilátero");
			this.nome=TipoTriangulo.EQUILATERO;
		}
		else if ((base != altura) && (base != calculaHipotenusa()) && (altura != calculaHipotenusa())) {
			System.out.println("Es un triángulo escaleno");
			this.nome=TipoTriangulo.ESCALENO;
		}
		else {
			System.out.println("Es un triángulo isósceles");
			this.nome=TipoTriangulo.ISOSCELES;
		}
	}

	public TipoTriangulo getNombre() {
		return nome;
	}

	@Override
	public String toString() {
		return super.toString()+"TrianguloRectangulo [nome=" + nome + ", base=" + base + ", altura=" + altura + "]";
	}
}
