package Logica;

public class TargetaSocial extends Targeta{
	private String nombreA;
	private String nombreB;
	
	public TargetaSocial(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	
	public TargetaSocial(String titulo, String cuerpo, ContactoUsuario contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}

	public String getNombreA() {
		return nombreA;
	}
	public void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}
	public String getNombreB() {
		return nombreB;
	}
	public void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}

}
