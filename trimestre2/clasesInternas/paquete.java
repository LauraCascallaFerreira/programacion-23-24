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

    public void setRemitente(persona remitente) {
        this.remitente = remitente;
    }

    public void setDestinatario(persona destinatario) {
        this.destinatario = destinatario;
    }

    public void setEnvio(tipoEnvio envio) {
        this.envio = envio;
    }

    public void setContenido(tipoContenido contenido) {
        this.contenido = contenido;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double valorPaquete() {
		int unitario = 0;
		if (this.envio == envio.NACIONAL) {
			if (this.contenido == contenido.DOCUMENTO) {

				if (peso > 2)
					unitario = 3000;
				else
					unitario = 2000;
			}
			if (this.contenido == contenido.MERCANCIA) {

				if (peso > 5)
					unitario = 7000;
				else
					unitario = 5000;
			}
		}
		if (this.envio == envio.INTERNACIONAL) {
			if (this.contenido == contenido.DOCUMENTO) {

				if (peso > 2)
					unitario = 15000;
				else
					unitario = 10000;
			}
			if (this.contenido == contenido.MERCANCIA) {

				if (peso > 5)
					unitario = 20000;
				else
					unitario = 12000;
			}
		}
		return peso*unitario;
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
