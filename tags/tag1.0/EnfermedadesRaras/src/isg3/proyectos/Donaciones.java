package isg3.proyectos;

import isg3.comun.Dni;

public class Donaciones {
	private String cantidad;
	private Boolean esMiembro;
	//si no fuera miembro recogemos algunos de datos del donante
	private String nombre;
	private String apellidos;
	private Dni dni;
	private String pais;
	
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public Boolean getEsMiembro() {
		return esMiembro;
	}
	public void setEsMiembro(Boolean esMiembro) {
		this.esMiembro = esMiembro;
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
	public Dni getDni() {
		return dni;
	}
	public void setDni(Dni dni) {
		this.dni = dni;
	}

}
