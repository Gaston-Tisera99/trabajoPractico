package paquete;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Pronostico {
	private int Equipo1;
	private int Equipo2;
	private String Gana1;
	private String Empata;
	private String Gana2;
	
	public Pronostico(int equipo1, int equipo2, String gana1, String empata, String gana2) {
		
		this.Equipo1 = equipo1;
		this.Equipo2 = equipo2;
		this.Gana1 = gana1;
		this.Empata = empata;
		this.Gana2 = gana2;
	}
	
	
	public int getEquipo1() {
		return Equipo1;
	}
	public void setEquipo1(int equipo1) {
		Equipo1 = equipo1;
	}
	public int getEquipo2() {
		return Equipo2;
	}
	public void setEquipo2(int equipo2) {
		Equipo2 = equipo2;
	}
	public String getGana1() {
		return Gana1;
	}
	public void setGana1(String gana1) {
		Gana1 = gana1;
	}
	public String getEmpata() {
		return Empata;
	}
	public void setEmpata(String empata) {
		Empata = empata;
	}
	public String getGana2() {
		return Gana2;
	}
	public void setGana2(String gana2) {
		Gana2 = gana2;
	}

	public void puntos(String resultado) {
			if(getGana1().equals("X")) {
				System.out.println("GANA ARGENTINA");
			}
	}
	
}
