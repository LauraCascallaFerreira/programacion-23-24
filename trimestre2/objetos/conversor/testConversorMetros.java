package trimestre2.objetos.conversor;

public class testConversorMetros {
    public static void main(String[] args) {

        conversorMetros uno = new conversorMetros(12);
        System.out.println(uno.toString()+" metros");
        
        System.out.println("En centímetros: "+uno.metrosACentímetros());
        System.out.println("En milímetros: "+uno.metrosAMilímetros());
        System.out.println("En pulgadas: "+uno.metrosAPulgadas());
        System.out.println("En pies: "+uno.metrosAPies());
        System.out.println("En yardas: "+uno.metrosAYardas());
    }
}
