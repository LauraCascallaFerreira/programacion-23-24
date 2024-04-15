package trimestre3.herencia.Inmueble;

import java.util.ArrayList;

import trimestre3.herencia.Inmueble.Local.localizacion;

public class testInmueble {

    public static void main(String[] args) {

        ArrayList<Inmueble> inmuebles = new ArrayList<>();

        Casa_Rural casa_Rural = new Casa_Rural(85, generaArea(), "Cebem 33", 3, 5, 2, 10, 20);
        inmuebles.add(casa_Rural);

        Rural_Conjunto_Cerrado conjunto_Cerrado = new Rural_Conjunto_Cerrado(32, generaArea(), "Teixugueiras 13", 2, 4, 2, 5, 40, 10000, false, true);
        inmuebles.add(conjunto_Cerrado);

        Urbana_Independiente urbana_Independiente = new Urbana_Independiente(3, generaArea(), "hola trece", 2, 2, 1, 4, 15);
        inmuebles.add(urbana_Independiente);

        Apartamento_ApartaEstudio apartaEstudio = new Apartamento_ApartaEstudio(13, generaArea(), "Coia 12", 1, 1, 3000);
        inmuebles.add(apartaEstudio);

        Apartamento_Familiar familiar = new Apartamento_Familiar(4, generaArea(), "Teis 32", 2, 3, 400);
        inmuebles.add(familiar);

        Local_Comercial local_Comercial = new Local_Comercial(5, generaArea(), "Vialia", localizacion.INTERNO, "Vialia");
        inmuebles.add(local_Comercial);

        Local_Oficina local_Oficina = new Local_Oficina(7, generaArea(), "García Barbón", localizacion.CALLE, true);
        inmuebles.add(local_Oficina);

        double precio=0d;

        for(Inmueble i : inmuebles){
            System.out.println(i.toString());
            double p = i.calculaPrecioVenta();
            System.out.println("Precio: "+p);
            precio+=p;
        }

        double IVA = 0.21*precio;

        System.out.println("Precio total de los inmuebles: "+precio);
        System.out.println("IVA 21%: "+IVA);
        System.out.println("Total: "+1.21*precio);
        
    }

    //area random para inmueble y herederos
    public static int generaArea(){
        return (int)(30+Math.random()*120);
    }
}
