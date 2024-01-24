package trimestre1.tres;

public class contadorIngles {

     /*5.Escribe un programa que cuente por pantalla del 1 al 10 en inglés. Utiliza una estructura switch que incluya la
        cláusula default. */

        public static void main(String[] args) {
            
            for(int i=0; i<11; i++){
                switch (i) {
                    case 1:
                        System.out.println("one");
                    break;
                    case 2:
                        System.out.println("two");
                    break;
                    case 3:
                        System.out.println("three");
                    break;
                    case 4:
                        System.out.println("four");
                    break;
                    case 5: 
                        System.out.println("five"); 
                    break;
                    case 6: 
                        System.out .println("six"); 
                    break;
                    case 7: 
                        System.out.println("seven"); 
                    break;
                    case 8: 
                        System.out.println("eight"); 
                        break;
                    case 9: 
                        System. out .println ("nine");
                    break;
                    default: 
                        System.out.println("ten") ;
                    break;
                }
            }
        }   
    
}
