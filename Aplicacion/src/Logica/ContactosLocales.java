package Logica;

import java.util.ArrayList;

//Los contactos locales son personas con las que ya se inicializo una convesacion
class ContactosLocales extends Contacto{
	private ArrayList<Mensaje> mensajes;

	//Genera los contactos locales con los mensajes sociales y de negocios
	ContactosLocales(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		mensajes = new ArrayList<Mensaje>();
	}

	ArrayList<Mensaje> getMensajes() {
		return mensajes;
	}

	void setMensajes(ArrayList<Mensaje> mensajes) {
		this.mensajes = mensajes;
	}
	
}
