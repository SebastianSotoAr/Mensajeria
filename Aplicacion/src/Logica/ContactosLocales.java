package Logica;

import java.util.ArrayList;

//Los contactos locales son personas con las que ya se inicializo una convesacion
class ContactosLocales extends Contacto{
	private ArrayList<TargetaNegocios> targetasNegocios;
	private ArrayList<TargetaSocial> targetasSociales;

	//Genera los contactos locales con los mensajes sociales y de negocios 
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
