package modelo;

/**
 * @author rpavez
 *
 */
public class Electrodomesticos {

	static final String COLOR = "BLANCO";
	static final int PRECIO_BASE = 100;
	static final char CONSUMO = 'F';
	static final int PESO = 5;

	static final char[] LETRAS = new char[] { 'A', 'B', 'C', 'D', 'E', 'F' };

	static final String[] COLORES = new String[] { "blanco", "negro", "rojo", "azul", "gris" };

	private int precioBase;
	private String color;
	private char consumoEnergetico;
	private int peso;

	/**
	 * onstructor por defecto
	 * 
	 */
	public Electrodomesticos() {
		this.color = COLOR;
		this.consumoEnergetico = CONSUMO;
		this.peso = PESO;
		this.precioBase = PRECIO_BASE;

	}

	/**
	 * Constructor con 2 parametrios y el resto por defecto
	 * 
	 * @param precioBase: precio inicial del producto
	 * @param peso: pero del producto
	 */
	public Electrodomesticos(int precioBase, int peso) {
		this();
		this.peso = peso;
		this.precioBase = precioBase;

	}

	/**
	 * Constructor con todos los parametros
	 * 
	 * @param precioBase: precio inicial del producto
	 * @param color: color del producto
	 * @param consumoEnergetico: consumo energetico del producto, basado en letras
	 * @param peso: peso del producto
	 */
	public Electrodomesticos(int precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		comprobarConsumo(consumoEnergetico);
		comprobarColor(color);
	}

	/**
	 * Método que permite comprobar el consumo energético del electrodoméstico.
	 * Si la letra no coincide con las registradas, por defecto sera 'F'
	 *
	 * @param letra
	 */
	private void comprobarConsumo(char letra) {

		this.consumoEnergetico = CONSUMO;

		for (int i = 0; i < LETRAS.length; i++) {

			if (LETRAS[i] == letra) {
				this.consumoEnergetico = letra;

			}

		}
	}

	/**
	 * Método que permite comprobar el color del electrodoméstico. Si el color
	 * no coincide con los registrados, por defecto será colo blanco
	 * 
	 * @param color
	 */
	private void comprobarColor(String color2) {
		this.color = COLOR;
		for (int i = 0; i < COLORES.length; i++) {
			if (COLORES[i].equalsIgnoreCase(color2)) {
				this.color = color2;
			}

		}
	}

	/**
	 * Método que calcula el precio final de los electrodomesticos, en base al
	 * tipo de consumo, peso y los demas atributos de las sub clases.
	 * 
	 * @return el precio total del electrodoméstico en particular y de todos.
	 */
	public int precioFinal() {
		// precio consumo
		int precioConsumo = 0;

		if (this.consumoEnergetico == 'A') {
			precioConsumo = 100;
		}
		if (this.consumoEnergetico == 'B') {
			precioConsumo = 80;
		}
		if (this.consumoEnergetico == 'C') {
			precioConsumo = 60;
		}
		if (this.consumoEnergetico == 'D') {
			precioConsumo = 50;
		}
		if (this.consumoEnergetico == 'E') {
			precioConsumo = 30;
		}
		if (this.consumoEnergetico == 'F') {
			precioConsumo = 10;
		}

		int precioKg = 0;

		if (this.peso >= 0 && this.peso <= 19) {
			precioKg = 10;
		}
		if (this.peso >= 20 && this.peso <= 49) {
			precioKg = 50;
		}
		if (this.peso >= 50 && this.peso <= 79) {
			precioKg = 80;
		}
		if (this.peso >= 80) {
			precioKg = 100;
		}

		int totalElectrodomestico = precioConsumo + precioKg + this.precioBase;

		return totalElectrodomestico;

	}

	public int getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Electrodomesticos [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

}
