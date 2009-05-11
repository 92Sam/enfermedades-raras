package er.domain.enfermedades;

import java.util.Collection;

public class Tratamiento {
	
	private String frecuencia;
	private String duracion;
	private Collection<Medicamento> lmedicamentos;
	
	public String getFrecuencia() {
		return frecuencia;
	}
	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}
	public String getDuracion() {
		return duracion;
	}
	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}
	public Collection<Medicamento> getLmedicamentos() {
		return lmedicamentos;
	}
	public void setLmedicamentos(Collection<Medicamento> lmedicamentos) {
		this.lmedicamentos = lmedicamentos;
	}

}
