
public interface IContacto {

	public int buscaContacto(OperacionesContacto contactoBuscado);

	public OperacionesContacto getContacto(String nombres, String apellidos);

	/**
	 * intenta setear un nuevo contacto. si el contacto no existia previamente
	 * inserta el contacto y retorna true. si el contacto ya existia previametne no
	 * inserta y retorna false.
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param numero
	 * @return
	 */
	public boolean agregarContacto(String nombres, String apellidos, String numero);

	/**
	 * si el contacto no existia lo crea. si el contacto ya existia lo actualiza.
	 * 
	 * @return
	 */
	public boolean actualizaContacto(String nombres, String apellidos, String numero);

	public boolean eliminarContacto(String nombres, String apellidos);

	boolean comparaContactos(OperacionesContacto contactoA, OperacionesContacto contactoB);

	/**
	 * le quita a un string los espacios en blanco al principio y al final, tambien
	 * si un string es null lo convierte a string de largo cero. este es un metodo
	 * utilitario, para no hacer tanta bola de codigo en los metodos mas arriba. la
	 * claridad del codigo es super importante!
	 */
	public String quitaNulos(String str);

}
