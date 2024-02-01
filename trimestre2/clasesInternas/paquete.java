package trimestre2.clasesInternas;
/*Atributos: remitente, destinatario, tipo de envío, contenido y peso del paquete.
 * El remitente y destinatario son de tipo de persona, siendo esta una calse interna
 * con atributos:
 */
public class paquete {

    enum tipoEnvio {NACIONAL, INTERNACIONAL}
    enum tipoContenido {DOCUMENTO, MERCANCIA}

    persona remitente;
    persona destinatario;
    tipoEnvio envio;
    tipoContenido contenido;
    double peso;
    
    public paquete() {
        
    }

    public paquete(persona remitente, persona destinatario, tipoEnvio envio, tipoContenido contenido, double peso) {
        this.remitente = remitente;
        this.destinatario = destinatario;
        this.envio = envio;
        this.contenido = contenido;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "paquete [remitente=" + remitente + ", destinatario=" + destinatario + ", envio=" + envio
                + ", contenido=" + contenido + ", peso=" + peso + "]";
    }

    class persona{
        String nombre;
        String apellido;
        long id;
        String direccion;
        long telefono;

        public persona() {

        }

        public persona(String nombre, String apellido, long id, String direccion, long telefono) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.id = id;
            this.direccion = direccion;
            this.telefono = telefono;
        }

        @Override
        public String toString() {
            return "persona [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", direccion=" + direccion
                    + ", telefono=" + telefono + "]";
        } 
    }
}
