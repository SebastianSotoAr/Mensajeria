package Logica;

import java.time.LocalDateTime;

class Targeta {
	private final LocalDateTime fecha;
	private String titulo;
	private String cuerpo;
	private String emailA;
	private String emailB;

	protected Targeta(String emailA, String emailB) {
		this.fecha = LocalDateTime.now();
		this.titulo = "Sin titulo";
		this.cuerpo = "Sin cuerpo";
		this.emailA = emailA;
		this.emailB = emailB;
	}

	protected Targeta(String titulo, String cuerpo, String emailA, String emailB) {
		this.fecha = LocalDateTime.now();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.emailA = emailA;
		this.emailB = emailB;
	}

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

	protected String getEmailA() {
		return emailA;
	}

	protected void setEmailA(String emailA) {
		this.emailA = emailA;
	}

	protected String getEmailB() {
		return emailB;
	}

	protected void setEmailB(String emailB) {
		this.emailB = emailB;
	}

	protected LocalDateTime getFecha() {
		return fecha;
	}
	
}
