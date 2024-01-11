package trimestre2.repaso2;

/*Se requiere un programa que modele el concepto de un planeta del sistema solar. 
La clase debe incluir los siguientes métodos:

u En un método main se deben crear dos planetas y mostrar los valores de sus atributos en pantalla. Además, se debe imprimir la
densidad de cada planeta y si el planeta es un planeta exterior del
sistema solar. */

public class planeta {

    /*Un nombre de tipo Sring con valor inicial de null.
    Cantidad de satélites de tipo int con valor inicial de cero.
    Masa en kilogramos de tipo double con valor inicial de cero.
    Volumen en kilómetros cúbicos de tipo double con valor inicial de
    cero.
    Diámetro en kilómetros de tipo int con valor inicial de cero.
    Distancia media al Sol en millones de kilómetros, de tipo int con
    valor inicial de cero. 
    Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con
    los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
    Observable a simple vista, de tipo booleano con valor inicial false.*/
    
    enum tamaño {gaseoso, terrestre, enano};

    private String nombre;
    private int satelites=0;
    private double masa=0;
    private double volumen=0;
    private int diametro=0;
    private int distanciaSol=0;
    private tamaño tamaño;
    private boolean observable=false;

    public planeta(String nombre, int satelites, double masa, double volumen, int diametro, int distanciaSol,
            trimestre2.repaso2.planeta.tamaño tamaño, boolean observable) {
        this.nombre = nombre;
        this.satelites = satelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tamaño = tamaño;
        this.observable = observable;
    }

    public double calcularDensidad (double masa, double volumen){
        double densidad=0;
        return densidad=masa/volumen;
    }

    @Override
    public String toString() {
        return "planeta [nombre=" + nombre + ", satelites=" + satelites + ", masa=" + masa + ", volumen=" + volumen
                + ", diametro=" + diametro + ", distanciaSol=" + distanciaSol + ", tamaño=" + tamaño + ", observable="
                + observable + "]";
    }

    /*Determinar si un planeta del sistema solar se considera exterior.
    Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón de 
    asteroides se encuentra entre 2.1 y 3.4 UA. Una
    unidad astronómica (UA) es la distancia entre la Tierra y el Sol=149597870 Km. */
    
    
}
