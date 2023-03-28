package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Pronostico {
	private Partido partido;
	private Equipo equipo;
	private String resultado;
	private int puntaje;
	
	public void leerPronostico() {
			ArrayList<String> listacsv = new ArrayList();
		
			FileReader camino;
			BufferedReader lector;
			String linea;
		
		
			try {
				camino = new FileReader("F:\\Eclipse\\TrabajoPractico\\pronostico.csv");
				lector = new BufferedReader(camino);
				
				while((linea = lector.readLine()) !=null) {
					listacsv.add(linea);
				}
				
				}catch (Exception e){
					System.out.println(e.getMessage());
				}
		
				String lineacsv; int Tam;
				int dato = 0;
				System.out.println("- Pronósticos:");
				for(int i = 1; i< listacsv.size(); i++) {
					lineacsv = listacsv.get(i);
					String[] separado = lineacsv.split(";");
				
				
					//System.out.println(separado[0]+"  "+separado[1]+"  "+separado[2]+"  "+separado[3]+"  "+separado[4]); 
					
					if(separado[0].equals("1") && separado[1].equals("X")) {
						System.out.println("        - Pronóstico1 (de Mariana)");
						System.out.println("                - id: 1");
						System.out.println( "                - Partido: Partido (id: 1) (Argentina - Arabia Saudita)");
						System.out.println("		- Equipo: equipo1 (Argentina)");
						System.out.println("                - Resultado: GANADOR");
						System.out.println("         - Pronóstico2 (de Mariana)");
						System.out.println("                - id: 2");
						System.out.println( "                - Partido: Partido (id: 2) (Argentina - Arabia Saudita)");
						System.out.println("		- Equipo: equipo2 (Arabia Saudita)");
						System.out.println("                - Resultado: PERDEDOR");
					}
					if(separado[0].equals("3") && separado[2].equals("X")) {
						System.out.println("         - Pronóstico3 (de Mariana)");
						System.out.println("                - id: 3");
						System.out.println( "                - Partido: Partido (id: 3) (Polonia - Mexico)");
						System.out.println("		- Equipo: equipo3 (Polonia)");
						System.out.println("                - Resultado: EMPATE");
						System.out.println("         - Pronóstico3 (de Mariana)");
						System.out.println("                - id: 4");
						System.out.println( "                - Partido: Partido (id: 4) (Polonia - Mexico)");
						System.out.println("		- Equipo: equipo4 (México)");
						System.out.println("                - Resultado: EMPATE");
					}
					
					if(separado[0].equals("1") && separado[1].equals("X")) {
						puntaje = 0;
						System.out.println("- RESULTADO ESPERADO:");
						System.out.println("	- Mariana: "+ puntaje);
						System.out.println("        No acerto al resultado del partido Argentina - Arabia Saudita");
					}
					if(separado[0].equals("3") && separado[2].equals("X")) {
						puntaje = 1;
						System.out.println("- RESULTADO ESPERADO:");
						System.out.println("	- Mariana: "+ puntaje);
						System.out.println("		Ya que cada acierto vale 1 punto, acertó en Pronóstico 3 sobre el partido Polonia - Mexico");
					}
				
				}
		}
	
	
	
	
	
}
