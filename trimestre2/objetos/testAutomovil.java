package trimestre2.objetos;

import trimestre2.objetos.automovil.tipoAutomovil;
import trimestre2.objetos.automovil.tipoColor;
import trimestre2.objetos.automovil.tipoCombustible;

public class testAutomovil {
    public static void main(String[] args) {
        automovil uno = new automovil("Audi", 3, 1000, 4, 5, 250, tipoColor.NEGRO, tipoCombustible.DIESEL, tipoAutomovil.SUV, 120);
        System.out.println(uno);
        System.out.println();
        uno.frenar();
        System.out.println(uno);
        uno.acelerar(150);
        System.out.println(uno);
        uno.desacelerar(20);
        System.out.println(uno);
        System.out.println("El tiempo de llegada es: "+uno.calcularTiempoLlegada(400));
        
    }
}
