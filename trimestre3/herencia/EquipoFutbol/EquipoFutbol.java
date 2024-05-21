package trimestre3.herencia.EquipoFutbol;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class EquipoFutbol {
    
    String nombre;
    String pais;
    Portero portero;
    Tecnico tecnico;
	Array Defensa[] = new Array[4];
	Array Mediocampo[] = new Array[3];
	Array Delantero[] = new Array[3];
    ArrayList<Mediocampo> medioCampos = new ArrayList<>();
    ArrayList<Delantero> delanteros = new ArrayList<>();
    ArrayList<Defensa> defensas = new ArrayList<>();

    public EquipoFutbol(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
    }

    public EquipoFutbol(String nombre, String pais, Portero portero, Tecnico tecnico, Array[] defensa,
			Array[] mediocampo, Array[] delantero) {
		this(nombre,pais);//LLAMADA AL OTRO CONSTRUCTOR
		this.portero = portero;
		this.tecnico = tecnico;
		Defensa = defensa;
		Mediocampo = mediocampo;
		Delantero = delantero;
	}



	/*public EquipoFutbol(String nombre, String pais, Portero portero, Tecnico tecnico, ArrayList<Mediocampo> medioCampos,
            ArrayList<Delantero> delanteros, ArrayList<Defensa> defensas) {
        this(nombre, pais); //SE ESTA HACIENDO UNA LLAMADA AL OTRO CONSTRUCTOR
        this.portero = portero;
        this.tecnico = tecnico;
        this.medioCampos = medioCampos;
        this.delanteros = delanteros;
        this.defensas = defensas;
    }*/

    public void imprimir() {
		System.out.println("\n			FICHA TÉCNICA - " + nombre);
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("\n             \tNOMBRE     \tEDAD");
		System.out.println("");
		System.out.println("\nTÉCNICOS     \t-          \t-   ");
		System.out.println();
		System.out.println("             \t" + tecnico.getNombre()+" "+tecnico.getApellidos() + "     \t" + tecnico.getEdad());
		System.out.println("");
		System.out.println("\nPORTERO      \t-          \t-       \tGOLES RECIBIDOS");
		System.out.println();
		System.out.println("             \t" + portero.getNombre() +" "+portero.getApellidos() +  "     \t" + portero.getEdad() + "            \t"
				+ portero.getGolesRecibidos());
		System.out.println("");
		System.out.println("\nMEDIOCAMPOS  \t-          \t-       \tASISTENCIAS");
		System.out.println();
		/*for (Mediocampo m : medioCampos) {
			System.out.println("             \t" + m.getNombre() +" "+m.getApellidos() +  "     \t" + m.getEdad() + "            \t" + m.getNumeroAsistencia());
		}
		System.out.println("");
		System.out.println("\nDELANTEROS   \t-          \t-       \tGOLES");
		System.out.println();
		for (Delantero d : delanteros) {
			System.out.println("             \t" + d.getNombre() +" "+d.getApellidos() +  "     \t" + d.getEdad() + "            \t" + d.getGolesAnotados());
		}
		System.out.println("");
		System.out.println("\nDEFENSAS     \t-          \t-       \tPATADAS");
		System.out.println();
		for (Defensa de : defensas) {
			System.out.println("             \t" + de.getNombre() +" "+de.getApellidos() +  "     \t" + de.getEdad()+      de.getNumeroPatadas());
		}*/
    }
}
