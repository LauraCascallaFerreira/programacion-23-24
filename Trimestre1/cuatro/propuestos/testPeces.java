package trimestre1.cuatro.propuestos;

public class testPeces {

    public static void main(String[] args) {
        //crear un pez
        pez hola = new pez("Nemo", 12, 200);
        System.out.println(hola);
        System.out.println();
        //crear un espada
        espada adios = new espada("Dori", 100, 50, 35, 4);
        System.out.println(adios);
        adios.nada();
        System.out.println();
        //crear un martillo
        martillo no = new martillo("tuPutaMadre", 200, 350, 4);
        System.out.println(no);
        no.soyComestible();
        //probar metodos nada y soy comestible

        
    }
    
}
