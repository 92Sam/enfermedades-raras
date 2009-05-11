package er.domain.proyectos;

import java.util.Calendar;
import java.util.Collection;

import er.domain.enfermedades.Enfermedad;
import er.domain.usuarios.UsuarioAdministrador;
import er.domain.usuarios.UsuarioCualificado;
import er.domain.usuarios.UsuarioNormal;

public class Proyecto {
	private Integer id;
	private UsuarioAdministrador administrador;
	private UsuarioCualificado cualificado;
	
	/**
	 *usuriosAdscritos son los Usuarios normales */
	private Collection<UsuarioNormal> usuariosAdscritos;
	private String descripcion;
	private String nombre;
	private Collection<Donacion> donaciones;
	private Calendar fechaInicio;
	private Calendar fechaFinPrevista;
	
	/**fechaFinReal indicará que a partir de esa fecha 
	 * el proyecto quedará cerrado
	 * **Para cerrar un proyecto fechaFinReal != null*/
	private Calendar fechaFinReal;
	
	private Enfermedad enfermedad;
	
	
	public Proyecto(String nombre, Calendar fi, Calendar ffp, Enfermedad e){
		this.nombre = nombre;
		this.enfermedad = e;
		this.fechaInicio = fi;
		this.fechaFinPrevista = ffp;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UsuarioAdministrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(UsuarioAdministrador administrador) {
		this.administrador = administrador;
	}

	public UsuarioCualificado getCualificado() {
		return cualificado;
	}

	public void setCualificado(UsuarioCualificado cualificado) {
		this.cualificado = cualificado;
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

	public void setFechaInicio(Calendar fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Calendar getFechaFinPrevista() {
		return fechaFinPrevista;
	}

	public void setFechaFinPrevista(Calendar fechaFinPrevista) {
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
	