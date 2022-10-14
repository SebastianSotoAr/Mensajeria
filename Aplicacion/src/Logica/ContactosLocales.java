package Logica;

import java.util.ArrayList;

public class ContactosLocales extends Contacto{
	private ArrayList<TargetaNegocios> targetasNegocios;
	private ArrayList<TargetaSocial> targetasSociales;

	public ContactosLocales(String nombre, String email, String nombreCompleto,
			ArrayList<TargetaNegocios> targetasNegocios, ArrayList<TargetaSocial> targetasSociales) {
		super(nombre, email, nombreCompleto);
		this.targetasNegocios = targetasNegocios;
		this.targetasSociales = targetasSociales;
	}

	public ArrayList<TargetaNegocios> getTargetasNegocios() {
		return targetasNegocios;
	}

	public void setTargetasNegocios(ArrayList<TargetaNegocios> targetasNegocios) {
		this.targetasNegocios = targetasNegocios;
	}

	public ArrayList<TargetaSocial> getTargetasSociales() {
		return targetasSociales;
	}

	public void setTargetasSociales(ArrayList<TargetaSocial> targetasSociales) {
		this.targetasSociales = targetasSociales;
	}

}
