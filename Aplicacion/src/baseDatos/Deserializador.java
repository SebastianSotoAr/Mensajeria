package baseDatos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializador {
	public static File rutaTemp = new File("src\\baseDatos\\temp");

	public static void deserializar() {
		File[] docs = rutaTemp.listFiles();
		FileInputStream fis;
		ObjectInputStream ois;
		
		for (File file : docs) {
			if (file.getAbsolutePath().contains("datosContactoUsuario")) {
				try {
					fis = new FileInputStream(file);
					ois = new ObjectInputStream(fis);
					
					DatosContactoUsuario.datos = ((DatosContactoUsuario) ois.readObject());
				
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
