package Logica;

class TargetaSocial extends Targeta{
	private String nombreA;
	private String nombreB;
	
	protected TargetaSocial(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	
	protected TargetaSocial(String titulo, String cuerpo, ContactoUsuario contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}

	protected String getNombreA() {
		return nombreA;
	}

	protected void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	protected String getNombreB() {
		return nombreB;
	}

	protected void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}

}
