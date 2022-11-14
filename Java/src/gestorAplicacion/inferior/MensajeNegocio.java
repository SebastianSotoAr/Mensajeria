package gestorAplicacion.inferior;

import gestorAplicacion.superior.Mensaje;

//Es un mensaje formal, tiene informacion sobre el negocio del usuario
class MensajeNegocio extends Mensaje {
	private String urgencia;
	private String logo;
	private String descripcion;
	private String termino;
	private String nombreCompletoA;
	private String nombreCompletoB;
	
	//No permite crear mensajes con campos vacios y cuanta con informacion sobre su urgencia
	MensajeNegocio(String titulo, String cuerpo, String urgencia, String logo, String descripcion, String termino,
			String nombreCompletoA, String nombreCompletoB) {
		super(titulo, cuerpo);
		this.urgencia = urgencia;
		this.logo = logo;
		this.descripcion = descripcion;
		this.termino = termino;
		this.nombreCompletoA = nombreCompletoA;
		this.nombreCompletoB = nombreCompletoB;
	}
	
	public String toString() {
		return  "MensajeNegocios [\n\tFecha Y Hora: " + this.getFechaYHora() + "\n\tTitulo: " + this.getTitulo()
				+ "\n\tCuerpo: " + this.getCuerpo() + "\n\tUrgencia:" + urgencia + "\n\tLogo del Negocio: " 
				+ logo + "\n\tDescripcion del Negocio:" + descripcion 
				+ "\n\tTerminos del Negocio: " + termino + "\n\tNombre Completo Usuario: " + nombreCompletoA 
				+ "\n\tNombre Completo Contacto: " + nombreCompletoB + "\n]";
	}

	String getLogo() {
		return logo;
	}

	void setLogo(String logo) {
		this.logo = logo;
	}

	String getDescripcion() {
		return descripcion;
	}

	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	String getTermino() {
		return termino;
	}

	void setTermino(String termino) {
		this.termino = termino;
	}

	String getNombreCompletoA() {
		return nombreCompletoA;
	}

	void setNombreCompletoA(String nombreCompletoA) {
		this.nombreCompletoA = nombreCompletoA;
	}

	String getNombreCompletoB() {
		return nombreCompletoB;
	}

	void setNombreCompletoB(String nombreCompletoB) {
		this.nombreCompletoB = nombreCompletoB;
	}

	String getUrgencia() {
		return urgencia;
	}

	void setUrgencia(String urgencia) {
		this.urgencia = urgencia;
	}
	
}
