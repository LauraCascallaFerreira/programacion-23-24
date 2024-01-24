package trimestre2.objetos;

public class testPersona {
    
    public static void main(String[] args) {
        persona p1 = new persona("Manolor", "Escobar", 12,  1834);
        persona p2 = new persona("Franz", "Beckenbauer", 23, 1945);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
