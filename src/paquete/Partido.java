package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Partido {
	
	String Equipo1;
	String Equipo2;
	int golesEquipo1;
	int golesEquipo2;
	int numPartido;
	int ganador;
	int perdedor;

	public void LeerResultado() {
		
		ArrayList<String> listacsv = new ArrayList();
		
		FileReader camino;
		BufferedReader lector;
		String linea;
		
		
		try {
			camino = new FileReader("F:\\Eclipse\\TrabajoPractico\\resultados.csv");
			lector = new BufferedReader(camino);
			
			while((linea = lector.readLine()) !=null) {
				listacsv.add(linea);
			}
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		
		String lineacsv; int Tam;
		System.out.println("- Equipos:");
		for(int i = 1; i< listacsv.size(); i++) {
			lineacsv = listacsv.get(i);
			String[] separado = lineacsv.split(";");
			//System.out.println(separado[3].getClass().getSimpleName());
				if(separado[0].equals("1")) {
					System.out.println("	- Equipo 1:");
					System.out.println("		- id: " + separado[0]);
					System.out.println("		- Nombre: " + separado[1]);	
					System.out.println("		- Descripción: " + separado[2]);
				}
				if(separado[5].equals("2")) {
					System.out.println("	- Equipo 2:");
					System.out.println("		- id: " + separado[5]);
					System.out.println("		- Nombre: " + separado[6]);	
					System.out.println("		- Descripción: " + separado[7]);
				}
				if(separado[0].equals("3")) {
					System.out.println("	- Equipo 3:");
					System.out.println("		- id: " + separado[0]);
					System.out.println("		- Nombre: " + separado[1]);	
					System.out.println("		- Descripción: " + separado[2]);
				}
				if(separado[5].equals("4")) {
					System.out.println("	- Equipo 4:");
					System.out.println("		- id: " + separado[5]);
					System.out.println("		- Nombre: " + separado[6]);	
					System.out.println("		- Descripción: " + separado[7]);
				}
				
	}
		System.out.println("- Partidos:");
		for(int y = 1; y< listacsv.size(); y++) {
			lineacsv = listacsv.get(y);
			String[] datos = lineacsv.split(";");
			if(datos[0].equals("1")) {
				System.out.println("	- Partido1:");
				System.out.println("		- id: " + datos[0]);
				System.out.println("		- Equipo 1: " + datos[1] + " (id:" + datos[0] + ")");	
				System.out.println("		- Equipo 2: " + datos[6] + " (id:" + datos[5] + ")");
				System.out.println("		- Goles Equipo 1: " + datos[3]);
				System.out.println("		- Goles Equipo 2: " + datos[4]);
			}
			if(datos[0].equals("3")) {
				System.out.println("	- Partido2:");
				System.out.println("		- id: " + datos[0]);
				System.out.println("		- Equipo 1: " + datos[1] + " (id:" + datos[0] + ")");	
				System.out.println("		- Equipo 2: " + datos[6] + " (id:" + datos[5] + ")");
				System.out.println("		- Goles Equipo 1: " + datos[3]);
				System.out.println("		- Goles Equipo 2: " + datos[4]);
			}
			
			//golesEquipo1 = Integer.parseInt(datos[3]);
			//golesEquipo2 = Integer.parseInt(datos[4]);
		}
			
		//System.out.println(goles1);
		//System.out.println(goles2);	
		//if(golesEquipo1 == golesEquipo2) {
			//System.out.println("EMPATE");
	//	}else if(golesEquipo1 > golesEquipo2) {
			//System.out.println("GANO EQUIPO 1");
		//}else {
			//System.out.println("GANO EQUIPO 2");
	//	}

}
}
