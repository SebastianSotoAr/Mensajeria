package Logica;

import java.util.Scanner;

//Se encarga de comunicar el interior del paquete con el exterior
public class Logica {
	private Usuario usuario;

	public Logica() {
		//crea un usuario por defecto
		this.usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila", "Andidas",
				"No vendo zapatos...", "Solo efectivo");
	}
	
	//Llama al metodo editar perfil de usuario.
	public void editarPerfil(Scanner sc) {
		usuario.getContactoUsuario().editarPerfil(sc);
	}
	
	//Llama al metodo crear nuevo contacto de usuario.
	public void crearNuevoContacto(Scanner sc) {
		usuario.crearNuevoContacto(sc);
	}
	
	//Llama al metodo empezar chat de usuario.
	public void empezarChat(Scanner sc) {
		usuario.empezarChat(sc);
	}
	
	//Llama al metodo mostrar chats de usuario.
	public void mostrarChats() {
		usuario.mostrarChats();
	}
}
