package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Lector {
	private ArrayList<Partido> partidos;
	private ArrayList<Equipo> equipos;
	private int equipoGanador1;
	private int equipoGanador2;
	private int puntaje;
	
	
	public Lector() {
		partidos = new ArrayList<Partido>();
		equipos = new ArrayList<Equipo>();
	
	}
	
	public void leerResultado(String dir) {
			
			ArrayList<String> listacsv = new ArrayList<String>();
			
			FileReader camino;
			BufferedReader lector;
			String linea;
			
			
			try {
				camino = new FileReader(dir);
				lector = new BufferedReader(camino);
				
				while((linea = lector.readLine()) !=null) {
					listacsv.add(linea);
				}
				procesarResultados(listacsv);
				
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
			
		
	}
	
	private void procesarResultados(ArrayList<String> listacsv) {
		String lineaCSV;		
		for ( int i = 1; i <= listacsv.size(); i++) {
			lineaCSV = listacsv.get(i);
			String[] lineaSeparada = lineaCSV.split(";");	
			Equipo equipo1 = new Equipo(Integer.parseInt(lineaSeparada[0]), lineaSeparada[1], lineaSeparada[2]);
			this.equipos.add(equipo1);
			Equipo equipo2 = new Equipo(Integer.parseInt(lineaSeparada[5]), lineaSeparada[6], lineaSeparada[7]);			
			this.equipos.add(equipo2);
			Partido p = new Partido(equipo1, equipo2, Integer.parseInt(lineaSeparada[3]), Integer.parseInt(lineaSeparada[4]), i);
			this.partidos.add(p);
				if (p.getNumPartido() == 1) {
				if(p.getGolesEquipo1() > p.getGolesEquipo2()) {
					equipoGanador1 = p.getEquipo1().id;
					System.out.println("EL NUMERO DE PARTIDO ES " + p.getNumPartido());
					System.out.println("EL EQUIPO QUE GANO FUE: " + lineaSeparada[1]);
				}else if (p.getGolesEquipo1() < p.getGolesEquipo2()){
					equipoGanador1 = p.getEquipo2().id;
					System.out.println("EL NUMERO DE PARTIDO ES " + p.getNumPartido());
					System.out.println("EL EQUIPO QUE GANO FUE: " + lineaSeparada[6]);
				} else if(p.getGolesEquipo1() == p.getGolesEquipo2()){
					equipoGanador1 = p.getEquipo1().id;
					System.out.println("EL RESULTADO FUE UN EMPATE");
				}
			  }else if(p.getNumPartido() == 2){
				  if(p.getGolesEquipo1() > p.getGolesEquipo2()) {
						equipoGanador2 = p.getEquipo1().id;
						System.out.println("EL NUMERO DE PARTIDO ES " + p.getNumPartido());
						System.out.println("EL EQUIPO QUE GANO FUE: " + lineaSeparada[1]);
					}else if (p.getGolesEquipo1() < p.getGolesEquipo2()){
						equipoGanador2 = p.getEquipo2().id;
						System.out.println("EL NUMERO DE PARTIDO ES " + p.getNumPartido());
						System.out.println("EL EQUIPO QUE GANO FUE: " + lineaSeparada[1]);
						System.out.println(equipoGanador2);	
					} else if(p.getGolesEquipo1() == p.getGolesEquipo2()){
						equipoGanador2 = p.getEquipo1().id;
						System.out.println("EL NUMERO DE PARTIDO ES " + p.getNumPartido());
						System.out.println("EL RESULTADO FUE UN EMPATE");
					}
			  }
			
			
		}
		System.out.println(equipoGanador1);
	}
	public void leerPronostico(String dir) {
		ArrayList<String> lista = new ArrayList<String>();
	
		FileReader camino;
		BufferedReader lector;
		String linea;
	
	
		try {
			camino = new FileReader(dir);
			lector = new BufferedReader(camino);
			
			while((linea = lector.readLine()) !=null) {
				lista.add(linea);
			}
			
			
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
			procesarPronostico(lista);
	}
	
	private void procesarPronostico(ArrayList<String> lista) {
		String lineaCSV;	
		int puntajeTotal = 0;
		for ( int i = 1; i < lista.size(); i++) {
			
			lineaCSV = lista.get(i);
			String[] lineaSeparada = lineaCSV.split(";");	
			
			if(lineaSeparada[1].equals("X") && Integer.parseInt(lineaSeparada[0]) == equipoGanador1) {
				puntaje = 1;
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO A UN RESULTADO");
			}
			if(lineaSeparada[3].equals("X") && Integer.parseInt(lineaSeparada[4]) == equipoGanador1) {
				puntaje = 1;
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO A UN RESULTADO");
			}
			if(lineaSeparada[1].equals("X") && Integer.parseInt(lineaSeparada[0]) == equipoGanador2) {
				puntaje = 1;
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO A UN RESULTADO");
			}
			if(lineaSeparada[3].equals("X") && Integer.parseInt(lineaSeparada[4]) == equipoGanador2) {
				puntaje = 1;
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO A UN RESULTADO");
			}
			if (lineaSeparada[2].equals("X") && Integer.parseInt(lineaSeparada[0]) == equipoGanador1) {
				puntaje = 1;
				System.out.println();
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO A UN RESULTADO");
			}
			if(lineaSeparada[2].equals("X") && Integer.parseInt(lineaSeparada[0]) == equipoGanador2) {
				puntaje = 1;
				System.out.println();
				System.out.println("SUMA UN PUNTO POR HABER ACERTADO AL RESULTADO DE EMPATE");
			}
			puntajeTotal += puntaje;
		}
		System.out.println();
		System.out.println("--Resultado: ");
		System.out.println("SUMA DE PUNTOS: " + puntajeTotal);
	}
	
	
	
	
	public ArrayList<Partido> getPartidos(){
		return this.partidos;
	}
	
	public ArrayList<Equipo> getEquipos(){
		return this.equipos;
	}
}
