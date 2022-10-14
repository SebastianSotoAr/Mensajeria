package Logica;

public class TargetaNegocios extends Targeta{
	private String logo;
	private String descripcion;
	private String termino;
	private String nombreCompletoA;
	private String nombreCompletoB;
	
	public TargetaNegocios(ContactoUsuario contactoA, Contacto contactoB) {
		super(contactoA.getEmail(), contactoB.getEmail());
		this.logo = contactoA.getLogoNegocio();
		this.descripcion = contactoA.getDescripcionNegocio();
		this.termino = contactoA.getTerminosNegocio();
		this.nombreCompletoA = contactoA.getNombreCompleto();
		this.nombreCompletoB = contactoB.getNombreCompleto();
	}

	public TargetaNegocios(String titulo, String cuerpo, ContactoUsuario contactoA, Contacto contactoB) {
		super(titulo, cuerpo, contactoA.getEmail(), contactoB.getEmail());
		this.logo = contactoA.getLogoNegocio();
		this.descripcion = contactoA.getDescripcionNegocio();
		this.termino = contactoA.getTerminosNegocio();
		this.nombreCompletoA = contactoA.getNombreCompleto();
		this.nombreCompletoB = contactoB.getNombreCompleto();
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getTermino() {
		return termino;
	}

	public void setTermino(String termino) {
		this.termino = termino;
	}

	public String getNombreCompletoA() {
		return nombreCompletoA;
	}

	public void setNombreCompletoA(String nombreCompletoA) {
		this.nombreCompletoA = nombreCompletoA;
	}

	public String getNombreCompletoB() {
		return nombreCompletoB;
	}

	public void setNombreCompletoB(String nombreCompletoB) {
		this.nombreCompletoB = nombreCompletoB;
	}

}
