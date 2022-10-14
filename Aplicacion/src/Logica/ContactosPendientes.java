package Logica;

public class ContactosPendientes extends Contacto{
	private final String targeta;

	public ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targeta = "No hay mensajes";
	}

	public String getTargeta() {
		return targeta;
	}

}
