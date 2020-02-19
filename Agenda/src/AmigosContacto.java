
public class AmigosContacto extends Contacto{
	
	private String redesSociales;
	
	public AmigosContacto(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}
	
	public AmigosContacto(String nombre, String telefono) {
		super(nombre, telefono);
		// TODO Auto-generated constructor stub
	}

	

	public String getRedesSociales() {
		return redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	@Override
	public String toString() {
		return "AmigosContacto [redesSociales=" + redesSociales + "]";
	}
	
}
