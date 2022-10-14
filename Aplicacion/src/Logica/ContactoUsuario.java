package Logica;

import java.util.ArrayList;

public class ContactoUsuario extends Contacto{
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private ArrayList<TargetaNegocios> targetasNegocios;
	private ArrayList<TargetaSocial> TargetasSociales;
	
	public ContactoUsuario(Usuario usuario, ArrayList<TargetaNegocios> targetasNegocios,
			ArrayList<TargetaSocial> targetasSociales) {
		super(usuario.getNombre(), usuario.getEmail(), usuario.getNombreCompleto());
		this.logoNegocio = usuario.getLogoNegocio();
		this.descripcionNegocio = usuario.getDescripcionNegocio();
		this.terminosNegocio = usuario.getTerminosNegocio();
		this.targetasNegocios = targetasNegocios;
		this.TargetasSociales = targetasSociales;
	}

	public String getLogoNegocio() {
		return logoNegocio;
	}

	public void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	public String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	public void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	public String getTerminosNegocio() {
		return terminosNegocio;
	}

	public void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	public ArrayList<TargetaNegocios> getTargetasNegocios() {
		return targetasNegocios;
	}

	public void setTargetasNegocios(ArrayList<TargetaNegocios> targetasNegocios) {
		this.targetasNegocios = targetasNegocios;
	}

	public ArrayList<TargetaSocial> getTargetasSociales() {
		return TargetasSociales;
	}

	public void setTargetasSociales(ArrayList<TargetaSocial> targetasSociales) {
		TargetasSociales = targetasSociales;
	}
	
}
