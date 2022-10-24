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
			System.out.println(contactoUsuario);
			System.out.println("Cambiar:\n0 Cancela\n1 nombre\n2 email\n3 nombreCompleto\n4 logoNegocio\n5 descripcionNegocio"
					+ "\n6 terminosNegocio");
			opcion = sc.nextInt();
			sc.nextLine();
				
			switch (opcion) {
				case 0:
					System.out.println("Termino modificacion de Perfil");
					break;
					
				case 1:
					System.out.println("Nombre actual: " + contactoUsuario.getNombre());
					System.out.print("Nuevo nombre: ");
					contactoUsuario.setNombre(sc.nextLine());
					break;
					
				case 2:
					System.out.println("Email actual: " + contactoUsuario.getEmail());
					System.out.print("Nuevo Email: ");
					contactoUsuario.setEmail(sc.next());
					sc.nextLine();
					break;
						
				case 3:
					System.out.println("Nombre completo actual: " + contactoUsuario.getNombreCompleto());
					System.out.print("Nuevo nombre completo: ");
					contactoUsuario.setNombreCompleto(sc.nextLine());
					break;
						
				case 4:
					System.out.println("Logo de negocio actual: " + contactoUsuario.getLogoNegocio());
					System.out.print("Nuevo logo de negocio: ");
					contactoUsuario.setLogoNegocio(sc.nextLine());
					break;
						
				case 5:
					System.out.println("Descripcion de negocio actual: " + contactoUsuario.getDescripcionNegocio());
					System.out.print("Nueva descripcion de negocio: ");
					contactoUsuario.setDescripcionNegocio(sc.nextLine());
					break;
						
				case 6:
					System.out.println("Terminos de negocio actual: " + contactoUsuario.getTerminosNegocio());
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
