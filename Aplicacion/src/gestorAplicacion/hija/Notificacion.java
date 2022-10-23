package gestorAplicacion.hija;

//Son los mensajes que el usuario se envia a si mismo
class Notificacion {
	String titulo;
	String cuerpo;
	
	//La Notificacion tiene titulo y cuepo
	Notificacion(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	//FIXME
	@Override
	public String toString() {
		return "Notificacion [titulo=" + titulo + ", cuerpo=" + cuerpo + "]";
	}



	String getTitulo() {
		return titulo;
	}

	void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	String getCuerpo() {
		return cuerpo;
	}

	void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
		
}
