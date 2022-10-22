package Logica;

import java.util.ArrayList;
import java.util.Scanner;

//Descrive al usuario del programa
class Usuario {
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	//Genera al Usuario y crea su ContactoUsuario
	Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
			String terminosNegocio) {
		this.contactoUsuario = new ContactoUsuario(nombre, email, nombreCompleto, logoNegocio, descripcionNegocio,
				terminosNegocio);
		this.contactosLocales = new ArrayList<ContactosLocales>();
		this.contactosPendientes = new ArrayList<ContactosPendientes>();
	}

	@Override
	public String toString() {
		return "Usuario [contactoUsuario=" + contactoUsuario + ", contactosLocales=" + contactosLocales
				+ ", contactosPendientes=" + contactosPendientes + "]";
	}

	//Añade un nuevo contacto al array de contactos pendites
	void crearNuevoContacto(Scanner sc) {
		//Llama al metodo de clase crear contacto de pendientes que devuelve un contacto 
		contactosPendientes.add(ContactosPendientes.crearContactoPendiente(sc));
	}
	
	//Permite seleccionar un contacto para iniciar una conversacion.
	void empezarChat(Scanner sc) {
		int opcion;
		do {
			System.out.println("Elige un contacto");
			System.out.println("0 cancelar");
			//Imprime todos los contactos locales con un indce al principio
			for (int i = 0; i < contactosPendientes.size(); i++) {
				System.out.println((i+1) + " " + contactosPendientes.get(i).toString());
			}
			opcion = sc.nextInt();
			sc.nextLine();
			
			//Revisa si se selecciono un contacto y se realiza en cambio.
			if ((opcion > 0) && (opcion <= contactosPendientes.size())) {
				crearTargeta(sc, contactosPendientes.get(opcion - 1));
				contactosPendientes.remove(opcion - 1);
				
			} else if (opcion != 0) {
				System.out.println("Seleccione un numero entre 0 y " + contactosPendientes.size());
				
			} else {
				System.out.println("Termino empezar chat");
				
			}
			
		} while (opcion != 0);
		
	}
	
	//crea una targeta de negocios o social, segun la eleccion por consola.
	//cambia un contacto pendiente a local.
	//resive el contacto a cambiar y el unico escaner como argumentos.
	void crearTargeta(Scanner sc, ContactosPendientes contactoP) {
		int opcion;
		String titulo;
		String cuerpo;
		//crea el contacto local a partir de la informacion del contacto pendiente.
		ContactosLocales contactoL = new ContactosLocales(contactoP.getNombre(), contactoP.getEmail(),
				contactoP.getNombreCompleto());
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
					contactoL.getMensajeNegocio().add(new MensajeNegocio(titulo, cuerpo, 
							contactoUsuario.getLogoNegocio(), contactoUsuario.getDescripcionNegocio(),
							contactoUsuario.getTerminosNegocio(), contactoUsuario.getNombreCompleto(),
							contactoP.getNombreCompleto()));
					break;
					
				case 1:
					//crea y añade un mesaje social al contacto recien creado
					contactoL.getMensajeSocial().add(new MensajeSocial(titulo, cuerpo, 
							contactoUsuario.getNombre(), contactoP.getNombre()));
					break;
					
				default:
					System.out.println("Seleccione un numero entre 0 o 1");
					break;
			}
		} while (opcion != 0 || opcion != 1);
		//por ultimo guarda en contacto local
		contactosLocales.add(contactoL);
		
	}
	
	//Muestra los chat con cada contacto local
	//Cada chat se divide en targetas sociales y de negocios
	void mostrarChats() {
		for(ContactosLocales c: contactosLocales) {
			System.out.println(c.getEmail());
			System.out.println("Targetas de Negocios");
			for (MensajeNegocio tn: c.getMensajeNegocio()) {
				System.out.println(tn);
			}
			System.out.println("Targetas de Sociales");
			for (MensajeSocial ts: c.getMensajeSocial()) {
				System.out.println(ts);
			}
		}
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
		
}
