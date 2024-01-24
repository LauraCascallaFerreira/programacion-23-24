package trimestre1.cuatro.propuestos;

public class espada extends pez{

    private int largoApéndice;
    private int numero_De_Aletas;

    public espada(){
        super(); //creamos un pez
    }

    public espada(String nombre, int longitud, float peso){
        super(nombre, longitud, peso);
    } 

    public espada(String nombre, int longitud, float peso, int largoApéndice, int numero_De_Aletas) {
        super(nombre, longitud, peso); //creamos un pez
        this.largoApéndice = largoApéndice;
        this.numero_De_Aletas = numero_De_Aletas;
    }

    public int getLargoApéndice() {
        return largoApéndice;
    }

    public void setLargoApéndice(int largoApéndice) {
        this.largoApéndice = largoApéndice;
    }

    public int getNumero_De_Aletas() {
        return numero_De_Aletas;
    }

    public void setNumero_De_Aletas(int numero_De_Aletas) {
        this.numero_De_Aletas = numero_De_Aletas;
    }    
    
    @Override
    public void nada() {
        super.nada();
        System.out.println(" ¡Ojo que te pincho!");
    }

    @Override
    public String toString() {
        return "espada [largoApéndice=" + largoApéndice + ", numero_De_Aletas=" + numero_De_Aletas + super.toString()+"]";
    }
}
