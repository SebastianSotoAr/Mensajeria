package Logica;

import java.util.ArrayList;

class Notificacion {
	private ArrayList<TargetaNegocios> targetasNegociosLeidas;
	private ArrayList<TargetaSocial> targetasSocialesLeidas;
	private ArrayList<TargetaNegocios> targetasNegociosNoLeidas;
	private ArrayList<TargetaSocial> targetasSocialesNoLeidas;
	
	protected Notificacion() {
		this.targetasNegociosLeidas = new ArrayList<TargetaNegocios>();
		this.targetasSocialesLeidas = new ArrayList<TargetaSocial>();
		this.targetasNegociosNoLeidas = new ArrayList<TargetaNegocios>();
		this.targetasSocialesNoLeidas = new ArrayList<TargetaSocial>();
	}

	protected ArrayList<TargetaNegocios> getTargetasNegociosLeidas() {
		return targetasNegociosLeidas;
	}

	protected void setTargetasNegociosLeidas(ArrayList<TargetaNegocios> targetasNegociosLeidas) {
		this.targetasNegociosLeidas = targetasNegociosLeidas;
	}

	protected ArrayList<TargetaSocial> getTargetasSocialesLeidas() {
		return targetasSocialesLeidas;
	}

	protected void setTargetasSocialesLeidas(ArrayList<TargetaSocial> targetasSocialesLeidas) {
		this.targetasSocialesLeidas = targetasSocialesLeidas;
	}

	protected ArrayList<TargetaNegocios> getTargetasNegociosNoLeidas() {
		return targetasNegociosNoLeidas;
	}

	protected void setTargetasNegociosNoLeidas(ArrayList<TargetaNegocios> targetasNegociosNoLeidas) {
		this.targetasNegociosNoLeidas = targetasNegociosNoLeidas;
	}

	protected ArrayList<TargetaSocial> getTargetasSocialesNoLeidas() {
		return targetasSocialesNoLeidas;
	}

	protected void setTargetasSocialesNoLeidas(ArrayList<TargetaSocial> targetasSocialesNoLeidas) {
		this.targetasSocialesNoLeidas = targetasSocialesNoLeidas;
	}
	
}
