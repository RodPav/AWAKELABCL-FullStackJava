import java.util.Date;

public class FamiliaContacto extends Contacto{
	
	private Date cumpleanos;
	
	public FamiliaContacto(String nombre) {
		super(nombre);
	}

	public FamiliaContacto(String nombre, String telefono, Date cumpleanos) {
		super(nombre, telefono);
		this.cumpleanos=cumpleanos;
	}
	

	public Date getCumpleanos() {
		return cumpleanos;
	}

	public void setCumpleanos(Date cumpleanos) {
		this.cumpleanos = cumpleanos;
	}

	@Override
	public String toString() {
		return "FamiliaContacto [cumpleanos=" + cumpleanos + "]";
	}
}
