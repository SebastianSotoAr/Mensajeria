package Logica;

//import java.time.LocalDateTime;

//Todos los mensajes deben tener "titulo", "cuerpo", fecha, emailA y emailB
abstract class Targeta {
	//private final LocalDateTime fecha;
	private String titulo;
	private String cuerpo;
	private String emailA;
	private String emailB;

	//Permite crear un mensaje sin titulo y cuerpo.
	//Obliga a crear un mensaje con emisor y reseptor.
	protected Targeta(String emailA, String emailB) {
		//Toma la fecha en el momento que se creo el mensaje
		//this.fecha = LocalDateTime.now();
		this.titulo = "Sin titulo";
		this.cuerpo = "Sin cuerpo";
		this.emailA = emailA;
		this.emailB = emailB;
	}

	//Permite crear mensajes con titulo y cuerpo.
	protected Targeta(String titulo, String cuerpo, String emailA, String emailB) {
		//Toma la fecha en el momento que se creo el mensaje
		//this.fecha = LocalDateTime.now();
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.emailA = emailA;
		this.emailB = emailB;
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

	/*protected LocalDateTime getFecha() {
		return fecha;
	}*/
	
}
