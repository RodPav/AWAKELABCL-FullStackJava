package modelo;

public class Kromi extends Carro {

	private int anoFabricacion;
	private String marca;

	public Kromi(int anoFabricacion, String marca) {
		super();
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "kromi [anoFabricacion=" + anoFabricacion + ", marca=" + marca + "]";
	}

	public int getAnoFabricacion() {
		return anoFabricacion;
	}

	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
