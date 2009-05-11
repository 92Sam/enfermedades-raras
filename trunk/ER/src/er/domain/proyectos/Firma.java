package er.domain.proyectos;

import er.domain.comun.Nif;

public class Firma {
	private String nombre;
	private String apellidos;
	private Nif dni;
	
	public Firma(String nombre, String apellidos, Nif dni){
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellidos(){
		return this.apellidos;
	}
	
	public Nif getNif(){
		return this.dni;
	}

}
