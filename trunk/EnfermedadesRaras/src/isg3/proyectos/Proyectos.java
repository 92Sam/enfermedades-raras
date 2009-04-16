package isg3.proyectos;

import isg3.enfermedades.Enfermedades;
import isg3.usuarios.UsuarioAdministrador;
import isg3.usuarios.UsuarioCualificado;
import isg3.usuarios.UsuarioNormal;

import java.util.Collection;
import java.util.Date;

public class Proyectos {
	private Integer id;
	private UsuarioAdministrador administrador;
	private UsuarioCualificado cualificado;
	
	/**
	 *usuriosAdscritos son los Usuarios normales */
	private Collection<UsuarioNormal> usuriosAdscritos;
	
	private String denominacion;
	private Collection<Donaciones> donaciones;
	private Date fechaInicio;
	private Date fechaFinPrevista;
	
	/**fechaFinReal indicará que a partir de esa fecha 
	 * el proyecto quedará cerrado
	 * **Para cerrar un proyecto fechaFinReal != null*/
	private Date fechaFinReal;
	
	private Enfermedades enfermedad;
	
	private Firmas firma;

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

	public Collection<UsuarioNormal> getUsuriosAdscritos() {
		return usuriosAdscritos;
	}

	public void setUsuriosAdscritos(Collection<UsuarioNormal> usuriosAdscritos) {
		this.usuriosAdscritos = usuriosAdscritos;
	}

	public String getDenominacion() {
		return denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public Collection<Donaciones> getDonaciones() {
		return donaciones;
	}

	public void setDonaciones(Collection<Donaciones> donaciones) {
		this.donaciones = donaciones;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFinPrevista() {
		return fechaFinPrevista;
	}

	public void setFechaFinPrevista(Date fechaFinPrevista) {
		this.fechaFinPrevista = fechaFinPrevista;
	}

	public Date getFechaFinReal() {
		return fechaFinReal;
	}

	public void setFechaFinReal(Date fechaFinReal) {
		this.fechaFinReal = fechaFinReal;
	}

	public Enfermedades getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(Enfermedades enfermedad) {
		this.enfermedad = enfermedad;
	}

	public Firmas getFirma() {
		return firma;
	}

	public void setFirma(Firmas firma) {
		this.firma = firma;
	}

}
	