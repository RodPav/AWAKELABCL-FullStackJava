package modelo;

/**
 * @author rpavez
 *
 */
public class Lavadora extends Electrodomesticos {

	static final int CARGA_LAVADORA = 5;

	private int carga;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		this.carga = CARGA_LAVADORA;

	}

	/**
	 * Constructor que recibe solo el precio base y peso, el resto por defecto
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(int precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_LAVADORA;

	}

	/**
	 * 
	 * Constructor que recibe todos los parametros, incluido los de la super clase
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param carga
	 */
	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;

	}

	public int getCarga() {
		return carga;
	}

	public int precioFinal() {
		int montoCarga = 0;

		if (this.carga > 30) {

		}

		int totalLavadora = montoCarga + super.precioFinal();

		return totalLavadora;
	}

}
