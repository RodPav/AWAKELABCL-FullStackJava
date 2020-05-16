package modelo;

/**
 * @author rpavez
 *
 */
public class Television extends Electrodomesticos {

	static final int RESOLUCION_DEF = 20;
	static final boolean TDT_DEF = false;

	private int resolucion;
	private boolean tdt;

	
	/**
	 * Constructor por defecto
	 */
	public Television() {
		this.resolucion = RESOLUCION_DEF;
		this.tdt = TDT_DEF;
	}

	/**
	 * Cconstructor que recibe solo el precio y peso, el resto por defecto
	 * @param precioBase
	 * @param peso
	 */
	public Television(int precioBase, int peso) {
		super(precioBase, peso);
		this.resolucion = RESOLUCION_DEF;
		this.tdt = TDT_DEF;
	}

	/**
	 * Constructor que recibe todos los parametros, incluidos los de la super clase
	 * @param precioBase
	 * @param color
	 * @param consumoEnergetico
	 * @param peso
	 * @param resolucion
	 * @param tdt
	 */
	public Television(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean tdt) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public int precioFinal() {

		int precioAumentado = 0;

		int montoTDT = 0;

		if (this.resolucion > 40) {

			int montoRes = (100 / 30);
			precioAumentado = getPrecioBase() * montoRes;

		}

		if (this.tdt) {

			montoTDT = 50;

		}

		int totalTV = precioAumentado + montoTDT + super.precioFinal();

		return totalTV;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

}
