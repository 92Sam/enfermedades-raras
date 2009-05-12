package er.domain.enfermedades;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import er.domain.proyectos.Proyecto;
import er.domain.usuarios.UsuarioCualificado;

public class Enfermedad {
	private Integer id ; 
	/**
	 * proyectos creados que tratan la enfermedad*/
	private Collection<Proyecto> lproyectos;
	
	private String nombreComun;
	private String descripcion;
	private Collection<Sintoma> lsintomas;
	private Collection<CDiagnostico> cdiagnostico;
	private Collection<UsuarioCualificado> usuariosC;
	private Tratamiento tratamiento;
	
	//medicamentos aplicables 
	private List<Medicamento> medicamentos;

	public Enfermedad(String nom){
		nombreComun = nom;
		lproyectos = new LinkedList<Proyecto>();
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Collection<Proyecto> getProyectos() {
		return lproyectos;
	}

	public void setProyectos(Collection<Proyecto> lproyectos) {
		this.lproyectos = lproyectos;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}


	public Collection<Sintoma> getLsintomas() {
		return lsintomas;
	}

	public void setLsintomas(Collection<Sintoma> lsintomas) {
		this.lsintomas = lsintomas;
	}

	public Collection<CDiagnostico> getCdiagnostico() {
		return cdiagnostico;
	}

	public void setCdiagnostico(Collection<CDiagnostico> cdiagnostico) {
		this.cdiagnostico = cdiagnostico;
	}

	public Tratamiento getTratamiento() {
		return tratamiento;
	}

	public void setTratamiento(Tratamiento tratamiento) {
		this.tratamiento = tratamiento;
	}

	public List getMedicamentos() {
		return medicamentos;
	}

	public void setMedicamentos(List<Medicamento> medicamentos) {
		this.medicamentos = medicamentos;
	}
	
	public boolean addProyecto(Proyecto p){
		boolean ret = false;
		if(!lproyectos.contains(p))
			ret = lproyectos.add(p);
		return ret;
	}
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public Collection<UsuarioCualificado> getUsuariosC(){
		return this.usuariosC;
	}
	
	public void addUsuarioC(UsuarioCualificado uc){
		this.usuariosC.add(uc);
	}
	
	
	
}
