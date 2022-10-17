package Logica;

import java.util.Scanner;

public class Logica {
	private Usuario usuario;

	public Logica() {
		this.usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila", "Andidas",
				"No vendo zapatos...", "Solo efectivo");
	}
	
	public void editarPerfil(Scanner sc) {
		usuario.editarPerfil(sc);
	}
	
	public void crearNuevoContacto(Scanner sc) {
		usuario.crearNuevoContacto(sc);
	}
	
	public void empezarChat(Scanner sc) {
		usuario.empezarChat(sc);
	}
}
