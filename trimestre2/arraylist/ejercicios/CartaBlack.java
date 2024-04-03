package trimestre2.arraylist.ejercicios;

public class CartaBlack {
    String valor;
	String palo;
	
	String[] valores = { "A", "K", "Q", "J", "dos","tres","cuatro" ,"cinco", "seis", "siete", "ocho", "nueve", "diez" };
	String[] palos = { "corazones", "diamantes", "picas", "treboles" };

	public String generaPalo() {
		int ind = (int) (Math.random() * 4);
		return palos[ind];
	}

	public String generaValor() {
		int ind = (int) (Math.random() * 10);
		return valores[ind];

	}

	CartaBlack() {
		this.valor = generaValor();
		this.palo = generaPalo();
		
	}

	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	@Override
	public String toString() {
		return "Carta [valor=" + valor + ", palo=" + palo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((palo == null) ? 0 : palo.hashCode());
		result = prime * result + ((valor == null) ? 0 : valor.hashCode());
		return result;
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CartaBlack other = (CartaBlack) obj;
		if (palo == null) {
			if (other.palo != null)
				return false;
		} else if (!palo.equals(other.palo))
			return false;
		if (valor == null) {
			if (other.valor != null)
				return false;
		} else if (!valor.equals(other.valor))
			return false;
		// son iguales si tienen el mismo palo y el mismo valor
		return true;
	}

}
