package Logica;

//La Targetas sociales son mensajes informales, tienen el nombre del emisor y receptor.
class TargetaSocial extends Targeta{
	private String nombreA;
	private String nombreB;
	
	//AL  crear un mesaje se tomar los atributos que se definieron en las instacias contacto
	protected TargetaSocial(String titulo, String cuerpo, Contacto contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	
	//El mensaje puede estar sin cuerpo, ni titulo
	protected TargetaSocial(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.nombreA = contactoA.getNombre();
		this.nombreB = contactoB.getNombre();
	}
	
	@Override
	public String toString() {
		return "TargetaSocial [titulo=" + this.getTitulo() + ", cuerpo="
				+ this.getCuerpo() + ", emailA=" + this.getEmailA() + ", emailB=" + this.getEmailB()
				+ ", nombreA=" + nombreA + ", nombreB=" + nombreB + "]";
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
