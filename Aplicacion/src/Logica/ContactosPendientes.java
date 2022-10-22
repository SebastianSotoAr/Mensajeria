package Logica;

import java.util.Scanner;

//Los contactos pendientes son personas con las que no se a iniciado un conversacion.
class ContactosPendientes extends Contacto{
	private final String targeta;

	//Crea el contacto sin mensajes
	protected ContactosPendientes(String nombre, String email, String nombreCompleto) {
		super(nombre, email, nombreCompleto);
		this.targeta = "No hay mensajes";
	}

	protected String getTargeta() {
		return targeta;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nContactosPendientes [targeta=" + targeta + "]";
	}

	//Permite al Usuario crear un contacto de este tipo por consola.
	//Resive al unico escaner del programa como parametro.
	protected static ContactosPendientes crearContactoPendiente(Scanner sc) {
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		//Resive el nombre (Puede ser mas de una palabra y elimina \n).
		String nombre = sc.nextLine();
		System.out.print("Email: ");
		//Resive el email (una palabra y no elimina \n).
		String email = sc.next();
		//Elimina el \n
		sc.nextLine();
		System.out.print("Nombre completo: ");
		//Resive el nombre completo (Puede ser mas de una palabra y elimina \n).
		String nombreCompleto = sc.nextLine();
		ContactosPendientes contacto = new ContactosPendientes(nombre, email, nombreCompleto);
		System.out.println(contacto.toString());
		return contacto;
	}
}
