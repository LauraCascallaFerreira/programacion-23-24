package trimestre2.clasesInternas;

public class testPaquete {

    public static void main(String[] args) {
        /*Aqui pepe explicó que podemos declarar Personas pero debemos inicializarlas para poder hacer con ellas
		el constructor de PaqueteEnvio si no ponemos ese = null nos dará error en el constructor del paquete*/
		paquete.persona remit = null;
		paquete.persona dest = null;
		paquete paquete1 = new paquete(remit, dest, null, null, 0);
		//
		
		
		
		
		//Voy a hacerlo de otra forma, que es sin declarar Personas, poniendo a null todo, luego pepe hizo lo que sigue
		
		paquete paquete2 = new paquete(remit, dest, null, null, 0);
		//Aqui en la consola se muestra que remitente y destinatario son "null" porque los inicializamos como tal
		System.out.println(paquete2);
		
		//Esta tarea va sobre aprender esta sintaxis de aquí abajo para poder crear Objetos de clases INTERNAS a otras clases
		paquete.persona manolo = paquete2.new persona("Manolo", "77x", 20, null, 033);
		System.out.println(manolo);
		
		paquete.persona juan = paquete2.new persona("Juan", "78V", 30, null, 044);//("Juan", "78V", 30, 044);
		paquete1.setDestinatario(manolo);
		
		//Aqui en la consola muestra el remitente y el destinatario con valores porque los acabamos de setear.
		System.out.println(paquete2);
		
		
		
		/*Antes de marcharnos Pepe intentó hacer una movida declarando primero el paquete null y haciendo personas 
		antes del constructor o sets del paquete, no funcionó porque dá error al intentar ir a la clase exterior como "null" y ahí nos quedamos,
		que no se puede hacer así aunque él creía que sí al principio*/
		paquete paquete3 = null;
		
		paquete.persona laurita = paquete3.new persona("laurita", null, 0, null, 0);
		paquete.persona pepito = paquete3.new persona("pepito", null, 0, null, 0);
		
		paquete3.setDestinatario(laurita);
		paquete3.setRemitente(pepito);
    }
    
}
