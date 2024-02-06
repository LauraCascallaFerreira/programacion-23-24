package trimestre2.arrays;

public class computador {
	
    String marca;
	int memoria;

	String procesador;
	String sistema; 
	double precio; 

	
	public computador(String marca, int memoria, String procesador, String sistema, double precio) {
		this.marca = marca;
		this.memoria = memoria;
		this.procesador = procesador;
		this.sistema = sistema;
		this.precio = precio;
	}

	public String getMarca() {
		return marca;
	}


	@Override
	public String toString() {
		return "Computador [marca=" + marca + ", memoria=" + memoria + ", procesador=" + procesador + ", sistema="
				+ sistema + ", precio=" + precio + "]";
	}
}
