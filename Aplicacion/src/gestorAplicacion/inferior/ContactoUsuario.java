package gestorAplicacion.inferior;

import java.util.ArrayList;
import java.util.List;

import baseDatos.Deserializador;
import gestorAplicacion.superior.Contacto;
import uiMain.ConexionUsuario;

//Contacto del Usuario guarda sus datos y sus notificaciones
public class ContactoUsuario extends Contacto {
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private List<Notificacion> notificaciones;
	
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
	public void anadirNotificaciones(String titulo, String cuerpo, String urgencia) {
		notificaciones.add(new Notificacion(titulo, cuerpo, urgencia));
	}
	
	//FIXME
	@Override
	public String toString() {
		return super.toString() + "\nTipo: ContactoUsuario [\n\tLogo del Negocio: " + logoNegocio 
				+ "\n\tDescripcion del Negocio: " + descripcionNegocio + "\n\tTerminos del Negocio: " 
				+ terminosNegocio + "\n]";
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

	public List<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	public void setNotificaciones(List<Notificacion> notificaciones) {
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
