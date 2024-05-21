package trimestre3.herencia.fockingCiclistas;

public class Escalador extends Ciclista{
    
    private double aceleradorPromedio;
    private double gradoRampa;

    public Escalador(int identificador, String nombre, double aceleradorPromedio, double gradoRampa) {
        super(identificador, nombre);
        this.aceleradorPromedio = aceleradorPromedio;
        this.gradoRampa = gradoRampa;
    }

    public double getAceleradorPromedio() {
        return aceleradorPromedio;
    }

    public void setAceleradorPromedio(double aceleradorPromedio) {
        this.aceleradorPromedio = aceleradorPromedio;
    }

    public double getGradoRampa() {
        return gradoRampa;
    }

    public void setGradoRampa(double gradoRampa) {
        this.gradoRampa = gradoRampa;
    }

    @Override
    String imprimirTipo() {
        return "Soy un escalador";
    }

    protected void imprimir() {
		super.imprimir();
        System.out.println("Acelerador promedio = "+aceleradorPromedio);
        System.out.println("Grado rampa = "+gradoRampa);
	}
}
