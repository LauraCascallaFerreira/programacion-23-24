package trimestre1.cosasExamen;
public class rectanguloTest {

    public static void main (String[] args){
        rectangulo r1 = new rectangulo(5,7,"");
        rectangulo r2 = (rectangulo) r1.clone();
        rectangulo poli = new rectangulo(1,2,"poli");
        System.out.println(poli);
        //asignacion
        poli=r1;
        System.out.println(poli);
        r2.incrementarAncho();
        r2. incrementarAlto();
        r1.setNombre("Chiquito");
        r2.setNombre("Grande");
        System. out.println("Alto: "+r1.getAlto());
        System. out.println ("Ancho: "+r1.getAncho());
        System.out.println ("Alto: "+r2.getAlto());
        System.out.println ("Ancho: "+r2.getAncho());
        System.out.println("Nombre: "+r1.getNombre());
        System.out.println("Nombre: "+r2.getNombre());
        
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r1.equals(r2));
        System.out.println(r1==r2);
        System.out.println(r1.equals(poli));
        System.out.println(r1==poli);
    }
}
