package er.domain.enfermedades;

public class Sintoma {
	private String nombre;
	private String descripcion;
	private String gravedad;
	
	public Sintoma(String nom, String desc, String gra){
		nombre = nom;
		descripcion = desc;
		gravedad = gra;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public String getGravedad() {
		return gravedad;
	}
	public void setGravedad(String gravedad) {
		this.gravedad = gravedad;
	}
	

}
