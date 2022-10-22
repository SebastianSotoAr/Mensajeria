package Logica;

import java.util.ArrayList;

//Contacto del Usuario, contiene los mensajes enviados a si mismo
class ContactoUsuario extends Contacto{
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private ArrayList<TargetaNegocios> targetasNegocios;
	private ArrayList<TargetaSocial> TargetasSociales;
	
	//Al momento de ser el creado contacto de Usuario toma los atributos del Usuario 
	protected ContactoUsuario(Usuario usuario) {
		super(usuario.getNombre(), usuario.getEmail(), usuario.getNombreCompleto());
		this.logoNegocio = usuario.getLogoNegocio();
		this.descripcionNegocio = usuario.getDescripcionNegocio();
		this.terminosNegocio = usuario.getTerminosNegocio();
		this.targetasNegocios = new ArrayList<TargetaNegocios>();
		this.TargetasSociales = new ArrayList<TargetaSocial>();
	}

	protected String getLogoNegocio() {
		return logoNegocio;
	}

	protected void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	protected String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	protected void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	protected String getTerminosNegocio() {
		return terminosNegocio;
	}

	protected void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	protected ArrayList<TargetaNegocios> getTargetasNegocios() {
		return targetasNegocios;
	}

	protected void setTargetasNegocios(ArrayList<TargetaNegocios> targetasNegocios) {
		this.targetasNegocios = targetasNegocios;
	}

	protected ArrayList<TargetaSocial> getTargetasSociales() {
		return TargetasSociales;
	}

	protected void setTargetasSociales(ArrayList<TargetaSocial> targetasSociales) {
		TargetasSociales = targetasSociales;
	}
	
}
