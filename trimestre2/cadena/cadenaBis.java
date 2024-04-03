package trimestre2.cadena;

public class cadenaBis {
    /*recibir un string como parametro y calcular las mayusculas que tiene
     * metodo que recibe como parametro un string y una letra y decir cuantas veces esta
     * la letra en el string
     * recibir como parametro string y eliminar los espacios en blanco y escribir por
     * pantalla el resultado
     * recibir como parametro un string y obtenga el string escrito al reves
     */
    

        public static int contarLetra(String param, char letra) {
            int con = 0;
            for (int k = 0; k < param.length(); k++)  // 65 a 99
                if (param.charAt(k) == letra ) {
                    con++;
                }
            return con;
        }
        
        public static String voltearCadena (String param) {
            char[] car = param.toCharArray();
            String voltear = "";
            
            for ( int i = car.length-1; i > 0; i--) {
                voltear += car[i];
            }
            return voltear;
        }
        
        public static int cuentaMayusculas(String param) {
            int con = 0;
            for (int k = 0; k < param.length(); k++)  // 65 a 99
                if ((param.charAt(k) <= 'Z') && (param.charAt(k) >= 'A')) {
                    con++;
                }
            return con;
        }
        
        
        public static void main(String[] args) {
            
            String cadena = "Programación Orientada a Objetos";
            System.out.println("Mayusculas: "+cuentaMayusculas(cadena));
            System.out.println("Letras: "+contarLetra(cadena, 'O'));
            System.out.println("Dada la vuelta: "+voltearCadena(cadena));
            
        }
    
}
