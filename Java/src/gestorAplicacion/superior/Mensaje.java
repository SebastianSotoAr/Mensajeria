package gestorAplicacion.superior;

import java.time.LocalDateTime;

//Todos los mensajes deben tener titulo y cuerpo
public abstract class Mensaje implements FechaYHora {
	final String fechaYHora;
	String titulo;
	String cuerpo;
	
	//Crea el mensaje con fecha y hora de creaccion, titulo, y cuerpo
	protected Mensaje(String titulo, String cuerpo) {
		this.fechaYHora = fechaYHora();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
	}
	
	@Override
	public String fechaYHora() {
		return dtf.format(LocalDateTime.now());
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

	protected String getFechaYHora() {
		return fechaYHora;
	}
	
}
