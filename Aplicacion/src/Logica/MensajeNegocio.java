package Logica;

class MensajeNegocio extends Mensaje{
	private String logo;
	private String descripcion;
	private String termino;
	private String nombreCompletoA;
	private String nombreCompletoB;
	
	MensajeNegocio(String titulo, String cuerpo, String logo, String descripcion, String termino,
			String nombreCompletoA, String nombreCompletoB) {
		super(titulo, cuerpo);
		this.logo = logo;
		this.descripcion = descripcion;
		this.termino = termino;
		this.nombreCompletoA = nombreCompletoA;
		this.nombreCompletoB = nombreCompletoB;
	}
	
	public String toString() {
		return  "MensajeNegocios [titulo=" + this.getTitulo() + ", cuerpo=" + this.getCuerpo() 
			+ ", logo=" + logo + ", descripcion=" + descripcion + ", termino=" + termino
			+ ", nombreCompletoA=" + nombreCompletoA + ", nombreCompletoB=" 
			+ nombreCompletoB + "]";
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
	
}
