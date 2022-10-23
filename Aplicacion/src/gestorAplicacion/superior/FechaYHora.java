package gestorAplicacion.superior;

import java.time.format.DateTimeFormatter;

public interface FechaYHora {
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	
	String fechaYHora();
}