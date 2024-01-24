package trimestre2.objetos.caja;

public class caja {
    //ATRIBUTOS
	double base;
	double anchura;
	double altura;
	
	enum tipo {
		CARTON, MADERA, HIERRO
	};

	tipo tipo;
	
	//CONSTRUCTORES
	public caja(double base, double anchura, double altura) {
		this.base = base;
		this.anchura = anchura;
		this.altura = altura;
	}
	
	public caja() {
		this.base = 0;
		this.anchura = 0;
		this.altura = 0;
	}
	
	public caja(double longitud) {
		this.base = longitud;
		this.anchura = longitud;
		this.altura = longitud;
	}
	
	public caja( double base, double anchura, double altura, tipo tipo) {
		this(base, anchura, altura);
		this.tipo = tipo;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Caja [longitudBase=" + base + ", anchura=" + anchura + ", altura=" + altura + ", tipo=" + tipo + "]";
	}
	
	//MÉTODOS
}
