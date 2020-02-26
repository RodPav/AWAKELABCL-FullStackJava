package modelo;



public class Carro {
	
	private int anoIngreso;
    private int ocupantes;
    private int fila;
    private int columna;
    
    public Carro(int anoIngreso, int ocupantes, int fila, int columna) {
        this.anoIngreso = anoIngreso;
        this.ocupantes = ocupantes;
        this.fila = fila;
        this.columna = columna;
    }
    
    public Carro() {
   
    }
    
	public int getAnoIngreso() {
		return anoIngreso;
	}
	public void setAnoIngreso(int anoIngreso) {
		this.anoIngreso = anoIngreso;
	}
	public int getOcupantes() {
		return ocupantes;
	}
	public void setOcupantes(int ocupantes) {
		this.ocupantes = ocupantes;
	}
	public int getFila() {
		return fila;
	}
	public void setFila(int fila) {
		this.fila = fila;
	}
	public int getColumna() {
		return columna;
	}
	public void setColumna(int columna) {
		this.columna = columna;
	}
	@Override
	public String toString() {
		return "carro [anoIngreso=" + anoIngreso + ", ocupantes=" + ocupantes + ", fila=" + fila + ", columna="
				+ columna + "]";
	}
	
}
