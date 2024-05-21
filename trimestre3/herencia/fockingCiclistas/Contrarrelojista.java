package trimestre3.herencia.fockingCiclistas;

public class Contrarrelojista extends Ciclista{
    
    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    @Override
    String imprimirTipo() {
        return "Soy un contrarrelojista";
    }

    protected void imprimir() {
		super.imprimir();
        System.out.println("Velocidad maxima = "+velocidadMaxima);
	}

    
}
