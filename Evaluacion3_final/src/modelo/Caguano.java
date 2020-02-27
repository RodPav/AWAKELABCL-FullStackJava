package modelo;

public class Caguano extends Carro {

	private String alcanceTiro;
	private String colorConfeti;

	public Caguano(String alcanceTiro, String colorConfeti) {
		super();
		this.alcanceTiro = alcanceTiro;
		this.colorConfeti = colorConfeti;
	}

	@Override
	public String toString() {
		return "caguano [alcanceTiro=" + alcanceTiro + ", colorConfeti=" + colorConfeti + "]";
	}

	public String getAlcanceTiro() {
		return alcanceTiro;
	}

	public void setAlcanceTiro(String alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public String getColorConfeti() {
		return colorConfeti;
	}

	public void setColorConfeti(String colorConfeti) {
		this.colorConfeti = colorConfeti;
	}
}
