package Trimestre1.tres;

public class Letrass {
    /*5. Realiza una clase letras que almacene una letra y la convierta a mayúsculas. La clase tendrá los siguientes
         métodos:
         getLetra que devolverá la letra
         printLetra que devolverá la letra por pantalla */ 

         private char letra;

        public Letrass(char letra) {
            this.letra = ponMayusculas(letra);
        }

        public char ponMayusculas(char l){
            if(l>=97 && l<=122){
                l=(char)(l-32);
                return l;
            }
            return l;
        }

        public char getLetra() {
            return letra;
        }

        public void setLetra(char letra) {
            this.letra = ponMayusculas(letra);
        }

        @Override
        public String toString() {
            return "Letrass [letra=" + letra + "]";
        }
}
