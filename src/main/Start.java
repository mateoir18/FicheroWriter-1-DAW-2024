package main;

import java.util.ArrayList;
import java.util.List;

import datos.Persona;
import escribir.WriteFile;

public class Start {

	public static void main(String[] args) {
		
		List <Persona> datos = new ArrayList<Persona>();
		datos.add(new Persona("Mateo", 22, "Oviedo"));
		datos.add(new Persona("Juan", 25, "Gijon"));
		datos.add(new Persona("Pepe", 30, "Dallas"));
		datos.add(new Persona("Diego", 27, "Los Angeles"));
		
		WriteFile fw = new WriteFile();
		fw.write(datos);

	}

}
