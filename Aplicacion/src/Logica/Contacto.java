package Logica;

public class Contacto {
	private String nombre;
	private String email;
	private String nombreCompleto;

	public Contacto(String nombre, String email, String nombreCompleto) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
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
	
}
