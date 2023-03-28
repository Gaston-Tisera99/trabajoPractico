package paquete;

public class Partido {
	
	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	private int numPartido;
	private int ganador;	//id de equipo
	private int perdedor;	//id de equipo
	
	public Partido(Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2, int numPartido) {
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
		this.numPartido = numPartido;
		if (golesEquipo1 > golesEquipo2) {
			this.ganador = equipo1.getId();
			this.perdedor = equipo2.getId();
		}
		else if(golesEquipo1 < golesEquipo2)
		{
			this.ganador = equipo2.getId();
			this.perdedor = equipo1.getId();
		}
		else
		{
			this.ganador = -1;     // si alguno de los ids es -1 entonces hubo un empate
			this.perdedor = -1;
		}
	}
	
	@Override
	public String toString() {
		String str = this.equipo1.getNombre() + " VS " + this.equipo2.getNombre() + "\n" + "Resulado: " + this.golesEquipo1 + " a " + this.golesEquipo2 +
				"\n" + "Numero de partido: " + this.numPartido; 
		return str;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public int getNumPartido() {
		return numPartido;
	}

	public int getGanador() {
		return ganador;
	}

	public int getPerdedor() {
		return perdedor;
	}
	
	

	/*
	 * public void LeerResultado() {
	 * 
	 * ArrayList<String> listacsv = new ArrayList();
	 * 
	 * FileReader camino; BufferedReader lector; String linea;
	 * 
	 * 
	 * try { camino = new
	 * FileReader("F:\\Eclipse\\TrabajoPractico\\resultados.csv"); lector = new
	 * BufferedReader(camino);
	 * 
	 * while((linea = lector.readLine()) !=null) { listacsv.add(linea); }
	 * 
	 * }catch (Exception e){ System.out.println(e.getMessage()); }
	 * 
	 * String lineacsv; int Tam; System.out.println("- Equipos:"); for(int i = 1; i<
	 * listacsv.size(); i++) { lineacsv = listacsv.get(i); String[] separado =
	 * lineacsv.split(";");
	 * //System.out.println(separado[3].getClass().getSimpleName());
	 * if(separado[0].equals("1")) { System.out.println("	- Equipo 1:");
	 * System.out.println("		- id: " + separado[0]);
	 * System.out.println("		- Nombre: " + separado[1]);
	 * System.out.println("		- Descripción: " + separado[2]); }
	 * if(separado[5].equals("2")) { System.out.println("	- Equipo 2:");
	 * System.out.println("		- id: " + separado[5]);
	 * System.out.println("		- Nombre: " + separado[6]);
	 * System.out.println("		- Descripción: " + separado[7]); }
	 * if(separado[0].equals("3")) { System.out.println("	- Equipo 3:");
	 * System.out.println("		- id: " + separado[0]);
	 * System.out.println("		- Nombre: " + separado[1]);
	 * System.out.println("		- Descripción: " + separado[2]); }
	 * if(separado[5].equals("4")) { System.out.println("	- Equipo 4:");
	 * System.out.println("		- id: " + separado[5]);
	 * System.out.println("		- Nombre: " + separado[6]);
	 * System.out.println("		- Descripción: " + separado[7]); }
	 * 
	 * } System.out.println("- Partidos:"); for(int y = 1; y< listacsv.size(); y++)
	 * { lineacsv = listacsv.get(y); String[] datos = lineacsv.split(";");
	 * if(datos[0].equals("1")) { System.out.println("	- Partido1:");
	 * System.out.println("		- id: " + datos[0]);
	 * System.out.println("		- Equipo 1: " + datos[1] + " (id:" + datos[0] +
	 * ")"); System.out.println("		- Equipo 2: " + datos[6] + " (id:" +
	 * datos[5] + ")"); System.out.println("		- Goles Equipo 1: " + datos[3]);
	 * System.out.println("		- Goles Equipo 2: " + datos[4]); }
	 * if(datos[0].equals("3")) { System.out.println("	- Partido2:");
	 * System.out.println("		- id: " + datos[0]);
	 * System.out.println("		- Equipo 1: " + datos[1] + " (id:" + datos[0] +
	 * ")"); System.out.println("		- Equipo 2: " + datos[6] + " (id:" +
	 * datos[5] + ")"); System.out.println("		- Goles Equipo 1: " + datos[3]);
	 * System.out.println("		- Goles Equipo 2: " + datos[4]); }
	 * 
	 * //golesEquipo1 = Integer.parseInt(datos[3]); //golesEquipo2 =
	 * Integer.parseInt(datos[4]); }
	 * 
	 * //System.out.println(goles1); //System.out.println(goles2); //if(golesEquipo1
	 * == golesEquipo2) { //System.out.println("EMPATE"); // }else if(golesEquipo1 >
	 * golesEquipo2) { //System.out.println("GANO EQUIPO 1"); //}else {
	 * //System.out.println("GANO EQUIPO 2"); // }
	 * 
	 * }
	 */
}
