package paquete;

public class Principal {

	public static void main(String[] args) {
		
		Lector l = new Lector();
		l.leerResultado("D:\\Documentos\\Eclipse\\trabajoPractico\\resultados.csv");
		for(Equipo e: l.getEquipos()) {
			System.out.println();
			System.out.println(e.toString());
		}
		for(Partido p: l.getPartidos()) {
			System.out.println();
			System.out.println(p.toString());
		}
	}
}