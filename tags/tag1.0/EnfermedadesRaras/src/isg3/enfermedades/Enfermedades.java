package isg3.enfermedades;

import isg3.proyectos.Proyectos;

import java.util.Collection;
import java.util.LinkedList;

public class Enfermedades {
	private Integer id ; 
	/**
	 * proyectos creados que tratan la enfermedad*/
	private Collection<Proyectos> lproyectos;
	
	private String nombreComun;
	private String nombreTecnico;
	
	private Collection<Sintomas> lsintomas;
	private Collection<CDiagnostico> cdiagnostico;
	
	private Tratamientos tratamiento;
	
	//medicamentos aplicables 
	private Medicamentos medicamentos;
	
	public Enfermedades(){
		this.nombreComun = "enfermedad de prueba";
		this.lsintomas = new LinkedList<Sintomas>();
		this.tratamiento = new Tratamientos();
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Collection<Proyectos> getLproyectos() {
		return lproyectos;
	}

	public void setLproyectos(Collection<Proyectos> lproyectos) {
		this.lproyectos = lproyectos;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreTecnico() {
		return nombreTecnico;
	}

	public void setNombreTecnico(String nombreTecnico) {
		this.nombreTecnico = nombreTecnico;
	}

	public Collection<Sintomas> getLsintomas() {
		return lsintomas;
	}

	public void setLsintomas(Collection<Sintomas> lsintomas) {
		this.lsintomas = lsintomas;
	}

	public Collection<CDiagnostico> getCdiagnostico() {
		return cdiagnostico;
	}

	public void setCdiagnostico(Collection<CDiagnostico> cdiagnostico) {
		this.cdiagnostico = cdiagnostico;
	}

	public Tratamientos getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamientos tratamiento) {
		this.tratamiento = tratamiento;
	}

	public Medicamentos getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(Medicamentos medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	
	
	
}
