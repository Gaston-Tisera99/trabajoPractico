package paquete;

public class Equipo {
	int id;
	String nombre;
	String descripcion;
	
	public Equipo(int id, String nombre, String descripcion) {		
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public int getId() {
		return this.id;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {		
		return "ID: " + this.id + " Nombre: " + this.nombre + " Descripcion: " + this.descripcion;
	}	
}