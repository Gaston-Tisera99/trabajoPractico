package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		
		Partido p1 = new Partido();
		Pronostico pr1 = new Pronostico();
		p1.LeerResultado();
		
		pr1.leerPronostico();
		
	}
}


