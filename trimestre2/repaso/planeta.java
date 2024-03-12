package trimestre2.repaso;

public class planeta {

    String nombre=null;
    int satelites=0;
    double masa=0;
    double volumen=0;
    int diametro=0;
    int distanciaSol=0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO};
    boolean observable=false;

    public planeta() {
    }
    
    public planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol,
            boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSatelites() {
        return satelites;
    }

    public void setSatelites(int satelites) {
        this.satelites = satelites;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(int distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public boolean isObservable() {
        return observable;
    }

    public void setObservable(boolean observable) {
        this.observable = observable;
    }

    /*
La clase debe incluir los siguientes métodos:
u Determinar si un planeta del sistema solar se considera exterior.
Un planeta exterior está situado más allá del cinturón de asteroides. 
El cinturón de asteroides se encuentra entre 2.1 y 3.4 UA. Una
unidad astronómica (UA) es la distancia entre la Tierra y el Sol=
149597870 Km.
u En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la
densidad de cada planeta y si el planeta es un planeta exterior del
sistema solar. */

    public double calcularDensidad(double masa, double volumen){
        return masa/volumen;
    }

    
}
