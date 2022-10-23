package gestorAplicacion.inferior;

public enum Urgencia {
	RIESGO_VITAL("Inmediatamente"),
	MUY_URGENTE("10 - 15 Minutos"),
	URGENTE("60 Minutos"),
	NORMAL("2 Horas"),
	NO_URGENTE("4 Horas");
	
	private final String atencion;
	
	Urgencia(String atencion) {
		this.atencion = atencion;
	}
	
	private String atencion() {return atencion;}
	
	public String getAtencion() {
		return this.atencion();
	}
}
