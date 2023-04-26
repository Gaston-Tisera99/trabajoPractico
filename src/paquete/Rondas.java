package paquete;

import java.util.ArrayList;
import java.util.List;

public class Rondas {
	String nro;
	List<Partido> partidos = new ArrayList<>();
	public Rondas(String nro, List<Partido> partidos) {
		super();
		this.nro = nro;
		this.partidos = partidos;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	public List<Partido> getPartidos() {
		return partidos;
	}
	public void setPartidos(List<Partido> partidos) {
		this.partidos = partidos;
	}
	
	
	
	
	
}
