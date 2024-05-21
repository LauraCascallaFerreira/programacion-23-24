package trimestre3.herencia.Aritmetica;

public class Numero {

    //atributos
	public double valor;

    //constructores
	public Numero(double valor) {
		this.valor = valor;
	}
	
	public Numero() {
		this.valor = 0;
	}
	
    //setters y  getters
	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

    //toString
	@Override
	public String toString() {
		return "Numero [valor=" + valor + "]";
	}

    //Equals
	@Override
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(getClass()!=obj.getClass())
			return false;
		Numero other = (Numero) obj;
		return valor == other.valor;
	}
	
    //HashCode
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
    //metodos propios

    //retorna la suma de los números.
	public void sumar (Numero num){
		this.setValor(this.getValor()+num.getValor());
		//return this;
	}

	public void restar (Numero num){
		this.setValor(this.getValor()-num.getValor());
		//return this;
	}

	public void multiplicar (Numero num){
		this.setValor(this.getValor()*num.getValor());
		//return this;
	}

	public void dividir (Numero num){
		if(num.getValor()!=0)
			this.setValor(this.getValor()/num.getValor());
		else
			System.out.println("Error aritmético");
		//return this;
	}
}