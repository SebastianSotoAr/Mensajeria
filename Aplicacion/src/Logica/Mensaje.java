package Logica;

abstract class Mensaje {
	String titulo;
	String cuerpo;
		
	protected Mensaje(String titulo, String cuerpo) {
		super();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	@Override
	public abstract String toString();

	protected String getTitulo() {
		return titulo;
	}

	protected void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	protected String getCuerpo() {
		return cuerpo;
	}

	protected void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}
	
}
