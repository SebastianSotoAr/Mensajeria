package gestorAplicacion.inferior;

import gestorAplicacion.superior.Mensaje;

//Son mensajes informales
class MensajeSocial extends Mensaje {
	private String nombreA;
	private String nombreB;
	
	//Crea mensaje con tilulo y cuerpo
	MensajeSocial(String titulo, String cuerpo,String nombreA, String nombreB) {
		super(titulo, cuerpo);
		this.nombreA = nombreA;
		this.nombreB = nombreB;
	}
	
	//Crea mensajes por default
	MensajeSocial( String nombreA, String nombreB) {
		this("sin titulo", "sin cuerpo", nombreA, nombreB);
	}
	
	@Override
	public String toString() {
		return "MensajeSocial [\n\tFecha Y Hora: " + this.getFechaYHora() + "\n\tTitulo: " 
				+ this.getTitulo() + "\n\tCuerpo: " + this.getCuerpo() 
				+ "\n\tNombre Usuario: " + nombreA + "\n\tNombre Contacto: " + nombreB + "\n]";
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
