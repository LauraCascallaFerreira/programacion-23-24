package trimestre1.cuatro.propuestos;

public class martillo extends pez {

    private double longitud_nariz;

    public martillo(){

    }

    public martillo(String nombre, int longitud, float peso, double longitud_nariz) {
        super(nombre, longitud, peso);
        this.longitud_nariz = longitud_nariz;
    }

    public double getLongitud_nariz() {
        return longitud_nariz;
    }

    public void setLongitud_nariz(double longitud_nariz) {
        this.longitud_nariz = longitud_nariz;
    }

    @Override
    public boolean soyComestible() {
        if(longitud_nariz>40)
            return false;
        else 
            return true;
    }

    @Override
    public void nada() {
        super.nada();
        System.out.println("Yo nado que lo clavo.");
    }

    @Override
    public String toString() {
        return "martillo [longitud_nariz=" + longitud_nariz + super.toString()+"]";
    }
}
