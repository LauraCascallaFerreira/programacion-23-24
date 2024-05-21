package trimestre3.herencia.SeleccionFutbol2;

public class Entrenador extends SeleccionFutbol{

     //Atributos
     private String licencia;

     //Constructor herencia
     public Entrenador(int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
     }
 
     //Constructor completo
     public Entrenador(int id, String nombre, String apellidos, int edad, String licencia) {
        super(id, nombre, apellidos, edad);
        this.licencia = licencia;
     }

     //Getters y setters
     public String getIdFederacion() {
         return licencia;
     }
 
     public void setIdFederacion(String licencia) {
         this.licencia = licencia;
     }

     //Métodos propios
     @Override
     public void entrenar(){
        System.out.println("Dirige un entrenamiento");
     }

     @Override
     public void jugarPartido(){
        System.out.println("Dirige un partido");
     }

     public void planificarEntrenamiento(){
        System.out.println("Planifica un entrenamiento");
     }

     @Override
     public void concentrarse(){
      System.out.println("Me concentro");
     }

     @Override
     public void viajar(){
         System.out.println("Entrenador-->Viajo en first class");
     }
 
     @Override
     public String toString() {
         return super.toString()+"Entrenador [licencia=" + licencia + "]";
     }
}
