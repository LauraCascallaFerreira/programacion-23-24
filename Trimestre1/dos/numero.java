package trimestre1.dos;
/*Realiza una clase número que almacene un número entero y tenga las siguientes 
 * características:
 * Constructor por defecto que inicializa a 0 el número interno.
 * Constructor que inicializa el número interno.
 * Método añade que permite sumarle un número al valor interno.
 * Método resta que resta un número al valor interno.
 * Método getValor. Devuelve el valor interno.
 * Método getDoble. Devuelve el doble del valor interno.
 * Método getTriple. Devuelve el triple del valor interno.
 * Método setNumero. Inicializa de nuevo el valor interno.*/

public class numero {
    
    private int num;
	
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public numero(){
		this.num=0;
	}
	
	public numero(int num){
		this.num=num;
	}
	
	public int getDoble() {
		return 2*num;
	}
	
	public int getTriple() {
		return 3*num;
	}
	
	@Override
	public String toString() {
		return "numero [num=" + num + ", getDoble()=" + getDoble() + ", getTriple()=" + getTriple() + ", getNum()="
				+ getNum() + "]";
	}
	
	public void suma(int suma) {
		num=num+suma;
	}
	
	public void resta(int resta) {
		num=num-resta;
	}
}
