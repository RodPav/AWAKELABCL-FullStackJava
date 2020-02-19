
public class TrabajoContacto extends Contacto{
	
	private String email;
	
	public TrabajoContacto(String nombre, String telefono) {
		super(nombre, telefono);
		// TODO Auto-generated constructor stub
	}
	
	public TrabajoContacto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "TrabajoContacto [email=" + email + "]";
	}
	
	
}
