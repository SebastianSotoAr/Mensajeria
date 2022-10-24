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
			System.out.println("Programa");
			System.out.println("Opciones:\n\t0 salir\n\t1 modificarPerfil\n\t2 agregarContacto"
					+ "\n\t3 empezarConversacion\n\t4 mostrarChats\n\t5 seguirConversacion"
					+ "\n\t6 verNotificaciones");
			System.out.print("\nOpcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("Fin del programa");
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
