package Logica;

import java.util.ArrayList;

//Los contactos locales son personas con las que ya se inicializo una convesacion
class ContactosLocales extends Contacto{
	private ArrayList<MensajeNegocio> mensajeNegocio;
	private ArrayList<MensajeSocial> mensajeSocial;

	//Genera los contactos locales con los mensajes sociales y de negocios
	ContactosLocales(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		mensajeNegocio = new ArrayList<MensajeNegocio>();
		mensajeSocial = new ArrayList<MensajeSocial>();
	}

	ArrayList<MensajeNegocio> getMensajeNegocio() {
		return mensajeNegocio;
	}

	void setMensajeNegocio(ArrayList<MensajeNegocio> mensajeNegocio) {
		this.mensajeNegocio = mensajeNegocio;
	}

	ArrayList<MensajeSocial> getMensajeSocial() {
		return mensajeSocial;
	}

	void setMensajeSocial(ArrayList<MensajeSocial> mensajeSocial) {
		this.mensajeSocial = mensajeSocial;
	}
	
}
