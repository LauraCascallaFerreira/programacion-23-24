package trimestre2.cadena;

public class volearCadena {
    public static String voltearCadena(String param) {
        char[] car = param.toCharArray();
        String voltear = "";
    
        for (int i = car.length - 1; i > 0; i--) {
            voltear += car[i];
        }
        return voltear;
    }
    
    public static void main(String[] args) {
    
        String cad = new String("Hola, mundo!");
    
        System.out.println("Dada la vuelta: " + voltearCadena(cad));
    
    }
}
