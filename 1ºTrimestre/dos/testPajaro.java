public class testPajaro {

    public static void main(String[] args) {

        /*declara el nombre de una referencia
         * para manipular, apuntar  a un objeto pajaro*/

        pajaro p;

        /*Crea un objeto pajaro con new pajaro
         * y lo asigna a una referencia p*/

        p=new pajaro();
        p.setedad(5);
        int num = p.getEdad();

        System.out.println("este pajaro tiene "+num);

        pajaro p2= new pajaro ('F', 2343, "disecado");
        pajaro p3= new pajaro("bumbury");

        System.out.println(p2.toString());
        System.out.println(p3.toString());
    }
    
}
