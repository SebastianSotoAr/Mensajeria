package gestorAplicacion.inferior;

import java.time.LocalDateTime;
import gestorAplicacion.superior.FechaYHora;

//Son los mensajes que el usuario se envia a si mismo
class Notificacion implements FechaYHora {
	final String fechaYHora;
	String titulo;
	String cuerpo;
	String urgencia;
	
	//La Notificacion tiene titulo y cuepo
	Notificacion(String titulo, String cuerpo, String urgencia) {
		this.fechaYHora = fechaYHora();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.urgencia = urgencia;
	}
	
	@Override
	public String fechaYHora() {
		return dtf.format(LocalDateTime.now());
	}
	
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

	String getFechaYHora() {
		return fechaYHora;
	}
	
}
