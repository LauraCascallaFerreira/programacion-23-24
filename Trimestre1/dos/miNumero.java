package trimestre1.dos;
/* Realiza una clase minumero que proporcione el doble, triple y cuádruple de un 
 * número proporcionado en su constructor (realiza un método para doble, otro 
 * para triple y otro para cuádruple). Haz un test que testee los distintos
 * metodos.*/

public class miNumero {
    
    //EXAMEN EXAMEN EXAMEN EXAMEN EXAMEN EXAMEN EXAMEN EXAMEN
	//Atributos
	int num;
	
	miNumero(int n){
		this.num=n;
	}
	
	//No se pasa nada porque el numero ya esta en el atributo
	public int dobleNumero() {
		return 2*num;
	}
	
	public int tripleNumero() {
		return 3*num;
	}
	
	public int cuadrupleNumero() {
		return 4*num;
	}

	@Override
	public String toString() {
		return "miNumero [num=" + num + ", dobleNumero()=" + dobleNumero() + ", tripleNumero()=" + tripleNumero()
				+ ", cuadrupleNumero()=" + cuadrupleNumero() + "]";
	}
}
