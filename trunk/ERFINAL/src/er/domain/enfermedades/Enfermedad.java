package er.domain.enfermedades;

import java.util.Collection;
import java.util.List;

import er.domain.proyectos.Proyecto;
import er.domain.proyectos.ProyectoFactoria;
import er.domain.usuarios.UsuarioCualificado;

public class Enfermedad {
	private String id ; 
	/**
	 * proyectos creados que tratan la enfermedad*/
	private Collection proyectos;
	private String nombre;
	private String descripcion;
	private Collection<Sintoma> lsintomas;
	private Collection<CDiagnostico> cdiagnostico;
	private Collection<UsuarioCualificado> usuariosC;
	private Tratamiento tratamiento;
	
	//medicamentos aplicables 
	private List<Medicamento> medicamentos;

		
	public String getId() {
		return id;
	}

	public void setId(String string) {
		this.id = string;
	}

	public Collection getProyectos() {
		
		return proyectos;
	}

	public void setProyectos(Collection pro){
		this.proyectos = pro;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
	
	public String getDescripcion(){
		return this.descripcion;
	}
	
	public void setDescripcion(String desc){
		descripcion = desc;
	}
	
	public Collection<UsuarioCualificado> getUsuariosC(){
		return this.usuariosC;
	}
	
	public void addUsuarioC(UsuarioCualificado uc){
		this.usuariosC.add(uc);
	}
	
	
	
}
