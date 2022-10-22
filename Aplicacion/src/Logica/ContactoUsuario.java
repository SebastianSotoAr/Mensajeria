package Logica;

import java.util.ArrayList;
import java.util.Scanner;

//Contacto del Usuario, contiene los mensajes enviados a si mismo
class ContactoUsuario extends Contacto{
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private ArrayList<Notificacion> notificaciones;
	
	//Al momento de ser el creado contacto de Usuario toma los atributos del Usuario 
	ContactoUsuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		super(nombre, email, nombreCompleto);
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificaciones = new ArrayList<Notificacion>();
	}
	
	//TODO falta serializar
	//Cambia los atributos del usuario, menos notificaciones y contactos
	void editarPerfil(Scanner sc) {
		int opcion;
		do {
			System.out.println(this);
			System.out.println("Cambiar:\n0 Cancela\n1 nombre\n2 email\n3 nombreCompleto\n4 logoNegocio\n5 descripcionNegocio"
					+ "\n6 terminosNegocio");
			opcion = sc.nextInt();
			sc.nextLine();
				
			switch (opcion) {
				case 0:
					System.out.println("Termino modificacion de Perfil");
					break;
					
				case 1:
					System.out.println("Nombre actual: " + getNombre());
					System.out.print("Nuevo nombre: ");
					setNombre(sc.nextLine());
					break;
					
				case 2:
					System.out.println("Email actual: " + getEmail());
					System.out.print("Nuevo Email: ");
					setEmail(sc.next());
					sc.nextLine();
					break;
						
				case 3:
					System.out.println("Nombre completo actual: " + getNombreCompleto());
					System.out.print("Nuevo nombre completo: ");
					setNombreCompleto(sc.nextLine());
					break;
						
				case 4:
					System.out.println("Logo de negocio actual: " + getLogoNegocio());
					System.out.print("Nuevo logo de negocio: ");
					setLogoNegocio(sc.nextLine());
					break;
						
				case 5:
					System.out.println("Descripcion de negocio actual: " + getDescripcionNegocio());
					System.out.print("Nueva descripcion de negocio: ");
					setDescripcionNegocio(sc.nextLine());
					break;
						
				case 6:
					System.out.println("Terminos de negocio actual: " + getTerminosNegocio());
					System.out.print("Nuevo terminos de negocio: ");
					setTerminosNegocio(sc.nextLine());
					break;
						
				default:
					System.out.println("Seleccione un numero entre 0 y 6");
					break;	
			}
		}while (opcion != 0);
		//falta serializar
			
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nContactoUsuario [logoNegocio=" + logoNegocio + ", descripcionNegocio=" 
				+ descripcionNegocio + ", terminosNegocio=" + terminosNegocio + "]";
	}

	String getLogoNegocio() {
		return logoNegocio;
	}

	void setLogoNegocio(String logoNegocio) {
		this.logoNegocio = logoNegocio;
	}

	String getDescripcionNegocio() {
		return descripcionNegocio;
	}

	void setDescripcionNegocio(String descripcionNegocio) {
		this.descripcionNegocio = descripcionNegocio;
	}

	String getTerminosNegocio() {
		return terminosNegocio;
	}

	void setTerminosNegocio(String terminosNegocio) {
		this.terminosNegocio = terminosNegocio;
	}

	ArrayList<Notificacion> getNotificaciones() {
		return notificaciones;
	}

	void setNotificaciones(ArrayList<Notificacion> notificaciones) {
		this.notificaciones = notificaciones;
	}
	
}
