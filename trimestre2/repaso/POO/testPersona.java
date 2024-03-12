package trimestre2.repaso.POO;

public class testPersona {
    public static void main(String[] args) {
        persona persona = new persona("Laura", 19, "7654", "mujer", 1.60, 60);
        System.out.println(persona);
        persona.calcularIMC(1.70, 57);
        persona.esMayorEdad(19);
        persona.sexoCorrecto("mujer");
    }
}
