package uiMain;

import java.util.Scanner;

import gestorAplicacion.inferior.Urgencia;
import gestorAplicacion.inferior.Usuario;

public class ConexionUsuario {
	public static Usuario usuario;
	
	//Permite al Usuario crear un contacto de este tipo por consola.
	public void crearNuevoContacto(Scanner sc) {
		System.out.println("-----Crear Contacto-----");
		System.out.println(usuario.getContactosPendientes());
		System.out.println("Nuevo Contacto");
		System.out.print("\tNombre: ");
		String nombre = sc.nextLine();
		System.out.print("\tEmail: ");
		String email = sc.next();
		sc.nextLine();//Elimina el \n del scanner
		System.out.print("\tNombre completo: ");
		String nombreCompleto = sc.nextLine();
		usuario.crearNuevoContacto(nombre, email, nombreCompleto);
		System.out.println("-----Contacto Creado-----");
	}
	
	//Permite al usuario elegir el tipo de urgencia
	public static String conexionUrgencia(Scanner sc) {
		int opcion;
		String urg = "";
		do {
			System.out.println("Tipo de Urgencia:");
			System.out.println("\tOpciones:\n\t\t1 Riesgo Vital\n\t\t2 Muy Urgente\n\t\t3 Urgente"
					+ "\n\t\t4 Normal\n\t\t5 No Urgente");
			System.out.print("\t\nTipo: ");
			opcion = sc.nextInt();
			sc.nextLine();//Elimina el \n del scanner
			
			
			switch (opcion) {
				case 1:
					urg = Urgencia.RIESGO_VITAL.getAtencion();
					break;
					
				case 2:
					urg = Urgencia.MUY_URGENTE.getAtencion();
					break;
					
				case 3:
					urg = Urgencia.URGENTE.getAtencion();
					break;
					
				case 4:
					urg = Urgencia.NORMAL.getAtencion();
					break;
					
				case 5:
					urg = Urgencia.NO_URGENTE.getAtencion();
					break;
					
				default:
					opcion = 0;
					System.out.println("\tSeleccione un numero entre 1 y 5");
					break;	
			}
			
		}while (opcion == 0);
		return urg;
	}
	
	//Permite seleccionar un contacto para iniciar una conversacion.
	public void empezarChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("-----Empezar Chat-----");
			System.out.println("Elige un contacto o Cancela:");
			System.out.println("\t0 Cancelar\n");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < usuario.getContactosPendientes().size(); i++) {
				System.out.println("\t" + (i+1) + " "
						+ usuario.getContactoPendiente(i).toString());
			}
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
			sc.nextLine();//Elimina el \n del scanner
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= usuario.getContactosPendientes().size())) {
				usuario.volverContactoLocal(opcion - 1);
				crearMensaje(sc);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y "
						+ usuario.getContactosPendientes().size());
				
			} else {
				System.out.println("-----Chats Enviados-----");
				
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
		System.out.println("Elige el tipo de mensaje:\n\t0 Negocios\n\t1 Social");
		System.out.print("\nOpcion: ");
		opcion = sc.nextInt();
		sc.nextLine();//Elimina el \n del scanner
		do {
			switch (opcion) {
				case 0:
					//crea y añade un mesaje de negocios al contacto recien creado
					usuario.anadirMensajeNegocio(titulo, cuerpo, conexionUrgencia(sc));
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
		System.out.println("-----Chats-----");
		System.out.println(usuario.mostrarChats());
		System.out.println("-----Estos fueron todos los Chats-----");
	}
	
	//Permite elegir a que contacto local enviarle un mensaje adicional
	public void seguirChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("-----Seguir Chat-----");
			System.out.println("Elige un contacto o Cancela:");
			System.out.println("\t0 Cancelar\n");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < usuario.getContactosLocales().size(); i++) {
				System.out.println("\t" + (i+1) + " " + usuario.getContactoLocal(i).toString());
			}
			System.out.print("Opcion: ");
			opcion = sc.nextInt();
			sc.nextLine();//Elimina el \n del scanner
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= usuario.getContactosLocales().size())) {
				crearMensaje(opcion - 1, sc);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + usuario.getContactosLocales().size());
				
			} else {
				System.out.println("-----Chats Enviados-----");
				
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
		System.out.print("\nOpcion: ");
		opcion = sc.nextInt();
		sc.nextLine();//Elimina el \n del scanner
		do {
			switch (opcion) {
				case 0:
					//crea y añade un mesaje de negocios al contacto recien creado
					usuario.anadirMensajeNegocio(i, titulo, cuerpo, conexionUrgencia(sc));
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

