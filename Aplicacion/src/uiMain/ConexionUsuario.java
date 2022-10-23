package uiMain;

import java.util.Scanner;
import gestorAplicacion.hija.Usuario;

public class ConexionUsuario {
	public static Usuario usuario = new Usuario("Andres", "Andres@a.com", "Andres Alvarez Arcila",
			"Andidas", "No vendo zapatos...", "Solo efectivo");
	
	//Permite al Usuario crear un contacto de este tipo por consola.
	public void crearNuevoContacto(Scanner sc) {
		System.out.println(usuario.getContactosPendientes());
		System.out.println("Crear Contacto");
		System.out.print("Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		sc.nextLine();
		System.out.print("Nombre completo: ");
		String nombreCompleto = sc.nextLine();
		usuario.crearNuevoContacto(nombre, email, nombreCompleto);
		
	}
	
	//TODO falta serializar
		//Permite seleccionar un contacto para iniciar una conversacion.
	public void empezarChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < usuario.getContactosPendientes().size(); i++) {
				System.out.println((i+1) + " " + usuario.getContactoPendiente(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= usuario.getContactosPendientes().size())) {
				usuario.volverContactoLocal(opcion - 1);
				crearMensaje(sc);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + usuario.getContactosPendientes().size());
				
			} else {
				System.out.println("Termino empezar chat");
				
			}
			
		} while (opcion != 0);
		
	}
	

	//Crea un mensaje social o local, segun la decision del usuario
	public void crearMensaje(Scanner sc) {
		int opcion;
		String titulo;
		String cuerpo;
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Cuerpo: ");
		cuerpo = sc.nextLine();
		System.out.println("Elige el tipo de mensaje:\n0 negocios\n1 Social");
		opcion = sc.nextInt();
		sc.nextLine();
		do {
			switch (opcion) {
				case 0:
					//crea y añade un mesaje de negocios al contacto recien creado
					usuario.anadirMensajeNegocio(titulo, cuerpo);
					break;
					
				case 1:
					//crea y añade un mesaje social al contacto recien creado
					usuario.anadirMensajeSocial(titulo, cuerpo);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 o 1");
					break;
			}
		} while (opcion != 0 && opcion != 1);
		
	}
	
	//Muestra los chats 
	public void mostrarChats() {
		System.out.println(usuario.mostrarChats());
	}
	
	//Permite elegir a que contacto local enviarle un mensaje adicional
	public void seguirChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < usuario.getContactosLocales().size(); i++) {
				System.out.println((i+1) + " " + usuario.getContactoLocal(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= usuario.getContactosLocales().size())) {
				crearMensaje(opcion - 1, sc);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + usuario.getContactosLocales().size());
				
			} else {
				System.out.println("Termino empezar chat");
				
			}
			
		} while (opcion != 0);
		
	}
	
	//Crea un mensaje en el contacto de la pocision i, socila o de negocios
	public void crearMensaje(int i, Scanner sc) {
		int opcion;
		String titulo;
		String cuerpo;
		System.out.print("Titulo: ");
		titulo = sc.nextLine();
		System.out.print("Cuerpo: ");
		cuerpo = sc.nextLine();
		System.out.println("Elige el tipo de mensaje:\n0 negocios\n1 Social");
		opcion = sc.nextInt();
		sc.nextLine();
		do {
			switch (opcion) {
				case 0:
					//crea y añade un mesaje de negocios al contacto recien creado
					usuario.anadirMensajeNegocio(i, titulo, cuerpo);
					break;
					
				case 1:
					//crea y añade un mesaje social al contacto recien creado
					usuario.anadirMensajeSocial(i, titulo, cuerpo);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 o 1");
					break;
			}
		} while (opcion != 0 && opcion != 1);
		
	}
}

