package Logica;

class Contacto {
	private String nombre;
	private String email;
	private String nombreCompleto;

	protected Contacto(String nombre, String email, String nombreCompleto) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	protected String getNombreCompleto() {
		return nombreCompleto;
	}

	protected void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", email=" + email + ", nombreCompleto=" + nombreCompleto + "]";
	}
	
}
