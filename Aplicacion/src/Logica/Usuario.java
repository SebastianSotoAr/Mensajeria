package Logica;

import java.util.ArrayList;
import java.util.Scanner;

class Usuario {
	private String nombre;
	private String email;
	private String nombreCompleto;
	private String logoNegocio;
	private String descripcionNegocio;
	private String terminosNegocio;
	private Notificacion notificacion;
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		this.nombre = nombre;
		this.email = email;
		this.nombreCompleto = nombreCompleto;
		this.logoNegocio = logoNegocio;
		this.descripcionNegocio = descripcionNegocio;
		this.terminosNegocio = terminosNegocio;
		this.notificacion = new Notificacion();
		this.contactoUsuario = new ContactoUsuario(this);
		this.contactosLocales = new ArrayList<ContactosLocales>();
		this.contactosPendientes = new ArrayList<ContactosPendientes>();
	}

	String getNombre() {
		return nombre;
	}

	void setNombre(String nombre) {
		this.nombre = nombre;
	}

	String getEmail() {
		return email;
	}

	void setEmail(String email) {
		this.email = email;
	}

	String getNombreCompleto() {
		return nombreCompleto;
	}

	void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
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

	Notificacion getNotificacion() {
		return notificacion;
	}

	void setNotificacion(Notificacion notificacion) {
		this.notificacion = notificacion;
	}

	ContactoUsuario getContactoUsuario() {
		return contactoUsuario;
	}

	void setContactoUsuario(ContactoUsuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	ArrayList<ContactosLocales> getContactosLocales() {
		return contactosLocales;
	}

	void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
		this.contactosLocales = contactosLocales;
	}

	ArrayList<ContactosPendientes> getContactosPendientes() {
		return contactosPendientes;
	}

	void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
		this.contactosPendientes = contactosPendientes;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", email=" + email + ", nombreCompleto=" + nombreCompleto
				+ ", logoNegocio=" + logoNegocio + ", descripcionNegocio=" + descripcionNegocio + ", terminosNegocio="
				+ terminosNegocio + ", notificacion=" + notificacion + ", contactoUsuario=" + contactoUsuario
				+ ", contactosLocales=" + contactosLocales + ", contactosPendientes=" + contactosPendientes + "]";
	}
	
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
		
	}
	
	void crearNuevoContacto(Scanner sc) {
		contactosPendientes.add(ContactosPendientes.crearContactoPendiente(sc));
	}
	
	void empezarChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			for (int i = 0; i < contactosPendientes.size(); i++) {
				System.out.println((i+1) + " " + contactosPendientes.get(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			if ((opcion > 0) && (opcion <= contactosPendientes.size())) {
				System.out.println(contactosPendientes.get(opcion - 1).getEmail());
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + contactosPendientes.size());
				
			} else {
				System.out.println("Termino empezar chat");
				
			}
			
		} while (opcion != 0);
		
	}
	
}
