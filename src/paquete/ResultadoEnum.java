package paquete;

public class ResultadoEnum {
	private int idEquipo1;
	private int idEquipo2;
	private int idGanador;
	
	public ResultadoEnum(int id1, int id2, int ganador) {
		this.idEquipo1 = id1;
		this.idEquipo2 = id2;
		this.idGanador = ganador;
	}

	public int getIdEquipo1() {
		return idEquipo1;
	}

	public int getIdEquipo2() {
		return idEquipo2;
	}

	public int getIdGanador() {
		return idGanador;
	}
	@Override
    public boolean equals(Object obj) {
        if(obj instanceof ResultadoEnum) {
            ResultadoEnum equalsSample = (ResultadoEnum) obj;
            if(equalsSample.getIdEquipo1() == (this.getIdEquipo1())){
            	if(equalsSample.getIdEquipo2() == this.getIdEquipo2()){
            		if(equalsSample.getIdGanador() == this.getIdGanador()) {
            			return true;
            		}
            	}
            }
        }
        return false;       
    }
}
