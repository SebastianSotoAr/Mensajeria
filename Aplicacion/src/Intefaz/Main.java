package Intefaz;

import java.util.Scanner;
import Logica.Logica;

public class Main {

	public static void main(String[] args) {
		Logica logica = new Logica();
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			System.out.println("Programa");
			System.out.println("Opcion:\n0 salir\n1 modificarPerfil\n2 agregarContacto\n3 empezarConversacion");
			opcion = sc.nextInt();
			sc.nextLine();
			
			
			switch (opcion) {
				case 0:
					System.out.println("Se cerro el programa");
					break;
					
				case 1:

					logica.editarPerfil(sc);
					break;
					
				case 2:
					logica.crearNuevoContacto(sc);
					break;
					
				case 3:
					logica.empezarChat(sc);
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 y 3");
					break;	
			}
			
		}while (opcion != 0);
		sc.close();
	}
}
