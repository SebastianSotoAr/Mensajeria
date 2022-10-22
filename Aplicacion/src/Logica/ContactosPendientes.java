package Logica;

import java.util.Scanner;

//Los contactos pendientes son personas con las que no se a iniciado un conversacion.
class ContactosPendientes extends Contacto{
	private final String targeta;

	//Crea el contacto sin mensajes
	ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targeta = "No hay mensajes";
	}

	String getTargeta() {
		return targeta;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nContactosPendientes [targeta=" + targeta + "]";
	}

	//Permite al Usuario crear un contacto de este tipo por consola.
	static ContactosPendientes crearContactoPendiente(Scanner sc) {
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		sc.nextLine();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		ContactosPendientes contacto = new ContactosPendientes(nombre, email, nombreCompleto);
		System.out.println(contacto.toString());
		return contacto;
	}
}
