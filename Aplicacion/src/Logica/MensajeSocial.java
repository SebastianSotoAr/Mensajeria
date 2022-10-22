package Logica;

class MensajeSocial extends Mensaje{
	private String nombreA;
	private String nombreB;
	
	//Crea mensaje con tilulo y cuerpo
	MensajeSocial(String titulo, String cuerpo, String nombreA, String nombreB) {
		super(titulo, cuerpo);
		this.nombreA = nombreA;
		this.nombreB = nombreB;
	}
	
	//Crea mensajes por default
	MensajeSocial( String nombreA, String nombreB) {
		super("sin titulo", "sin cuerpo");
		this.nombreA = nombreA;
		this.nombreB = nombreB;
	}
	
	@Override
	public String toString() {
		return "TargetaSocial [titulo=" + this.getTitulo() + ", cuerpo=" + this.getCuerpo() 
		+ ", nombreA=" + nombreA + ", nombreB=" + nombreB + "]";
	}

	String getNombreA() {
		return nombreA;
	}

	void setNombreA(String nombreA) {
		this.nombreA = nombreA;
	}

	String getNombreB() {
		return nombreB;
	}

	void setNombreB(String nombreB) {
		this.nombreB = nombreB;
	}
	
}
