package Logica;

class Notificacion {
	String titulo;
	String cuerpo;
	
	Notificacion(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
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
