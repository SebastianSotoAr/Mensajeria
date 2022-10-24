package gestorAplicacion.inferior;

import java.io.Serializable;

import gestorAplicacion.superior.Contacto;

//Los contactos pendientes son personas con las que no se a iniciado un conversacion.
class ContactosPendientes extends Contacto implements Serializable {
	private final String mensajes;

	//Crea el contacto sin mensajes
	ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.mensajes = "No hay mensajes";
	}

	String getTargeta() {
		return mensajes;
	}
	
	@Override
	//FIXME
	public String toString() {
		return super.toString() + "\nContactosPendientes [mensajes=" + mensajes + "]";
	}

	@Override
	protected String getNombre() {
		return super.getNombre();
	}

	@Override
	protected void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	protected String getEmail() {
		return super.getEmail();
	}

	@Override
	protected void setEmail(String email) {
		super.setEmail(email);
	}

	@Override
	protected String getNombreCompleto() {
		return super.getNombreCompleto();
	}

	@Override
	protected void setNombreCompleto(String nombreCompleto) {
		super.setNombreCompleto(nombreCompleto);
	}
	
}
