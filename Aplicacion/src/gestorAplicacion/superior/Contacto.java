package gestorAplicacion.superior;

//Todos los contactos tienen nombre, email y nombre completo
public abstract class Contacto {
	private String nombre;
	private String email;
	private String nombreCompleto;

	//Cada contacto debe tener nombre, email y nombre completo 
	protected Contacto(String nombre, String email, String nombreCompleto) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
	}
	
	//Muetra describe el contacto
	@Override
	public String toString() {
		return "Contacto [\n\tNombre: " + nombre + "\n\tEmail: " + email + "\n\tNombre Completo: " + nombreCompleto + "\n]";
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
	
}
