package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import gestorAplicacion.inferior.ContactoUsuario;
import gestorAplicacion.inferior.Notificacion;

public class Deserializador {
	public static File rutaTemp = new File("src\\baseDastos\\temp");

	public static void deserializar(ContactoUsuario contactoUsuario) {
		File[] docs = rutaTemp.listFiles();
		FileInputStream fis;
		ObjectInputStream ois;
		
		for (File file : docs) {
			if (file.getAbsolutePath().contains("notificaciones")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					contactoUsuario.setNotificaciones((List<Notificacion>) ois.readObject());
				
				} catch (FileNotFoundException e) {
					e.printStackTrace();
					
				} catch (IOException e) {
					e.printStackTrace();
					
				} catch (ClassNotFoundException e) {
					e.printStackTrace();
					
				}
				
			}
		}	
	}
}
