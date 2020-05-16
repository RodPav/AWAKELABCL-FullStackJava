package modelo;

public class Trupalla extends Carro {

	private int armadura;
	private String piloto;

	public Trupalla(int armadura, String piloto) {
		super();
		this.armadura = armadura;
		this.piloto = piloto;
	}

	@Override
	public String toString() {
		return "trupalla [armadura=" + armadura + ", piloto=" + piloto + "]";
	}

	public int getArmadura() {
		return armadura;
	}

	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}
}
