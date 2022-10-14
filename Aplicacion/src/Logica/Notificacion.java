package Logica;

import java.util.ArrayList;

public class Notificacion {
	private ArrayList<TargetaNegocios> targetasNegociosLeidas;
	private ArrayList<TargetaSocial> targetasSocialesLeidas;
	private ArrayList<TargetaNegocios> targetasNegociosNoLeidas;
	private ArrayList<TargetaSocial> targetasSocialesNoLeidas;
	
	public Notificacion() {
		this.targetasNegociosLeidas = new ArrayList<TargetaNegocios>();
		this.targetasSocialesLeidas = new ArrayList<TargetaSocial>();
		this.targetasNegociosNoLeidas = new ArrayList<TargetaNegocios>();
		this.targetasSocialesNoLeidas = new ArrayList<TargetaSocial>();
	}

	public ArrayList<TargetaNegocios> getTargetasNegociosLeidas() {
		return targetasNegociosLeidas;
	}

	public void setTargetasNegociosLeidas(ArrayList<TargetaNegocios> targetasNegociosLeidas) {
		this.targetasNegociosLeidas = targetasNegociosLeidas;
	}

	public ArrayList<TargetaSocial> getTargetasSocialesLeidas() {
		return targetasSocialesLeidas;
	}

	public void setTargetasSocialesLeidas(ArrayList<TargetaSocial> targetasSocialesLeidas) {
		this.targetasSocialesLeidas = targetasSocialesLeidas;
	}

	public ArrayList<TargetaNegocios> getTargetasNegociosNoLeidas() {
		return targetasNegociosNoLeidas;
	}

	public void setTargetasNegociosNoLeidas(ArrayList<TargetaNegocios> targetasNegociosNoLeidas) {
		this.targetasNegociosNoLeidas = targetasNegociosNoLeidas;
	}

	public ArrayList<TargetaSocial> getTargetasSocialesNoLeidas() {
		return targetasSocialesNoLeidas;
	}

	public void setTargetasSocialesNoLeidas(ArrayList<TargetaSocial> targetasSocialesNoLeidas) {
		this.targetasSocialesNoLeidas = targetasSocialesNoLeidas;
	}
	
}
