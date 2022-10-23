package gestorAplicacion.inferior;

import java.util.ArrayList;

import gestorAplicacion.superior.Contacto;

//Contacto del Usuario guarda sus datos y sus notificaciones
public class ContactoUsuario extends Contacto{
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private ArrayList<Notificacion> notificaciones;
	
	//Guarda la informacion del Usuario
	public ContactoUsuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		super(nombre, email, nombreCompleto);
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificaciones = new ArrayList<Notificacion>();
	}
	
	//agrega una nueva notificacion al Contacto de Usuario
	public void anadirNotificaciones(String titulo, String cuerpo) {
		notificaciones.add(new Notificacion(titulo, cuerpo));
	}
	
	//FIXME
	@Override
	public String toString() {
		return super.toString() + "\nContactoUsuario [logoNegocio=" + logoNegocio + ", descripcionNegocio=" 
				+ descripcionNegocio + ", terminosNegocio=" + terminosNegocio + "]";
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

	public ArrayList<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(ArrayList<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}

	@Override
	public String getNombre() {
		return super.getNombre();
	}

	@Override
	public void setNombre(String nombre) {
		super.setNombre(nombre);
	}

	@Override
	public String getEmail() {
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		super.setEmail(email);
	}

	@Override
	public String getNombreCompleto() {
		return super.getNombreCompleto();
	}

	@Override
	public void setNombreCompleto(String nombreCompleto) {
		super.setNombreCompleto(nombreCompleto);
	}
	
}
