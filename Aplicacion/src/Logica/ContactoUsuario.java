package Logica;

import java.util.ArrayList;

//Contacto del Usuario, contiene los mensajes enviados a si mismo
class ContactoUsuario extends Contacto{
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private ArrayList<Notificacion> notificaciones;
	
	//Al momento de ser el creado contacto de Usuario toma los atributos del Usuario 
	ContactoUsuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		super(nombre, email, nombreCompleto);
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificaciones = new ArrayList<Notificacion>();
	}

	String getLogoNegocio() {
		return logoNegocio;
	}

	void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	String getTerminosNegocio() {
		return terminosNegocio;
	}

	void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	ArrayList<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	void setNotificaciones(ArrayList<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	
}
