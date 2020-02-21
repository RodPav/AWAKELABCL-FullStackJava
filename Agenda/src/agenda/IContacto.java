package agenda;


public interface IContacto {

	
	
	
	public int buscaContacto(OperacionesContacto contactoBuscado);

	boolean comparaContactos(OperacionesContacto contactoA, OperacionesContacto contactoB);

	public boolean existeContacto(Contacto c);

	public boolean agregarContacto(Contacto nuevoContacto);

	boolean eliminarContacto(Contacto contacto);
	
	public void listarContactos();

	boolean existeContactoAgregar(Contacto nuevoContacto);




   
         
    

}
