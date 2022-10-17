package Logica;

import java.util.ArrayList;

class ContactosLocales extends Contacto{
	private ArrayList<TargetaNegocios> targetasNegocios;
	private ArrayList<TargetaSocial> targetasSociales;

	protected ContactosLocales(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targetasNegocios = new ArrayList<TargetaNegocios>();
		this.targetasSociales = new ArrayList<TargetaSocial>();
	}

	protected ArrayList<TargetaNegocios> getTargetasNegocios() {
		return targetasNegocios;
	}

	protected void setTargetasNegocios(ArrayList<TargetaNegocios> targetasNegocios) {
		this.targetasNegocios = targetasNegocios;
	}

	protected ArrayList<TargetaSocial> getTargetasSociales() {
		return targetasSociales;
	}

	protected void setTargetasSociales(ArrayList<TargetaSocial> targetasSociales) {
		this.targetasSociales = targetasSociales;
	}

}
