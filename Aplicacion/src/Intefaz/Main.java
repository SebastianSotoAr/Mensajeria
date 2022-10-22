package Intefaz;

import java.util.Scanner;
import Logica.Logica;

public class Main {

	public static void main(String[] args) {
		//Crea la conexion con el paquete Logica, atravez de una instacia de la clase Logica
		Logica logica = new Logica();
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Programa");
			System.out.println("Opcion:\n0 salir\n1 modificarPerfil\n2 agregarContacto\n3 empezarConversacion"
					+ "\n4 mostrarChats\n5 seguirConversacion\n6 verNotificaciones");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("Se cerro el programa");
					break;
					
				case 1:
					//TODO falta serializar
					logica.editarPerfil(sc);
					break;
					
				case 2:
					//TODO falta serializar
					logica.crearNuevoContacto(sc);
					break;
					
				case 3:
					//TODO falta serializar
					logica.empezarChat(sc);
					break;
					
				case 4:
					logica.mostrarChats();
					break;
					
				case 5:
					//TODO falta serializar
					logica.seguirChat(sc);
					break;
					
				case 6:
					//TODO falta serializar
					logica.verNotificaciones(sc);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 y 6");
					break;	
			}
			
		}while (opcion != 0);
		sc.close();
	}
}
