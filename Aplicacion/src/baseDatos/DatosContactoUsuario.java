package baseDatos;

import java.io.Serializable;

public class DatosContactoUsuario implements Serializable{
	private String nombre;
	private String email;
	private String nombreCompleto;
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	
	public static DatosContactoUsuario datos;
	
	public DatosContactoUsuario(String nombre, String email, String nombreCompleto, String logoNegocio,
			String descripcionNegocio, String terminosNegocio) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
	}
	
	public static void guardarContactoUsuario(String nombre, String email, String nombreCompleto, 
			String logoNegocio, String descripcionNegocio, String terminosNegocio) {
		DatosContactoUsuario datos = new DatosContactoUsuario(nombre, email, nombreCompleto, logoNegocio, 
				descripcionNegocio, terminosNegocio);
		Serializador.serializar(datos);
	}
	
	public static void cargarContactoUsuario( ) {
		Deserializador.deserializar();
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

	public static DatosContactoUsuario getDatos() {
		return datos;
	}

	public static void setDatos(DatosContactoUsuario datos) {
		DatosContactoUsuario.datos = datos;
	}
	
}
