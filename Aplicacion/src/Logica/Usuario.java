package Logica;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String email;
	private String nombreCompleto;
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private Notificacion notificacion;
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	public Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio, Notificacion notificacion, ContactoUsuario contactoUsuario,
			ArrayList<ContactosLocales> contactosLocales, ArrayList<ContactosPendientes> contactosPendientes) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificacion = notificacion;
		this.contactoUsuario = contactoUsuario;
		this.contactosLocales = contactosLocales;
		this.contactosPendientes = contactosPendientes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getLogoNegocio() {
		return logoNegocio;
	}

	public void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	public String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	public void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	public String getTerminosNegocio() {
		return terminosNegocio;
	}

	public void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	public Notificacion getNotificacion() {
		return notificacion;
	}

	public void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	public ContactoUsuario getContactoUsuario() {
		return contactoUsuario;
	}

	public void setContactoUsuario(ContactoUsuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	public ArrayList<ContactosLocales> getContactosLocales() {
		return contactosLocales;
	}

	public void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
		this.contactosLocales = contactosLocales;
	}

	public ArrayList<ContactosPendientes> getContactosPendientes() {
		return contactosPendientes;
	}

	public void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
		this.contactosPendientes = contactosPendientes;
	}

}
