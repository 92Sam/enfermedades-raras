package er.domain.proyectos;

import er.domain.comun.Nif;

public class Donacion {
	private float cantidad;
	//si no fuera miembro recogemos algunos de datos del donante
	private String nombre;
	private String apellidos;
	private Nif dni;
	private String pais;
	private Proyecto proyecto;
	
	public Donacion(String nom, String ape, Nif dni, String pais, Proyecto p,float cant){
		cantidad = cant;
		nombre=nom;
		apellidos=ape;
		this.dni = dni;
		this.pais=pais;
		proyecto=p;
	}
	
	public float getCantidad() {
		return cantidad;
	}
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Nif getDni() {
		return dni;
	}
	public void setDni(Nif dni) {
		this.dni = dni;
	}

}
