package trimestre3.herencia.EquipoFutbol;

import java.util.ArrayList;

public class TestEquipoFutbol {
    public static void main(String[] args) {
        
        Tecnico tecnico = new Tecnico("Claudio", " Giraldez", 40, 10);

        Portero portero = new Portero("Iván", "Villar", 30, true, 1);

        ArrayList<Mediocampo> medioCampos = new ArrayList<>();

        Mediocampo medioCampo1 = new Mediocampo("Fran", "Beltran", 0, true, 28);
        medioCampos.add(medioCampo1);
        Mediocampo medioCampo2 = new Mediocampo("James", "Rodríguez", 28, true, 30);
        medioCampos.add(medioCampo2);
        Mediocampo medioCampo3 = new Mediocampo("Juan Guillermo", " Cuadrado", 31, true, 30);
        medioCampos.add(medioCampo3);
        Mediocampo medioCampo4 = new Mediocampo("Wilmar", "Barrios", 25, true, 12);
        medioCampos.add(medioCampo4);

        ArrayList<Delantero> delanteros = new ArrayList<>();

        Delantero delantero1 = new Delantero("Radamel Falcao", " García", 33, true, 15);
        delanteros.add(delantero1);
        Delantero delantero2 = new Delantero("Duván", "Zapata", 28, true, 12);
        delanteros.add(delantero2);

        ArrayList<Defensa> defensas = new ArrayList<>();

        Defensa defensa1 = new Defensa("Yerry", "Mina", 24, true, 3);
        defensas.add(defensa1);
        Defensa defensa2 = new Defensa("Davison", "Sánchez", 23, true, 8);
        defensas.add(defensa2);
        Defensa defensa3 = new Defensa("William", "Tesillo", 29, true, 13);
        defensas.add(defensa3);
        Defensa defensa4 = new Defensa("Stefan", "Medina", 29, true, 15);
        defensas.add(defensa4);

        //EquipoFutbol equipoFutbol = new EquipoFutbol("Columbus", "Colombia", portero, tecnico, defensas, null, null);
        //equipoFutbol.imprimir();
    }
}
