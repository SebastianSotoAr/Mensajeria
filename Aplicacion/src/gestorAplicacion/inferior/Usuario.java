package gestorAplicacion.inferior;

import java.util.ArrayList;
import gestorAplicacion.superior.Mensaje;

//Descrive al usuario del programa
public class Usuario {
	private ContactoUsuario contactoUsuario;
	private ArrayList<ContactosLocales> contactosLocales;
	private ArrayList<ContactosPendientes> contactosPendientes;

	//Genera al Usuario y crea su ContactoUsuario
	public Usuario(String nombre, String email, String nombreCompleto, String logoNegocio, String descripcionNegocio,
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
	public void crearNuevoContacto(String nombre, String email, String nombreCompleto) {
		//Llama al metodo de clase crear contacto de pendientes que devuelve un contacto 
		contactosPendientes.add(new ContactosPendientes(nombre, email, nombreCompleto));
	}
	
	//Depende del metodo empezarChat para optener el indice del contacto
	//vuele un contacto pendiente en local
	public void volverContactoLocal(int indice) {
		ContactosPendientes contactoP = contactosPendientes.remove(indice);
		ContactosLocales contactoL = new ContactosLocales(contactoP.getNombre(), contactoP.getEmail(),
				contactoP.getNombreCompleto());
		contactosLocales.add(contactoL);
	}
	
	//le agrega un mensaje de negocios al contacto local recien creado
	public void anadirMensajeNegocio(String titulo, String cuerpo, String urgencia) {
		int l = contactosLocales.size() - 1;
		contactosLocales.get(l).getMensajes().add(
			new MensajeNegocio(titulo, cuerpo, urgencia,contactoUsuario.getLogoNegocio(),
					contactoUsuario.getDescripcionNegocio(), contactoUsuario.getTerminosNegocio(),
					contactoUsuario.getNombreCompleto(), contactosLocales.get(l).getNombreCompleto())
		);
	}
	
	//le agrega un mensaje social al contacto local recien creado
	public void anadirMensajeSocial(String titulo, String cuerpo) {
		int l = contactosLocales.size() - 1;
		contactosLocales.get(l).getMensajes().add(
				new MensajeSocial(titulo, cuerpo, contactoUsuario.getNombre(), contactosLocales.get(l).getNombre())
		);
	}
	
	//le agrega un mensaje de negocios al contacto local recien creado
	public void anadirMensajeNegocio(int i, String titulo, String cuerpo, String urgencia) {
		contactosLocales.get(i).getMensajes().add(
			new MensajeNegocio(titulo, cuerpo, urgencia,contactoUsuario.getLogoNegocio(),
					contactoUsuario.getDescripcionNegocio(), contactoUsuario.getTerminosNegocio(),
					contactoUsuario.getNombreCompleto(), contactosLocales.get(i).getNombreCompleto())
		);
	}
	
	//le agrega un mensaje social al contacto local recien creado
	public void anadirMensajeSocial(int i, String titulo, String cuerpo) {
		contactosLocales.get(i).getMensajes().add(
				new MensajeSocial(titulo, cuerpo,contactoUsuario.getNombre(), contactosLocales.get(i).getNombre())
		);
	}
	
	//Muestra los chat con cada contacto local
	//Cada chat se divide en targetas sociales y de negocios
	public String mostrarChats() {
		String texto = "";
		for(ContactosLocales c: contactosLocales) {
			texto += "email: " + c.getEmail() + "\n";
			texto += "Mensajes: " + "\n";
			for (Mensaje m: c.getMensajes()) {
				texto += m + "\n";
			}	
		}
		return texto;	
	}
	
	//Devuelve en contacto pendiente en la pocision i
	public Object getContactoPendiente(int i) {
		return contactosPendientes.get(i);
	}
	
	//Devuelve en contacto local en la pocision i
	public Object getContactoLocal(int i) {
		return contactosLocales.get(i);
	}

	public ContactoUsuario getContactoUsuario() {
		return contactoUsuario;
	}

	public void setContactoUsuario(ContactoUsuario contactoUsuario) {
		this.contactoUsuario = contactoUsuario;
	}

	public ArrayList<ContactosLocales> getContactosLocales() {
		return contactosLocales;
	}

	public void setContactosLocales(ArrayList<ContactosLocales> contactosLocales) {
		this.contactosLocales = contactosLocales;
	}

	public ArrayList<ContactosPendientes> getContactosPendientes() {
		return contactosPendientes;
	}

	public void setContactosPendientes(ArrayList<ContactosPendientes> contactosPendientes) {
		this.contactosPendientes = contactosPendientes;
	}
		
}
