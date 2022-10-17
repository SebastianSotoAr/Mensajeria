package Logica;

class TargetaNegocios extends Targeta{
	private String logo;
	private String descripcion;
	private String termino;
	private String nombreCompletoA;
	private String nombreCompletoB;
	
	protected TargetaNegocios(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.logo = contactoA.getLogoNegocio();
		this.descripcion = contactoA.getDescripcionNegocio();
		this.termino = contactoA.getTerminosNegocio();
		this.nombreCompletoA = contactoA.getNombreCompleto();
		this.nombreCompletoB = contactoB.getNombreCompleto();
	}

	protected TargetaNegocios(String titulo, String cuerpo, ContactoUsuario contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.logo = contactoA.getLogoNegocio();
		this.descripcion = contactoA.getDescripcionNegocio();
		this.termino = contactoA.getTerminosNegocio();
		this.nombreCompletoA = contactoA.getNombreCompleto();
		this.nombreCompletoB = contactoB.getNombreCompleto();
	}

	protected String getLogo() {
		return logo;
	}

	protected void setLogo(String logo) {
		this.logo = logo;
	}

	protected String getDescripcion() {
		return descripcion;
	}

	protected void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	protected String getTermino() {
		return termino;
	}

	protected void setTermino(String termino) {
		this.termino = termino;
	}

	protected String getNombreCompletoA() {
		return nombreCompletoA;
	}

	protected void setNombreCompletoA(String nombreCompletoA) {
		this.nombreCompletoA = nombreCompletoA;
	}

	protected String getNombreCompletoB() {
		return nombreCompletoB;
	}

	protected void setNombreCompletoB(String nombreCompletoB) {
		this.nombreCompletoB = nombreCompletoB;
	}
	
}
