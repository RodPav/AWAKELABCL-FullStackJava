package agenda;

public class Contacto {
     
    private String nombre;
    private String telefono;
    
    
 
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
 
    }
     
    public Contacto(String nombre) {
        this.nombre = nombre;
        this.telefono = "";
    }
 
    public Contacto() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
        return nombre;
    }
 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String getTelefono() {
        return telefono;
    }
 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
 
    @Override
    public String toString() {
        return "nombre=" + nombre + ", telefono=" + telefono;
    }
     
     
}