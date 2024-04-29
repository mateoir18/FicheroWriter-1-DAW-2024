package escribir;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;

import datos.Persona;

/**
 * Se escribe en un fichero de texto una línea por cada dato que buscamos
 * guardar
 *
 */
public class WriteFile {

	public void write(List<Persona> datos) {

		

		try {

			File file = new File("./file.txt");
			
			// A stream that connects to the text file
			FileWriter fileReader = new FileWriter(file);
			
			// Connect the FileWriter to the BufferedWriter
			BufferedWriter bufferedWriter = new BufferedWriter(fileReader);
			for (Persona s : datos) {
				
				// writed data and inserts new line
				bufferedWriter.write(s + "\n");
			}
			bufferedWriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
