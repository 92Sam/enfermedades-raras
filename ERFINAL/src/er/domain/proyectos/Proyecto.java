package er.domain.proyectos;

import java.util.Calendar;
import java.util.Collection;
import java.util.GregorianCalendar;

import er.domain.enfermedades.Enfermedad;
import er.domain.usuarios.UsuarioAdministrador;
import er.domain.usuarios.UsuarioNormal;

public class Proyecto {
	
	private UsuarioAdministrador administrador;
	
	/**
	 *usuriosAdscritos son los Usuarios normales */
	private Collection<UsuarioNormal> usuariosAdscritos;
	private String descripcion;
	private String nombre;
	private Collection<Donacion> donaciones;
	private GregorianCalendar fechaInicio;
	private GregorianCalendar fechaFinPrevista;
	
	/**fechaFinReal indicará que a partir de esa fecha 
	 * el proyecto quedará cerrado
	 * **Para cerrar un proyecto fechaFinReal != null*/
	private Calendar fechaFinReal;
	
	private Enfermedad enfermedad;
	
	public Proyecto(){
		
	}
	public Proyecto(String nombre,UsuarioAdministrador ua, Enfermedad e, String desc,GregorianCalendar fi,GregorianCalendar ff){
		this.nombre = nombre;
		this.enfermedad = e;
		this.descripcion = desc;
		this.administrador = ua;
		this.fechaFinPrevista = ff;
		this.fechaInicio = fi;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	

	public UsuarioAdministrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(UsuarioAdministrador administrador) {
		this.administrador = administrador;
	}

	public Collection<UsuarioNormal> getUsuariosAdscritos() {
		return usuariosAdscritos;
	}

	public void setUsuriosAdscritos(Collection<UsuarioNormal> usuariosAdscritos) {
		this.usuariosAdscritos = usuariosAdscritos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Collection<Donacion> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(Collection<Donacion> donaciones) {
		this.donaciones = donaciones;
	}

	public Calendar getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(GregorianCalendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFinPrevista() {
		return fechaFinPrevista;
	}

	public void setFechaFinPrevista(GregorianCalendar fechaFinPrevista) {
		this.fechaFinPrevista = fechaFinPrevista;
	}

	public Calendar getFechaFinReal() {
		return fechaFinReal;
	}

	public void setFechaFinReal(Calendar fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

	public Enfermedad getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedad enfermedad) {
		this.enfermedad = enfermedad;
	}

}
	