package trimestre2.objetos;

import trimestre2.objetos.planeta.tamaño;

public class testPlaneta {
    
    public static void main(String[] args) {
        planeta p1 = new planeta("Freddy Mercury", 4, 1678.9, 123.8, 600, 19272463, tamaño.gaseoso, true, 4, 12);
        System.out.println(p1);
        System.out.println("Densidad: ");
        System.out.println(p1.calcularDensidad(1678.9, 123.8));
        p1.esExterior(19272463);
    }
}
