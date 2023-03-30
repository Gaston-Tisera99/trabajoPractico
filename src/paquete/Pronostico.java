package paquete;

import java.util.ArrayList;

public class Pronostico {		
	private int puntaje;
	
	public Pronostico(ArrayList<Partido> partidos, ArrayList<ResultadoEnum> resultados) {
		puntaje = 0;
		for(int i = 0; i<partidos.size(); i++) {
			Partido partido = partidos.get(i);
			ResultadoEnum resultado = resultados.get(i);					
			if(partido.getResultado().equals(resultado)) {
				puntaje += 1;
			}
		}
	}
	
	public int getPuntaje() {
		return this.puntaje;
	}
}
