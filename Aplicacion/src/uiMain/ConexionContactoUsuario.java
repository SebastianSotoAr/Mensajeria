package uiMain;

import java.util.Scanner;

import baseDatos.DatosContactoUsuario;
import gestorAplicacion.inferior.ContactoUsuario;
import gestorAplicacion.inferior.Usuario;

public class ConexionContactoUsuario {
	public static ContactoUsuario contactoUsuario;
	
	//Cambia los atributos del contacto de usuario, menos notificaciones
	public void editarPerfil(Scanner sc) {
		int opcion;
		do {
			System.out.println("-----Editar Perfil-----");
			System.out.println(contactoUsuario);
			System.out.println("Opciones:\n\t0 Terminar Edicion\n\t1 Editar Nombre\n\t2 Editar Email"
					+ "\n\t3 Editar Nombre Completo\n\t4 Editar Logo del Negocio"
					+ "\n\t5 Editar Descripcion del Negocio\n\t6 Editar Terminos del Negocio");
			System.out.print("\nOpcion: ");
			opcion = sc.nextInt();
			sc.nextLine();
				
			switch (opcion) {
				case 0:
					System.out.println("-----Termino Edicion de Perfil------");
					break;
					
				case 1:
					System.out.println("\nNombre actual: " + contactoUsuario.getNombre());
					System.out.print("Nuevo nombre: ");
					contactoUsuario.setNombre(sc.nextLine());
					break;
					
				case 2:
					System.out.println("\nEmail actual: " + contactoUsuario.getEmail());
					System.out.print("Nuevo Email: ");
					contactoUsuario.setEmail(sc.next());
					sc.nextLine();
					break;
						
				case 3:
					System.out.println("\nNombre completo actual: " + contactoUsuario.getNombreCompleto());
					System.out.print("Nuevo nombre completo: ");
					contactoUsuario.setNombreCompleto(sc.nextLine());
					break;
						
				case 4:
					System.out.println("\nLogo de negocio actual: " + contactoUsuario.getLogoNegocio());
					System.out.print("Nuevo logo de negocio: ");
					contactoUsuario.setLogoNegocio(sc.nextLine());
					break;
						
				case 5:
					System.out.println("\nDescripcion de negocio actual: " + contactoUsuario.getDescripcionNegocio());
					System.out.print("Nueva descripcion de negocio: ");
					contactoUsuario.setDescripcionNegocio(sc.nextLine());
					break;
						
				case 6:
					System.out.println("\nTerminos de negocio actual: " + contactoUsuario.getTerminosNegocio());
					System.out.print("Nuevo terminos de negocio: ");
					contactoUsuario.setTerminosNegocio(sc.nextLine());
					break;
						
				default:
					System.out.println("Seleccione un numero entre 0 y 6");
					break;	
			}
		}while (opcion != 0);

	}

	//permite ver las notificaciones del contacto de usurio y crear nuevas
	public void verNotificaciones(Scanner sc) {
		int opcion;
		String titulo;
		String cuerpo;
		String urgencia;
		do {
			System.out.println("Notificaciones: ");
			for(Object n: contactoUsuario.getNotificaciones()) {
				System.out.println(n);
			}
			System.out.println("Crear una nueva:\n0 no\n1 si");
			opcion = sc.nextInt();
			sc.nextLine();
				
			switch (opcion) {
				case 0:
					System.out.println("Termino modificacion de Perfil");
					break;
					
				case 1:
					System.out.print("titulo: ");
					titulo = sc.nextLine();
					System.out.print("cuerpo: ");
					cuerpo = sc.nextLine();
					urgencia = ConexionUsuario.conexionUrgencia(sc);
					contactoUsuario.anadirNotificaciones(titulo, cuerpo, urgencia);
						
				default:
					System.out.println("Seleccione un numero entre 0 o 1");
					break;	
			}
		}while (opcion != 0);
		
	}
	
	public static void cargarContactoUsuario() {
		DatosContactoUsuario.cargarContactoUsuario();
		DatosContactoUsuario datos = DatosContactoUsuario.datos;
		ConexionUsuario.usuario = new Usuario(datos.getNombre(), datos.getEmail(), 
				datos.getNombreCompleto(), datos.getLogoNegocio(), datos.getDescripcionNegocio(),
				datos.getTerminosNegocio());
		contactoUsuario = ConexionUsuario.usuario.getContactoUsuario();
	}
	
	public static void guardarContactoUsuario() {
		DatosContactoUsuario.guardarContactoUsuario(contactoUsuario.getNombre(),
				contactoUsuario.getEmail(), contactoUsuario.getNombreCompleto(),
				contactoUsuario.getLogoNegocio(), contactoUsuario.getDescripcionNegocio(),
				contactoUsuario.getTerminosNegocio());
	}

}
