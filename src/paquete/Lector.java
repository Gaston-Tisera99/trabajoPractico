package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lector {
	private ArrayList<Partido> partidos;
	private ArrayList<Equipo> equipos;
	public ArrayList<String> leerResultado() {
			
			ArrayList<String> listacsv = new ArrayList<String>();
			
			FileReader camino;
			BufferedReader lector;
			String linea;
			
			
			try {
				camino = new FileReader("F:\\Eclipse\\TrabajoPractico\\resultados.csv");
				lector = new BufferedReader(camino);
				
				while((linea = lector.readLine()) !=null) {
					listacsv.add(linea);
				}
				
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
			
			return listacsv;
	}
	
	public void procesarResultados(ArrayList<String> listacsv) {
		String lineaCSV;		
		//ArrayList<Equipo> equipos = new ArrayList<Equipo>();
		for ( int i = 1; i <= listacsv.size(); i++) {
			lineaCSV = listacsv.get(i);
			String[] lineaSeparada = lineaCSV.split(";");	
			Equipo equipo1 = new Equipo(Integer.parseInt(lineaSeparada[0]), lineaSeparada[1], lineaSeparada[2]);
			this.equipos.add(equipo1);
			Equipo equipo2 = new Equipo(Integer.parseInt(lineaSeparada[5]), lineaSeparada[6], lineaSeparada[7]);			
			this.equipos.add(equipo2);
			Partido p = new Partido(equipo1, equipo2, Integer.parseInt(lineaSeparada[3]), Integer.parseInt(lineaSeparada[4]), i);
			this.partidos.add(p);
		}
	}
	
	public ArrayList<Partido> getPartidos(){
		return this.partidos;
	}
	
	public ArrayList<Equipo> getEquipos(){
		return this.equipos;
	}
}
