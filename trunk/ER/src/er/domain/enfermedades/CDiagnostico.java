package er.domain.enfermedades;

public class CDiagnostico {
	private String nombre;
	private String direccion;
	private String municipio;
	private String provincia;
	private String pais;
	
	public CDiagnostico(String nombre, String direccion, String municipio, String provincia, String pais){
		this.nombre = nombre;
		this.direccion = direccion;
		this.municipio = municipio;
		this.provincia = provincia;
		this.pais = pais;
	}
	
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getMunicipio() {
		return municipio;
	}
	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}

}
