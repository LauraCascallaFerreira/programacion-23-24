package trimestre2.objetos;

public class testPersona2 {
    public static void main(String[] args) {
        persona2 p1 = new persona2("Pablo", "Escobar", "Fariña", 12, 1834, genero.H);
        persona2 p2 = new persona2("Franz", "Beckenbauer", "Nazi", 23, 1945, genero.H);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
