package uiMain;

import java.util.Scanner;

import gestorAplicacion.inferior.Usuario;

//El main del programa
public class Pantalla {

	public static void main(String[] args) {
		ConexionContactoUsuario.cargarContactoUsuario();
		Scanner sc = new Scanner(System.in);
		ConexionContactoUsuario ccu = new ConexionContactoUsuario();
		ConexionUsuario cu = new ConexionUsuario();
		int opcion;
		do {
			System.out.println("Programa de Mensajeria");
			System.out.println("Opciones:\n\t0 Salir del Programa\n\t1 Editar Perfil"
					+ "\n\t2 Agregar un Nuevo Contacto\n\t3 Empezar una Conversacion"
					+ "\n\t4 Mostrar Chats\n\t5 Seguir una Conversacion"
					+ "\n\t6 Ver Notificaciones de Usuario");
			System.out.print("\nOpcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("\nFin del Programa");
					break;
					
				case 1:
					ccu.editarPerfil(sc);
					break;
					
				case 2:
					cu.crearNuevoContacto(sc);
					break;
					
				case 3:
					cu.empezarChat(sc);
					break;
					
				case 4:
					cu.mostrarChats();
					break;
					
				case 5:
					cu.seguirChat(sc);
					break;
					
				case 6:
					ccu.verNotificaciones(sc);
					break;
					
				default:
					System.out.println("\tSeleccione un numero entre 0 y 6");
					break;	
			}
			
		}while (opcion != 0);
		ConexionContactoUsuario.guardarContactoUsuario();
		sc.close();
	}
}
